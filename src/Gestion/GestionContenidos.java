package Gestion;

import Conexion.Conexion;
import Datos.Contenido;
import Datos.Usuario;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class GestionContenidos extends Conexion {

    //Insertar contenido
    public void InsertarContenido(Contenido cont) {

        try {
            PreparedStatement ps = this.conectar().prepareStatement("insertar_contenidos ?,?,?,?");

            ps.setString(1, cont.getCodigo());
            ps.setString(2, cont.getNombre());
            ps.setString(3, cont.getDescripccion());
            ps.setString(4, cont.getObservaciones());

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Contenido: " + cont.getNombre() + " REGISTRADA CON EXITO");
            this.Cerrar();
        } catch (SQLException SQLE) {
            JOptionPane.showMessageDialog(null, "ERROR EN LA SENTENCIA INSERT");
        } 
    }

    //Actualizar contenido
    public void actualizarContenido(Contenido ctd) {
        try {
            PreparedStatement ps = this.conectar().prepareStatement("exec actualizar_contenido ?,?,?,?");
            ps.setString(1, ctd.getCodigo());
            ps.setString(2, ctd.getNombre());
            ps.setString(3, ctd.getDescripccion());
            ps.setString(4, ctd.getObservaciones());

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "CONTENIDO ACTUALIZADO CORRECTAMENTE");
            this.Cerrar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR " + ex.getMessage());
        }
    }

    //Eliminar contenido
    public boolean eliminarContenido(String codigo) {
        boolean op = false;
        try {
            CallableStatement ps = this.conectar().prepareCall("exec eliminar_contenido ?");
            ps.setString(1, codigo);
            ps.executeUpdate();
            op = true;
            ps.close();
        } catch (SQLException exql) {
            JOptionPane.showMessageDialog(null, "ERROR AL ELIMINAR CONTENIDO: " + exql);
        }
        return op;
    }
    
    //Buscar contenido
    public Contenido BuscarContenido(String codigo) throws SQLException {
        ResultSet rs = null;
        Contenido ctd = null;
        try {
            CallableStatement ps = this.conectar().prepareCall("exec buscar_contenido ?");
            ps.setString(1, codigo);
            rs = ps.executeQuery();
            while (rs.next()) {
                ctd = new Contenido(
                        rs.getString("codigo_con").trim(),
                        rs.getString("nombre_con").trim(),
                        rs.getString("descripcion_con").trim(),
                        rs.getString("observaciones_con").trim()
                );
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        return ctd;
    }

    //Mostrar contenido
    public List<Contenido> listarContenidos() throws Exception {
        List<Contenido> lista = null;
        try {
            this.conectar();
            PreparedStatement st = this.conectar().prepareStatement("exec visualizar_contenidos");

            lista = new ArrayList();
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Contenido ctd;
                ctd = new Contenido(
                        rs.getString("codigo_con").trim(),
                        rs.getString("nombre_con").trim(),
                        rs.getString("descripcion_con").trim(),
                        rs.getString("observaciones_con").trim()
                );
                lista.add(ctd);
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
