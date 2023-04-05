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
public class Guia4 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int op;
        String op2;
        do {

            System.out.println("Ingrese el numero de la opción deseada");
            System.out.println("1- Sumar");
            System.out.println("2- Restar");
            System.out.println("3- Multiplicar");
            System.out.println("4- Dividir");
            System.out.println("5- Salir");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    System.out.println("La suma de los numeros es: " + suma(num1 , num2));
                    break;
                case 2:
                    System.out.println("La resta de los numeros es: " + resta(num1 , num2));
                    break;
                case 3:
                    System.out.println("La multiplicacion de los numeros es: " + multi(num1 , num2));
                    break;
                case 4:
                    System.out.println("La division de los numeros es: " + div(num1 , num2));
                    break;
                case 5:
                    System.out.println("Seguro que quieres salir? S/N");

                    op2 = leer.next();

                    if (op2.equalsIgnoreCase("s")) {
                        op = 6;
                    } else {
                        op = 5;
                    }

                default:
            }
        } while (op != 6);
    }
    public static int suma(int num1, int num2) {
        int resultado = num1 + num2;
       
        
        return resultado;
       
    }
    
     
      public static int resta(int num1, int num2) {
        int resultado = num1 - num2;
       
        
        return resultado;
       
    }
       public static int multi(int num1, int num2) {
        int resultado = num1 * num2;
       
        
        return resultado;
       
    }
        public static int div(int num1, int num2) {
        int resultado = num1 / num2;
       
        
        return resultado;
       
    }
    
}