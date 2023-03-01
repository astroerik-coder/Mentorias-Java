
package Datos;


public class Emprendedores {
    private String id;
    private String nombre;
    private String telefono;
    private String sexo;
    private String email;
    private String direccion;
    private String nombreTienda;
    private String descripcionTienda;
    private String googleMaps;
    private String direccionTienda;
    private String facebookTienda;
    private String observaciones;

    public Emprendedores(String id, String nombre, String telefono, String sexo, String email, String direccion, String nombreTienda, String descripcionTienda, String googleMaps, String direccionTienda, String facebookTienda, String observaciones) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.sexo = sexo;
        this.email = email;
        this.direccion = direccion;
        this.nombreTienda = nombreTienda;
        this.descripcionTienda = descripcionTienda;
        this.googleMaps = googleMaps;
        this.direccionTienda = direccionTienda;
        this.facebookTienda = facebookTienda;
        this.observaciones = observaciones;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombreTienda() {
        return nombreTienda;
    }

    public void setNombreTienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
    }

    public String getDescripcionTienda() {
        return descripcionTienda;
    }

    public void setDescripcionTienda(String descripcionTienda) {
        this.descripcionTienda = descripcionTienda;
    }

    public String getGoogleMaps() {
        return googleMaps;
    }

    public void setGoogleMaps(String googleMaps) {
        this.googleMaps = googleMaps;
    }

    public String getDireccionTienda() {
        return direccionTienda;
    }

    public void setDireccionTienda(String direccionTienda) {
        this.direccionTienda = direccionTienda;
    }

    public String getFacebookTienda() {
        return facebookTienda;
    }

    public void setFacebookTienda(String facebookTienda) {
        this.facebookTienda = facebookTienda;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    
}
