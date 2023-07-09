drop database senac_terrenos;
CREATE DATABASE senac_terrenos;

USE senac_terrenos;

CREATE TABLE vendedores (
   id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
   nome VARCHAR(25) NOT NULL
);

CREATE TABLE cidades (
   id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
   nome VARCHAR(25) NOT NULL,
   UF CHAR(2) NOT NULL,
   custo_metro_quadrado DECIMAL(6,2) NOT NULL
);

CREATE TABLE terrenos(
   id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
   id_cidade INT(6) UNSIGNED,
   largura DECIMAL(8,2) NOT NULL,
   comprimento DECIMAL(8,2) NOT NULL,
   vendido BOOL NOT NULL DEFAULT FALSE,
   FOREIGN KEY(id_cidade) REFERENCES cidades(id)
);

CREATE TABLE vendas(
   id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
   id_terreno INT(6) UNSIGNED,
   id_vendedor INT(6) UNSIGNED,
   vendido_em DATETIME NOT NULL,
   valor_total DECIMAL(24,2) NOT NULL,
   FOREIGN KEY(id_terreno) REFERENCES terrenos(id),
   FOREIGN KEY(id_vendedor) REFERENCES vendedores(id)
);

INSERT INTO vendedores(nome) VALUES ("Fulano");
INSERT INTO vendedores(nome) VALUES ("Ciclano");
INSERT INTO vendedores(nome) VALUES ("Beltrano");

INSERT INTO cidades (nome, UF, custo_metro_quadrado)
VALUES ("Porto Alegre", "RS", 6416.49);

INSERT INTO terrenos (id_cidade, largura, comprimento, vendido)
VALUES (1, 12, 4, false);

DELIMITER //
CREATE PROCEDURE minha_procedure()
BEGIN  
   DECLARE id_porto_alegre INT UNSIGNED DEFAULT 12;
   SELECT id_porto_alegre;
END//
DELIMITER ;

CALL MINHA_PROCEDURE();

DELIMITER //
CREATE PROCEDURE repetir(p1 INT)
	BEGIN
		SET @x = 0;
		REPEAT SET @x = @x + 1; UNTIL @x > p1 END REPEAT;
	END//
DELIMITER ;
CALL REPETIR();


DELIMITER //
CREATE PROCEDURE MINHA_PROCEDURE3(ID_CIDADE INT)
	BEGIN
		SELECT ID_CIDADE;
	END//
DELIMITER ;

CALL MINHA_PROCEDURE3(100);

DELIMITER $$
CREATE PROCEDURE MINHA_PROCEDURE4()
	BEGIN
		DECLARE ID_PORTO_ALEGRE INT UNSIGNED DEFAULT 12;
        DECLARE ID_ALUNOS VARCHAR(25) DEFAULT 'SENAC';
        DECLARE NOTA DECIMAL (3,1) DEFAULT 9.5;
        DECLARE FINALIZADA_EM DATETIME DEFAULT "2022-01-14 10:32:35";
        SELECT ID_PORTO_ALEGRE, ID_ALUNOS, NOTA, FINALIZADA_EM;
	END;
$$
DELIMITER;

CALL MINHA_PROCEDURE4;


DELIMITER //
CREATE PROCEDURE PROCEDURE5()
	BEGIN
		DECLARE CURSO VARCHAR (200);
        SET CURSO = 'TDS';
        SELECT CURSO;
	END;
//
DELIMITER;


CALL PROCEDURE5;

delimiter //
CREATE PROCEDURE repetir2(p1 INT)
BEGIN
   SET @x = 0;
   REPEAT SET @x = @x + 1; UNTIL @x > p1 END REPEAT;
END;
//
DELIMITER ;

CALL repetir2(1000);

SELECT @x;

DECLARE salario DECIMAL(5, 2) DEFAULT 150.99;

DELIMITER $$
CREATE PROCEDURE buscar_resultado_prova ()
BEGIN
    DECLARE aluno VARCHAR(25) DEFAULT "Fulano";
    DECLARE id_prova INT UNSIGNED DEFAULT 12;
    DECLARE nota DECIMAL(3, 1) DEFAULT 9.5;
    DECLARE finalizada_em DATETIME DEFAULT "2022-01-14 10:32:35";
    SELECT aluno, id_prova, nota, finalizada_em;
END $$
DELIMITER ;

delimiter //
create procedure exibir_vendedores(codigo int)
	begin
		select nome from vendedores where id=codigo;
	end;
//
delimiter;

call exibir_vendedores(2);

