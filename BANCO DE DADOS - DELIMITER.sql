-- comando para criar um no banco de dados --
create database senac_terrenos;

-- comando para utilizar banco de dados -- 
use senac_terrenos;

-- comando para criar uma tabela -- 
create table vendedores
(
id int(6) unsigned auto_increment primary key ,
nome varchar (25) not null
)

-- comando para criar uma tabela --
create table cidades 
(
id int (6) unsigned auto_increment primary key,
nome varchar (25) not null,
uf char(2) not null,
custo_metro_quadrado decimal (6,2) not null 
)

-- comando para criar uma tabela com frase estrangeira --
create table terrenos 
(
id int (6) unsigned auto_increment primary key,
id_cidade int (6) unsigned,
largura decimal (8,2) not null,
comprimento decimal (8,2) not null,
vendido bool not null default false, 
foreign key (id_cidade) references cidades(id)
)

-- comando para criar uma tabela com frase estrangeira --
create table vendas
(
id int (6) unsigned auto_increment primary key,
id_terreno int (6) unsigned,
id_vendedor int (6) unsigned,
vendido_em datetime not null,
valor_total decimal (24,2) not null,
foreign key (id_terreno) references terrenos(id),
foreign key (id_vendedor) references vendedores(id)
)

-- comando para inserir informações nas tabelas --
insert into vendedores (nome) values
('Fulano'),
('Ciclano'),
('Beltrano');

-- comando para inserir informações nas tabelas --
insert into cidades (nome, uf, custo_metro_quadrado) values
("Porto Alegre", "RS", "6416.49");

-- comando para inserir informações nas tabelas --
insert into terrenos (id_cidade, largura, comprimento, vendido) values
(1, 12, 4, false);


-- comando novo procedure, begin, end 
-- create procedure minha_procedure() --
-- begin -- 
--	declare id_porto_alegre int unsigned default 12; --
--   select id_porto_alegre; --
-- end; --

-- DECLARE  É O COMANDO PARA CRIAR UM VARIÁVEL EX: DECLARE SALARIO DECIMAL (8,2); -- 
-- DECLARE  SALARIO DECIMAL (5,2) DEFAULT 150.99; -- 
DELIMITER $$
CREATE PROCEDURE BUSCAR_RESULTADO_PROVA()
BEGIN 
	DECLARE ALUNO VARCHAR (25) DEFAULT "FULANO";
    DECLARE ID_PROVA INT UNSIGNED DEFAULT 12;
    DECLARE NOTA DECIMAL (3, 1) DEFAULT 9.5;
    DECLARE FINALIZADA_EM DATETIME DEFAULT "2022-01-14 10:32:35";
    SELECT ALUNO, ID_PROVA, NOTA, FINALIZADA_EM;
END $$
DELIMITER ; 

-- PARA ALTERAR UMA INFORMAÇÃO EM UMA VARIÁVEL --
DECLARE ALUNO VARCHAR (25) DEFAULT "FULANO";
SET ALUNO = "CICLANO";

DECLARE ALUNO VARCHAR (25) DEFAULT "FULANO";
DECLARE NOTA DECIMAL (3,1) DEFAULT 10.0;
SET ALUNO = "CICLANO", NOTA = 9.5;

DECLARE CONTADOR INT UNSIGNED DEFAULT 0;
SET CONTADOR = CONTADOR + 1;

DECLARE ANO_NASCIMENTO INT UNSIGNED DEFAULT 1987;
DECLARE ANO_ATUAL INT UNSIGNED DEFAULT 2022;
DECLARE IDADE INT UNSIGNED DEFAULT 0;
SET IDADE = ANO_ATUAL - ANO_NASCIMENTO;

DELIMITER //

CREATE PROCEDURE BUSCAR_NOME_VENDEDOR ()
BEGIN
	DECLARE VARIAVEL_NOME VARCHAR (25);
    SELECT NOME INTO VARIAVEL_NOME FROM VENDEDORES WHERE ID = 1;
END//

DELIMITER ;

DELIMITER //

CREATE PROCEDURE BUSCAR_NOME_VENDEDOR ()
BEGIN 
	DECLARE VARIAVEL_NOME VARCHAR(25);
    SET VARIAVEL_NOME := (SELECT NOME FROM VENDEDORES WHERE ID = 1);
    SELECT VARIAVEL_NOME;
END//

DELIMITER ;

DELIMITER //
CREATE PROCEDURE BUSCAR_DADOS_VENDEDOR ()
BEGIN
	DECLARE V_NOME VARCHAR (25);
    DECLARE V_EMAIL VARCHAR(255);
    SELECT NOME, EMAIL INTO V_NOME, V_EMAIL FROM VENDEDORES WHERE ID = 1;
    SELECT V_NOME, V_EMAIL;
END//
DELIMITER ;

SELECT ID, NOME INTO @V_ID, @V_NOME
FROM VENDEDORES 
WHERE ID = 1;

SET @V_NOME := (SELECT NOME FROM VENDEDORES WHERE ID = 1);

SELECT * FROM VENDEDORES;

DELIMITER // 
CREATE PROCEDURE MINHA_PROCEDURE ()
BEGIN 
	DECLARE NUMERO INT DEFAULT 1;
    IF NUMERO = 1 THEN 
		SET NUMERO := 2;
	END IF;
    SELECT NUMERO;
END//
DELIMITER ;

DELIMITER $$
CREATE PROCEDURE MINHA_PROCEDURE1 ()
BEGIN 
	DECLARE NUMERO INT DEFAULT 2;
    IF NUMERO = 1 THEN 
		SET NUMERO := 10;
        else
        SET NUMERO := 20;
	END IF;
    SELECT NUMERO;
END$$
DELIMITER ;

DELIMITER $$
CREATE PROCEDURE BUSCAR_TERRENOS (ID_VENDEDOR INT)
BEGIN
	DECLARE ID_ENCONTRADO INT;
    
    SELECT ID INTO ID_ENCONTRADO FROM VENDEDORES
		WHERE ID  = ID_VENDEDOR;
        
	IF ID_ENCONTRADO IS NULL THEN
		SELECT "SEM ACESSO";
	else
		SELECT * FROM TERRENOS;
	END IF;
END $$
DELIMITER ;

DELIMITER $$
CREATE PROCEDURE BUSCAR_COMISSAO (ID_VENDEDOR INT)
BEGIN 
	DECLARE COMISSAO DECIMAL(2,1) DEFAULT 1.0;
    DECLARE NOME_VENDEDOR VARCHAR (25);
    select nome into nome_vendedor
		from VENDEDORES
        WHERE ID = ID_VENDEDOR;
        
	IF NOME_VENDEDOR = "FULANO" THEN 
		SET COMISSAO := 1.3;
	ELSEIF NOME_VENDEDOR = "CICLANO" THEN 
		SET COMISSAO := 1.2;
	ELSE 
		SET COMISSAO := 1.1;
	END IF;
    SELECT COMISSAO; 
END$$
DELIMITER ;

DELIMITER $$
CREATE PROCEDURE INSERINDO_VENDEDORES ()
BEGIN
	DECLARE V1 INT DEFAULT 5;
    WHILE V1 > O DO 
		INSERT INTO VENDEDORES (NOME)
			VALUES (CONCAT("VENDEDOR ", V1));
		SET V1 = V1 - 1;
	END WHILE;
END$$ 
DELIMITER ;