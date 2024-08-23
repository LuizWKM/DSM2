/*
Exercício 3: 
Relacionamento entre Clientes e Cartões de Crédito
Considere um sistema de gerenciamento de cartões de crédito. Cada cliente possui um 
único cartão de crédito, e cada cartão de crédito está associado a um único cliente. 
Modele essa relação com uma cardinalidade um-para-um e inclua os atributos 
apropriados:
- Entidade 1: Cliente
 - Atributos: ClienteID (Chave Primária), Nome, Endereço, Data de Nascimento, etc.
- Entidade 2: Cartão de Crédito
 - Atributos: CartaoID (Chave Primária), Número do Cartão, Data de Validade, Limite de 
Crédito, etc
*/
create database gerencCC;
use gerencCC;
create table clientes
(
clienteId int auto_increment primary key,
clienteNome varchar(100),
clienteEndereco varchar(100),
dt_nascimento date
);
create table cartoes_de_creditos
(
cartaoId int auto_increment primary key,
nmrcartao int,
dt_validade date,
limite_cred double
);