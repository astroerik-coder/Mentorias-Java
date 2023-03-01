
package vistas;

/**
 *
 * @author nitro
 */
public class GestionLogin extends Login {
    
    private String dato;

    /**
     *
     * @param dato
     */
    public GestionLogin(String dato) {
        System.out.println("Dato: "+dato);
        this.dato = dato;     
    }
    
    
    
    public String enviar(){
        System.out.println("Envio: "+this.dato);
        return this.dato;
    }
   
}
