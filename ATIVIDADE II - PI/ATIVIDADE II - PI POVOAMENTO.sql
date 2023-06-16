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
('Diogo Juan Moura','991.774.659-54','50.703.260-3','1947-03-07','Travessa da Comissão, 298','(67) 2627-1555','(67) 99415-5954','diogojuanmoura@isometro.com.br	79023');
Diogo Juan Moura	991.774.659-54	50.703.260-3	07/03/1947	Travessa da Comissão, 298	Igor Caio Moura	Antônia Olivia Luzia	(67) 2627-1555	(67) 99415-5954	diogojuanmoura@isometro.com.br	79023
Ana Luiza Santos	174.913.953-76	18.844.957-7	22/02/1993	Rua Doutor Alfredo Barcelos, 135	Yuri Cláudio Santos	Esther Olivia	(21) 2845-1184	(21) 99631-4218	ana_santos@ruizonline.com.br	21060
Tatiane Ester da Cruz	457.514.825-30	50.283.662-3	07/06/1956	Avenida Candeias, 294	Luiz Enzo Ricardo da Cruz	Adriana Hadassa Heloisa	(69) 3619-6755	(69) 99284-3013	tatiane.ester.dacruz@pmm.am.gov.br	76870
Elisa Andrea Lopes	163.406.416-01	24.981.728-7	19/02/1968	Condomínio Vila dos Pássaros, 915	Giovanni Levi Mário Lopes	Stefany Sueli Maya	(92) 2691-9328	(92) 99447-8495	elisaandrealopes@hydropowermc.com.br	69023

('Giovanna Josefa Oliveira', '556.126.039-16', '17.427.318-6', '1999-02-08', 'Rua CV 38, 528', 'Jorge Tiago Fábio Oliveira', 'Joana Helena', '(62) 2883-5275', '(62) 99602-9999', 'giovanna_josefa_oliveira@endoimplantes.com.br'),
('Caroline Jennifer Aparício', '720.933.331-20', '36.146.286-4', '1998-05-11', 'Rua Auriverde, 248', 'Leonardo Eduardo Aparício', 'Giovana Alessandra', '(67) 2729-4781', '(67) 99263-7632', 'caroline.jennifer.aparicio@avantii.com.br'),
('Tatiane Ester da Cruz', '802.091.925-26', '11.810.755-0', '2005-03-24', 'Avenida João Ribeiro, 755', 'José Gael da Rocha', 'Ayla Renata Raimunda', '(79) 2834-6803', '(79) 99271-1621', 'elias.tomas.darocha@zaniniengenharia.com.br'),
('Elisa Andrea Lopes', '743.636.876-14', '26.283.987-8', '1976-02-17', 'Avenida da Terra, 853', 'Ian Anthony Nelson Caldeira', 'Tânia Natália Larissa', '(95) 3604-3874', '(95) 98768-5710', 'daniela.stefany.caldeira@oxiteno.com'),

Diogo Juan Moura	991.774.659-54	50.703.260-3	07/03/1947	Travessa da Comissão, 298	Igor Caio Moura	Antônia Olivia Luzia	(67) 2627-1555	(67) 99415-5954	diogojuanmoura@isometro.com.br	79023


