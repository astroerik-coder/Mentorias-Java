package Gestion;

import Conexion.Conexion;
import Datos.Mentoria;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import vistas.Menu;
import vistas.Menu;
/**
 *
 * @author nitro
 */
public class GestionMentorias extends Conexion{
    //Insertar
     public void InsertarMentoria(Mentoria ment) {
        try {
            PreparedStatement ps = this.conectar().prepareStatement("exec insertar_mentoria ?,?,?,?,?,?,?,?,?,?");

            ps.setString(1, ment.getId());
            ps.setString(2, ment.getNombre());
            ps.setString(3, ment.getDescripcion());
            ps.setString(4, ment.getFecha());
            ps.setString(5, ment.getHora());
            ps.setString(6, ment.getObservaciones());
            ps.setString(7, ment.getIdEmprendedor());
            ps.setString(8, ment.getIdEncargado());
            ps.setString(9, ment.getIdContenido());
            
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "MENTORIA: " + ment.getNombre() + " REGISTRADA CON EXITO");
            this.Cerrar();
        } catch (SQLException SQLE) {
            JOptionPane.showMessageDialog(null, "ERROR EN LA SENTENCIA INSERT");
        }
    }
     
     
    //Actualizar
    public void actualizarMentoria(Mentoria ment) {
        try {
            PreparedStatement ps = this.conectar().prepareStatement("exec actualizar_mentoria ?,?,?,?,?,?,?,?,?");

           ps.setString(1, ment.getId());
            ps.setString(2, ment.getNombre());
            ps.setString(3, ment.getDescripcion());
            ps.setString(4, ment.getFecha());
            ps.setString(5, ment.getHora());
            ps.setString(6, ment.getObservaciones());
            ps.setString(7, ment.getIdEmprendedor());
            ps.setString(8, ment.getIdEncargado());
            ps.setString(9, ment.getIdContenido());

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "MENTORIA ACTUALIZADO CORRECTAMENTE");
            this.Cerrar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR " + ex.getMessage());
        }
    }
    
    //Eliminar
    public boolean eliminarMentoria(String codigo) {
        boolean op = false;
        try {
            CallableStatement ps = this.conectar().prepareCall("exec eliminar_mentoria ?");
            ps.setString(1, codigo);
            ps.executeUpdate();
            op = true;
            ps.close();
        } catch (SQLException exql) {
            JOptionPane.showMessageDialog(null, "ERROR AL ELIMINAR MENTORIA: " + exql);
        }
        return op;
    }
    
    
      //Buscar
    public Mentoria BuscarMentoria(String codigo) throws SQLException {
        ResultSet rs = null;
        Mentoria ment = null;
        try {
            CallableStatement ps = this.conectar().prepareCall("exec buscar_mentoria ?");
            ps.setString(1, codigo);
            rs = ps.executeQuery();
            while (rs.next()) {
                ment = new Mentoria(
                        rs.getString("id_men").trim(),
                        rs.getString("nombre_men").trim(),
                        rs.getString("descripcion_men").trim(),
                        rs.getString("fecha_men"),
                        rs.getString("hora_men"),
                        rs.getString("observaciones_men").trim(),
                        rs.getString("id_emp").trim(),
                        rs.getString("id_enc").trim(),
                        rs.getString("codigo_con").trim()
                );
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        return ment;
    }
      
    
    //Listar
    public List<Mentoria> listarMentorias() throws Exception {
        List<Mentoria> lista = null;
        Mentoria ment;
        try {
            this.conectar();
            PreparedStatement st = this.conectar().prepareStatement("exec visualizar_mentoria");

            lista = new ArrayList();
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                ment = new Mentoria(
                        rs.getString("id_men").trim(),
                        rs.getString("nombre_men").trim(),
                        rs.getString("descripcion_men").trim(),
                        rs.getString("fecha_men"),
                        rs.getString("hora_men"),
                        rs.getString("observaciones_men").trim(),
                        rs.getString("id_emp").trim(),
                        rs.getString("id_enc").trim(),
                        rs.getString("codigo_con").trim()
                );
                lista.add(ment);
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        return lista;
    }
    
    
    public void llenarComboBox(String valor, String tabla,JComboBox cbo) throws SQLException{
        String sql="Select "+valor+" from "+tabla+";";
        try {
              PreparedStatement st = this.conectar().prepareStatement(sql);
              ResultSet rs = st.executeQuery();

              while(rs.next()){
                  cbo.addItem(rs.getString(valor));
              }
              this.Cerrar();
        } catch (SQLException exql) {
            JOptionPane.showMessageDialog(null, "ERROR AL OBTENER DATOS: " + exql);
        }
    }
    
}
