/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintro01;

import java.util.Scanner;

/**
 *
 * @author maria
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner(System.in);
        String nombre;
        System.out.println("Ingrese su nombre:");
        nombre = leer.next();
        System.out.println("Hola Mundo! Soy " + nombre + " y estoy programando en Java!");
         
    }
    
}
