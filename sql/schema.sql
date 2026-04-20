-- Base de datos MatchPoint
CREATE DATABASE IF NOT EXISTS matchpoint;
USE matchpoint;

-- =====================
-- TABLA USUARIOS
-- =====================
CREATE TABLE usuarios (
    id_usuario INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    telefono VARCHAR(20),
    fecha_registro TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- =====================
-- TABLA DEPORTES
-- =====================
CREATE TABLE deportes (
    id_deporte INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL
);

-- =====================
-- TABLA PISTAS
-- =====================
CREATE TABLE pistas (
    id_pista INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    tipo VARCHAR(50), -- pádel, tenis, fútbol…
    ubicacion VARCHAR(100),
    precio_hora DECIMAL(6,2) NOT NULL,
    id_deporte INT,
    FOREIGN KEY (id_deporte) REFERENCES deportes(id_deporte)
);

-- =====================
-- TABLA RESERVAS
-- =====================
CREATE TABLE reservas (
    id_reserva INT AUTO_INCREMENT PRIMARY KEY,
    id_usuario INT NOT NULL,
    id_pista INT NOT NULL,
    fecha DATE NOT NULL,
    hora_inicio TIME NOT NULL,
    hora_fin TIME NOT NULL,
    estado VARCHAR(50) DEFAULT 'activa',

    FOREIGN KEY (id_usuario) REFERENCES usuarios(id_usuario),
    FOREIGN KEY (id_pista) REFERENCES pistas(id_pista)
);

-- =====================
-- TABLA PAGOS
-- =====================
CREATE TABLE pagos (
    id_pago INT AUTO_INCREMENT PRIMARY KEY,
    id_reserva INT NOT NULL,
    importe DECIMAL(6,2) NOT NULL,
    metodo_pago VARCHAR(50), -- tarjeta, efectivo…
    fecha_pago TIMESTAMP DEFAULT CURRENT_TIMESTAMP,

    FOREIGN KEY (id_reserva) REFERENCES reservas(id_reserva)
);
