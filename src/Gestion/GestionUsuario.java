package Gestion;

import Conexion.Conexion;
import Datos.Usuario;
import java.util.ArrayList;
import java.util.List;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class GestionUsuario extends Conexion {

    //Insertar Usuario
    public void insertarUsuario(Usuario usr, String Permisos) {
        try {
            PreparedStatement ps = this.conectar().prepareStatement("exec insertar_usr ?,?,?,?,?,?");
            ps.setString(1, usr.getCodigo());
            ps.setString(2, usr.getFullname());
            ps.setString(3, usr.getNikname());
            ps.setString(4, usr.getPassword());
            ps.setString(5, usr.getRol());
            ps.setString(6, usr.getCodBin());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "USUARIO REGISTRADO CORRECTAMENTE");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR EN LA SENTENCIA INSERT: " + ex.getMessage());
        }
    }

    //Seleccionar Rol Usuario
    public String getrol(String login, String password) {

        ResultSet rs = null;
        String rol = null;
        try {
            PreparedStatement ps = this.conectar().prepareStatement("exec getRol ?,?");
            ps.setString(1, login);
            ps.setString(2, password);

            rs = ps.executeQuery();
            while (rs.next()) {
                rol = rs.getString("rol_usr");
            }
            return rol;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la sentencia SELECT: " + ex);
        }
        return rol;

    }

    //Seleccionar Rol Binario
    public String getrolBin(String login, String password) {

        ResultSet rs = null;
        String rolDiv[] = new String[6];
        String rol = null;
        try {
            PreparedStatement ps = this.conectar().prepareStatement("exec getRolBin ?,?");
            ps.setString(1, login);
            ps.setString(2, password);

            rs = ps.executeQuery();
            rs.next();
            rol = rs.getString("codigoBin_usr");
            return rol;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la sentencia SELECT: " + ex);
        }
        System.out.println("este es un rol div" + rolDiv[0]);
        System.out.println("este es un rol div" + rol);
        return rol;
    }

    //Verificar Usuario
    public boolean verificarUsuario(String login, String password) {
        ResultSet rs = null;
        int contador = 0;
        boolean encontro;

        try {

            PreparedStatement ps = this.conectar().prepareStatement("exec verificar_U ?,?");
            ps.setString(1, login);
            ps.setString(2, password);

            rs = ps.executeQuery();
            while (rs.next()) {
                contador++;
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la sentencia SELECT: " + ex);
        }
        if (contador >= 1) {
            encontro = true;
        } else {
            encontro = false;
        }
        return encontro;
    }

    //Buscar Usuarios
    public Usuario BuscarUsuario(String codigo) {
        ResultSet rs = null;
        Usuario usr = null;
        try {
            CallableStatement ps = this.conectar().prepareCall("exec buscar_usuario ?");

            ps.setString(1, codigo);
            rs = ps.executeQuery();
            while (rs.next()) {
                usr = new Usuario(rs.getString("codigo_usr").trim(),
                        rs.getString("fullname_usr").trim(),
                        rs.getString("nikName_usr").trim(),
                        rs.getString("password_usr").trim(),
                        rs.getString("rol_usr").trim(),
                        rs.getString("codigoBin_usr").trim());
            }
            ps.close();
            rs.close();
        } catch (SQLException exql) {
            JOptionPane.showMessageDialog(null, "ERROR EN LA SENTENCIA SELECT: " + exql);
        }
        return usr;

    }

    // Eliminar Usuario
    public boolean eliminarusuario(String codigo) {
        boolean op = false;
        try {
            CallableStatement ps = this.conectar().prepareCall("exec eleminar_usr ?");
            ps.setString(1, codigo);
            ps.executeUpdate();
            op = true;

        } catch (SQLException exql) {
            System.out.println("ERROR EN LA SENTENCIA SELECT: " + exql);
        }
        return op;
    }

     //Listar Contenido
    public List<Usuario> listarUsuarios() throws Exception {
        List<Usuario> lista = null;
        try {
            this.conectar();
            PreparedStatement st = this.conectar().prepareStatement("exec visualizar_usuario");

            lista = new ArrayList();
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Usuario usr;
                usr = new Usuario(
                        rs.getString("codigo_usr").trim(),
                        rs.getString("fullname_usr").trim(),
                        rs.getString("nikName_usr").trim(),
                        rs.getString("password_usr").trim(),
                        rs.getString("rol_usr").trim(),
                        rs.getString("codigoBin_usr").trim()
                );
                lista.add(usr);
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

    //Actualizar
    public void actualizarUsuario(Usuario usr, String Permisos) {
        try {
            PreparedStatement ps = this.conectar().prepareStatement("exec actualizar_usuario ?,?,?,?,?,?");
            ps.setString(1, usr.getCodigo());
            ps.setString(2, usr.getFullname());
            ps.setString(3, usr.getNikname());
            ps.setString(4, usr.getPassword());
            ps.setString(5, usr.getRol());
            ps.setString(6, usr.getCodBin());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "USUARIO ACTUALIZADO CORRECTAMENTE");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR " + ex.getMessage());
        }
    }
}
