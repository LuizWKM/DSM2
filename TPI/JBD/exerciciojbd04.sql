create database ConsultaPrefeitura;
use ConsultaPrefeitura;

create table prefeituras
(
id int auto_increment primary key,
codigo int,
nomePrefeitura varchar(150),
cidade varchar(150)
);
