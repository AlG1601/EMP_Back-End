CREATE DATABASE IF NOT EXISTS EMP;
USE EMP;

CREATE TABLE USER (
ID INT PRIMARY KEY auto_increment,
NOME VARCHAR(200) NOT NULL,
SENHA VARCHAR(8) NOT NULL
);

INSERT INTO USER (ID, NOME, SENHA) VALUES
(1, "Guilherme", "123456");

SELECT * FROM USER;