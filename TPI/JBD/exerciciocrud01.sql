create database exerciciocrud01;
use exerciciocrud01;
create table usuarios
(
id int auto_increment primary key,
nome varchar(100),
email varchar(100),
login varchar(100),
senha varchar(100)
);
insert into usuarios(nome, email, login, senha) values
('Teste','Teste@teste.teste','TesteLogin','TesteSenha');
select * from usuarios;

delete u.id from usuarios u where id = 1;

SELECT LAST_INSERT_ID() as id;