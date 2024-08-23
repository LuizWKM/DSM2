/*
Exercício 7: 
Relacionamento entre Alunos e Disciplinas
Em um sistema acadêmico, vários alunos podem se inscrever em várias disciplinas. 
Modele essa relação com uma cardinalidade muitos-para-muitos e adicione atributos 
relevantes:
- Entidade 1: Aluno
 - Atributos: AlunoID (Chave Primária), Nome, Data de Nascimento, Endereço, etc.
- Entidade 2: Disciplina
 - Atributos: DisciplinaID (Chave Primária), Nome da Disciplina, Professor, Horário, etc.
- Entidade Associativa: Matrícula
 - Atributos: MatriculaID (Chave Primária), Data da Matrícula, Nota, etc.
 - Chaves Estrangeiras: AlunoID (Referência à tabela Aluno), DisciplinaID (Referência à 
tabela Disciplina)
*/
create database Inscricao;
use Inscricao;

create table alunos
(
alunoId int auto_increment primary key,
nome varchar(100),
dt_nascimento date,
endereco varchar(100)
);

create table disciplinas
(
disciplinaId int auto_increment primary key,
nome_disciplina varchar(100),
professor varchar(100),
horario time
);

create table matriculas
(
matriculaId int auto_increment primary key,
alunId int,
disciplinId int,
dt_matricula date,
nota double,
constraint fk_alunosIdMatric foreign key(alunId)
references alunos(alunoId),
constraint fk_disciplinasIdMatric foreign key(disciplinId)
references disciplinas(disciplinaId)
);