# calendario-backend

### criação de banco

CREATE DATABASE token;

use token;

CREATE TABLE evento (
id_evento INT(10) NOT NULL PRIMARY KEY AUTO_INCREMENT,
descricao VARCHAR(100) NOT NULL,
hora_inicio TIMESTAMP NOT NULL,
hora_fim TIMESTAMP NOT NULL
);

SELECT * from evento;

CREATE USER 'cadastra_eventos_app'@'localhost' IDENTIFIED BY 'desafiotoken';

GRANT ALL PRIVILEGES ON token.* TO 'cadastra_eventos_app'@'localhost';

