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
public class Listaadulto {

    ArrayList<Adultos> ad = new ArrayList();

    public String Input(String Nombre) {
        return JOptionPane.showInputDialog(Nombre);
    }

    public int Input1(String edad) {
        return Integer.parseInt(JOptionPane.showInputDialog(edad));
    }

    public void addAd() {
        String nombre = Input("Ingrese el nombre del adulto");
        int edad = Input1("Ingrese la edad del adulto");
        Adultos ad1 = new Adultos();
        ad1.setNombre(nombre);
        ad1.setEdad(edad);
        ad.add(ad1);
    }

    public void getAd() {
        Iterator it = ad.iterator();
        while (it.hasNext()) {
            Object objeto = it.next();
            Adultos adul = (Adultos) objeto;
            JOptionPane.showMessageDialog(null, adul.datos());
        }
    }
    public void promedioAd(){
        double a = 0;
        for (int i = 0; i < ad.size(); i++) {
            a+=Double.parseDouble(ad.get(i).toString());
            JOptionPane.showMessageDialog(null, "Promedio de edad" + a/ad.size());
        }
        
        
    }

}
