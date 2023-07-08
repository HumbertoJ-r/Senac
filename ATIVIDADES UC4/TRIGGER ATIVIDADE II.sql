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

