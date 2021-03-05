class Samaris {
    String nombre;
    
    String samaris (String nombre){
      this.nombre = nombre;
    }
    
    String nombreF (String nombre){
        return nombre;
    }

    String nombreApellido (String nombre){
        if (nombre == "Samaris"){
            return nombre + "Saturno";
        }else{
            return nombre;
        }
    }
}
