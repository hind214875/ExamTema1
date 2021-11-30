/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author hinda
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        //declaracion variables
        int a, b, c, x = 0, x1, x2;

        //pedir datos
        String text = JOptionPane.showInputDialog(null, "Introduce el valor de A");
        a = Integer.parseInt(text);

        text = JOptionPane.showInputDialog(null, "Introduce el valor de B");
        b = Integer.parseInt(text);

        text = JOptionPane.showInputDialog(null, "Introduce el valor de C");
        c = Integer.parseInt(text);

        if (a == 0 && b == 0) {
            System.out.println("La ecuacion no tiene solucion");
        } else if (a == 0 && b != 0) {
            System.out.println("el resulta es: " + (x = (-c) / b));
        } else {
            if ((Math.pow(b,2) - (4 * a * c)) < 0) {
                System.out.println("bº2-4ac no pueden ser negativo");
            } else {
                x1 = (int) ((-b) + Math.sqrt(Math.pow(b, 2) - (4 * a * c)) / 2 * a);
                x2 = (int) ((-b) - Math.sqrt(Math.pow(b, 2) / 2 * a));
                System.out.println("el resulta es:"+x1 +" "+x2);
            }

        }
        
        
    }
}
