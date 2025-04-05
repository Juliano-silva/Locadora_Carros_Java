import java.sql.DriverManager;
import java.sql.SQLException;

public class Sqlite {
    public static void connect() {
        // connection string
        var url = "jdbc:sqlite:C:/Users/sustu/OneDrive/Pictures/Programação/Java/Java Swing/Locadora_Projeto/src/Banco.db";

        try (var conn = DriverManager.getConnection(url)) {
            System.out.println("Connection to SQLite has been established.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        connect();
    }
}
