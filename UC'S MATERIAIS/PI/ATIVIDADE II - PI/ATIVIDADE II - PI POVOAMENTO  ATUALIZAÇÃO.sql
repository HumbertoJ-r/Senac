use db_nova_belo

insert into CLIENTE (nome, cpf, rg, data_de_nascimento, endereco, nome_pai, nome_mae, telefone, telefone_contato, email) values
('Giovanna Josefa Oliveira', '556.126.039-16', '17.427.318-6', '1999-02-08', 'Rua CV 38, 528', 'Jorge Tiago Fábio Oliveira', 'Joana Helena', '(62) 2883-5275', '(62) 99602-9999', 'giovanna_josefa_oliveira@endoimplantes.com.br'),
('Caroline Jennifer Aparício', '720.933.331-20', '36.146.286-4', '1998-05-11', 'Rua Auriverde, 248', 'Leonardo Eduardo Aparício', 'Giovana Alessandra', '(67) 2729-4781', '(67) 99263-7632', 'caroline.jennifer.aparicio@avantii.com.br'),
('Elias Tomás da Rocha', '802.091.925-26', '11.810.755-0', '2005-03-24', 'Avenida João Ribeiro, 755', 'José Gael da Rocha', 'Ayla Renata Raimunda', '(79) 2834-6803', '(79) 99271-1621', 'elias.tomas.darocha@zaniniengenharia.com.br'),
('Daniela Stefany Caldeira', '743.636.876-14', '26.283.987-8', '1976-02-17', 'Avenida da Terra, 853', 'Ian Anthony Nelson Caldeira', 'Tânia Natália Larissa', '(95) 3604-3874', '(95) 98768-5710', 'daniela.stefany.caldeira@oxiteno.com'),
('Bento Rafael Bernardo Almada', '663.252.009-00', '49.722.263-2', '1966-02-04', 'Rua Rio Exu, 811', 'Luan Yago Almada', 'Patrícia Márcia', '(87) 3936-3410', '(87) 99482-6325', 'bento-almada74@bodyfast.com.br'),
('Iago Miguel Assunção', '186.114.429-62', '18.393.775-2', '1964-01-19', 'Rua Lúcia Carvalho, 914', 'Danilo Davi Assunção', 'Marli Helena', '(69) 2616-2481', '(69) 99756-2902', 'iago.miguel.assuncao@azevedoalves.com.br'),
('Débora Cecília de Paula', '664.730.694-37', '47.258.704-3', '1959-03-15', 'Avenida Rio Ave, 448', 'Alexandre Osvaldo de Paula', 'Laís Pietra Rosângela', '(71) 3766-0129', '(71) 98316-4289', 'debora_cecilia_depaula@truran.com.br'),
('Stella Daiane Lívia Araújo', '579.016.460-98', '40.649.487-3', '1994-02-10', 'Quadra EQNN 18/20 Bloco B, 922', 'Rodrigo Enzo Araújo', 'Eloá Natália Louise', '(61) 2824-4829', '(61) 99864-4218', 'stella_araujo@uninorte.com.br'),
('Carlos Eduardo Osvaldo Filipe Novaes', '924.152.602-58', '20.718.028-3', '1991-06-03', 'Rua Abelardo Romero, 398', 'Gabriel Luan Noah Novaes', 'Aparecida Bruna Tatiane', '(79) 3732-4686', '(79) 98954-2742', 'carlos_novaes@doublemoore.com'),
('Pietra Eduarda Rezende', '141.306.332-28', '28.843.457-2', '1999-01-27', 'Rua da Paz, 407', 'Bernardo Juan Luan Rezende', 'Eliane Sabrina', '(21) 2563-3427', '(21) 98194-2272', 'pietraeduardarezende@msds.com.br');

select * from cliente

