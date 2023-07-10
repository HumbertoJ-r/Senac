CREATE VIEW AULAS AS
SELECT v.data, v.valor_total, iv.nome_produto, iv.quantidade, iv.valor_unitario, c.id, c.cpf, c.telefone
FROM venda v 
JOIN  item_venda iv ON v.id = iv.venda_id
JOIN  cliente c ON v.cliente_id = c.id
WHERE v.tipo_pagamento = 'D'
ORDER BY v.data DESC;

INDEX PARA ALUNO E AULAS 

