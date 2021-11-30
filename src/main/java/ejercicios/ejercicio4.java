/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author hinda
 */
public class ejercicio4 {
    //method menu

    private static void mostrarMenu() {
        System.out.println("Menú de opciones");
        System.out.println("-------------------------");
        System.out.println("1. Cuenta atras");
        System.out.println("2.Juego de dados");
        System.out.println("3.Salir");
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        int opcion = 0;
        String opcionsalir;
        Scanner sc = new Scanner(System.in);
        boolean seguir;

        do {
            mostrarMenu();

            do {//un bucle que se repete cuando el variable seguir es true
                seguir = true;
                try {

                    System.out.println("Introduce una opcion");
                    opcion = sc.nextInt();
                    seguir = false;

                } catch (InputMismatchException ime) {
                    System.out.println(" Error.Introduce opcion valida ");
                    sc.nextLine();
                }
            } while (seguir);

            switch (opcion) {
                case 1:
                    System.out.println("opcion 1");
                    break;

                case 2:
                    System.out.println("opcion 2");
                    break;

                case 3:
                    System.out.println("Desea Salir? ,Escribe Si para salir");
                    opcionsalir = sc.next();
                    if (opcionsalir.equalsIgnoreCase("si")) {
                        System.out.println("Terminar");
                    } else {
                        mostrarMenu();
                        do {//un bucle que se repete cuando el variable seguir es true
                            seguir = true;
                            try {

                                System.out.println("Introduce una opcion");
                                opcion = sc.nextInt();
                                seguir = false;

                            } catch (InputMismatchException ime) {
                                System.out.println(" Error.Introduc opcion valida ");
                                sc.nextLine();
                            }
                        } while (seguir);
                    }

            }

        } while (opcion != 3);
    }
}
