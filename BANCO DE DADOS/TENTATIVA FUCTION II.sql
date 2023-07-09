DELIMITER //

CREATE FUNCTION determinarTipoCliente(id INT) RETURNS VARCHAR(10)
BEGIN
    DECLARE total_compras DECIMAL(10,2);
    DECLARE tipo_cliente VARCHAR(10);

    -- Calcula o total de compras nos últimos dois anos
    SELECT SUM(iv.quantidade * iv.valor_unitario)
    INTO total_compras
    FROM venda v
    JOIN item_venda iv ON v.id = iv.venda_id
    WHERE v.cliente_id = id
        AND v.data >= DATE_SUB(NOW(), INTERVAL 2 YEAR);

    -- Verifica se o cliente é "PREMIUM" ou "REGULAR" com base no total de compras
    IF total_compras > 10000 THEN
        SET tipo_cliente = 'PREMIUM';
    ELSE
        SET tipo_cliente = 'REGULAR';
    END IF;

    -- Retorna o tipo de cliente
    RETURN tipo_cliente;
END //

DELIMITER ;