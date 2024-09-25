create database consultavenda;
use consultavenda;
create table vendas
(
id int auto_increment primary key,
codigo int,
nomeVendedor varchar(100),
nomeProduto varchar(150)
);
select * from vendas;