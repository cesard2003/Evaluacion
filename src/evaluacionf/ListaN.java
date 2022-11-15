/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluacionf;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class ListaN {

    ArrayList<Niños> Ni = new ArrayList();

    public String Input(String Nombre) {
        return JOptionPane.showInputDialog(Nombre);
    }

    public int Input1(String edad) {
        return Integer.parseInt(JOptionPane.showInputDialog(edad));
    }

    public String Input2(String perFav) {
        return JOptionPane.showInputDialog(perFav);
    }

    public void addNi() {
        String nombre = Input("Ingrese el nombre del niño");
        int edad = Input1("Imgrese la edad del niño");
        String perFav = Input2("Ingrese el personaje favorito del niño ");
        Niños n1 = new Niños();
        n1.setNombre(nombre);
        n1.setEdad(edad);
        n1.setPerFav(perFav);
        Ni.add(n1);
    }

    public void getNi() {
        Iterator it = Ni.iterator();
        while (it.hasNext()) {
            Object objeto = it.next();
            Niños ni = (Niños) objeto;
            JOptionPane.showMessageDialog(null, ni.datos());
        }
    }

}
