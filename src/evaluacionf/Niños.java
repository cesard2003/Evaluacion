/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluacionf;

/**
 *
 * @author LENOVO
 */
public class Niños {
    private String nombre;
    private String perFav;
    private int edad;

    public Niños() {
        nombre = "";
        edad = 0;
        perFav = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPerFav() {
        return perFav;
    }

    public void setPerFav(String perFav) {
        this.perFav = perFav;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String datos(){
        return "El niño se llama"+nombre+"Tiene"+edad+"Años"+"\n"+"Y su personaje favorito es: "+perFav;
    }
    
}
