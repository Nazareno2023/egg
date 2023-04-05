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
public class guia4_2 {
   public static void main(String[] args) {
       personas();
        
            
    }
    public static void personas(){
         Scanner leer = new Scanner(System.in);
        String nombre;
        int edad;
        String respuesta;
        
        do {
            System.out.println("escribe un nombre");
            nombre = leer.next();
            System.out.println("Escriba la edad");
            edad = leer.nextInt();
            if(edad>=18){
                System.out.println(nombre+ " tiene "+ edad + " años de edad, y es mayor de edad");
                
            }else{
                System.out.println(nombre+ " tiene "+ edad + " años de edad, y es menor de edad");
            }
            System.out.println("Quieres seguir ingresando personas? S/N");
            respuesta = leer.next();
            if (respuesta.equalsIgnoreCase("no")||respuesta.equalsIgnoreCase("n")) {
                respuesta = "n";
            }
        } while (!respuesta.equalsIgnoreCase("n"));
        
    }
    
}
