/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trayectoria;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Trayectoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double velocidad = 0;
        double angulo = 0;
        double altura = 0;
        double alturaAnterior = 0;
        double gravedad = 9.81;
        double anguloRad = 0;

        System.out.print("Ingrese la velocidad inicial en m/s: ");
        velocidad = sc.nextDouble();

        System.out.print("Ingrese el angulo de lanzamiento en grados: ");
        angulo = sc.nextDouble();

        if (velocidad <= 0) {
            System.out.println("Error: la velocidad debe ser mayor a 0.");
        } 
        else if (angulo <= 1 || angulo >= 89) {
            System.out.println("Error: el angulo debe estar entre 1 y 89 grados.");
        } 
        else {

            anguloRad = angulo * 3.1416 / 180;

            System.out.println("\n--- Trayectoria del proyectil ---");

            for (int t = 1; t <= 10; t++) {

             
                altura = velocidad * Math.sin(anguloRad) * t
                        - 0.5 * gravedad * t * t;

                System.out.printf("Segundo %d: %.2f metros%n", t, altura);

                if (altura < 0) {
                    System.out.println("El proyectil ya impacto el suelo.");
                    break;
                } 
                else if (t > 1 && altura < alturaAnterior) {
                    System.out.println("La altura maxima fue alcanzada aproximadamente  en el segundo " + (t - 1) );
                   
                } 
                else {
                    alturaAnterior = altura;
                }
            }
        }

     
    }
}
        

