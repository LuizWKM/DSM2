create database consultaempresa;
use consultaempresa;

create table empresas
(
id int auto_increment primary key,
CNPJ int,
nomeEmpresa varchar(150),
endereco varchar(150)
);