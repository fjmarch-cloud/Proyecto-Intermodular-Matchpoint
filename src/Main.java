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
