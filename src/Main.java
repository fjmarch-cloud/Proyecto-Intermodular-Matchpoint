public class Main {
    public static void main(String[] args) {
        System.out.println("MatchPoint iniciado");
    }
}

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {

        Connection conn = DatabaseConnection.getConnection();

        if (conn != null) {
            System.out.println("Conexión OK");
        } else {
            System.out.println("Error");
        }
    }
}
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        UsuarioDAO dao = new UsuarioDAO();

        int opcion;

        do {
            System.out.println("\n--- MATCHPOINT ---");
            System.out.println("1. Crear usuario");
            System.out.println("2. Ver usuarios");
            System.out.println("0. Salir");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Email: ");
                    String email = sc.nextLine();

                    dao.insertarUsuario(new Usuario(nombre, email));
                    break;

                case 2:
                    List<Usuario> usuarios = dao.obtenerUsuarios();
                    for (Usuario u : usuarios) {
                        System.out.println(u.getNombre() + " - " + u.getEmail());
                    }
                    break;
            }

        } while (opcion != 0);
    }
}
