/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package descuento;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Descuento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        int edad=0;
        char membresia='a';
        double descuento=0;
        double precioVenta=0;
        double ventaTotal=0;
        double montodescuento=0;
        
        System.out.print("Ingrese su EDAD:");
        edad = sc.nextInt();
        System.out.println("Tiene membresia? S: si / N: no");
        System.out.print("Respuesta: ");
        membresia = sc.next().toUpperCase().charAt(0);
        System.out.println("Ingrese el monto de la venta: ");
        precioVenta=sc.nextDouble();
        if(edad >=18){
            if(edad>65||membresia=='S'){
               descuento=20; 
            }
            else{
                descuento=10;
            }
            }
            else 
            {
                if(edad>12&&edad<18&&membresia=='S'){
                    descuento=15;   
                                       }
                else{
                    descuento=0;
                }
                
        }
        ventaTotal= precioVenta-(precioVenta*descuento/100);
        System.out.printf("Su precio de venta es: %.2f\n",precioVenta);
        System.out.printf("Su descuento es de: %.0f%%\n",descuento);
        System.out.printf("Su precio final es: %.2f\n",ventaTotal);
        
              
    }//fin de main
    
}//fin de class
