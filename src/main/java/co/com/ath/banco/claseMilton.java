package co.com.ath.banco;


public class claseMilton {
    
    String nombre (String nombre){
        return nombre;
    }
    
    String nombreApellido(String nombre){
        if(nombre.equalsIgnoreCase("milton")){
            return nombre+"cifuentes";
        }else{
            return nombre;
        }
    }
    
}
