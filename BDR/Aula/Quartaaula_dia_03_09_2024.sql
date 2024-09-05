create database sistemaVendasLivros;
use sistemaVendasLivros;

create table Autores
(
autorId int auto_increment primary key,
nome varchar(255),
pais varchar(50)
);

create table livros
(
livroId int auto_increment primary key,
titulo varchar(255),
autorId int,
preco decimal(10,2),
estoque int default 0,
constraint fk_autoId_Livros foreign key(autorId) references Autores(autorId)
);

create table vendas
(
vendaId int auto_increment primary key,
livroId int,
dataVenda date,
quantidade int,
valorTotal decimal(10,2),
constraint fk_livroId_vendas foreign key(livroId) references livros(livroId)
);

alter table vendas add column valorTotal  decimal(10,2);

insert into Autores (nome,pais) values
('Machado de Assis', 'Brasil'),
('Clarice Linspector', 'Brasil'),
('Jorge Amado', 'Brasil');

insert into Livros (titulo, autorId, preco, estoque) values
('Dom Casmurro', 1, 34.90, 12),
('A Hora da Estrela', 2, 29.90, 7),
('Capitães de Areia', 3, 39.90, 9);

insert into vendas (livroId, dataVenda, quantidade, valorTotal) values
(1, '2024-09-01', 3, 104.78),
(2, '2024-09-02', 2, 59.80),
(3, '2024-09-02', 1, 39.90);

select * from autores;
select * from livros;
select * from vendas;

#Criar Funções
#Mudar Delimitador MySQL
Delimiter //
create function TotalVendas() returns decimal(10,2)
begin
declare total decimal(10,2);
select sum(valorTotal) into  total from vendas;
return ifNull(total,0);
end//
Delimiter ;

#Executar Função
Select TotalVendas();

# Criar Função CalculaVenda
delimiter //
create function calculaVenda(ID int, Qtd int) returns decimal(10,2)
begin
-- Declarar variaveis
declare valorTotal decimal(10,2);
declare precoUnit decimal(10,2);

-- Buscar o Preço unitário do livro na Tabela Livros
Select preco into precoUnit from livros where livros.livroId = ID limit 1;

-- Verificar se o retorno é nulo
if precoUnit is null then
return 0;
end if;

--  Calcular o Valor Total do Produto
set valorTotal  = precoUnit * Qtd;
return valorTotal;
end//
delimiter ;

Select * from livros;
select calculaVenda(2,5);

# Função Calcula Estoque
delimiter //
create function calculaEstoque(id int, Qtd int) returns int
begin
	declare estoqueAtual int;
    declare estoqueAtualizado int;
    
    Select estoque into estoqueAtual from livros where livroId = id limit 1;
    set estoqueAtualizado = estoqueAtual - qtd;
    return estoqueAtualizado;
end//
delimiter ;
select * from livros;

select * from vendas;
select calculaEstoque(2,5);

#Procedure Registrar Venda
Delimiter //
create procedure RegistraVenda(In id int, in qtd int)
begin
   declare valorTotal decimal(10,2);
   
   set valorTotal = calculaVenda(id, qtd);
   insert into Vendas (livroId, dataVenda, quantidade, valorTotal) values
   (id, curdate(), qtd, valorTotal);
end//

Delimiter ; 

select * from vendas;
#Executar Procedure
call RegistraVenda(2,5);

Delimiter //
create procedure BaixarEstoque(in id int, in qtd int)
begin
     declare estoqueAtualizado int;
     
     set estoqueAtualizado = calculaEstoque(id, qtd);
     
     update livros set estoque = estoqueAtualizado where livroId = id;
end//
Delimiter ;

select * from livros;
select * from vendas;
call BaixarEstoque(1,3);

#Criar Trigger
Delimiter //
create trigger vender 
after insert on vendas 
for each row
begin
    call BaixarEstoque(new.livroId, new.quantidade);
end// 

Delimiter ;

select * from livros;
select * from vendas;
call RegistraVenda(1,8);

#Criar View de Listagem
create view listaVendas as
select vendaId, vendas.livroId, livros.titulo, quantidade, valorTotal from vendas
inner join livros on vendas.livroId = livros.livroId;

select * from vendas;
select * from listaVendas;