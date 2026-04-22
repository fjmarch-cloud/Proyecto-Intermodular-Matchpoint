CREATE DATABASE matchpoint;
USE matchpoint;

CREATE TABLE usuario (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
    email VARCHAR(100) UNIQUE,
    password VARCHAR(100)
);

CREATE TABLE pista (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
    deporte VARCHAR(50)
);

CREATE TABLE reserva (
    id INT AUTO_INCREMENT PRIMARY KEY,
    id_usuario INT,
    id_pista INT,
    fecha DATE,
    hora TIME,
    FOREIGN KEY (id_usuario) REFERENCES usuario(id),
    FOREIGN KEY (id_pista) REFERENCES pista(id)
);
