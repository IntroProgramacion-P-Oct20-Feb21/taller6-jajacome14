/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JAVIER JACOME
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombre;
        String cadenaF = "";
        int Diastrabajados;
        int contador = 1;
        double totalPagar;
        double costoDias;

        while (contador <= 5) {
            System.out.println("Ingrese el nombre del Empleado:");
            nombre = entrada.nextLine();

            System.out.println("Ingrese el número de días trabajados:");
            Diastrabajados = entrada.nextInt();

            System.out.println("Ingrese total a pagar en el dia trabajado:");
            costoDias = entrada.nextDouble();
            entrada.nextLine();

            totalPagar = Diastrabajados * costoDias;

            cadenaF = String.format("%s\t%s\t%d\t$%.2f\t$%.2f\n", cadenaF,
                    nombre, Diastrabajados, costoDias, totalPagar);

            contador = contador + 1;
        }
        System.out.printf("%S\n", cadenaF);
        entrada.nextLine();
    }

}
