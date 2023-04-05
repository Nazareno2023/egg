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
public class guia4_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Por favor ingrese la cantidad a convertir en Euros");
        double euros = leer.nextDouble();
        System.out.println("por favor elija el tipo de divisa a cambiar? Dolares / Yenes / Libras");
        String divisa = leer.next();
        
        cambio(euros, divisa);
        
                
    }
    public static void cambio(double euros, String divisas){
        if(divisas.equalsIgnoreCase("Dolares")) {
            System.out.println("El cambio de " + euros + " Euros a dolares es de : "+(euros*1.28611));
               
        }else if(divisas.equalsIgnoreCase("yenes")){
            System.out.println("El cambio de " + euros + " Euros a yenes es de : "+(euros*129.852));
            
        }else if(divisas.equalsIgnoreCase("libras")){
           System.out.println("El cambio de " + euros + " Euros a libras es de : "+(euros*0.86)); 
        }
    }
    
}
