/*
Exercício 9: 
Relacionamento entre Funcionários e Projetos
Em um sistema de gerenciamento de projetos, vários funcionários podem estar 
envolvidos em vários projetos. Modele essa relação com uma cardinalidade muitos para-muitos e adicione os atributos apropriados:
- Entidade 1: Funcionário
 - Atributos: FuncionarioID (Chave Primária), Nome, Cargo, Data de Contratação, 
Salário, etc.
- Entidade 2: Projeto
- Atributos: ProjetoID (Chave Primária), Nome do Projeto, Data de Início, Data de 
Término, Orçamento, etc.
- Entidade Associativa: Atribuição
 - Atributos: AtribuicaoID (Chave Primária), Função no Projeto, Horas Alocadas, etc.
 - Chaves Estrangeiras: FuncionarioID (Referência à tabela Funcionario), ProjetoID 
(Referência à tabela Projeto)
*/

create database  Gerenciaproj;
use Gerenciaproj;

create table funcionarios
(
funcionarioId int auto_increment primary key,
nome_func varchar(100),
cargo varchar(100),
dt_contrata date
);

create table projetos 
(
projetoId int auto_increment primary key,
nome_proj varchar(100),
dt_inicio date,
dt_termino date,
orcamento double
);

create table atribuicoes
(
atribuicaoId int auto_increment primary key,
funcioId int,
projId int,
funcao_no_proj varchar(150),
horas_alocadas double,
constraint fk_funcionarioIdAtribui foreign key(funcioId)
references funcionarios(funcionarioId),
constraint fk_projetosIdAtribui foreign key(projId)
references projetos(projetoId)projetosfuncionariosfuncionariosatribuicoesatribuicaoIdfuncioIdprojId
);