insert into instrutor (nome, cpf, rg, data_nascimento, endereco, telefone, telefone_contato, email, numero_credencial) values
('Diogo Juan Moura','991.774.659-54','50.703.260-3','1947-03-07','Travessa da Comissão, 298','(67) 2627-1555','(67) 99415-5954','diogojuanmoura@isometro.com.br	79023'),
('Ana Luiza Santos','174.913.953-76','18.844.957-7','1993-02-22','Rua Doutor Alfredo Barcelos, 135','(21) 2845-1184','(21) 99631-4218','ana_santos@ruizonline.com.br','21060'),
('Tatiane Ester da Cruz','457.514.825-30','50.283.662-3','1956-06-07','Avenida Candeias, 294','(69) 3619-6755','(69) 99284-3013','tatiane.ester.dacruz@pmm.am.gov.br','76870'),
('Elisa Andrea Lopes','163.406.416-01','24.981.728-7','1968-02-19','Condomínio Vila dos Pássaros, 915','(92) 2691-9328','(92) 99447-8495','elisaandrealopes@hydropowermc.com.br','69023');

select * from instrutor;

drop table instrutor;

create table instrutor 
(
id INT AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR (255),
CPF VARCHAR (20),
RG VARCHAR (20),
DATA_NASCINETO DATE,
CREDENCIAL INT (5)
);

CREATE TABLE INFORMACAO_INSTRUTOR
(
ID INT AUTO_INCREMENT PRIMARY KEY,
TELEFONE VARCHAR (20),
TELEFONE_CONTATO VARCHAR (20),
EMAIL VARCHAR (225),
ENDERECO VARCHAR (225)
);


CREATE TABLE DIRETORES
(
id INT AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR (255),
CPF VARCHAR (20),
RG VARCHAR (20),
DATA_NASCINETO DATE,
CREDENCIAL INT (5)
);

CREATE TABLE INFORMACAO_DIRETORES
(
ID INT AUTO_INCREMENT PRIMARY KEY,
TELEFONE VARCHAR (20),
TELEFONE_CONTATO VARCHAR (20),
EMAIL VARCHAR (225),
ENDERECO VARCHAR (225)
);

insert into diretores (nome, cpf, rg, data_nascimento, endereco, telefone, telefone_contato, email, numero_credencial) values
('José Murilo da Luz','910.434.378-60','34.385.780-7','1954-01-09','Rua Miguel Guimarães, 988','(85) 2821-1807','(85) 99156-8251','josemurilodaluz@fulltransport.com.br','60831'),
('Juan Leandro Rodrigues','113.176.077-83','40.724.768-3','1993-03-25','Rua Rui Rogério de Carvalho, 528','(19) 2516-6366','(19) 98311-3778','juan_rodrigues@goldenhotel.com.br','13100');

select * from diretores

drop table atendentes;

create table atendentes
(
id int primary key auto_increment not null,
nome varchar(255), 
cpf varchar(45), 
rg varchar(45), 
data_nascimento date, 
endereco varchar(255), 
telefone varchar(25), 
telefone_contato varchar(25), 
email varchar(255)
);

insert into atendentes (nome, cpf, rg, data_nascimento, endereco, telefone, telefone_contato, email) values
('Carlos Thiago Peixoto','799.907.299-05','44.005.126-5','1999-02-16','Rua Sergipe, 555','(86) 3500-0914','(86) 98618-9505','carlos-peixoto97@sp.senac.com.br'),
('Nair Carla Marina Brito','517.125.965-86','24.868.864-9','1981-01-09','Avenida Euclides da Cunha, 564','(96) 3519-2935','(96) 99207-2842','nair_carla_brito@andritz.com');

select * from atendentes 

drop table servicos;

ALTER TABLE vendas DROP FOREIGN KEY fk_VENDAS_SERVIÇOS1;

select * from servicos;

ALTER TABLE SERVIVOS rename SERVICOS;

create table servivos
(
id int primary key auto_increment not null,
tipo_de_servico varchar(255)
);

insert into servicos (tipo_de_servico) values
('Primeira Habilitação Categoria A'),
('Primeira Habilitação Categoria B'),
('Primeira Habilitação Categoria AB'),
('Adição de Categoria A'),
('Adição de Categoria B'),
('Mudança de Categoria C'),
('Mudança de Categoria D'),
('Mudança de Categoria E');

create table categorias 
(
id int primary key auto_increment not null,
categorias char(2)
);

insert into categorias (categorias) values
('A'),
('B'),
('C'),
('D'),
('E');

alter table categorias change cartegoria categoria char(2);
alter table vendas modify column id_diretores int default null;
alter table vendas modify column id_atendente int default null;
drop table aulas_praticas_has_instrutor;
drop table cliente_has_aulas_praticas;

