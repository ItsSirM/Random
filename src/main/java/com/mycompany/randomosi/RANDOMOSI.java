/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.randomosi;
import java.util.Scanner;
/**
 *
 * @author MARTI
 */
public class RANDOMOSI {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
       boolean  MENU=true;
        int Opcion=0;
        
        
        while(MENU==false) {
        System.out.println("------MENU------");
        System.out.println("1------Lavanderia");
        System.out.println("2------Palabras al reves");
        System.out.println("3------Palindromo");
        System.out.println("4------Salir del Sistema");
        Opcion=leer.nextInt();
        
    }
      switch(Opcion){
          case 1:
              MENU=true;
              System.out.println("");
              
      }
        
        
        
        
}
}
