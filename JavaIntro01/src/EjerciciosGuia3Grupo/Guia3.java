/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maria
 */
package EjerciciosGuia3Grupo;

import java.util.Scanner;

public class Guia3 {


   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor ingrese una frase de 8 caracteres de largo");      
        String frase = leer.nextLine();
        int largo = frase.length();
        
        if (largo == 8){
            System.out.println("Correcto");
        }else {
            System.out.println("Incorrecto");
        }
    }
    
}
