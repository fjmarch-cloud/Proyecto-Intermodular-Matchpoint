package model;

public class Reserva {
    private int idUsuario;
    private int idPista;
    private String fecha;
    private String hora;

    public Reserva(int idUsuario, int idPista, String fecha, String hora) {
        this.idUsuario = idUsuario;
        this.idPista = idPista;
        this.fecha = fecha;
        this.hora = hora;
    }

    public int getIdUsuario() { return idUsuario; }
    public int getIdPista() { return idPista; }
    public String getFecha() { return fecha; }
    public String getHora() { return hora; }
}
