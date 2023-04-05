/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6;

import java.util.Random;
import java.util.Scanner;



/**
 *
 * @author maria
 */
public class Guia5_4Encuentro9Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        //declarar matriz 4x4
      int [][] matriz = new int [4][4];
      Random rand = new Random();
      //Llenar matriz con valores aleatorios
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = rand.nextInt(100) + 1;
            }            
        }
        //Mostrar la matriz original
        System.out.println("Matriz Original");
         for (int i = 0; i < 4; i++) {
             for (int j = 0; j < 4; j++) {  
                 System.out.print("[" + matriz[i][j] + "]");
             }
             System.out.println("");
        }  
         //Calcular la matriz transpuesta
        int [][] transpuesta = new int [4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                transpuesta[j][i] = matriz[i][j];                
            } 
        }
        //Mostrar la matriz transpuesta
        System.out.println("Matriz transpuesta");
         for (int i = 0; i < 4; i++) {
             for (int j = 0; j < 4; j++) {
                 System.out.println("[" + transpuesta[j][i] + "]");
             }
             System.out.println("");
            
        }
     
                   
    }
}
                

         
    
   

