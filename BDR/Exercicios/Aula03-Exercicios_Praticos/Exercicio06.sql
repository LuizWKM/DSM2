/*
Exercício 6: 
Relacionamento entre Categorias e Produtos
Considere um sistema de gerenciamento de inventário. Cada categoria pode ter muitos 
produtos, mas cada produto pertence a uma única categoria. Modele essa relação com 
uma cardinalidade um-para-muitos e adicione os atributos apropriados:
- Entidade 1: Categoria
 - Atributos: CategoriaID (Chave Primária), Nome da Categoria, Descrição, etc.
- Entidade 2: Produto
 - Atributos: ProdutoID (Chave Primária), Nome do Produto, Preço, Quan�dade em 
Estoque, etc.
*/

create database gerenciainv;
use gerenciainv;

create table categorias
(
CategoriaId int auto_increment primary key,
nome_catego varchar(100),
descricao varchar(100)
);

create table produtos 
(
ProdutoId int auto_increment primary key,
nome_prod varchar(100),
preco double,
qtd_estoque int,
ctgId int,
constraint fk_categoriaIdProd foreign key(ctgId)
references categorias(CategoriaId)
);