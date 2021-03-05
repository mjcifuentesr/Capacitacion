package co.com.ath.banco;


public class claseMilton {
    
    String nombre (String nombre){
        return nombre;
    }
    
    String nombreApellido(String nombre){
        if(nombre.equalsIgnoreCase("milton")){
            String completo=nombre+" Cifuentes";
            return completo;
        }else{
            return nombre;
        }
    }
    
    int suma(int i, int o){
        return i+o;
    }
    
}
