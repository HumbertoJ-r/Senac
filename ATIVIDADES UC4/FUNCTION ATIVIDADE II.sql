DELIMITER //
CREATE FUNCTION verificarStatusCliente(cliente_id INT)  RETURNS varchar(10) DETERMINISTIC
BEGIN
  DECLARE total_compras DECIMAL(10, 2);
  DECLARE IV_QUANTIDADE DECIMAL(10, 2);
  DECLARE IV_VALOR_UNITARIO DECIMAL(10,2);
  
  SELECT SUM(iv.quantidade * iv.valor_unitario) INTO total_compras
  FROM cliente c
  JOIN venda v on c.id = cliente_id
  JOIN item_venda iv on v.id = iv.venda_id
  WHERE v.cliente_id = cliente_id
    AND v.data >= DATE_SUB('2019-02-27', INTERVAL 2 YEAR);
  IF total_compras > 10000 THEN
    RETURN 'PREMIUM';
  ELSE
    RETURN 'REGULAR';
  END IF;
END //
DELIMITER ;

-- CLIENTE 88 PREMIUM --
-- CLIENTE 01 REGULAR --
select verificarStatusCliente (01);
