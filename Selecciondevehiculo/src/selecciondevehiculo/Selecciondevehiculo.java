/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package selecciondevehiculo;

import java.util.Scanner;

/**
 *
 * @author DELL
 * objetivo
 * estructura de seleccion
 * 1. Estructura o formato
 *   a. Palabras claves
 *   b. bloques
 *   c. Terminaciones
 *   d. condiciones -> valor a comparar
 * 2. Tipos de seleccion
 *  a. Simple
 *  b. Doble
 * 3. Condiciones
 *  a. Tipos de condicones
 *    i. <  -> menor
 *   ii.>   -> mayor
 *  iii.>= o <= mayor o igual
 *  b. Tipos de comparacion
 */
public class Selecciondevehiculo {

    /**
     * @param args the command line arguments
     * Desarrollar un algoritmo que me permita determinar los siguientes elementos
     * de un vehiculo:
     *  a. Si el tamaño del tanque de combustible agarra mas de 30 lts(Dato Numerico)
     *  b. El tipo de combustible si es DIESEL o no (Dato  tipo caracter)
     *  c. Si es energeticamente eficiente y ecologico(Dato Cadena) 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int cantidadlitros =0;
        char respuestatipo = 'a';
        String respuestacadena = "Jhon Doe";
        
        System.out.println("Me dijeron que eres duenio de un vehiculo \"verde\"");
        System.out.println("Tienes que echarle biodiesel");
        System.out.println("Cuantos litros agarra?");
        cantidadlitros = entrada.nextInt();
        
        if(cantidadlitros>30){
            System.out.println("Es un vehiculo con");
            System.out.println("grandes capacidades");
            System.out.println("Seguro la factura es alta!!");
            
        }
        System.out.println("");
        
        entrada.nextLine();//Limpiar el Buffer (cuando se pasa de capturar un dato numerico a un caracter)
        System.out.println("Tu vehiculo es Diesel?  (x = si, y = no)");
        respuestatipo = entrada.nextLine(). charAt(0);
        
        if(respuestatipo =='x'){
            System.out.println("Si es diesel verde!!");
            System.out.println("Diesel combinado con ethanol");
            System.out.println("Se saca del maiz");
        }
        else
        {
            System.out.println("Uyyy.... eres anticlimatico");
            System.out.println("Calentamiento Global");
        }
        System.out.println("");
        System.out.println("Tu carro es energeticamente eficiente");
        respuestacadena = entrada.nextLine();
        
       /* System.out.println("Seguro que es asi?");
        respuestacadena = entrada.nextLine().toUpperCase();
        System.out.printf("Respuesta Ingresada: %s", respuestacadena);
        
        System.out.println("\n100% Seguro?");
        respuestacadena = entrada.next().toLowerCase();
        System.out.printf("Respuesta Ingresada: %s",respuestacadena);
        */
       if(respuestacadena.equals("si")){
           System.out.println("Excelente");
           System.out.println("Amigable con el ambiente");
           
       }
       else {
           System.out.println("Uyy...busca que se puede hacer");
       }
    }// Fin de main
    
}// Fin de class
