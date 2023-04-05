


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ejercicio5;

import java.util.Scanner;

public class guia3_5 {


 
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valor limite positivo");
        int vl = leer.nextInt();
        int num;
        int suma = 0;
        
        do{
        System.out.println("Ingrese numeros");
        num = leer.nextInt();
        suma=suma+num;
                   
    }while(suma<=vl);
        
        System.out.println("la suma de los numeros ingresados supero el limite ingreado");
    
}
}