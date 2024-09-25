create database ConsultaProduto;
use ConsultaProduto;

create table produtos
(
id int auto_increment primary key,
codigo int,
nomeProduto varchar(100),
descricao varchar(150)
);

select * from produtos;