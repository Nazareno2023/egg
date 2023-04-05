


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
public class Guia5_3Encuentro9Vector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el tamaño del vector");
        int n = leer.nextInt();
        int vector[] = new int[n];
        int cont = 0;
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int)(Math.random()*20000);
        }
        int cont1, cont2, cont3, cont4, cont5;
        cont1 = 0;
        cont2 = 0; 
        cont3 = 0;
        cont4 = 0;
        cont5 = 0;
        for (int i = 0; i < vector.length; i++) {
            while(vector[i]!=0){
            vector[i] = vector[i]/10;
            cont++;
        }
            switch(cont){
                case 1:
                    cont1++;
                    break;
                case 2:
                    cont2++;
                    break;
                case 3:
                    cont3++;
                    break;
                case 4:
                    cont4++;
                    break;
                case 5:
                    cont5++; 
                    break;
            }
            cont = 0;            
    }
    System.out.println("Hay " +cont1 + " numeros con 1 dìgito");
    System.out.println("Hay " +cont2 + " numeros con 2 dìgito");
    System.out.println("Hay " +cont3 + " numeros con 3 dìgito");
    System.out.println("Hay " +cont4 + " numeros con 4 dìgito");
    System.out.println("Hay " +cont5 + " numeros con 5 dìgito");
}
}


    
