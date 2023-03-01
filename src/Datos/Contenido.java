
package Datos;

public class Contenido {
    private String codigo;
    private String nombre;
    private String descripccion;
    private String observaciones;

    public Contenido(String codigo, String nombre, String descripccion, String observaciones) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripccion = descripccion;
        this.observaciones = observaciones;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripccion() {
        return descripccion;
    }

    public void setDescripccion(String descripccion) {
        this.descripccion = descripccion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
   
}
