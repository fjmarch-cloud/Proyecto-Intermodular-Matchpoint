USE matchpoint;

-- Ver reservas con datos completos
SELECT u.nombre, p.nombre AS pista, r.fecha, r.hora_inicio, r.hora_fin
FROM reservas r
JOIN usuarios u ON r.id_usuario = u.id_usuario
JOIN pistas p ON r.id_pista = p.id_pista;

-- Buscar reservas por usuario
SELECT * FROM reservas
WHERE id_usuario = 1;

-- Ver ingresos totales
SELECT SUM(importe) AS total_ingresos FROM pagos;

-- Ver pistas disponibles (ejemplo simple)
SELECT * FROM pistas;
