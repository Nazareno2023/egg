/*
 * /*Realizar un algoritmo que llene un vector con los 100 primeros números 
/*enteros y los muestre por pantalla en orden descendente.
 * 
 * 
 */
package Ejercicio6;

import java.util.Scanner;

/**
 *
 * @author maria
 */
public class guia5_1practico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String rta;
        System.out.println("Ingrese la cantidad de personas que desea ingresar al sistema ");
        int N = leer.nextInt();
        /*salte todo el resto del codigo     
        */
        for (int i = 0; i < N; i++) {
            System.out.println("Ingrese el nombre de la persona n°"+(i+1));
            String nombre = leer.next();
            System.out.println("Ahora ingrese su edad: ");
            int edad = leer.nextInt();
            System.out.println("Desea mostrar la información de esta persona? si/no");
            rta = leer.next();
            if (rta.equalsIgnoreCase("si")) {
                mostrarInfo(nombre, edad);
                System.out.println("Desea mostrar la información de la siguiente persona?si/no");
                rta = leer.next();
                if (rta.equalsIgnoreCase("si")) {
                    continue;
                }else{
                    System.out.println("Adios!");
                    break;
                }
            }
            
            
        }
    }
    public static void mostrarInfo(String nombre, int edad){
        if (edad >= 18) {
            System.out.println(nombre + " es mayor de edad"); 
        }else if (edad <=17) {
            System.out.println(nombre + " es menor de edad ");
        }
    }
}
