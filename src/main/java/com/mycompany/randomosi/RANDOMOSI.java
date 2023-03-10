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
     
        
        //VARIABLES
        boolean MENU=true,TIPO=true;
        int Opcion=0,opcion1=0,lavado=0,lavado1=0;
        String Nombre=" ";
        char Respuesta=' ' , Respuesta1=' ';
        int ContadorF=0,ContadorC=0,ContadorCL=0,ContadorS=0;
        int TotalF=0,TotalC=0,TotalCL=0,TotalS=0;
        int Subtotal=0;
        double Total=0,Impuesto=0;
        
        
        
        while(MENU==true) {
        System.out.println("------MENU------");
        System.out.println("1------Lavanderia");
        System.out.println("2------Palabras al reves");
        System.out.println("3------Caracter Popular");
        System.out.println("4------Salir del Sistema");
        System.out.println("Escoja una Opcion: ");
        Opcion=leer.nextInt();
        
    
      switch(Opcion){
          case 1:
                  MENU=false;
                  System.out.println("Ingrese su Nombre: ");
                  Nombre=leer.next();
                  
                  while(TIPO==true){
                      System.out.println("Ingrese el Tipo de Prenda ");
                      System.out.println("1------Formal");
                      System.out.println("2------Casual");
                      System.out.println("3------Colcha");
                      System.out.println("Ingrese una de esas Opciones:");
                      opcion1=leer.nextInt();
                      
                      switch(opcion1){
                          case 1:
                              ContadorF++;
                              TIPO=false;
                              System.out.println("Ingrese el Tipo de Lavado");
                              System.out.println("1-----Normal");
                              System.out.println("2-----DryClean");
                              lavado=leer.nextInt();
                              
                              System.out.println("");
                              
                              System.out.println("Desea poner otra prenda?");
                              System.out.println(" Si/No?");
                              Respuesta=leer.next().charAt(0);
                              
                              if(Respuesta=='S' || Respuesta=='s'){
                                  TIPO=true;
                                  System.out.println(" ");
                              }
                              if(Respuesta=='N' || Respuesta=='n'){
                                  System.out.println("Desea Agregar Suavizante?");
                                  System.out.println("Si/No");
                                  Respuesta1=leer.next().charAt(0);
                              }
                              break;
                               case 2:
                                   ContadorC++;
                              TIPO=false;
                              System.out.println("Ingrese el Tipo de Lavado");
                              System.out.println("1-----Normal");
                              System.out.println("2-----DryClean");
                              lavado=leer.nextInt();
                              
                              System.out.println(" ");
                              
                              System.out.println("Desea poner otra prenda?");
                              System.out.println(" Si/No?");
                              Respuesta=leer.next().charAt(0);
                              
                              if(Respuesta=='S' || Respuesta=='s'){
                                  TIPO=true;
                                  ContadorS++;
                                  System.out.println(" ");
                              }
                              if(Respuesta=='N' || Respuesta=='n'){
                                  System.out.println("Desea Agregar Suavizante?");
                                  System.out.println("Si/No");
                                  Respuesta1=leer.next().charAt(0);
                              }
                              break;
                               case 3:
                              ContadorCL++;
                              TIPO=false;
                              System.out.println("Ingrese el Tipo de Lavado");
                              System.out.println("1-----Normal");
                              System.out.println("2-----DryClean");
                              lavado=leer.nextInt();
                              
                              System.out.println(" ");
                              
                              System.out.println("Desea poner otra prenda?");
                              System.out.println(" Si/No?");
                              Respuesta=leer.next().charAt(0);
                              
                              if(Respuesta=='S' || Respuesta=='s'){
                                  TIPO=true;
                                  System.out.println(" ");
                              }
                              else if(Respuesta=='N' || Respuesta=='n'){
                                  System.out.println("Desea Agregar Suavizante?");
                                  System.out.println("Si/No");
                                  Respuesta1=leer.next().charAt(0);
                              }
                              
                              
                         
                              
                              
                      }
                  }
                      if(Respuesta1=='s' || Respuesta1=='S'){
                          ContadorS++;
                      }
                  
                  
                  
                      if(opcion1==1 && lavado==2){
                          TotalF= ContadorF*100;
                      }
                              else if(opcion1==1 && lavado==1){
                          TotalF=ContadorF*50;
                      }
                      
                      if(opcion1==2 && lavado==2){
                          TotalC=ContadorC*70;
                      }
                      else if(opcion1==2 && lavado==1){
                          TotalC=ContadorC*20;
                      }
                      if(opcion1==3 && lavado==2){
                          TotalCL=ContadorCL*150;
                      }
                      else if(opcion1==3 && lavado==1){
                          TotalCL=ContadorCL*100;
                      }
                      
                     TotalS=ContadorS*200;
                     Subtotal=TotalC+TotalCL+TotalF+TotalS;
                      Impuesto=Subtotal*0.15;
                      Total=Subtotal+Impuesto;
                       
                  
                     
                      
                      System.out.println("*******FACTURA*******");
                      System.out.println("Prendas Formales: "+ContadorF);
                      System.out.println("Prendas Casuales: "+ContadorC);
                      System.out.println("Colchas: "+ContadorCL);
                      System.out.println("Subtotal: "+Subtotal);
                      System.out.println("Impuesto 15%: "+Impuesto);
                      System.out.println("Total: "+Total);
                           
                      MENU=true;
              break;
              
          case 2:
        String Pro=" ";
        String Invertido=" ";
        
        System.out.println("Ingrese la Palabra");
        Pro=leer.next();
        
        
        for(int i=Pro.length()-1;i>=0;i--){
            Invertido+=Pro.charAt(i);
        };
        
        System.out.println(Invertido);
        
        
              break;
          case 3:
               String Palarga=" ";
       char letra, popular = ' ' ;
       int Popular1 = 0, mayor = 0;
              System.out.println("Ingrese Cualquier Palabra:  ");
        Palarga = leer.next();

        for (int contar = 0; contar < Palarga.length(); contar++) {
            System.out.println(Palarga.charAt(contar));
            letra = Palarga.charAt(contar);
            for (int conta2 = 0; conta2 < Palarga.length(); conta2++) {


                if (letra == Palarga.charAt(conta2)) {
                    Popular1 = Popular1 + 1;

                    if (Popular1 > mayor) {
                        popular = letra;
                    } else if (mayor == 1 || (mayor==2 && Popular1==2)) {
                        popular = ' ';
                    }
                }
          }
          mayor = Popular1;
            Popular1 = 0;

        }

        System.out.println("---------Resultado-------");
        System.out.println("Palabra Ingresada: "+Palarga);
        System.out.println("Caracter Popular: "+popular);

              break;
          case 4:
              System.out.println("Vuelva Pronto!");
              MENU=false;
              break;
              
         
      }
    }

    
    
    
    
    }
}
        
        
        
        