alter table vendas change column SERVIÇOS_idSERVIÇOS id_servicos int;
alter table vendas add column id_cliente int;
alter table vendas add foreign key (id_cliente) references cliente (idcliente); 
alter table vendas add column id_atendente int;
alter table vendas add foreign key (id_atendente) references atendentes (id);
alter table vendas add column id_diretores int;
alter table vendas add foreign key (id_diretores) references diretores (iddiretores);

alter table aulas_praticas add column id_instrutor int;
alter table aulas_praticas add foreign key (id_instrutor) references instrutor (idinstrutor);
alter table aulas_praticas add column id_categoria int;
alter table aulas_praticas add foreign key (id_categoria) references categorias (id);

select * from categorias;

drop table categorias;
drop table instrutor_has_categorias;

select * from vendas;
select * from servicos;
select * from cliente;
select * from atendentes;
select * from diretores;

alter table vendas change quanitidade_venda quantidade_venda int;
insert into vendas (ID_SERVICOS, quantidade_venda, data_venda, id_cliente, id_atendente, id_diretores) values
('1','1','2023-01-17','1','1','1'),
('2','1','2023-02-13','2','2','2'),
('3','1','2023-03-05','3','2','1'),
('4','1','2023-04-06','4','1','2'),
('5','1','2023-05-19','5','2','1'),
('6','1','2023-06-21','6','2','2'),
('7','1','2023-06-10','7','1 ','2'),
('8','1','2023-05-16','8','1','1'),
('1','1','2023-04-30','9','2','2'),
('2','1','2023-03-11','10','1','2'),
('3','1','2023-02-09','11','2 ','1');

select * from vendas;
select * from categorias;

insert into aulas_praticas (data_da_aula, cliente_idcliente, id_instrutor, id_categoria) values
('2023-01-05 09:30:00','1','1','1'),('2023-01-05 10:40:00','1','1','1'),
('2023-01-06 09:30:00','2','2','2'),('2023-01-06 10:40:00','2','2','2'),
('2023-01-07 09:30:00','3','3','3'),('2023-01-07 10:40:00','3','3','3'),
('2023-01-08 09:30:00','4','4','4'),('2023-01-08 10:40:00','4','4','4'),
('2023-01-09 09:30:00','5','1','5'),('2023-01-09 10:40:00','5','1','5'),
('2023-01-10 09:30:00','6','2','1'),('2023-01-10 10:40:00','6','2','1'),
('2023-01-11 09:30:00','7','3','2'),('2023-01-11 10:40:00','7','3','2'),
('2023-01-12 09:30:00','8','4','3'),('2023-01-12 10:40:00','8','4','3'),
('2023-01-13 09:30:00','9','1','1'),('2023-01-13 10:40:00','9','1','1'),
('2023-01-14 09:30:00','10','2','2'),('2023-01-14 10:40:00','10','2','2'),
('2023-01-15 09:30:00','11','3','3'),('2023-01-15 10:40:00','11','3','3'),
('2023-01-16 09:30:00','1','4','4'),('2023-01-16 10:40:00','1','4','4'),
('2023-01-17 09:30:00','2','1','5'),('2023-01-17 10:40:00','2','1','5'),
('2023-01-18 09:30:00','3','2','1'),('2023-01-18 10:40:00','3','2','1'),
('2023-01-19 09:30:00','4','3','2'),('2023-01-20 10:40:00','4','3','2'),
('2023-01-20 09:30:00','5','4','3'),('2023-01-21 10:40:00','5','4','3'),
('2023-01-21 09:30:00','6','1','4'),('2023-01-22 10:40:00','6','1','4'),
('2023-01-22 09:30:00','7','2','5'),('2023-01-23 10:40:00','7','2','5');

select * from aulas_praticas;
select * from curso_cfca;

insert into curso_cfca (data_inicio, data_de_termino, numero_certificado, nome_do_cfca, cliente_idcliente) values
('2023-01-01','2023-01-20','123456','Aki','1'),
('2023-01-01','2023-01-20','123457','Aki','2'),
('2023-01-01','2023-01-20','123458','Aki','3'),
('2023-01-01','2023-01-20','123459','Aki','9'),
('2023-01-01','2023-01-20','123460','Aki','10'),
('2023-01-01','2023-01-20','123461','Aki','11');

