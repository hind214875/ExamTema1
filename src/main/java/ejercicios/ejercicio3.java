/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.InputMismatchException;
import javax.swing.JOptionPane;

/**
 *
 * @author hinda
 */
public class ejercicio3 {

    public static void main(String[] args) {
        //declaracion variables
        int a = 0, b = 0, c = 0, x = 0, x1, x2;
        boolean seguir;
        String text;
        //pedir datos
        do {
            do {
                seguir = true;
                try {
                    text = JOptionPane.showInputDialog(null, "Introduce el valor de A");
                    a = Integer.parseInt(text);
                    seguir = false;
                } catch (InputMismatchException ime) {
                    JOptionPane.showMessageDialog(null, "Has Puesto una letra tiene que ser numero");
                }

            } while (seguir);

            do {
                seguir = true;
                try {
                    text = JOptionPane.showInputDialog(null, "Introduce el valor de B");
                    b = Integer.parseInt(text);
                    seguir = false;
                } catch (InputMismatchException ime) {
                    JOptionPane.showMessageDialog(null, "Has Puesto una letra tiene que ser numero");
                }

            } while (seguir);

            do {
                seguir = true;
                try {
                    text = JOptionPane.showInputDialog(null, "Introduce el valor de C");
                    c = Integer.parseInt(text);
                    seguir = false;
                } catch (InputMismatchException ime) {
                    JOptionPane.showMessageDialog(null, "Has Puesto una letra tiene que ser numero");
                }

            } while (seguir);
        } while (((Math.pow(b, 2) - (4 * a * c)) < 0));// pedir informaciones otravez cuando 

        if (a == 0 && b == 0) {
            System.out.println("La ecuacion no tiene solucion");
        } else if (a == 0 && b != 0) {
            System.out.println("el resulta es: " + (x = (-c) / b));
        } else {
            x1 = (int) ((-b) + Math.sqrt(Math.pow(b, 2) - (4 * a * c)) / 2 * a);
            x2 = (int) ((-b) - Math.sqrt(Math.pow(b, 2) / 2 * a));
            System.out.println("el resulta es:" + x1 + " " + x2);

        }

    }
}
