package Gestion;

import Conexion.Conexion;
import Datos.Usuario;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nitro
 */
public class GestionAuditoria extends Conexion {
    
    //Listar Usuarios Borrados
    /*
    
    public ArrayList<Usuario> ListarUsuariosBorrados(){
        ArrayList<Usuario> usr=new ArrayList<>();
        try {
            PreparedStatement st=this.conectar().prepareStatement("select * from respaldo_usuario");
            rs=st.executeQuery();
            while (rs.ext()) {
                Usuario(tbl);
                
            }
        } catch (Exception e) {
        }
    }
    
    /*public void Mostar Usuario(JTable tbl){
            DefaultTableModel modelo= new DefaultTableModel();
            modelo.addColumn("Codigo");
            modelo.addColumn("Fullname");
            modelo.addColumn("Nickname");
            modelo.addColumn("Password");
            modelo.addColumn("Rol");
            modelo.addColumn("Fecha y hora");
            
            tbl.setModel(modelo);
            
            
            
    }*/
    
    //Listar Usuarios Actualizados
    
}
