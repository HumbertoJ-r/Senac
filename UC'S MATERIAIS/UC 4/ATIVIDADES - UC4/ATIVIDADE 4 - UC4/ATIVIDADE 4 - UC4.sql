-- Aqui vamos criar uma nova tabela "endereco_cliente", para que a tabela "cliente" fique em conformidade com a 1FN --
CREATE TABLE endereco_cliente 
(
id INT auto_increment PRIMARY KEY,
lougradoro VARCHAR (255),
FOREIGN KEY (cliente_id) REFERENCES cliente(id)
);

-- Aqui vamos criar uma nova tabela "telefone_cliente", para que a tabela "cliente" fique em conformidade com a 1FN --
CREATE TABLE tefelone_cliente
(
id INT AUTO_INCREMENT PRIMARY KEY,
telefone VARCHAR (255),
FOREIGN KEY (cliente_id) REFERENCES cliente(id)
);

-- Aqui vamos criar uma nova tabela "tipo_de_pagamento", para que a tabela "venda" fique em conformidade com a 2FN --
CREATE TABLE tipo_de_pagamento 
(
ID INT AUTO_INCREMENT PRIMARY KEY,
TIPO_DE_PAGAMENTO CHAR (1),
NUMERO_CARTÃO_PAGAMENTO VARCHAR(16),
NUMERO_PARCELAS_PAGAMENTO INT,
DATA_PAGAMENTO DATETIME,
FOREIGN KEY (VENDA_ID) REFERENCES VENDA (ID)
);

-- Aqui vamos criar uma nova tabela "envio", para que a tabela "venda" fique em conformidade com a 2FN --
CREATE TABLE ENVIO 
(
DATA_ENVIO DATETIME,
STATUS VARCHAR (45),
FOREIGN KEY (VENDA_ID) REFERENCES VENDA (ID)
);

-- Aqui vamos criar uma nova tabela "subtotal", para que a tabela "item_venda" fique em conformidade com a 3FN --
CREATE TABLE subtotal
(
id INT AUTO_INCREMENT PRIMARY KEY,
quantidade INT,
valor_unitario DECIMAL (9,2),
subtotal DECIMAL (9,2)
FOREIGN KEY (item_venda_id) REFERENCES item_venda (id)
);

SELECT * FROM CLIENTE;
SELECT * FROM VENDA;
SELECT * FROM item_venda;