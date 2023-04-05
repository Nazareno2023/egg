/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6;

import java.util.Scanner;

/**
 *
 * @author maria
 */
public class Guia5_2Encuentro9vector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el tamaño del vector");
        int vector[]= new int[leer.nextInt()];
        System.out.println("Que numero quiere buscar?");
        int busqueda = leer.nextInt();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int)(Math.random() * vector.length + 1);    
        }
        int cont = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i]== busqueda) {
            System.out.println("El numero " + busqueda + " se encuentra en la posición "+ i);
            cont++;                
            }
        }
         if (cont > 1) {
             System.out.println("su numero se encontró repetido " + (cont-1)+ " veces/vez");            
        }else if (cont==0) {
             System.out.println("No se encontró su número");
        }     
    }    
}
