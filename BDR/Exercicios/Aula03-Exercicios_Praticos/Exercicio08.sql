/*
Exercício 8: 
Relacionamento entre Artigos e Autores
Em um sistema de publicação acadêmica, vários autores podem contribuir com vários 
artigos. Modele essa relação com uma cardinalidade muitos-para-muitos e inclua 
atributos relevantes:
-Entidade 1: Autor
 - Atributos: AutorID (Chave Primária), Nome, Afiliação, Email, etc.
- Entidade 2: Artigo
 - Atributos: ArtigoID (Chave Primária), Título, Resumo, Data de Publicação, etc.
- Entidade Associativa: Contribuição
 - Atributos: ContribuicaoID (Chave Primária), Papel do Autor, Ordem de Autoria, etc.
 - Chaves Estrangeiras: AutorID (Referência à tabela Autor), ArtigoID (Referência à 
tabela Artigo)
*/
create database Publiacad;
use Publiacad;

create table autores
(
autorId int auto_increment primary key,
nome_autor varchar(100),
afiliacao varchar(50),
email varchar(100)
);

create table artigos
(
artigoId int auto_increment primary key,
titulo varchar(100),
resumo varchar(200),
dt_publi date
);

create table contribuicoes
(
contribuicaoId int auto_increment primary key,
autId int,
artId int,
papel_do_autor varchar(200),
ordem_de_autori varchar(100),
constraint fk_autorIdContri foreign key(autId)
references autores(autorId),
constraint fk_artigoIdContri foreign key(artId)
references artigos(artigoId)
);