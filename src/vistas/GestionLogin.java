package vistas;

public class GestionLogin{
    
    public String datos[]=new String[1];
    private static String user;
    
   public void obtenerUser(String[] arr){
        for (String arr1 : arr) {
            user = arr1;
            System.out.println("Usuario obtenido:"+user);     
        }
    }
    
    public String enviarUser(){
        System.out.println("Enviado:"+user);
        return user;
    }
   
}
