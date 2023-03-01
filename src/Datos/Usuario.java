
package Datos;


public class Usuario {
    private String codigo;
    private String fullname;
    private String nikname;
    private String password;
    private String rol;
    private String codBin;

    public Usuario(String codigo, String fullname, String nikname, String password, String rol, String codBin) {
        this.codigo = codigo;
        this.fullname = fullname;
        this.nikname = nikname;
        this.password = password;
        this.rol = rol;
        this.codBin = codBin;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getNikname() {
        return nikname;
    }

    public void setNikname(String nikname) {
        this.nikname = nikname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getCodBin() {
        return codBin;
    }

    public void setCodBin(String codBin) {
        this.codBin = codBin;
    }
    
    
}
