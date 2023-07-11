create user 'atendente_carlos'@'localhost' identified by '123456';
select * from mysql.user;
grant select on *.* to 'atendente_carlos'@'localhost';
flush privileges;

create role 'Atendentes';
GRANT SELECT, INSERT, UPDATE ON db_nova_belo.* TO 'Atendentes';
FLUSH privileges;
GRANT 'Atendentes' TO 'atendente_carlos'@'localhost';
SET DEFAULT ROLE 'Atendentes' TO 'atendente_carlos'@'LOCALHOST';
select * from mysql.user;
show grants for 'Atendentes';

create user 'atendente_nair'@'localhost' identified by '123456';
select * from mysql.user;
grant select on *.* to 'atendente_nair'@'localhost';
flush privileges;

GRANT 'Atendentes' TO 'atendente_nair'@'localhost';
SET DEFAULT ROLE 'Atendentes' TO 'atendente_nair'@'LOCALHOST';
select * from mysql.user;
show grants for 'Atendentes';

create role 'Diretores';
GRANT SELECT, INSERT, UPDATE, DELETE ON db_nova_belo.* TO 'Diretores';
FLUSH privileges;

create user 'diretor_jose'@'localhost' identified by '123456';
select * from mysql.user;

GRANT 'Diretores' TO 'diretor_jose'@'localhost';
SET DEFAULT ROLE 'Diretores' TO 'diretor_jose'@'LOCALHOST';
select * from mysql.user;
show grants for 'Diretores';

create user 'diretor_juan'@'localhost' identified by '123456';
select * from mysql.user;
GRANT 'Diretores' TO 'diretor_juan'@'localhost';
SET DEFAULT ROLE 'Diretores' TO 'diretor_juan'@'LOCALHOST';
select * from mysql.user;
show grants for 'Diretores';
