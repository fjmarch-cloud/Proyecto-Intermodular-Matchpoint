USE matchpoint;

-- Deportes
INSERT INTO deportes (nombre) VALUES 
('Pádel'), ('Tenis'), ('Fútbol');

-- Usuarios
INSERT INTO usuarios (nombre, email, telefono) VALUES
('Juan Pérez', 'juan@email.com', '123456789'),
('Ana López', 'ana@email.com', '987654321');

-- Pistas
INSERT INTO pistas (nombre, tipo, ubicacion, precio_hora, id_deporte) VALUES
('Pista 1', 'Pádel', 'Centro Deportivo', 20.00, 1),
('Pista 2', 'Tenis', 'Centro Deportivo', 15.00, 2);

-- Reservas
INSERT INTO reservas (id_usuario, id_pista, fecha, hora_inicio, hora_fin) VALUES
(1, 1, '2026-05-10', '10:00:00', '11:00:00'),
(2, 2, '2026-05-11', '12:00:00', '13:00:00');

-- Pagos
INSERT INTO pagos (id_reserva, importe, metodo_pago) VALUES
(1, 20.00, 'tarjeta'),
(2, 15.00, 'efectivo');
