/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6;

/**
 *
 * @author maria
 */
public class Guia5_AulaVirtualEjemploMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] [] matriz = new String [3] [3];
  	 
   // Puedo asignar valores de esta manera
   matriz[0][0] = "B";

    // Asigno valores mediante el For
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            matriz[i][j] = "B";
        }
    }
   	 
    // Muestro la matriz
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
           	 
        System.out.print("[" + matriz[i][j] + "]");  
          	 
        }
        System.out.println("");

    }
    
    }
}

