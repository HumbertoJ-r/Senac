-- Consulta 1: Relatório de todas as vendas pagas em dinheiro
-- Necessários para o relatório data da venda, valor total; produtos vendidos, quantidade e valor unitário; nome do cliente, cpf e telefone.
-- Ordena-se pela data de venda, as mais recentes primeiro.

-- EXPLAIN antes da otimização
EXPLAIN
SELECT v.data_venda, v.valor_total, p.nome AS nome_produto, iv.quantidade, iv.valor_unitario, c.nome AS nome_cliente, c.cpf, c.telefone
FROM venda v
JOIN item_venda iv ON v.id = iv.venda_id
JOIN produto p ON p.id = iv.produto_id
JOIN cliente c ON c.id = v.cliente_id
JOIN funcionario f ON f.id = v.funcionario_id
WHERE v.tipo_pagamento = 'D'
ORDER BY v.data_venda DESC;

-- Otimização da consulta
CREATE INDEX idx_venda_tipo_pagamento ON venda (tipo_pagamento);
CREATE INDEX idx_item_venda_venda_id ON item_venda (venda_id);
CREATE INDEX idx_item_venda_produto_id ON item_venda (produto_id);
CREATE INDEX idx_cliente_id ON cliente (id);
CREATE INDEX idx_funcionario_id ON funcionario (id);

-- EXPLAIN após a otimização
EXPLAIN
SELECT v.data_venda, v.valor_total, p.nome AS nome_produto, iv.quantidade, iv.valor_unitario, c.nome AS nome_cliente, c.cpf, c.telefone
FROM venda v
JOIN item_venda iv ON v.id = iv.venda_id
JOIN produto p ON p.id = iv.produto_id
JOIN cliente c ON c.id = v.cliente_id
JOIN funcionario f ON f.id = v.funcionario_id
WHERE v.tipo_pagamento = 'D'
ORDER BY v.data_venda DESC;

-- Criação da view correspondente
CREATE VIEW vendas_pagas_em_dinheiro AS
SELECT v.data_venda, v.valor_total, p.nome AS nome_produto, iv.quantidade, iv.valor_unitario, c.nome AS nome_cliente, c.cpf, c.telefone
FROM venda v
JOIN item_venda iv ON v.id = iv.venda_id
JOIN produto p ON p.id = iv.produto_id
JOIN cliente c ON c.id = v.cliente_id
JOIN funcionario f ON f.id = v.funcionario_id
WHERE v.tipo_pagamento = 'D'
ORDER BY v.data_venda DESC;

-- Consulta 2: Todas as vendas de produtos de um dado fabricante
-- Mostrar dados do produto, quantidade vendida, data da venda.
-- Ordena-se pelo nome do produto.

-- EXPLAIN antes da otimização
EXPLAIN
SELECT p.nome AS nome_produto, iv.quantidade, v.data_venda
FROM produto p
JOIN item_venda iv ON p.id = iv.produto_id
JOIN venda v ON v.id = iv.venda_id
WHERE p.fabricante LIKE '%lar%'
ORDER BY p.nome;

-- Otimização da consulta
CREATE INDEX idx_produto_fabricante ON produto (fabricante);
CREATE INDEX idx_item_venda_produto_id ON item_venda (produto_id);
CREATE INDEX idx_venda_id ON venda (id);

-- EXPLAIN após a otimização
EXPLAIN
SELECT p.nome AS nome_produto, iv.quantidade, v.data_venda
FROM produto p
JOIN item_venda iv ON p.id = iv