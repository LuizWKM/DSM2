create database exerciciocrud02;
use exerciciocrud02;

create table produtos
(
id int auto_increment primary key,
codigo int,
nomeProduto varchar(100),
descricao varchar(150)
);