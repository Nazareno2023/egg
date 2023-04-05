/*
 *Realizar un algoritmo que llene un vector con los 100 primeros 
 *números enteros y los muestre por pantalla en orden descendente.
 */
package Ejercicio6;

/**
 *
 * @author maria
 */
public class Guia5_1bEncuentro9Vector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int vector[] = new int [100];
        //vector.length para cardinalidad desconocida
        for (int i = 0; i < 100; i++) {
            vector [i] = i; 
        }
        String aux = "";
        for (int i = 99; i > 0; i--) {
            aux += "" + vector[i];
        }
        System.out.println(aux);
    }
    
}
