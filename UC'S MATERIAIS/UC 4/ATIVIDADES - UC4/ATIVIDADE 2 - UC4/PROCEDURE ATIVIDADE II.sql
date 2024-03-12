DELIMITER //
CREATE PROCEDURE ListaComprasPorCliente2(
    IN ClienteId INT,
    IN DataInicial DATE,
    IN DataFinal DATE
)
BEGIN
    SELECT
        c.nome AS NomeCliente,
        v.id AS IdVenda,
        SUM(iv.quantidade*iv.valor_unitario) AS Total,
        iv.nome_produto AS NomeProduto,
        iv.quantidade AS Quantidade
    FROM
        cliente c
        JOIN venda v ON c.id = v.cliente_id
        JOIN item_venda iv ON v.id = iv.venda_id
    WHERE
        c.id = ClienteId
        AND v.data >= DataInicial
        AND v.data <= DataFinal
    GROUP BY
        c.nome,
        v.id,
        iv.nome_produto,
        iv.quantidade
    ORDER BY
        v.data;
END //
DELIMITER ;
CALL ListaComprasPorCliente2(88, '2020-01-08', '2022-01-08');
