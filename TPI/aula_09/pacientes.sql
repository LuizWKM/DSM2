create database Pacientes;
use Pacientes;

create table usuarios
(
id int auto_increment primary key,
login varchar(150),
senha varchar(150)
);

create table pacientes
(
id int auto_increment primary key,
cod_Paci int not null,
nome_Paci  varchar(150) not null,
endereco varchar(120) not null,
complemento varchar(50),
rg varchar(27),
cpf varchar(18),
data_nasc varchar(10)
);

insert into usuarios(login, senha) values
('luiz','123');