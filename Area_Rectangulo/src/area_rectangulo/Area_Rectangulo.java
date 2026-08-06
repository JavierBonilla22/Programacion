/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package area_rectangulo;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Area_Rectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        double Largo = 0;
        double Ancho = 0;
        double Area = 0;
        double perimetro = 0;
        
        System.out.printf("Ingrese el largo de su Rectangulo: ",Largo);
        Largo = sc.nextDouble();
        System.out.println("");
        System.out.printf("Ingrese el ancho de su Rectangulo: ",Ancho);
        Ancho = sc.nextDouble();
        System.out.println("");
        Area = Largo*Ancho;
        System.out.printf("El area de su Rectangulo es: %.2f\n", Area);
        System.out.println("");
        perimetro = (Largo*2)+(Ancho*2); 
        System.out.printf("El perimetro de su rectangulo es: %.2f\n",perimetro);
        System.out.println("");
        // TODO code application logic here
    }
    
}
