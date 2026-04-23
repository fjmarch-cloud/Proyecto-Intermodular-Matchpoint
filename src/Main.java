import java.util.List;
import java.util.Scanner;

import dao.UsuarioDAO;
import dao.ReservaDAO;
import model.Usuario;
import model.Reserva;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        ReservaDAO reservaDAO = new ReservaDAO();

        int opcion;

        do {
            System.out.println("\n--- MATCHPOINT ---");
            System.out.println("1. Crear usuario");
            System.out.println("2. Ver usuarios");
            System.out.println("3. Crear reserva");
            System.out.println("4. Ver reservas");
            System.out.println("0. Salir");

            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {

                case 1:
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Email: ");
                    String email = sc.nextLine();

                    usuarioDAO.insertarUsuario(new Usuario(nombre, email));
                    break;

                case 2:
                    List<Usuario> usuarios = usuarioDAO.obtenerUsuarios();
                    for (Usuario u : usuarios) {
                        System.out.println(u.getNombre() + " - " + u.getEmail());
                    }
                    break;

                case 3:
                    System.out.print("ID Usuario: ");
                    int idUsuario = sc.nextInt();

                    System.out.print("ID Pista: ");
                    int idPista = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Fecha (YYYY-MM-DD): ");
                    String fecha = sc.nextLine();

                    System.out.print("Hora (HH:MM:SS): ");
                    String hora = sc.nextLine();

                    reservaDAO.crearReserva(new Reserva(idUsuario, idPista, fecha, hora));
                    break;

                case 4:
                    for (String r : reservaDAO.verReservas()) {
                        System.out.println(r);
                    }
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida");
            }

        } while (opcion != 0);

        sc.close();
    }
}
