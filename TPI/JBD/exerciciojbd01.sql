create database exercicioJBD01;
use exercicioJBD01;

create table usuarios
(
id int auto_increment primary key,
nome varchar(100),
email varchar(100),
login varchar(100),
senha varchar(100)
);