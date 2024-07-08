/***
consulta para um relatório de todas as vendas pagas em dinheiro. 
Necessários para o relatório data da venda, valor total; produtos vendidos, quantidade e valor unitário; nome do cliente, cpf e telefone.
Ordena-se pela data de venda, as mais recentes primeiro.
**/
SELECT * FROM venda v, item_venda iv, produto p, cliente c, funcionario f
WHERE v.id = iv.venda_id AND c.id = v.cliente_id AND p.id = iv.produto_id AND f.id = v.funcionario_id and tipo_pagamento = 'D'

-- Ajuste realizado com JOIN para otmizar e melhorar a pesquisa anterior --
SELECT v.data, v.valor_total, iv.nome_produto, iv.quantidade, iv.valor_unitario, c.id, c.cpf, c.telefone
FROM venda v 
JOIN  item_venda iv ON v.id = iv.venda_id
JOIN  cliente c ON v.cliente_id = c.id
WHERE v.tipo_pagamento = 'D'
ORDER BY v.data DESC;

-- Criação da VIEW para pesquisar sem a necessidade reescrever o código para uma nova pesquisa com os mesmos parâmetros -- 
CREATE VIEW vendas_dinheiro AS
SELECT v.data, v.valor_total, iv.nome_produto, iv.quantidade, iv.valor_unitario, c.id, c.cpf, c.telefone
FROM venda v 
JOIN  item_venda iv ON v.id = iv.venda_id
JOIN  cliente c ON v.cliente_id = c.id
WHERE v.tipo_pagamento = 'D'
ORDER BY v.data DESC;

-- Chamando o resultado da VIEW --
SELECT * FROM vendas_dinheiro;

-- Pesquisa para comparar o tempo de retorno antes da modificação --
EXPLAIN SELECT * FROM venda v, item_venda iv, produto p, cliente c, funcionario f
WHERE v.id = iv.venda_id AND c.id = v.cliente_id AND p.id = iv.produto_id AND f.id = v.funcionario_id and tipo_pagamento = 'D'

 -- Pesquisa para comparar o tempo de retorno depois da modificação --
EXPLAIN SELECT v.data, v.valor_total, iv.nome_produto, iv.quantidade, iv.valor_unitario, c.id, c.cpf, c.telefone
FROM venda v 
JOIN  item_venda iv ON v.id = iv.venda_id
JOIN  cliente c ON v.cliente_id = c.id
WHERE v.tipo_pagamento = 'D'
ORDER BY v.data DESC;

CREATE INDEX index_venda ON venda(cliente_id, data);
CREATE INDEX index_cliente ON cliente(nome);
CREATE INDEX index_produto ON produto(nome, descricao);

DROP INDEX index_venda ON venda;
DROP INDEX index_cliente ON cliente;
DROP INDEX index_produto ON produto;
 
/***
consulta para encontrar todas as vendas de produtos de um dado fabricante
Mostrar dados do produto, quantidade vendida, data da venda.
Ordena-se pelo nome do produto.
***/
SELECT * 
FROM produto p, item_venda iv, venda v
WHERE p.id = iv.produto_id AND v.id = iv.venda_id AND p.fabricante like '%lar%'

-- Ajuste realizado com JOIN para otmizar e melhorar a pesquisa anterior --
SELECT p.nome, p.descricao, p.fabricante, iv.quantidade, v.data
FROM item_venda iv
JOIN venda v ON iv.venda_id = v.id
JOIN produto p ON iv.produto_id = p.id
ORDER BY p.nome;

-- Criação da VIEW para pesquisar sem a necessidade reescrever o código para uma nova pesquisa com os mesmos parâmetros -- 
CREATE VIEW  descricao_produto AS
SELECT p.nome, p.descricao, p.fabricante, iv.quantidade, v.data
FROM item_venda iv
JOIN venda v ON iv.venda_id = v.id
JOIN produto p ON iv.produto_id = p.id
ORDER BY p.nome;

-- Chamando o resultado da VIEW --
SELECT * FROM descricao_produto;

-- Pesquisa para comparar o tempo de retorno antes da modificação --
EXPLAIN SELECT * 
FROM produto p, item_venda iv, venda v
WHERE p.id = iv.produto_id AND v.id = iv.venda_id AND p.fabricante like '%lar%'

-- Pesquisa para comparar o tempo de retorno depois da modificação --
EXPLAIN SELECT p.nome, p.descricao, p.fabricante, iv.quantidade, v.data
FROM item_venda iv
JOIN venda v ON iv.venda_id = v.id
JOIN produto p ON iv.produto_id = p.id
ORDER BY p.nome;
  
/***
Relatório de vendas de produto por cliente.
Mostrar dados do cliente, dados do produto e valor e quantidade totais de venda ao cliente de cada produto.
*/
SELECT SUM(iv.subtotal), SUM(iv.quantidade)
FROM produto p, item_venda iv, venda v, cliente c
WHERE p.id = iv.produto_id AND v.id = iv.venda_id AND c.id = v.cliente_id /*f.id = v.funcionario_id*/
GROUP BY c.nome, p.nome

-- Criação da VIEW para pesquisar sem a necessidade reescrever o código para uma nova pesquisa com os mesmos parâmetros --
CREATE view total_venda as 
SELECT SUM(iv.subtotal * iv.quantidade) AS total, c.nome AS nome_cliente, p.nome AS nome_produto, p.descricao, iv.valor_unitario, iv.quantidade, v.valor_total
FROM venda v
JOIN cliente c ON v.cliente_id = c.id
JOIN item_venda iv ON iv.venda_id = v.id
JOIN produto p ON iv.produto_id = p.id
GROUP BY c.nome, p.nome, p.descricao, iv.valor_unitario, iv.quantidade, v.valor_total;

-- Chamando o resultado da VIEW --
select * from total_venda;

-- Ajuste realizado com JOIN para otmizar e melhorar a pesquisa anterior --
SELECT SUM(iv.subtotal * iv.quantidade) AS total, c.nome, p.nome, p.descricao, iv.valor_unitario, iv.quantidade, v.valor_total
FROM venda v
JOIN cliente c ON v.cliente_id = c.id
JOIN item_venda iv ON iv.venda_id = v.id
JOIN produto p ON iv.produto_id = p.id
GROUP BY c.nome, p.nome, p.descricao, iv.valor_unitario, iv.quantidade, v.valor_total;

-- Pesquisa para comparar o tempo de retorno antes da modificação --
EXPLAIN SELECT SUM(iv.subtotal), SUM(iv.quantidade)
FROM produto p, item_venda iv, venda v, cliente c
WHERE p.id = iv.produto_id AND v.id = iv.venda_id AND c.id = v.cliente_id /*f.id = v.funcionario_id*/
GROUP BY c.nome, p.nome

-- Pesquisa para comparar o tempo de retorno depois da modificação --
EXPLAIN SELECT SUM(iv.subtotal * iv.quantidade) AS total, c.nome, p.nome, p.descricao, iv.valor_unitario, iv.quantidade, v.valor_total
FROM venda v
JOIN cliente c ON v.cliente_id = c.id
JOIN item_venda iv ON iv.venda_id = v.id
JOIN produto p ON iv.produto_id = p.id
GROUP BY c.nome, p.nome, p.descricao, iv.valor_unitario, iv.quantidade, v.valor_total;
