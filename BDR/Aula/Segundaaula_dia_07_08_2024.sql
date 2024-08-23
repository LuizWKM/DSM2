create database Logins;
use logins;
create table usuários
(
userId int auto_increment primary key,
nome varchar(100),
Email varchar(100),
Senha varchar(10)
);

create table configuracoesContas
(
configId int auto_increment primary key,
configIdioma varchar(100),
configTema varchar(100),
notificacao varchar(256)
);

/*Exercicio 04*/

create database DepFuncionarios;
use depfuncionarios;
create table departamentos
(
DeptoID int auto_increment primary key,
DeptNome varchar(100),
DeptLocalizacao varchar(50)
);

create table funcionarios
(
funcId int auto_increment primary key,
funcNome varchar(100),
funcCargo varchar(50),
funcDtContrat date,
funcSalario double(8,2),
deptoId int,
constraint fk_deptoFunc foreign key (deptoId) 
references departamentos(deptoID)
);