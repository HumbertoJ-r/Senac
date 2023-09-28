CREATE VIEW QUADRO_DE_AULAS AS
SELECT c.nome AS ALUNO, a.data_da_aula AS DATA, i.nome AS INSTRUTOR, ca.categorias AS CATEGORIA
FROM aulas_praticas a
JOIN cliente c ON c.idcliente = a.cliente_idcliente
JOIN instrutor i ON i.idinstrutor = a.id_instrutor
JOIN categorias ca ON ca.id = a.id_categoria
ORDER BY a.data_da_aula;

CREATE INDEX index_AULAS_PRATICAS ON aulas_praticas (CLIENTE_IDCLIENTE,DATA_DA_AULA);
CREATE INDEX index_cliente ON CLIENTE (NOME);

select * from QUADRO_DE_AULAS;

