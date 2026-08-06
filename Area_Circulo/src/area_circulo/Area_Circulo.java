/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package area_circulo;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Area_Circulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      Scanner sc= new Scanner (System.in);
      double radio=0;
      double area=0;
      double circunferencia=0;
        System.out.println("Este es un programa para calcular el Area y Circunferencia de un Circulo");
        System.out.printf("Ingrese el Radio de el Circulo: ");
        radio = sc.nextDouble();
        area = Math.PI*Math.pow(radio,2);
        circunferencia=Math.PI* radio*2;
        System.out.printf("El area de su circulo es: %.2f\n",area);
        System.out.println("");
        System.out.printf("La circunferencia de su circulo es: %.2f\n",circunferencia);
        System.out.println("");
    }
    
}
