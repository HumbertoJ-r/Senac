CREATE TABLE produto (
	id INT PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(100),
    preco DOUBLE,
    quantidade INT,
    estado VARCHAR(10),
    categoria VARCHAR(150),
    vendido BOOLEAN,
    numeroNotaFiscal VARCHAR(50),
    dataDaCompra DATE
);

INSERT INTO produto(nome, preco, quantidade, estado, categoria, vendido, numeroNotaFiscal, dataDaCompra)
VALUES("Teste Java", 99.99, 10, "Novo", "Memória RAM", 0, "111111", "2024-01-30");

SELECT * FROM produto