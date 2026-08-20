/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversor;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Conversor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     double medida = 0;
     double resultado=0;
     int opcion=0;
     
        
        do{
            System.out.println("1. Metros a pies\n2. Kilogramos a libras\n3.Centimetros a pulgadas\n4. Salir");
           System.out.print("Ingrese la opcion que desea realizar: ");
            opcion = sc.nextInt();
           
           
            switch(opcion){
                case 1:
            do {
                System.out.print("Ingrese el valor en METROS: ");
                medida = sc.nextDouble();

                if (medida < 0) {
                    System.out.println("Error: no puede ingresar datos negativos.");
                }

            } while (medida < 0);

            resultado = medida * 3.28084;
            System.out.printf("Su resultado en PIES es: %.2f%n", resultado);
            break;

               case 2:
            do {
                System.out.print("Ingrese el valor en KILOGRAMOS: ");
                medida = sc.nextDouble();

                if (medida < 0) {
                    System.out.println("Error: no puede ingresar datos negativos.");
                }

            } while (medida < 0);

            resultado = medida * 2.20462;
            System.out.printf("Su resultado en LIBRAS es: %.2f%n", resultado);
            break;

               case 3:
            do {
                System.out.print("Ingrese el valor en CENTIMETROS: ");
                medida = sc.nextDouble();

                if (medida < 0) {
                    System.out.println("Error: no puede ingresar datos negativos.");
                }

            } while (medida < 0);

            resultado = medida * 0.393701;
            System.out.printf("Su resultado en PULGADAS es: %.2f%n", resultado);
            break;

        case 4:
            System.out.println("Saliendo del programa!!");
            break;

        default:
            System.out.println("Opcion no valida intente nuevamente.");
            break;
    }

} while (opcion != 4);
}        
}    

