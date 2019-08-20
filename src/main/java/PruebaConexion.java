import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class PruebaConexion {
    private static String url = "jdbc:mysql://localhost:3306/Paddle";
    private static String user = "root";
    private static String password = "s2dnp395Ab*";
    private static Connection miConexion;
    private static Statement miStatement;
    private static ResultSet miResultado;

   public static void main(String[] args) {

       try
        {
            miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/Paddle","root","s2dnp395Ab*");
            miStatement = miConexion.createStatement();
            miResultado = miStatement.executeQuery("select * from Cancha");
            while(miResultado.next()) {
               System.out.println(miResultado.getString("idCancha")+" "+miResultado.getString("nombre"));
            }
        }

        catch (Exception e) {
            System.out.println("No conecta");
        }
    }
}
