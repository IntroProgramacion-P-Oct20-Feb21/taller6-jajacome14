/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JAVIER JACOME
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String Usuario;
        String Empresa;
        boolean bandera = true;
        double Netflix = 10;
        double Disney = 6;
        double Apple = 5;
        double Amazon = 4.50;
        double Total;
        double Impuesto;

        System.out.println("Ingrese nombre del usuario\n:");
        Usuario = entrada.nextLine();
        while (bandera) {
            System.out.println("Ingrese el nombre de la empresa\nNetlix\nDisney\n"
                    + "Apple\nAmazon");
            Empresa = entrada.nextLine();
            switch (Empresa) {
                case "Netflix":
                    Impuesto = (Netflix * 10) / 100;
                    Total = Netflix + Impuesto;
                    System.out.printf("Usuario:%s\n " + "Empresa:%s\n"
                            + "Precio base:%.2f\n"
                            + "Impuesto:%.2f\n"
                            + "Total a pagar es:%.2f\n", Usuario, 
                            Empresa, Netflix,Impuesto, Total);
                            
                    break;
                case "Disney":
                    Impuesto = (Disney * 12) / 100;
                    Total = Disney + Impuesto;
                    System.out.printf("Usuario:%s\n " + "Empresa:%s\n"
                            + "Precio base:%.2f\n"
                            + "Impuesto:%.2f\n"
                            + "Total a pagar es:%.2f\n", Usuario, 
                            Empresa, Disney,Impuesto, Total);
                            
                    break;
                case "Apple":
                    Impuesto = (Apple * 14) / 100;
                    Total = Apple + Impuesto;
                    System.out.printf("Usuario:%s\n " + "Empresa:%s\n"
                            + "Precio base:%.2f\n"
                            + "Impuesto:%.2f\n"
                            + "Total a pagar es:%.2f\n", Usuario, 
                            Empresa, Apple,Impuesto, Total);
                            
                    
                    break;
                case "Amazon":
                    Impuesto = (Amazon * 16) / 100;
                    Total = Amazon + Impuesto;
                    System.out.printf("Usuario:%s\n " + "Empresa:%s\n"
                            + "Precio base:%.2f\n"
                            + "Impuesto:%.2f\n"
                            + "Total a pagar es:%.2f\n", Usuario, 
                            Empresa, Amazon,Impuesto, Total);
                            
                    break;
            }
            System.out.println("Ingresar el valor -1 para salir de la secuencia:");
            int temporal = entrada.nextInt();
            if (temporal == -1) {
                bandera = false;
            }
            entrada.nextLine();
        }
    }

}
