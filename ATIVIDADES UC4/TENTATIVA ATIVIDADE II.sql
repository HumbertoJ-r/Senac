           
DELIMITER //
CREATE PROCEDURE buscar_compras (codigo INT)
BEGIN
    SELECT cliente_id, data, valor_total FROM venda WHERE id = codigo;
END//
DELIMITER ;

CALL buscar_compras();
CALL buscar_nome_cliente(2);
drop procedure buscar_nome_cliente;

select * from cliente;
SELECT * FROM item_venda;
SELECT * FROM PRODUTO;
SELECT * FROM VENDA;
delimiter //

drop procedure listacomprasporcliente;

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
END //
DELIMITER ;
            
CALL ListaComprasPorCliente(50, '2019-01-01', '2023-06-30');


DELIMITER //
CREATE PROCEDURE ListaCompraPorCliente
(
	DECLARE Cliente INT,
	DECLARE DataIncial DATE,
	DECLARE DataFinal DATE
 )
	BEGIN
		SELECT

        c.nome AS NomeCliente,
        v.id AS IdVenda,
        SUM(iv.subtotal) AS Total,
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
CALL ListaComprasPorCliente1(50, '2019-01-01', '2023-06-30');

DELIMITER //
CREATE PROCEDURE ListaComprasPorCliente1(
    IN ClienteId INT,
    IN DataInicial DATE,
    IN DataFinal DATE
)
BEGIN
    SELECT
        c.nome AS NomeCliente,
        v.id AS IdVenda,
        v.total AS Total,
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
    ORDER BY
    v.data;
END //
DELIMITER ;
