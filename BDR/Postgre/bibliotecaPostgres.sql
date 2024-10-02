Create table Autores
(
    autor_id serial primary key, --Serial é o mesmo que int auto_increment
	nome varchar(100)
);

create table livros
(
    livro_id serial primary key,
	titulo varchar(150),
	autor_id int references autores(autor_id) on delete cascade,
	estoque int check(estoque >= 0), --Valida que o estoque não pode ser negativo
	ano_publicacao int,
	isbn varchar(13)unique -- Determina que o registro será unico
);

create table Membros
(
   membro_id serial primary key,
   nome varchar(100),
   endereco varchar(100),
   email varchar(100),
   data_cadastro date default current_date
);

create table emprestimos
(
	emprestimo_id serial primary key,
	livro_id int references livros(livro_id),
	membro_id int references membros(membro_id), 
	data_emprestimo date default current_date,
	data_devolucao date,
	devolvido boolean default false,
    data_prevista_devolucao date
);	

create table reservas
(
    reserva_id serial primary key,
    livro_id int references livros(livro_id),
	membro_id int references membros(membro_id),
	data_reserva date default current_date
);

create table multas
(
    multa_id serial primary key,
	emprestimo_id int references emprestimos(emprestimo_id),
	valor numeric(5,2),
	pago boolean default false
);

-- Procedures e Triggers: Gerar multa automaticamente
-- para livros entregues com atraso

-- Procedure para calcular multa
CREATE OR REPLACE FUNCTION gerar_multa() RETURNS TRIGGER AS $$
BEGIN
    IF NEW.devolvido = TRUE AND NEW.data_devolucao > NEW.data_prevista_devolucao THEN
        -- Calcular valor da multa com 1.50 por dia de atraso
        INSERT INTO multas(emprestimo_id, valor) VALUES
        (NEW.emprestimo_id, (NEW.data_devolucao - NEW.data_prevista_devolucao) * 1.50);
    END IF;
    RETURN NEW;
END;
$$ LANGUAGE plpgsql;

-- Trigger para chamar a função ao atualizar o status de devolução
CREATE TRIGGER trigger_gerar_multa
AFTER UPDATE ON emprestimos
FOR EACH ROW
WHEN (NEW.devolvido = TRUE)
EXECUTE FUNCTION gerar_multa();

-- view para listar membros com emprestimos em atraso]
create view membros_em_atraso AS
select m.membro_id, m.nome, e.data_prevista_devolucao
from membros m 
join emprestimos e on m.membro_id = e.membro_id
where e.devolvido = false and e.data_prevista_devolucao < current_date;

--Indice para acelerar consultas por título de livro
create index idx_livros_titulo on livros(titulo);

-- Populando o banco de dados
insert into autores(nome) values
('J.K.Rowling'),('George R.R. Martin'),('J.R.R.Tolkien');

insert into livros(titulo,autor_id,estoque,ano_publicacao,isbn) values
('Harry Potter e a Pedra Filosofal',1,5,1997,'978747532699'),
('Game of Thrones',2,3,1996,'9780553108354'),
('O Senhor dos Aneis',3,4,1954,'978618640157');

insert into membros(nome,endereco,email) values
('João Silva', 'Rua das Flores,123','joao@email.com'),
('Maria Souza', 'Av. Brasil,456', 'maria@email.com');

insert into emprestimos(livro_id,membro_id,data_prevista_devolucao) values
(1,1,'2024-10-08'),(2,2,'2024-10-10');

select * from autores;
select * from livros;
select * from membros;
select * from emprestimos;
select * from multas;