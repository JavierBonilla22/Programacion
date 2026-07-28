/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversiones;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Conversiones {

    /**
     * @param args the command line arguments
     * Objetivos
     * 1. Orden  Secuencial de las instrucciones
     * 2.  Capturar  Datos desde teclado
     * 3. Operaciones Aritmeticas
     * 
     * Desarrollar un algoritmo    que me permita convertir los siguientes
     * elementos:
     * 1. Pulgadas a centimetros
     * 2. Kilometros a Millas
     * 3. Grados Farenheit a grados Celsius
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in); 
        int pulgadas = 0;
        double ResultadoCM = 0;
        
        double kilometros = 0;
        double millas = 0;
        
        double farenheit = 0;
        double celsius = 0;
        
        pulgadas = 10;
        ResultadoCM = pulgadas * 2.54;
        System.out.printf("%d pulgadas es igual a %.2f cm",pulgadas,ResultadoCM);
        
        pulgadas = 35;
        ResultadoCM = pulgadas * 2.54;
        System.out.printf("\n %.2f cm  es igual a %d pulgadas", ResultadoCM,pulgadas);
        System.out.println("");
        System.out.println("Cuantos Kilometros hay de TGU - SPS?");
        kilometros = teclado.nextDouble();
        millas = kilometros /1.6;
        System.out.printf("%.2f km es igual a %.2f  millas \n",kilometros , millas);
        System.out.println("");

        System.out.println("Ingrese los grados farenheit");
        farenheit = teclado.nextDouble();
        celsius = (farenheit - 32) * 5/9;
        System.out.printf("%.2f Farenheit es igual a %.2f  Celsius \n",farenheit , celsius);
        System.out.println("");
        
        
        
        
        
        
        
        // Declarar Variables
    }// Fin de main
    
}// Fin de class
