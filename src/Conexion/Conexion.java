
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Conexion {
    
    public Connection conectar() {
         String conexionUrl="jdbc:sqlserver://localhost:1433;"
                +"database=dbmentorias;"
                +"user=admin;"
                +"password=admin;"
                +"loginTimeout=30;"
                +"TrustServerCertificate=True;";
        try {

            Connection con = (Connection) DriverManager.getConnection(conexionUrl);
            System.out.println("Conexion Realizada Correctamente");
            return con;
        } catch (SQLException sqlex) {
            JOptionPane.showMessageDialog(null, "ERROR AL CONECTAR CON LA BASE DATOS " + sqlex.getMessage());
            return  null;
        }
    }
    
    public void Cerrar() throws SQLException{
        if (conectar() != null) {
            if (!conectar().isClosed()) {
                conectar().close();
            }
        }
    }
    
}
