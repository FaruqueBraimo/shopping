CREATE TABLE categoria (
    id VARCHAR(256) PRIMARY KEY,
    nome VARCHAR(256),
    UNIQUE (id, nome)

);

CREATE TABLE cor (
    id VARCHAR(256) PRIMARY KEY,
    nome VARCHAR(256),
    UNIQUE (id, nome)


);

CREATE TABLE marca (
    id VARCHAR(256) PRIMARY KEY,
    nome VARCHAR(256),
    UNIQUE (id, nome)

);

CREATE TABLE calcado (
    id VARCHAR(256) PRIMARY KEY,
    nome VARCHAR(256) ,
    tamanho int NOT NULL,
    quantidade_stock int NOT NULL,
    preco int NOT NULL,
    descricao VARCHAR(256)  NOT NULL,
    data_criacao TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    marca VARCHAR(256) NOT NULL,
    CONSTRAINT marca FOREIGN KEY(marca) REFERENCES marca(id),
     categoria VARCHAR(256) NOT NULL,
     CONSTRAINT categoria FOREIGN KEY(categoria) REFERENCES categoria(id),
    cor VARCHAR(256) NOT NULL,
    CONSTRAINT cor FOREIGN KEY(cor) REFERENCES cor(id),
    UNIQUE (id, nome)

);

