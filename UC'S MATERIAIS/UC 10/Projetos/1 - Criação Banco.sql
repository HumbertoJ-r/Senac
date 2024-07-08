DROP DATABASE IF EXISTS livraria_9578;
CREATE DATABASE livraria_9578;
use livraria_9578;

CREATE TABLE Livro (
    id INT PRIMARY KEY AUTO_INCREMENT,
    titulo VARCHAR(100),
    autor VARCHAR(100),
    editora VARCHAR(100),
    lido boolean,
    dataPublicacao date,
    ativo boolean
);

CREATE TABLE Usuario (
    id INT PRIMARY KEY AUTO_INCREMENT,
    login varchar(30),
    senha varchar(30),
    nivel varchar(30)
);