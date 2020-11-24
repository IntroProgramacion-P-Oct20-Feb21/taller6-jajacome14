/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JAVIER JACOME
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String Nombre;
        String cadenaF = "";
        int Contador = 1;
        double Promedio;

        while (Contador <= 4) {
            System.out.println("Ingrese el nombre del Estudiante:");
            Nombre = entrada.nextLine();
            System.out.println("Ingrese el Promedio:");
            Promedio = entrada.nextDouble();
            if (Promedio >= 7) {
                cadenaF = String.format("%s\t%s\t%.2f\t" + "Aprobado\n",
                        cadenaF, Nombre, Promedio);
            } else {
                cadenaF = String.format("%s\t%s\t%.2f\t" + "Reprobado\n",
                        cadenaF, Nombre, Promedio);
            }
            Contador = Contador + 1;
            entrada.nextLine();
        }
        System.out.printf("%s\n", cadenaF);
    }

}
