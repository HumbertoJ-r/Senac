CREATE TABLE vendedor (
    id INT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    salario DECIMAL(9,2) NULL,
    data_admissao DATETIME NULL,
    cpf VARCHAR(11) NOT NULL,
    PRIMARY KEY (`id`))
ENGINE = InnoDB;

CREATE TABLE venda (
    id INT NOT NULL AUTO_INCREMENT,
    data DATETIME NULL,
    total DECIMAL(9,2) NULL,
    produto VARCHAR(45) NULL,
    quantidade INT NULL,
    vendedor_id INT NOT NULL,
    PRIMARY KEY (id),
        FOREIGN KEY (vendedor_id)
        REFERENCES vendedor (id))
ENGINE = InnoDB;


                
START TRANSACTION;

INSERT INTO vendedor (nome, salario, data_admissao, cpf) 
VALUES ('José da Silva', 1500, '2020-10-10', '00100200304');

SELECT * FROM vendedor;

ROLLBACK;

SELECT * FROM vendedor;
                
              
              
START TRANSACTION;

INSERT INTO vendedor (nome, salario, data_admissao, cpf) 
VALUES ('José da Silva', 1500, '2020-10-10', '00100200304');

SELECT * FROM vendedor;

COMMIT;

SELECT * FROM vendedor;
                
                
START TRANSACTION;

INSERT INTO vendedor (nome, salario, data_admissao, cpf) 
VALUES ('Maria Quintino', 1500, '2021-01-10', '00200300405');

SELECT * FROM vendedor;

INSERT INTO venda (data, total, produto, quantidade, vendedor_id)
VALUES ('2021-01-11', 100.5, 'kit mouse e teclado', 1, 100);

COMMIT;


START TRANSACTION;

UPDATE vendedor
    SET salario = 1600
 WHERE nome = 'José da Silva';

SELECT * FROM vendedor; 
                
              
              
START TRANSACTION;

INSERT INTO vendedor (nome, salario, data_admissao, cpf) 
VALUES ('José da Silva', 1500, '2020-10-10', '00100200304');

SELECT * FROM vendedor;

COMMIT;

SELECT * FROM vendedor;
                
                
                
                
START TRANSACTION;

INSERT INTO vendedor (nome, salario, data_admissao, cpf) 
VALUES ('Maria Quintino', 1500, '2021-01-10', '00200300405');

SELECT * FROM vendedor;

INSERT INTO venda (data, total, produto, quantidade, vendedor_id)
VALUES ('2021-01-11', 100.5, 'kit mouse e teclado', 1, 100);

COMMIT;
                
                
                
START TRANSACTION;

UPDATE vendedor
    SET salario = 1600
 WHERE nome = 'José da Silva';

SELECT * FROM vendedor; 
                
              
              
              
                
START TRANSACTION;

UPDATE vendedor
    SET salario = 1400, cpf='11122233344'
 WHERE nome = 'José da Silva';

SELECT * FROM vendedor;


  
ROLLBACK;

             
START TRANSACTION;

UPDATE vendedor
    SET salario = 1600
 WHERE id = 2;

SELECT * FROM vendedor;


                
START TRANSACTION;

UPDATE vendedor
    SET salario = 1700
 WHERE id = 4;

SELECT * FROM vendedor;
                
              
              
              
LOCK TABLES vendedor READ;

SELECT * FROM vendedor;

INSERT INTO vendedor (nome, salario, data_admissao, cpf) VALUES ('Joaquim Sá', '2000', '2019-05-10', '00300400506');

UNLOCK TABLES;

                
LOCK TABLES vendedor WRITE;


SELECT * FROM vendedor;
INSERT INTO vendedor (nome, salario, data_admissao, cpf) VALUES ('Antônio Martins', '1850', '2020-01-05', '00400500607');

START TRANSACTION;

INSERT INTO vendedor (nome, salario, data_admissao, cpf) 
VALUES ('Jerônimo Sá', 1250.75, '2020-01-10', '00500600708');

/*encontrando o último id de vendedor e armazenando em uma variável*/
SELECT @id_vendedor := MAX(id) FROM vendedor;

INSERT INTO venda (data, total, produto, quantidade, vendedor_id)
VALUES ('2021-01-11', 100.5, 'kit mouse e teclado', 1, @id_vendedor);

COMMIT;
                
                