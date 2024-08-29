create database biblioteca;
use biblioteca;

create table livros
(
codLivro int auto_increment primary key,
ISBN bigInt(13),
titulo varchar(255),
subTitulo varchar(255),
anoPublicacao int(4),
genero varchar(100),
breve_descricao varchar(255)
);

create table autores
(
codAutor int auto_increment primary key,
nomeCompleto varchar(255),
dtNasc date,
biografiaResumida varchar(255)
);

create table livrosXautores 
(
idx int auto_increment primary key,
cod_livro int,
cod_autor int,
constraint fk_codLivro foreign key(cod_livro) references livros(codLivro),
constraint fk_autorLivro foreign key(cod_autor) references autores(codAutor)
);

create table usuarios
(
codUsuario int auto_increment primary key,
nomeCompleto varchar(255),
endereco varchar(255),
bairro varchar(100),
cidade varchar(100),
estado varchar(2)
);

alter table usuarios add column assinatura enum("Aluno", "Professor", "Funcionário") default "Aluno";
insert into usuarios (nomeCompleto, assinatura) values ("Luiz Claudio", "Professor");
select * from usuarios;  
alter table usuarios change assinatura assinatura enum("Aluno", "Professor", "Funcionário", "Diretor") default "Aluno";

create table usuariosXtelefones
(
idx int auto_increment primary key,
idUsuario int,
telefone bigInt(11),
constraint fk_codUsuarioTel foreign key(idUsuario) references usuarios(codUsuario)
);

create table usuariosXemails
(
idx int auto_increment primary key,
idUsuario int,
email varchar(255),
constraint fk_codUsuarioEmail foreign key(idUsuario) references usuarios(codUsuario)
);

create table emprestimos
(
codEmprestimo int auto_increment primary key,
cod_usuario int,
dtEmprestimo date not null,
dtPrevistaDev date not null,
dtRealDev date,
constraint fk_codUsuarioEmp foreign key(cod_usuario) references usuarios(codUsuario)
);

create table emprestados
(
idx int auto_increment primary key,
cod_livro int,
cod_emprestimo int,
constraint fk_codLivroEmpresta foreign key(cod_livro) references livros(codLivro),
constraint fk_codEmprestimoEmpresta foreign key(cod_emprestimo) references emprestimos(codEmprestimo)
);

insert into livros(ISBN, titulo, subTitulo, anoPublicacao, genero, breve_descricao) values
(9780140449136, 'A Odisséia', 'Traduzido por: João Pereira', 800, 'Épico', 'A história épica de 
Odisseu e sua jornada de volta para casa.'),
(9780321125217, 'Clean Code', 'A Handbook of Agile Software Craftsmanship', 2008, 
'Tecnologia', 'Conselhos e melhores práticas para escrever código limpo e manutenível.'),
(9780201616224, 'Design Patterns', 'Elements of Reusable Object-Oriented Software', 1994, 
'Tecnologia', 'Padrões de design de software e suas aplicações em programação orientada a 
objetos.');
select * from livros;

insert into autores(nomeCompleto, dtNasc, biografiaResumida) values
('Homero', '0800-01-01', 'Poeta grego da Antiguidade, autor da Ilíada e da Odisséia.'),
('Robert C. Martin', '1952-12-05', 'Engenheiro de software e autor conhecido por seu trabalho 
em princípios de design de software.'),
('Erich Gamma', '1960-03-22', 'Um dos autores do famoso livro "Design Patterns", professor e 
consultor em design de software.');
select * from autores;

insert into livrosXautores(cod_livro, cod_autor) values
(1, 1),
(2, 2),
(3, 3);
select * from livrosXautores;

insert into usuarios (nomeCompleto, endereco, bairro, cidade, estado, assinatura) values
('Ana Silva', 'Rua das Flores, 123', 'Jardim Primavera', 'São Paulo', 'SP', 'Aluno'),
('João Souza', 'Avenida Central, 456', 'Centro', 'Rio de Janeiro', 'RJ', 'Professor'),
('Maria Oliveira', 'Praça da Liberdade, 789', 'Liberdade', 'Belo Horizonte', 'MG', 'Funcionario');
select * from usuarios;

insert into usuariosXtelefones(idUsuario, telefone) values
(1, 11987654321),
(2, 21987654321),
(3, 31987654321);
select * from usuariosxtelefones;

insert into usuariosXemails(idUsuario, email) values
(1, 'ana.silva@example.com'),
(2, 'joao.souza@example.com'),
(3, 'maria.oliveira@example.com');
select * from usuariosXemails;

insert into emprestimos(dtEmprestimo, dtPrevistaDev, dtRealDev, cod_usuario) values
('2024-08-01', '2024-08-15', NULL, 1),
('2024-08-05', '2024-08-20', NULL, 2),
('2024-08-10', '2024-08-25', NULL, 3);
select * from emprestimos;

insert into emprestados (cod_livro, cod_emprestimo) values
(1, 1),
(2, 2),
(3, 3);
select * from emprestados;

#1. Listar todos os livros disponíveis na biblioteca. 
select * from livros;

#2. Encontrar todos os autores que têm mais de 50 anos.
select * from autores; 

drop database biblioteca;