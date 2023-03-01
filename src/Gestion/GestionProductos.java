package Gestion;

import Datos.Productos;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Conexion.Conexion;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;

/**
 *
 * @author nitro
 */
public class GestionProductos extends Conexion {
    //Insertar
    public void InsertarProducto(Productos prd) {
        try {
            PreparedStatement ps = this.conectar().prepareStatement("exec insertar_productos ?,?,?,?,?,?");

            ps.setString(1, prd.getId());
            ps.setString(2, prd.getNombre());
            ps.setString(3, prd.getDescripcion());
            ps.setFloat(4, prd.getPrecio());
            ps.setString(5, prd.getObservaciones());
            ps.setString(6, prd.getId_emp());

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "PRODUCTO: " + prd.getNombre() + " REGISTRADA CON EXITO");
            this.Cerrar();
        } catch (SQLException SQLE) {
            JOptionPane.showMessageDialog(null, "ERROR EN LA SENTENCIA INSERT");
        }
    }

    //Actualizar
    public void actualizarProductos(Productos prd) {
        try {
            PreparedStatement ps = this.conectar().prepareStatement("exec actualizar_producto ?,?,?,?,?,?");


            ps.setString(1, prd.getId());
            ps.setString(2, prd.getNombre());
            ps.setString(3, prd.getDescripcion());
            ps.setFloat(4, prd.getPrecio());
            ps.setString(5, prd.getObservaciones());
            ps.setString(6, prd.getId_emp());

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "PRODUCTO ACTUALIZADO CORRECTAMENTE");
            this.Cerrar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR " + ex.getMessage());
        }
    }
    
   //Buscar
    public Productos BuscarProducto(String codigo) throws SQLException {
        ResultSet rs = null;
        Productos prd = null;
        try {
            CallableStatement ps = this.conectar().prepareCall("exec buscar_producto ?");
            ps.setString(1, codigo);
            rs = ps.executeQuery();
            while (rs.next()) {
                
                prd = new Productos (
                        
                        rs.getString("id_pro").trim(),
                        rs.getString("nombre_pro").trim(),
                        rs.getString("descripcion_pro").trim(),
                        rs.getFloat("precion_pro"),
                        rs.getString("observaciones_pro").trim(),
                        rs.getString("id_emp").trim()
                );
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        return prd;
    }

   //Eliminar
    public boolean eliminarProducto(String codigo) {
        boolean op = false;
        try {
            CallableStatement ps = this.conectar().prepareCall("exec eliminar_producto ?");
            ps.setString(1, codigo);
            ps.executeUpdate();
            op = true;
            ps.close();
        } catch (SQLException exql) {
            JOptionPane.showMessageDialog(null, "ERROR AL ELIMINAR PRODUCTO: " + exql);
        }
        return op;
    }

    //Listar
    public List<Productos> listarProductos() throws Exception {
        List<Productos> lista = null;
        Productos prd;
        try {
            /**PreparedStatement st = this.conectar().prepareStatement("exec visualizar_producto"); */           
            PreparedStatement st = this.conectar().prepareStatement("select * from view_producto");

            lista = new ArrayList();
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                prd = new Productos (
                        rs.getString("id_pro").trim(),
                        rs.getString("nombre_pro").trim(),
                        rs.getString("descripcion_pro").trim(),
                        rs.getFloat("precion_pro"),
                        rs.getString("id_emp").trim(),
                        rs.getString("nombre_emp").trim() 
                );
                lista.add(prd);
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

    public void llenarComboBox(String valor, JComboBox cbo) throws SQLException{
        try {
              PreparedStatement st = this.conectar().prepareStatement("exec llenar_combo");
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
