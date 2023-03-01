package Gestion;

import Conexion.Conexion;
import Datos.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author nitro
 */
public class GestionAuditoria extends Conexion {
    
    //Listar Usuarios Borrados
   
    public DefaultTableModel MostrarAuditoria(JTable tblAlumno) {

        DefaultTableModel modelo = new DefaultTableModel();
        TableRowSorter<TableModel> OrdenarTabla = new TableRowSorter<>(modelo);
        tblAlumno.setRowSorter(OrdenarTabla);
        
        modelo.addColumn("Id");
        modelo.addColumn("fecha-hora");
        modelo.addColumn("usuario");
        modelo.addColumn("operacion");
        modelo.addColumn("tabla");
        modelo.addColumn("observaciones");
        String sql = "select * from auditorias"; //18.65
        String[] datos = new String[6];

        try {
            Statement st = this.conectar().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString(1).trim();
                datos[1] = rs.getString(2).trim();
                datos[2] = rs.getString(3).trim();
                datos[3] = rs.getString(4).trim();
                datos[4] = rs.getString(5).trim();
                datos[5] = rs.getString(6).trim();
                modelo.addRow(datos);
            }
            tblAlumno.setModel(modelo);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo mostrar los registros" + e.getMessage());
        }
        return null;
    }
    
    
}
