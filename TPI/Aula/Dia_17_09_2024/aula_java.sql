create database aula_java;

use aula_java;

create table Cliente
(
id int(4) auto_increment primary key,
codigo int(5) not null,
nome varchar(80),
telefone varchar(25),
email varchar(120)
);