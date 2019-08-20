import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ModificaBBDD {
        private static String url = "jdbc:mysql://localhost:3306/Paddle";
        private static String user = "root";
        private static String password = "s2dnp395Ab*";
        private static Connection miConexion;
        private static Statement miStatement;
        private static ResultSet miResultado;

        public static void main(String[] args) {

            try {
                miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/Paddle", "root", "s2dnp395Ab*");
                miStatement = miConexion.createStatement();
                String insertaCancha = "insert into Cancha (nombre,tieneIluminacion,idColor) values ('La estacion',1,null)";
                miStatement.executeUpdate(insertaCancha);
            } catch (Exception e) {
                System.out.println("No conecta"+"\n");
                e.printStackTrace();
            }
        }
    }
