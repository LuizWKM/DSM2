create database fazenda_palmitos_luiz;
use fazenda_palmitos_luiz;

create table palmitos
(
id_palmito int auto_increment primary key,
tipo_palmito varchar(150),
preco_venda decimal(10,2),
estoque_atual int,
data_plantio date,
data_colheita date
);

create table fornecedores
(
id_fornecedor int auto_increment primary key,
nome_fornecedor varchar(150),
contato varchar(15),
cidade varchar(150)
);

create table compras
(
id_compra int auto_increment primary key,
id_palmito int,
quantidade_comprada int,
data_compra date,
preco_total decimal(10,2),
constraint Fk_palmitoId_Compras foreign key(id_palmito) references palmitos(id_palmito)
);

create table vendas
(
id_venda int auto_increment primary key,
id_palmito int,
quantidade_vendida int,
data_venda date,
preco_total decimal(10,2),
constraint Fk_palmitoId_Vendas foreign key(id_palmito) references palmitos(id_palmito)
);

insert into palmitos(tipo_palmito,preco_venda,estoque_atual,data_plantio,data_colheita) values
("Pupunha", 15.50, 200, "2023-02-15", "2024-02-15"),
("Açaí", 10.00, 150, "2023-01-10", "2024-01-10"),
("Jussara", 18.75, 80, "2023-03-05", "2024-03-05"),
("Real", 20.00, 60, "2023-04-20", "2024-04-20"),
("Pupunha Premium", 25.00, 40, "2023-05-15", "2024-05-15"),
("Açaí Orgânico", 12.50, 100, "2023-06-10", "2024-06-10"),
("Jussara Orgânico", 19.00, 70, "2023-07-22", "2024-07-22"),
("Real Orgânico", 22.50, 30, "2023-08-01", "2024-08-01"),
("Pupunha Orgânico", 16.50, 50, "2023-09-05", "2024-09-05"),
("Açaí Premium", 13.50, 120, "2023-10-12", "2024-10-12");

insert into fornecedores(nome_fornecedor,contato,cidade) values
("Fazenda Verde", "(11) 98765-4321", "São Paulo"),
("AgroPalm", "(21) 91234-5678", "Rio de Janeiro"),
("Orgânicos S.A.", "(47) 99876-5432", "Florianópolis"),
("EcoPlanta", "(31) 92345-6789", "Belo Horizonte"),
("Sustenta Verde", "(61) 99999-9999", "Brasília"),
("HortiVida", "(81) 97654-3210", "Recife"),
("AgroPalmito", "(19) 93210-5678", "Campinas"),
("VerdeOrg", "(41) 94321-7654", "Curitiba"),
("PlantarBem", "(62) 95432-1098", "Goiânia"),
("BioPalm", "(85) 98765-1234", "Fortaleza");

insert into compras(id_palmito,quantidade_comprada,data_compra,preco_total) values
(1 ,100, "2024-01-05", 1550.00),
(2 , 50, "2024-01-12", 500.00),
(3 , 40, "2024-01-18", 750.00),
(4 , 20, "2024-02-01", 400.00),
(5 , 10, "2024-02-15", 250.00),
(6 , 80, "2024-02-20", 1000.00),
(7 , 50, "2024-02-25", 950.00),
(8 , 30, "2024-03-02", 675.00),
(9 , 40, "2024-03-10", 660.00),
(10 , 70, "2024-03-18", 945.00);

insert into vendas(id_palmito, quantidade_vendida, data_venda, preco_total) values
(1, 50, "2024-03-10", 775.00),
(2, 30, "2024-03-15", 300.00),
(3, 20, "2024-03-20", 375.00),
(4, 10, "2024-03-25", 200.00),
(5, 5, "2024-04-05", 125.00),
(6, 40, "2024-04-10", 500.00),
(7, 35, "2024-04-12", 665.00),
(8, 20, "2024-04-18", 450.00),
(9, 25, "2024-04-20", 412.00),
(10, 60, "2024-04-22", 810.00);
#1 .Consultas SQL Utilizando Where, Order By, Group By, Having:

