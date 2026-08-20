/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package temperatura;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Temperatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        double suma = 0;
        int cantidad = 0;
        double tempMaxima = 0;
        double tempMinima = 0;
        double temperatura= 0;

        System.out.print("Ingrese temperatura en grados Celsius (-999 para terminar): ");
       temperatura = sc.nextDouble();

        while (temperatura != -999) {

            if (temperatura < -273.15) {
                System.out.println("Error: la temperatura no puede ser menor a -273.15 °C.");
            } else {
      
                if (cantidad == 0) {
                    tempMaxima = temperatura;
                    tempMinima = temperatura;
                } else {
                    if (temperatura > tempMaxima) {
                        tempMaxima = temperatura;
                    }

                    if (temperatura < tempMinima) {
                        tempMinima = temperatura;
                    }
                }

                suma += temperatura;
                cantidad++;
            }

            System.out.print("Ingrese temperatura en grados Celsius (-999 para terminar): ");
            temperatura = sc.nextDouble();
        }

        if (cantidad > 0) {
            double promedio = suma / cantidad;
            double diferenciaTermica = tempMaxima - tempMinima;
            
            System.out.printf("Promedio: %.2f %n", promedio);
            System.out.printf("Diferencia termica: %.2f %n", diferenciaTermica);
        } else {
            System.out.println("\nNo se ingresaron temperaturas válidas.");
        }

       
        }
    }
    

