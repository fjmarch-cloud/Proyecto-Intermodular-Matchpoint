package dao;

import model.Reserva;
import utils.DatabaseConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ReservaDAO {

    public void crearReserva(Reserva r) {
        String sql = "INSERT INTO reservas (id_usuario, id_pista, fecha, hora) VALUES (?, ?, ?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, r.getIdUsuario());
            stmt.setInt(2, r.getIdPista());
            stmt.setString(3, r.getFecha());
            stmt.setString(4, r.getHora());

            stmt.executeUpdate();
            System.out.println("Reserva creada");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<String> verReservas() {
        List<String> lista = new ArrayList<>();

        String sql = "SELECT u.nombre, p.nombre AS pista, r.fecha, r.hora " +
                     "FROM reservas r " +
                     "JOIN usuarios u ON r.id_usuario = u.id_usuario " +
                     "JOIN pistas p ON r.id_pista = p.id_pista";

        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                String info = rs.getString("nombre") + " - " +
                              rs.getString("pista") + " - " +
                              rs.getString("fecha") + " " +
                              rs.getString("hora");

                lista.add(info);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }
}
