/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maria
 */
package javaintro01;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        System.out.println("Por favor ingrese su nombre");
        Scanner leer = new Scanner(System.in);
        String nombre = leer.nextLine();
        System.out.println("El nombre ingresado es: " + nombre);

    }

}