delimiter //
create procedure exibir_vendedores2(codigo int)
	begin 
		declare nome_vendedor varchar(200);
        set nome_vendedor := (select nome from vendedores where id=codigo);
        select nome_vendedor;
	end;
//
delimiter;

call evibir_vendedores2(2);

DECLARE aluno VARCHAR(25) DEFAULT "Fulano";
SET aluno = "Ciclano";


              
DECLARE aluno VARCHAR(25) DEFAULT "Fulano";
DECLARE nota DECIMAL(3,1) DEFAULT 10.0;
SET aluno = "Ciclano", nota = 9.5;

DECLARE contador INT UNSIGNED DEFAULT 0;
SET contador = contador + 1;

DECLARE ano_nascimento INT UNSIGNED DEFAULT 1987;
DECLARE ano_atual INT UNSIGNED DEFAULT 2022;
DECLARE idade INT UNSIGNED DEFAULT 0;
SET idade = ano_atual - ano_nascimento;


              
DELIMITER //

CREATE PROCEDURE buscar_nome_vendedor ()
BEGIN
    DECLARE variavel_nome VARCHAR(25);
    SELECT nome INTO variavel_nome FROM vendedores WHERE id = 1;
    SELECT variavel_nome;
END//

DELIMITER ;


              
DELIMITER //

CREATE PROCEDURE buscar_nome_vendedor ()
BEGIN
    DECLARE variavel_nome VARCHAR(25);
    SET variavel_nome := (SELECT nome FROM vendedores WHERE id = 1);
    SELECT variavel_nome;
END//

DELIMITER ;

DELIMITER //
CREATE PROCEDURE buscar_dados_vendedor ()
BEGIN
    DECLARE v_nome VARCHAR(25);
    DECLARE v_email VARCHAR(255);
    SELECT nome, email INTO v_nome, v_email 
        FROM vendedores WHERE id = 1;
    SELECT v_nome, v_email;
END//
DELIMITER ;
              
              
SET @ola = "Olá mundo";

SELECT @ola;

SELECT @variavelInexistente;

SET @ola = "Hello world";

SELECT @ola;

              
SELECT id, nome INTO @v_id, @v_nome 
FROM vendedores 
WHERE id = 1;

              
SET @v_nome := (SELECT nome FROM vendedores WHERE id = 1);

DELIMITER //
CREATE PROCEDURE minha_procedure6 ()
BEGIN
    DECLARE numero INT DEFAULT 1;
    IF numero = 1 THEN
        SET numero := 2;
    END IF;
    SELECT numero;
END//
DELIMITER ;
call minha_procedure6();
              
DELIMITER $$
CREATE PROCEDURE minha_procedure ()
BEGIN
    DECLARE numero INT DEFAULT 2;
    IF numero = 1 THEN
        SET numero := 10;
        ELSE
        SET numero := 20;
    END IF;
    SELECT numero;
END$$
DELIMITER ;
              
              
DELIMITER $$
CREATE PROCEDURE buscar_terrenos (id_vendedor INT)
BEGIN
    DECLARE id_encontrado INT;

    SELECT id INTO id_encontrado FROM vendedores 
        WHERE id = id_vendedor;

    IF id_encontrado IS NULL THEN
        SELECT "Sem acesso";
    ELSE
        SELECT * FROM terrenos;
    END IF;
END $$
DELIMITER ;


DELIMITER $$
CREATE PROCEDURE buscar_comissao (id_vendedor INT)
BEGIN
    DECLARE comissao DECIMAL(2,1) DEFAULT 1.0;
    DECLARE nome_vendedor VARCHAR(25);
    SELECT nome INTO nome_vendedor
        FROM vendedores
        WHERE id = id_vendedor;
    
    IF nome_vendedor = "Fulano" THEN
        SET comissao := 1.3;
    ELSEIF nome_vendedor = "Ciclano" THEN
        SET comissao := 1.2;
    ELSE
        SET comissao := 1.1;
    END IF;
    SELECT comissao;
END$$
DELIMITER ;

call buscar_comissao(2);
            
            
SELECT IF(10>1, "É maior", "É menor");

DELIMITER $$
CREATE PROCEDURE inserindo_vendedores ()
BEGIN
    DECLARE v1 INT DEFAULT 5;
    WHILE v1 > 0 DO
        INSERT INTO vendedores (nome)
            VALUES (CONCAT("Vendedor ", v1));
        SET v1 = v1 - 1;
    END WHILE;
END$$
DELIMITER ;
              
              
              
