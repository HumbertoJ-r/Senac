DELIMITER //

CREATE FUNCTION determinarTipoCliente(id INT) RETURNS DECIMAL (12,2)
BEGIN
    DECLARE total_compras DECIMAL(10,2);

    -- Calcula o total de compras nos últimos dois anos
    SELECT
		c.nome as NomeCliente,
        v.id as IdVenda,
        SUM(iv.quantidade * iv.valor_unitario) as total_compras,
        iv.nome_produto as Nomeproduto,
        iv.quantidade as quantidade
    FROM
		cliente c
        JOIN venda v ON c.id = v.cliente_id
        JOIN item_venda iv ON v.id = iv.venda_id             
    WHERE cliente_id = cliente_id
        AND data >= DATE_SUB(YEAR(2021), INTERVAL 2 YEAR);

    -- Verifica se o cliente é "PREMIUM" ou "REGULAR" com base no total de compras
    IF total_compras > 10000 THEN
        RETURN 'PREMIUM';
    ELSE
        RETURN 'REGULAR';
    END IF;
END //

DELIMITER ;

Neste exemplo, a função determinarTipoCliente recebe o ID do cliente como parâmetro e retorna a string "PREMIUM" se o valor total de compras nos últimos dois anos for superior a R$ 10.000, caso contrário, retorna "REGULAR". Certifique-se de substituir "venda" pelo nome correto da tabela de vendas em sua base de dados.

Para chamar a função e obter o tipo de cliente para um ID específico, você pode executar o seguinte comando:

sql
Copy code
SELECT determinarTipoCliente(123) AS tipo_cliente;
Certifique-se de substituir "123" pelo ID do cliente que você deseja verificar.

Agora, para criar o trigger que aplique automaticamente a função MD5() à coluna "senha" ao inserir um novo usuário, você pode usar o seguinte código:

sql
Copy code
DELIMITER //

CREATE TRIGGER aplicarMD5Senha BEFORE INSERT ON usuario
FOR EACH ROW
BEGIN
    SET NEW.senha = MD5(NEW.senha);
END //

DELIMITER ;
