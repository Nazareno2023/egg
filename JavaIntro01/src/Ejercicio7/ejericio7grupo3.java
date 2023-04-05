/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio7;

import java.util.Scanner;


public class ejericio7grupo3 {


    public static void main(String[] args) {
      Scanner leer = new Scanner (System.in);
      
            int largo;
            int contInc = 0;
      int contCor = 0;
      String cadena;
      
      do{
          System.out.println("Por favor ingrese frases, para terminar ingrese &&&&&");
          cadena = leer.next();
          if((cadena.startsWith("X"))&&(cadena.endsWith("O"))&&(cadena.length()<=5)){
              contCor++;
          }else{
              if(cadena.equals("&&&&&")){
          }else{
             contInc++;     
          }
         }
          
  
      }while(!cadena.equals("&&&&&"));
      
        System.out.println("Cantidad de lecturas correctas:" + contCor);
        System.out.println("Cantidad de lecturas incorrectas:" + contInc);
    }
    
      
 
      
    } 