DELIMITER //
CREATE PROCEDURE minha_procedure ()
BEGIN
    DECLARE variavel INT DEFAULT 15;
    SELECT variavel;
END//
DELIMITER ;


DROP PROCEDURE minha_procedure;


DELIMITER //
CREATE PROCEDURE soma1 (INOUT numero INT)
BEGIN
    SET numero := numero + 1;
END//
DELIMITER ;

SET @numero := 2;
CALL soma1(@numero);
SELECT @numero;

DELIMITER //
CREATE PROCEDURE buscar_nome_vendedor (
    id_vendedor INT,
    OUT nome_vendedor VARCHAR(25)
)
BEGIN
    SELECT nome INTO nome_vendedor
        FROM vendedores
    WHERE id = id_vendedor;
END//
DELIMITER ;


CALL buscar_nome_vendedor(1, @meu_vendedor);
                    
                    
CREATE PROCEDURE exemplo ()
BEGIN
    SELECT 1;
    SELECT 2;
END;
         
		
        
        
                    
CREATE PROCEDURE exemplo ()
BEGIN
    SELECT 1 INTO @primeiro_valor;
    SELECT 2;
END;




DELIMITER //
CREATE FUNCTION buscar_preco (
    id_terreno INT
) RETURNS DECIMAL(24,2) DETERMINISTIC
BEGIN
    DECLARE v_custo_m2 DECIMAL(6,2);
    DECLARE v_largura INT;
    DECLARE v_comprimento INT;

    SELECT c.custo_metro_quadrado, t.largura, t.comprimento
    INTO v_custo_m2, v_largura, v_comprimento
    FROM terrenos t
        LEFT JOIN cidades c ON c.id = t.id_cidade
    WHERE t.id = id_terreno;
    
    RETURN (v_comprimento * v_largura) * v_custo_m2;
END//
DELIMITER ;
              
              
SELECT buscar_preco(1);


INSERT INTO vendas (
    id_terreno,
    id_vendedor,
    vendido_em,
    valor_total
) values (1, 1, "2022-02-07 10:00:00", buscar_preco(1));


DELIMITER //
CREATE TRIGGER marcar_venda AFTER INSERT
ON vendas
FOR EACH ROW
BEGIN
    UPDATE terrenos
    SET vendido = true
    WHERE id = NEW.id_terreno;
END//
DELIMITER ;
            
delimiter //
create procedure exibir_media1(nota decimal(5,2))
	begin 
		declare exibir varchar(30);
		if nota >= 7 then
			set exibir := "aprovado";
		elseif nota > 5 < 7 then
			set exibir := "Exame";
		else
			set exibir := "Reprovado";
		end if;
    
		select exibir;
    
	END//
    
    DELIMITER ;
    
CALL exibir_media1(6.2);

delimiter //
create procedure buscar_terrenos1 (id_vendedor INT)
	begin
		declare id_encontrado int;
        select id into id_encontrado from vendedores where id = id_vendedor;
        if id_encontrado is null then
			select "Nenhum registro encontrado";
		else	
			select * from terrenos;
		end if;
	end //
delimiter ;

call buscar_terrenos1(1);

DELIMITER //
CREATE FUNCTION BUSCAR_PRECO1 (CLIENTEID INT) RETURNS DECIMAL (24,2) DETERMINISTIC
	BEGIN 
		DECLARE TOTAL DECIMAL(6,2);
        DECLARE V_QUANTIDADE INT;
        DECLARE V_VALOR_UNITARIO DECIMAL(6,2);
        SELECT C.ID, V.QUANTIDADE, IV.VALOR_UNITARIO,
        SUM(IV.QUANTIDADE * IV.VALOR_UNITARIO)
        INTO TOTAL, V_QUANTIDADE, V_VALOR_UNITARIO
        FROM CLIENTE C INNER JOIN VENDA V ON C.ID = V.CLIENTE_ID
        JOIN item_venda IV ON V.ID = IV.venda_id
        WHERE C.ID = CLIENTEID
        
        
        
        RETURN (V_QUANTIDADE * V_VALOR_UNITARIO) = TOTAL;
	END//
DELIMITER ;
    


    
    
DELIMITER //
CREATE TRIGGER MARCAR_VENDA AFTER INSERT ON VENDAS 

FOR EACH ROW 
	BEGIN
		UPDATE TERRENOS 
        SET VENDIDO = TRUE
        WHERE ID = NEW.ID_TERRENO;
	END//
DELIMITER ;

