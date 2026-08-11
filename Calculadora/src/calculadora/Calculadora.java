/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int num1; 
        int num2; 
        char operacion; 
        double resultado; 
        System.out.print("Ingrese el primer numero : "); 
        num1 = sc.nextInt();
        System.out.print("Ingrese el segundo numero : ");
        num2 = sc.nextInt();
        System.out.println("Ingrese la operacion que quiera realizar: ");
        System.out.println("a. Suma");
        System.out.println("b. Resta");
        System.out.println("c. Multiplicacion");
        System.out.println("d. Division");
        System.out.println("e. Porcentaje");
        System.out.println("Respuesta: ");
        operacion = sc.next().toUpperCase().charAt(0);
        switch (operacion) { 
            
            case 'A' :{
                resultado = num1 + num2;
                System.out.printf("Tu resultado: %.2f%n", resultado);
                break;
            }
            case 'B':{
                resultado = num1 - num2;
                System.out.printf("Tu resultado: %.2f%n", resultado);
                break;
            }
            case 'C': {
                resultado = num1 * num2;
                System.out.printf("Tu resultado: %.2f%n", resultado);
                break;
            }
 case 'D' : {
     if (num2 == 0)
     { 
         System.out.println("No se puede dividir entre cero");
     }
     else 
     { resultado = (double) num1 / num2;
     System.out.printf("Tu resultado: %.2f%n", resultado);
     break;
     }
            }
 case 'E' : {
     if (num2 == 0) { 
         System.out.println("No se puede calcular Modulo entre cero");
     } 
     else 
     { resultado = num1 % num2;
     System.out.printf("Tu resultado: %.2f%n", resultado);
     break;
     }
            }
 default: System.out.println("Opcion no Valida");
       
    }//fin de switch
}//fin de main
}//fin de class    

