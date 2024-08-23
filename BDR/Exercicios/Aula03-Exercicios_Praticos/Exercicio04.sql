/*
Exercício 4: 
Relacionamento entre Departamentos e Funcionários
Considere um sistema de gerenciamento de recursos humanos. Cada departamento 
pode ter muitos funcionários, mas cada funcionário pertence a um único 
departamento. Modele essa relação com uma cardinalidade um-para-muitos e 
adicione alguns atributos:
- Entidade 1: Departamento
 - Atributos: DepartamentoID (Chave Primária), Nome do Departamento, Localização, 
etc.
- Entidade 2: Funcionário
 - Atributos: FuncionarioID (Chave Primária), Nome, Cargo, Data de Contratação, 
Salário, etc.
*/

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