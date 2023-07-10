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


DELIMITER //
CREATE TRIGGER nova_senha BEFORE INSERT ON usuario
FOR EACH ROW
BEGIN
    SET NEW.senha = MD5(NEW.senha);
END //
DELIMITER ;

insert into usuario (login, senha, ultimo_login) values
('newnick','erick0311','2023-07-08');

select * from usuario;

