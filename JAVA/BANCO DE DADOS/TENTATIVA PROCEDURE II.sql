DELIMITER //
CREATE PROCEDURE ListaComprasPorCliente(
    IN ClienteId INT,
    IN DataInicial DATE,
    IN DataFinal DATE
)
BEGIN
    SELECT
		c.nome as NomeCliente,
        v.id as IdVenda,
        SUM(iv.quantidade * iv.valor_unitario) as total,
        iv.nome_produto as Nomeproduto,
        iv.quantidade as quantidade
    FROM
		cliente c
        JOIN venda v ON c.id = v.cliente_id
        JOIN item_venda iv ON v.id = iv.venda_id
	WHERE
		c.id = ClienteId
        and v.data >= DataInicial
        and v.data <= DataFinal
	GROUP BY
		c.nome,
        v.id,
        iv.quantidade,
        iv.nome_produto
      ORDER BY
		v.data;
        
        RETURN IV.quantidade * IV.valor_unitario;
END //
DELIMITER ;
            
CALL ListaComprasPorCliente(50, '2019-01-01', '2023-06-30');
