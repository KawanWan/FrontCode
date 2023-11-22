drop database if exists BancoLixoEletronico;
CREATE DATABASE BancoLixoEletronico;
use BancoLixoEletronico;

CREATE TABLE empresa (
cnpj varchar(30) primary key,
nome varchar(60) unique not null,
rua varchar(60),
bairro varchar(60),
numero varchar(10),
custoTransporte DECIMAL(10,2) check (custoTransporte > 0)
);

create table residuo (
id int primary key auto_increment,
nome varchar(60) unique not null,
quantidade decimal(10,2) check (quantidade > 0),
valorVenda decimal(10,2) not null,
classe VARCHAR(7),
empresa_CNPJ varchar(25) references Empresa(cnpj)
);

create table funcionario (
idFuncionario int primary key auto_increment,
nome varchar(60) not null unique,
senha varchar(60) not null,
cpf varchar(60) not null check (cpf > 0),
data_nasc DATE not null
);

-- Funcionários
insert into funcionario values (null, 'augusto', '1234', '36489677888', '2002-05-22');
insert into funcionario values (null, 'cicero', '1234', '47953159813', '2003-03-02');
insert into funcionario values (null, 'gustavo', '1234', '46680271894', '2003-06-18');
insert into funcionario values (null, 'kawan', '1234', '46718406856', '2002-07-18');
insert into funcionario values (null, 'pedro', '1234', '51165697807', '2004-02-13');

-- Empresas
INSERT INTO empresa (cnpj, nome, rua, bairro, numero, custoTransporte)
VALUES ('11111111111111', 'Empresa A', 'Rua A', 'Bairro A', 123, 50.00);
INSERT INTO empresa (cnpj, nome, rua, bairro, numero, custoTransporte)
VALUES ('22222222222222', 'Empresa B', 'Rua B', 'Bairro B', 456, 75.00);
INSERT INTO empresa (cnpj, nome, rua, bairro, numero, custoTransporte)
VALUES ('33333333333333', 'Empresa C', 'Rua C', 'Bairro C', 789, 60.00);
INSERT INTO empresa (cnpj, nome, rua, bairro, numero, custoTransporte)
VALUES ('44444444444444', 'Empresa D', 'Rua D', 'Bairro D', 1011, 40.00);
INSERT INTO empresa (cnpj, nome, rua, bairro, numero, custoTransporte)
VALUES ('55555555555555', 'Empresa E', 'Rua E', 'Bairro E', 1213, 55.00);

-- Resíduos
INSERT INTO residuo (nome, quantidade, valorVenda, classe)
VALUES ('Fogão', 5, 200.00, 'Linha Branca');
INSERT INTO residuo (nome, quantidade, valorVenda, classe)
VALUES ('Lavadora de Roupa', 3, 300.00, 'Linha Branca');
INSERT INTO residuo (nome, quantidade, valorVenda, classe)
VALUES ('Refrigerador', 2, 500.00, 'Linha Branca');
INSERT INTO residuo (nome, quantidade, valorVenda, classe)
VALUES ('Monitor', 4, 100.00, 'Linha Marrom');
INSERT INTO residuo (nome, quantidade, valorVenda, classe)
VALUES ('Televisor de Tubo', 2, 150.00, 'Linha Marrom');
INSERT INTO residuo (nome, quantidade, valorVenda, classe)
VALUES ('LED', 3, 200.00, 'Linha Marrom');
INSERT INTO residuo (nome, quantidade, valorVenda, classe)
VALUES ('Batedeira', 6, 50.00, 'Linha Azul');
INSERT INTO residuo (nome, quantidade, valorVenda, classe)
VALUES ('Liquidificador', 4, 40.00, 'Linha Azul');
INSERT INTO residuo (nome, quantidade, valorVenda, classe)
VALUES ('Furadeira', 2, 80.00, 'Linha Azul');
-- Inserção 10
INSERT INTO residuo (nome, quantidade, valorVenda, classe)
VALUES ('Computador', 3, 300.00, 'Linha Verde');