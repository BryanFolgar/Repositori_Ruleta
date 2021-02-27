/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto_ruleta;

import java.util.Scanner;
import java.util.Random;
import java.lang.*;

/**
 *
 * @author Bryan Folgar
 */
public class Principal{
    
    public static void main(String[] args) throws Exception{
        //Declaracion de variables
        Scanner objInput = new Scanner(System.in);
        String respuesta = null;
        
        //Mostrar menu 
        do {
            System.out.println("                      BIENVENIDO AL JUEGO DE LA RULETA                             ");
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
            System.out.println("-*                          Reglas del juego                                     -*");
            System.out.println("*-          El jugador tiene un saldo inicial de 100 para poder jugar            -*");
            System.out.println("*-              El jugador debe apostar por un numero al inicio                  -*");
            System.out.println("*-    Si el jugador acierta el número entonces ganara el triple de la apuesta    -*");
            System.out.println("*-        Si el jugador acierta al color entonces ganará el doble.               -*");
            System.out.println("*-       El juego termina cuando el jugador ya no pueda apostar                  -*");
            System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
            System.out.println("");
            System.out.println("¿Desea Ingresar al juego? S/N.");
            //Obtener el valor del buffer del teclado.
           String strDecision = objInput.nextLine();
      
           switch(strDecision){
               case "s":
                   
                   //Declaracion de variables
                    int total = 100;
                    String seguir = ""; 
                    
                    do{
                        System.out.println("La siguiente tabla ilustrara el orden de los numeros y colores...");
                        System.out.println("//////////////////////////////////////////");
                        System.out.println("///   [1,B],[2,N],[3,B],[4,N],[5,B]    ///");
                        System.out.println("///   [6,N],[7,B],[8,N],[9,B],[10,N]   ///");
                        System.out.println("///  COLORES>>>>[B]=Blanco, [N]=Negro  ///");
                        System.out.println("//////////////////////////////////////////");
                        System.out.println("BUENA SUERTE!! Que empieze el juego...");
                        System.out.println("");
                        System.out.println("Ingrese El numero y el color, al que desea apostar, cuenta con un total de "+ ( total = total - 10) +" Fichas");

                        respuesta = objInput.nextLine();
                        System.out.println("Tu Eleccion es: " + respuesta);
                        if(respuesta.equals("B") || respuesta.equals("N")){
                            System.out.println("Elegiste jugar por color...");
                            System.out.println("Girando ruleta...");
                            Thread.sleep(1500);
                            System.out.println("Girando ruleta...");
                            Thread.sleep(1500);
                            int resultado = new Random().nextInt(10);
                            String aleatorio;
                            if(resultado%2==0){
                                aleatorio="N";
                                System.out.println("Salio [N]");
                            }else{
                                aleatorio="B";  
                                System.out.println("Salio [B]");
                            }
                            if(respuesta.equals(aleatorio)){
                                total=total+20;
                                System.out.println("Acertarte... ganas 20...");
                                System.out.println("SALDO: "+ total);
                            }else{
                                System.out.println("Fallaste... No ganas...");
                                System.out.println("SALDO: "+ total);
                            }
                            System.out.println("Quieres seguir jugando? S/N");
                            seguir=objInput.nextLine();
                        }else{
                            System.out.println("Elegiste jugar por numero...");
                            System.out.println("Girando ruleta...");
                            Thread.sleep(1500);
                            System.out.println("Girando ruleta...");
                            Thread.sleep(1500);
                            int resultado = new Random().nextInt(10);
                            if(respuesta.equals(String.valueOf(resultado))){
                                total=total+30;
                                System.out.println("Acertarte... ganas 30... :0 ");
                                System.out.println("SALDO: "+ total);
                            }else{
                                System.out.println("Fallaste... No ganas...");
                                System.out.println("SALDO: "+ total);
                            }
                            System.out.println("Quieres seguir jugando? S/N");
                            seguir=objInput.nextLine();
                        }
                    }while(seguir.equals("s")|| seguir.equals("S"));
                    System.out.println("TU saldo final es de: " + total);
                   break;
           }
        } while(respuesta.equals("s")||respuesta.equals("S"));
            
    }
    
}
