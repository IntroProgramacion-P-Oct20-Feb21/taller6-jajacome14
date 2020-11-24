/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author JAVIER JACOME
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador = 1;
        int contador1 = 20;
        int contador2 = 10;
        while (contador <= 6) {
            if ((contador % 2) == 0) {
                System.out.println(contador + "/" + contador1);
                contador1 = contador1 + 1;
            } else {
                System.out.println(contador + "/" + contador2);
                contador2 = contador2 + 1;
            }
            contador = contador + 1;
        }
    }
}
