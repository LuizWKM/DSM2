create database felinos;

create table felinos
(
IdGato serial primary key,
nome varchar(150) not null,
raca varchar(150) not null,
coloracao varchar(150) not null,
idade int not null,
brinq_fav varchar(150) not null
);

insert into felinos(nome, raca, coloracao, idade, brinq_fav) values
('Mickey', 'Maine Coon', 'Multicor', 3, 'Bolinha vermelha'),
('Nine', 'Ragamuffin', 'Bege', 2, 'Bolinha verde'),
('Carmen', 'Persian', 'Marrom', 2, 'Ratinho de Borracha'),
('Luna', 'Abyssinian', 'Multicor', 12, 'Bolinha de papel'),
('Bella', 'Siamese', 'Laranja', 15, 'Arranhador'),
('Simba', 'Bengal', 'Amarelo com Manchas', 5, 'Corda'),
('Nina', 'Sphynx', 'Pele Nua', 4, 'Bolinha de Lã'),
('Zorro', 'Persian', 'Cinza', 10, 'Ratinho de Borracha'),
('Chester', 'British Shorthair', 'Cinza', 7, 'Pneu de Borracha'),
('Tina', 'Maine Coon', 'Branco e Preto', 8, 'Peixe de Borracha');

select * from felinos;

/*1) Crie uma consulta para listar a média de idade dos gatos agrupados pela raça, 
mostrando também a quantidade de gatos por raça. Ordene os resultados pela 
média de idade, da raça mais velha para a mais nova.*/
select Raca as "Raça"  ,count(Raca) as "Número de animais", Round(avg(idade)) as "Média de Idade" from felinos
group by Raca order by "Média de Idade" desc;

/*2) Crie uma consulta para listar o nome e a idade dos gatos cujo brinquedo favorito é 
"Ratinho de Borracha" ou "Bolinha de Lã", e que possuem uma idade maior que a 
média de idade de todos os gatos.*/
select nome as "Nome do felino", idade as "Idade do felino" from felinos
where (brinq_fav = 'Ratinho de Borracha' or brinq_fav = 'Bolinha de Lã')
and idade > (select avg(idade) from felinos);

/*3) Crie uma consulta para listar os gatos que têm mais de 5 anos de idade e que têm 
como brinquedo favorito "Ratinho de Borracha", ordenando os resultados por 
idade, da mais velha para a mais nova.*/
select * from felinos
where idade > 5 and brinq_fav = 'Ratinho de Borracha'
order by idade desc;