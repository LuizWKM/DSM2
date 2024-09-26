-- Criar banco de dados
create database nomeBanco;

-- Criar Tabela
create table tipoProdutos
(
   idProd serial primary key, --Tipo de dado serial é o mesmo que int auto_increment
   descricao varchar(100)
);

create table produtos
(
	idProduto serial primary key,
	descricao varchar(100) not null,
	preco money not null, --Tipo de dado exclusivo para moeda
    id_tipo_produto int references tipoProdutos(idProd) --Criação de Foreign Key
);

/*Inserindo dados na tabela*/
insert into tipoProdutos(descricao) values
('computadores'), ('impressora');


/*Toda inserção de valores tipo texto usar aspas simples '' e não aspas duplas ""*/

insert into produtos (descricao,preco,id_tipo_produto) values
('Desktop', 1200.00, 1), ('Laptop', 3200.00, 1),
('Impressora Jato de Tinta', 500.00, 2),
('Impressora Laser', 1200.00, 2);

--Listagem de dados
--Listar todos os registros da tabela
select * from produtos;
--Listar os produtos em ordem descrescente por descrição
select * from produtos order by descricao desc;
--Listar os produtos em ordem crescente de preço
select * from produtos order by preco;
--Listar os produtos que são do tipo de produto 2
select * from produtos where id_tipo_produto = 2;
--Listar os produtos que são do tipo de produto computador
select p.idProduto as "Id do produto", p.descricao as "Descrição", p.preco as "Preço", tp.descricao as "Tipo Descrição" from produtos p
left join tipoProdutos tp on idProd = id_tipo_produto
where tp.descricao = 'computadores';

-- Retorne o valor total de produtos de cada tipo de produto 
select sum(p.preco) as "Preço", tp.descricao from produtos p
inner join tipoProdutos tp on idProd = id_tipo_produto
group by tp.descricao;