insert into emissao (data_emissao, cliente_idcliente) values
('2023-07-07','1'),
('2023-07-08','2'),
('2023-07-09','3'),
('2023-07-10','4'),
('2023-07-11','5'),
('2023-07-12','6'),
('2023-07-13','7'),
('2023-07-14','8'),
('2023-07-15','9'),
('2023-07-16','10'),
('2023-07-17','11');

insert into exame_medico (data_exame, nome_do_medico, endereco_da_clinica, renach, cliente_idcliente) values
('2023-01-06','Raul Igor Bernardo Fogaça','Rua Severino Pereira da Silva, 251','942995','1'),
('2023-02-07','Mirella Patrícia de Paula', 'Rua Quadra 25, 235','714424','2'),
('2023-03-08','Kaique Márcio Julio Moreira','Rua Sete, 869','680781','3'),
('2023-04-09','Raul Igor Bernardo Fogaça','Rua Severino Pereira da Silva, 251','262492','4'),
('2023-05-10','Mirella Patrícia de Paula','Rua Quadra 25, 235','676981','5'),
('2023-06-11','Kaique Márcio Julio Moreira','Rua Sete, 869','541445','6'),
('2023-06-12','Raul Igor Bernardo Fogaça','Rua Severino Pereira da Silva, 251','323442','7'),
('2023-05-13','Mirella Patrícia de Paula','Rua Quadra 25, 235','827602','8'),
('2023-04-14','Kaique Márcio Julio Moreira','Rua Sete, 869','385392','9'),
('2023-03-15','Raul Igor Bernardo Fogaça','Rua Severino Pereira da Silva, 251','813854','10'),
('2023-02-16','Mirella Patrícia de Paula','Rua Quadra 25, 235','934642','11');

alter table exame_pratico modify column data_exame date;

insert into exame_pratico (data_exame, resultado, cliente_idcliente) values
('2023-07-01','APROVADO','1'),('2023-07-02','APROVADO','2'),
('2023-07-03','APROVADO','3'),('2023-07-04','APROVADO','4'),
('2023-07-05','APROVADO','5'),('2023-07-06','APROVADO','6'),
('2023-07-07','APROVADO','7'),('2023-07-08','APROVADO','8'),
('2023-07-09','APROVADO','9'),('2023-07-10','APROVADO','10'),
('2023-07-11','APROVADO','11');

insert into exame_teorico (data_exame, resultado, cliente_idcliente) values
('2023-06-01','A','1'),('2023-06-02','A','2'),
('2023-06-03','A','3'),('2023-06-04','A','9'),
('2023-06-05','A','10'),('2023-06-06','A','11');

insert into exame_psicotecnico (data_exame, nome_do_medico, endereco_da_clinica, renach, cliente_idcliente) values
('2023-01-06','Thiago Cauê Nascimento','Rua Quadra 5 MC, 177','942995','1'),
('2023-02-07','Letícia Priscila Nogueira','Rua Triunfo, 751','714424','2'),
('2023-03-08','Emily Fernanda Caroline Lima','Rua Aldery de Paula Damasceno, 716','680781','3'),
('2023-04-09','Thiago Cauê Nascimento','Rua Quadra 5 MC, 177','262492','4'),
('2023-05-10','Letícia Priscila Nogueira','Rua Triunfo, 751','676981','5'),
('2023-06-11','Emily Fernanda Caroline Lima','Rua Aldery de Paula Damasceno, 716','541445','6'),
('2023-06-12','Thiago Cauê Nascimento','Rua Quadra 5 MC, 177','323442','7'),
('2023-05-13','Letícia Priscila Nogueira','Rua Triunfo, 751','827602','8'),
('2023-04-14','Emily Fernanda Caroline Lima','Rua Aldery de Paula Damasceno, 716','385392','9'),
('2023-03-15','Thiago Cauê Nascimento','Rua Quadra 5 MC, 177','813854','10'),
('2023-02-16','Letícia Priscila Nogueira','Rua Triunfo, 751','934642','11');

select * from exame_psicotecnico;