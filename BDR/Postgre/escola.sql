-- Criando Tabelas

create table alunos(
    id serial primary key,
	nome varchar(100) not null
);

create table notas (
    id serial primary key,
	aluno_id int references alunos(id),
	disciplina varchar(50) not null,
	nota numeric(4,2) check (nota >= 0 and nota <= 10) -- verifica se nota entre 0 e 10
);

 -- populando tabelas
insert into alunos(nome) values
('João Silva'),
('Maria Oliveira'),
('Carlos Souza'),
('Ana Martins');

select * from alunos;

insert into notas(aluno_id, disciplina, nota) values
(1,'Matematica', 8.0),(1,'Portugues', 6.0),(1,'História', 7.5),
(2,'Matematica', 5.5),(2,'Portugues', 4.0),(2,'História', 6.0),
(3,'Matematica', 3.0),(3,'Portugues', 5.0),(3,'História', 4.0),
(4,'Matematica', 6.0),(4,'Portugues', 7.5),(4,'História', 8.5);

select * from notas;

create view view_status_alunos as
select a.nome as Alunos, ROUND(AVG(n.nota),2) as Media,
case
when AVG(n.nota) >= 7 then 'Aprovado'
when AVG(n.nota) >= 5 then 'Recuperacao'
else 'Reprovado'
end as status
from
alunos a
join
notas n on a.id = n.aluno_id
group by
a.nome;

select * from view_status_alunos;

select * from view_status_alunos where status='Reprovado';