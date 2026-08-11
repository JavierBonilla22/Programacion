/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package promedio_nota;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Promedio_Nota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        double nota1=0;
        double nota2=0;
        double promedio=0;
        System.out.print("Ingrese nombre del estudiante: ");
        nombre = sc.nextLine();
       
        System.out.printf("Ingrese nota primer parcial: ");
        nota1=sc.nextDouble();
        System.out.printf("Ingrese nota segundo parcial: ");
        nota2=sc.nextDouble();
        promedio = (nota1+nota2)/2;
        System.out.printf("Su promedio es: %.2f\n",promedio);
        
        if (promedio >=65) {
            System.out.println("El estudiante esta APROBADO");
        }
        else
        {
            System.out.println("El estudiante esta REPROBADO");
        }
        
        
         }//fin de main
    
}//fin de class