#a.  Consulta 1: Listar todas as vendas de um tipo de palmito específico. 
select * from vendas
join palmitos p using(id_palmito)
where p.tipo_palmito = "Pupunha";

/*b.  Consulta 2: Ordenar as vendas por data, da mais recente para a mais antiga.*/
select * from vendas order by data_venda desc;

/*c. Consulta 3: Exibir o total de vendas por tipo de palmito, agrupando 
pelo id_palmito. */ 
select p.tipo_palmito as "Tipo de Palmito", count(v.id_palmito) as "Total de vendas"
from vendas v
join palmitos p using(id_palmito)
group by id_palmito;


/*d.  Consulta 4: Listar os tipos de palmito cuja venda total excedeu 500 
unidades, utilizando HAVING.*/
select p.tipo_palmito as "Tipo de Palmito", sum(v.quantidade_vendida) as "Total de vendas"
from vendas v
join palmitos p using(id_palmito)
group by (id_palmito)
having sum(v.quantidade_vendida) > 500;

#2 .Criação de Funções, Procedures e Triggers:
/*a. Calcular o total de vendas de um palmito*/
Delimiter //
create function tv_palmito(id int) returns int
BEGIN
declare totalV int;
select count(id_venda) into totalV from vendas where  id = id_palmito; 

return totalV;
END //
Delimiter ;

select tv_palmito(1) as "Total de vendas do palmito";

/*b. Inserir uma nova venda e atualizar o estoque.*/
delimiter //
create function totaldV(id int, qtd int) returns decimal(10, 2)
BEGIN
declare totalPrec decimal(10,2);
declare precoU decimal(10,2);
select preco_venda into precoU from palmitos where id = id_palmito;
set totalPrec = precoU * qtd;
return totalPrec;
END // 
delimiter ;
select totaldV(1,50);

delimiter //
create function fun_esto(id int, qtd int) returns int
BEGIN 
declare est_atz int;
declare est_at int;

select estoque_atual into est_at from palmitos where id = id_palmito;
set est_atz = est_at - qtd;

return est_atz;
END //
delimiter ;
select fun_esto(1,10);


delimiter //
create procedure baixaDeVenda(in id int, in qtd int)
BEGIN
declare valorT decimal(10,2);
set valorT = totaldV(id,qtd);

insert into vendas(id_palmito, quantidade_vendida, data_venda, preco_total) values
(id, qtd, curdate(), valorT);

END //
delimiter ;

delimiter //
create procedure atualEst(in id int, in qtd int) 
BEGIN
declare estoqueAtua int;
set estoqueAtua = fun_esto(id,qtd);

update palmitos set estoque_atual = estoqueAtua where id_palmito = id;
END//
delimiter ;

/*c.  Atualizar o estoque automaticamente ao inserir uma nova compra */

delimiter //
create trigger atualiza_estoque
after insert on vendas
for each row
begin
call atualEst(new.id_palmito, new.quantidade_vendida);
end//
delimiter ;

call baixaDeVenda(1, 40);

select * from vendas;
select * from palmitos;

#3. Criação de Views:
/*a. Mostrar a situação atual do estoque.*/
create view Est_Atual as
select id_palmito as "ID do palmito", tipo_palmito as "Tipo do palmito", estoque_atual as "Estoque atual do palmito" 
from palmitos;
 
select * from Est_Atual;
 
/*b. Exibir o histórico de vendas por tipo de palmito.*/
create view Hist_VP as
select p.id_palmito as "ID do palmito", p.tipo_palmito as "Tipo do palmito", v.quantidade_vendida as "Quantidade vendida", 
v.data_venda as "Data da venda", v.preco_total as "Preço total" from vendas v
join palmitos p using(id_palmito) order by tipo_palmito;

select * from Hist_VP;