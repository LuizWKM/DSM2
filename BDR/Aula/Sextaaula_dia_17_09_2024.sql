create database if not exists loja_online;

use loja_online;

create table if not exists categorias
(
id int auto_increment primary key,
nome varchar(50)
);

create table if not exists produtos
(
id int auto_increment primary key,
nome varchar(100) not null,
categoria_id int,
preco decimal(10,2),
quantidade_estoque int,
foreign key (categoria_id) references categorias(id)
);

#inserção de dados
insert into categorias (nome) values
('Roupas'),('Calçados'),('Acessorios');

insert into produtos (nome, categoria_id, preco, quantidade_estoque) values
('Camiseta',1,29.99,100),
('Calça Jeans',1, 49.99,75),
('Tênis Esportivo',2,89.99,50),
('Relógio',3,199.99,20),
('Óculos de Sol', 3,129.99,30),
('Jaqueta',1,79.99,40),
('Bota',2,119.99,25),
('Mochila',3,59.99,60),
('Camisa Polo',1,39.99,80),
('Tênis Casual',2,69.99,70);