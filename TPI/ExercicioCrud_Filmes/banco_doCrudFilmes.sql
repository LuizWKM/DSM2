create database Crud_Filmes;
use Crud_Filmes;

create table Filmes
(
id_filme int auto_increment primary key,
titulo varchar(150) not null,
genero varchar(150) not null,
produtora varchar(150) not null,
datacompra varchar(150) not null
);
