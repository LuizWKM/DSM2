create database javaCrud;
use javaCrud;
create table usuario
(
id int auto_increment primary key,
codigo int(4) not null,
nome varchar(80),
telefone varchar(25),
login varchar(60),
senha varchar(50)
);