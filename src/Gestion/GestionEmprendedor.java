package Gestion;

import Conexion.Conexion;
import Datos.Contenido;
import Datos.Emprendedores;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author nitro
 */
public class GestionEmprendedor extends Conexion {
    
    //Insertar
     public void InsertarEmprendedor(Emprendedores empr) {

        try {
            PreparedStatement ps = this.conectar().prepareStatement("exec insertar_emprendedor ?,?,?,?,?,?,?,?,?,?,?,?");

            ps.setString(1,empr.getId());
            ps.setString(2,empr.getNombre());
            ps.setString(3,empr.getTelefono());
            ps.setString(4,empr.getSexo());
            ps.setString(5,empr.getEmail());
            ps.setString(6,empr.getDireccion());
            ps.setString(7,empr.getNombreTienda());
            ps.setString(8,empr.getDescripcionTienda());
            ps.setString(9,empr.getGoogleMaps());
            ps.setString(10,empr.getFacebookTienda());
            ps.setString(11,empr.getDireccionTienda());
            ps.setString(12,empr.getObservaciones());

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Emprendedor: " + empr.getNombre() + " REGISTRADA CON EXITO");
            this.Cerrar();
        } catch (SQLException SQLE) {
            JOptionPane.showMessageDialog(null, "ERROR EN LA SENTENCIA INSERT");
        }
    }

    //Actualizar
     public void actualizarEmprendedor(Emprendedores empr) {
        try {
            PreparedStatement ps = this.conectar().prepareStatement("exec actualizar_emprendedor ?,?,?,?,?,?,?,?,?,?,?,?");
            
            ps.setString(1,empr.getId());
            ps.setString(2,empr.getNombre());
            ps.setString(3,empr.getTelefono());
            ps.setString(4,empr.getSexo());
            ps.setString(5,empr.getEmail());
            ps.setString(6,empr.getDireccion());
            ps.setString(7,empr.getNombreTienda());
            ps.setString(8,empr.getDescripcionTienda());
            ps.setString(9,empr.getGoogleMaps());
            ps.setString(10,empr.getFacebookTienda());
            ps.setString(11,empr.getDireccionTienda());
            ps.setString(12,empr.getObservaciones());

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "EMPRENDEDOR ACTUALIZADO CORRECTAMENTE");
            this.Cerrar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR " + ex.getMessage());
        }
    }

     
    //Buscar
     public Emprendedores BuscarEmprendedor(String codigo) throws SQLException {
        ResultSet rs = null;
        Emprendedores empr = null;
        try {
            CallableStatement ps = this.conectar().prepareCall("exec buscar_emprendedor ?");
            ps.setString(1, codigo);
            rs = ps.executeQuery();
            while (rs.next()) {
                empr = new Emprendedores(
                        rs.getString("id_emp").trim(),
                        rs.getString("nombre_emp").trim(),
                        rs.getString("telefono_emp").trim(),
                        rs.getString("sexo_emp").trim(),
                        rs.getString("email_emp").trim(),
                        rs.getString("direccion_emp").trim(),
                        rs.getString("nombre_tie_emp").trim(),
                        rs.getString("descripccion_tie_emp").trim(),
                        rs.getString("googleMaps_tie_emp").trim(),
                        rs.getString("facebook_emp").trim(),
                        rs.getString("direccion_tie_emp").trim(),
                        rs.getString("observaciones_emp").trim()
                );
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        return empr;
    }
     
    //Eliminar
        public boolean eliminarEmprendedor(String codigo) {
        boolean op = false;
        try {
            CallableStatement ps = this.conectar().prepareCall("exec eliminar_emprendedor ?");
            ps.setString(1, codigo);
            ps.executeUpdate();
            op = true;
            ps.close();
        } catch (SQLException exql) {
            JOptionPane.showMessageDialog(null, "ERROR AL ELIMINAR EMPRENDEDOR: " + exql);
        }
        return op;
    }

     
    //Listar
     public List<Emprendedores> listarEmprendedores() throws Exception {
        List<Emprendedores> lista = null;
        try {
            this.conectar();
            PreparedStatement st = this.conectar().prepareStatement("exec visualizar_emprendedor");

            lista = new ArrayList();
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Emprendedores empr;
                empr = new Emprendedores(
                       rs.getString("id_emp").trim(),
                        rs.getString("nombre_emp").trim(),
                        rs.getString("telefono_emp").trim(),
                        rs.getString("sexo_emp").trim(),
                        rs.getString("email_emp").trim(),
                        rs.getString("direccion_emp").trim(),
                        rs.getString("nombre_tie_emp").trim(),
                        rs.getString("descripccion_tie_emp").trim(),
                        rs.getString("googleMaps_tie_emp").trim(),
                        rs.getString("facebook_emp").trim(),
                        rs.getString("direccion_tie_emp").trim(),
                        rs.getString("observaciones_emp").trim()
                );
                lista.add(empr);
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

    
    
}
