/*
Exercício 1: 
Relacionamento entre Usuários e Configurações de Conta
Considere um sistema de gerenciamento de contas de usuário. Cada usuário possui uma 
única configuração de conta, e cada configuração de conta está associada a um único 
usuário. Modele essa relação com uma cardinalidade um-para-um e adicione alguns 
atributos:
- Entidade 1: Usuário
 - Atributos: UserID (Chave Primária), Nome, Email, Senha, etc.
- Entidade 2: Configuração de Conta
 - Atributos: ConfigID (Chave Primária), Configuração de Idioma, Tema, Notificações, 
etc.
*/

create database Logins;
use logins;
create table usuários
(
userId int auto_increment primary key,
nome varchar(100),
Email varchar(100),
Senha varchar(10)
);

create table configuracoesContas
(
configId int auto_increment primary key,
configIdioma varchar(100),
configTema varchar(100),
notificacao varchar(256)
);