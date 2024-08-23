create database bd_fatec;
use bd_fatec;alunosalunos

create table alunos
(
idAluno int auto_increment primary key,
nome varchar(100),
cpf varchar(14)
);

insert into alunos (nome, cpf) values 
("Pedro", "123.456.789-01"),
("Lucas", "111.222.333-44"),
("Barbara", "222.333.444-55");

#Seleção de todos os registros da tabela
select * from alunos;

/*Seleção de todos os registros mostrando apenas
alguns campos criado na tabela*/
select idAluno, nome from alunos;
select idAluno, cpf from alunos;
select nome, cpf from alunos;
select cpf, nome from alunos;
select cpf, nome, idAluno from alunos;

#Seleção de Registro específico
select * from alunos where idAluno = 2;


#Atualizando Dados em tabela
update alunos set cpf="111.222.333-04" where idAluno=2;
update alunos set cpf="111.222.333-04";

#Adicionar campos na tabela
alter table alunos add column rg varchar(13);
select * from alunos;

alter table alunos add column tel varchar(14);
select * from alunos;

#Troca nome da coluna na tabela
alter table alunos change tel cel varchar(14);
select * from alunos;

#Exclui coluna da tabela
alter table alunos drop column rg;
select * from alunos;

#Apelidos de Campos
select * from alunos;
select idAluno as  "ID do Aluno", nome as "Nome do Aluno", cpf as CPF, cel as Telefone from alunos;

#Apelido de Tabela
select a.nome, a.cpf from alunos a;

create table disciplinas
(
idDisc int auto_increment primary key,
nomeDisc varchar(100)
);

insert into disciplinas (nomeDisc) values
("Banco de Dados Relacional"),
("Desenvolvimento Web II"),
("Design Digital");

select * from disciplinas;

create table matricula
(
idMatricula int auto_increment primary key,
aluno int,
disciplina int,

#Criar chave estrangeira

constraint fk_aluno_disciplinaMatr foreign key(aluno) references alunos(idAluno),
foreign key(disciplina) references disciplinas(idDisc)
);

insert into matricula (aluno, disciplina) values
(1,1),
(1,2),
(1,3),
(2,1),
(2,3),
(3,1);

select aluno, disciplina from matricula where aluno = 1;

insert into matricula (aluno,disciplina) values
(4,5),
(4,1);

#Relacionamento entre tabelas usando INNER JOIN
select a.nome as "Nome do Aluno", d.nomeDisc as "Disciplina" from matricula
inner join alunos a on matricula.aluno = a.idAluno
inner join disciplinas d on matricula.disciplina = d.idDisc where Matricula.Aluno = 1;