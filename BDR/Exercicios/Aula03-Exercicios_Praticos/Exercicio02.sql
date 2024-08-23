/*
Exercício 2: 
Relacionamento entre Produtos e Garantias
Imagine um sistema de gestão de garantias de produtos. Cada produto possui uma 
única garan�a, e cada garan�a está associada a um único produto. Modele essa relação 
com uma cardinalidade um-para-um e adicione atributos relevantes:
- Entidade 1: Produto
 - Atributos: ProdutoID (Chave Primária), Nome do Produto, Preço, Fabricante, etc.
- Entidade 2: Garan�a
 - Atributos: Garan�aID (Chave Primária), Tipo de Garan�a, Data de Início, Data de 
Término, Termos, etc.
*/
create database gestaoprod;
use gestaoprod;
create table produtos
(
prodId int auto_increment primary key,
nomeProd varchar(100),
preco double,
fabricante varchar(60)
);

create table garantias
(
garantiaId int auto_increment primary key,
tipo_de_garantia varchar(60),
dt_inicio date,
dt_termino date,
termos varchar(100)
);