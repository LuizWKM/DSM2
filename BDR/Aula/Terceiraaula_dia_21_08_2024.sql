create database biblioteca;
use biblioteca;

create table livros
(
codLivro int auto_increment primary key,
ISBN int(13),
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
telefone int(11),
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