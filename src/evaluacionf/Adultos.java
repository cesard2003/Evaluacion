
package evaluacionf;


public class Adultos {
    private String nombre;
    private int edad;

    public Adultos() {
      nombre = "";
      edad = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String datos(){
            return "El hombre se llama"+nombre+"Tiene"+edad+"Años";
        
    }
    
    
   
}

