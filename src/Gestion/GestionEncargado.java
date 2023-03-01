package Gestion;

import Conexion.Conexion;
import Datos.Encargados;
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
public class GestionEncargado extends Conexion {

    //Insertar
    public void InsertarEncargado(Encargados enc) {
        try {
            PreparedStatement ps = this.conectar().prepareStatement("exec insertar_encargado ?,?,?,?,?,?,?,?");

            ps.setString(1, enc.getId());
            ps.setString(2, enc.getCedula());
            ps.setString(3, enc.getNombre());
            ps.setString(4, enc.getTelefono());
            ps.setString(5, enc.getEmail());
            ps.setString(6, enc.getDireccion());
            ps.setString(7, enc.getSexo());
            ps.setString(8, enc.getObservaciones());

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "ENCARGADO: " + enc.getNombre() + " REGISTRADA CON EXITO");
            this.Cerrar();
        } catch (SQLException SQLE) {
            JOptionPane.showMessageDialog(null, "ERROR EN LA SENTENCIA INSERT");
        }
    }

    //Actualizar
    public void actualizarEncargados(Encargados enc) {
        try {
            PreparedStatement ps = this.conectar().prepareStatement("exec actualizar_encargado ?,?,?,?,?,?,?,?");

            ps.setString(1, enc.getId());
            ps.setString(2, enc.getCedula());
            ps.setString(3, enc.getNombre());
            ps.setString(4, enc.getTelefono());
            ps.setString(5, enc.getEmail());
            ps.setString(6, enc.getDireccion());
            ps.setString(7, enc.getSexo());
            ps.setString(8, enc.getObservaciones());

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "ENCARGADO ACTUALIZADO CORRECTAMENTE");
            this.Cerrar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR " + ex.getMessage());
        }
    }

    //Buscar
    public Encargados BuscarEncargados(String codigo) throws SQLException {
        ResultSet rs = null;
        Encargados enc = null;
        try {
            CallableStatement ps = this.conectar().prepareCall("exec buscar_encargado ?");
            ps.setString(1, codigo);
            rs = ps.executeQuery();
            while (rs.next()) {
                enc = new Encargados(
                        rs.getString("id_enc").trim(),
                        rs.getString("cedula_enc").trim(),
                        rs.getString("nombre_enc").trim(),
                        rs.getString("telefono_enc").trim(),
                        rs.getString("email_enc").trim(),
                        rs.getString("direccion_enc").trim(),
                        rs.getString("sexo_enc").trim(),
                        rs.getString("observaciones_enc").trim()
                );
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        return enc;
    }

    //Eliminar
    public boolean eliminarEncargado(String codigo) {
        boolean op = false;
        try {
            CallableStatement ps = this.conectar().prepareCall("exec eliminar_encargado ?");
            ps.setString(1, codigo);
            ps.executeUpdate();
            op = true;
            ps.close();
        } catch (SQLException exql) {
            JOptionPane.showMessageDialog(null, "ERROR AL ELIMINAR ENCARGADO: " + exql);
        }
        return op;
    }

    //Listar
    public List<Encargados> listarEncargados() throws Exception {
        List<Encargados> lista = null;
        Encargados enc;
        try {
            this.conectar();
            PreparedStatement st = this.conectar().prepareStatement("exec visualizar_encargado");

            lista = new ArrayList();
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                enc = new Encargados(
                        rs.getString("id_enc").trim(),
                        rs.getString("cedula_enc").trim(),
                        rs.getString("nombre_enc").trim(),
                        rs.getString("telefono_enc").trim(),
                        rs.getString("email_enc").trim(),
                        rs.getString("direccion_enc").trim(),
                        rs.getString("sexo_enc").trim(),
                        rs.getString("observaciones_enc").trim()
                );
                lista.add(enc);
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
