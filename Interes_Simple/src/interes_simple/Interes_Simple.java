/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interes_simple;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Interes_Simple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        double capitalini=0;
        int interesanual=0;
        double tiempo=0;
        double interes=0;
        System.out.printf("Ingrese su capital inicial: ");
        capitalini = sc.nextDouble();
        System.out.println("");
        System.out.printf("Ingrese su tasa de ineteres anual: ");
        interesanual= sc.nextInt();
        System.out.println("");
        System.out.printf("Ingrese los años del prestamo: ");
        tiempo= sc.nextDouble();
        System.out.println("");
        interes= (capitalini*interesanual*tiempo)/100;
        System.out.printf("Su interes generado es de: %.2f\n",interes);
        
        // TODO code application logic here
    }
    
}
