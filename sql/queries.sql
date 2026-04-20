USE matchpoint;

-- Ver reservas con datos completos
SELECT 
    u.nombre AS usuario,
    p.nombre AS pista,
    r.fecha,
    r.hora_inicio,
    r.hora_fin,
    pa.importe
FROM reservas r
JOIN usuarios u ON r.id_usuario = u.id_usuario
JOIN pistas p ON r.id_pista = p.id_pista
LEFT JOIN pagos pa ON r.id_reserva = pa.id_reserva;

-- Buscar reservas por usuario
SELECT * 
FROM reservas
WHERE id_usuario = 1;

-- Ver ingresos totales
SELECT SUM(importe) AS total_ingresos 
FROM pagos;

-- Ver pistas disponibles
SELECT 
    p.nombre,
    COUNT(r.id_reserva) AS total_reservas
FROM pistas p
JOIN reservas r ON p.id_pista = r.id_pista
GROUP BY p.nombre
ORDER BY total_reservas DESC;

--Reservas por fecha
SELECT *
FROM reservas
WHERE fecha = '2026-05-10';
