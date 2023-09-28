-- Essa FUNCTION foi criada para saber se o cliente alcançou a carga horário de 20 aulas práticas ou não --

DELIMITER //
CREATE FUNCTION verificar_carga_horaria(cliente_id INT) RETURNS VARCHAR(20) deterministic
BEGIN
    DECLARE total_aulas INT;
    SELECT COUNT(*) INTO total_aulas
    FROM aulas_praticas
    WHERE cliente_idcliente = cliente_id;
    
    IF total_aulas >= 20 THEN
        RETURN 'Alcançou';
    ELSE
        RETURN 'Não alcançou';
    END IF;
END //
DELIMITER ;

-- Esse povoamento foi necessario para verificar se a fuction funcionaria ou não --
insert into aulas_praticas (data_da_aula, cliente_idcliente, id_instrutor, id_categoria) values
('2023-01-05 09:30:00','1','1','1'),('2023-01-05 10:40:00','1','1','1'),
('2023-01-06 09:30:00','1','1','1'),('2023-01-06 10:40:00','1','1','1'),
('2023-01-07 09:30:00','1','1','1'),('2023-01-07 10:40:00','1','1','1'),
('2023-01-08 09:30:00','1','1','1'),('2023-01-08 10:40:00','1','1','1'),
('2023-01-09 09:30:00','1','1','1'),('2023-01-09 10:40:00','1','1','1'),
('2023-01-10 09:30:00','1','1','1'),('2023-01-10 10:40:00','1','1','1'),
('2023-01-11 09:30:00','1','1','1'),('2023-01-11 10:40:00','1','1','1');

insert into aulas_praticas (data_da_aula, cliente_idcliente, id_instrutor, id_categoria) values
('2023-01-12 09:30:00','1','1','1'),('2023-01-12 10:40:00','1','1','1');

-- O cliente 1 alcaçou a cargoria --
-- O cliente 2 ainda não alcaçou --
SELECT verificar_carga_horaria (1);