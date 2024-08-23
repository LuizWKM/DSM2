/*
Exercício 5: 
Relacionamento entre Clientes e Pedidos
Imagine um sistema de gerenciamento de pedidos online. Cada cliente pode fazer 
muitos pedidos, mas cada pedido pertence a um único cliente. Modele essa relação 
com uma cardinalidade um-para-muitos e inclua atributos relevantes:
- Entidade 1: Cliente
 - Atributos: ClienteID (Chave Primária), Nome, Endereço, Email, etc.
- Entidade 2: Pedido
 - Atributos: PedidoID (Chave Primária), Data do Pedido, Total do Pedido, Status, etc.
*/

create database gerenciaped;
use gerenciaped;

create table Clientes
(
ClienteId int auto_increment primary key,
nome varchar(100),
endereco varchar(100),
email varchar(50)
);

create table Pedidos 
(
PedidoId int auto_increment primary key,
dt_pedido date,
total_ped int,
Status_ped varchar(50),
cliId int,
constraint fk_ClienteIdPed foreign key (cliId)
references Clientes(ClienteId)
);
