/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JAVIER JACOME
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int contador = 1;
        String nombre;
        int cantidadpuntos;
        int cantidadfaltas;
        String cadenaF = "";
        while (contador <= 10) {
            System.out.println("Ingrese el Nombre del Jugador:");
            nombre = entrada.nextLine();
            
            System.out.println("Ingrese la cantidad de puntos Anotados:");
            cantidadpuntos = entrada.nextInt();
            
            System.out.println("Ingrese la cantidad de Faltas:");
            cantidadfaltas = entrada.nextInt();
            
            contador = contador + 1;
            cadenaF = String.format("%s\t%s\t%d\t%d\n", cadenaF,
                    nombre, cantidadpuntos, cantidadfaltas);

            entrada.nextLine();
        }
        System.out.printf("%s\n", cadenaF);
    }

}
