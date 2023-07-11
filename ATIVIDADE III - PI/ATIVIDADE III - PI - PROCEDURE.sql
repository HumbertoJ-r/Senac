DELIMITER //
CREATE PROCEDURE QUADRO_DE_AULA(IN IDCLIENTE INT)
BEGIN
    SELECT
        c.nome AS ALUNO, 
        a.data_da_aula AS DATA, 
        i.nome AS INSTRUTOR, 
        ca.categorias AS CATEGORIA
    FROM
        aulas_praticas a
		JOIN cliente c ON c.idcliente = a.cliente_idcliente
		JOIN instrutor i ON i.idinstrutor = a.id_instrutor
		JOIN categorias ca ON ca.id = a.id_categoria
	WHERE
		C.IDCLIENTE = IDCLIENTE
    ORDER BY
        a.DATA_DA_AULA;
END //
DELIMITER ;

CALL QUADRO_DE_AULA(1);
