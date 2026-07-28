/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holamundo;

/**
 *
 * @author DELL
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    // Sirve para comentar una sol linea
    /*
    Pleca Asterisco -> Abrir el Bloque de comentario
    Asterisco Pleca -> Cerrar el Bloque de comentario
    
    */
    public static void main(String[] args) {
        // TODO code application logic here
        /* 
          1.Imprimir en pantalla
             a. Salidas formateadss
             b. Caracteres de Escape
          2.Captura de Datos
        */
        System.out.println("Hola.. Me llamo Javier");
        System.out.println("Este es mi 1er");
        System.out.println("PROGRAMA!!!");
        System.out.print("Vamos camino a ");
        System.out.print("la clase de ");
        System.out.print("Progra!!");
        System.out.println("");
        
        System.out.printf ("Tu apellido es %S\n","Bonilla");
        System.out.println("");
        //ALT + 92 ->\
        System.out.printf("%S Tu apellido es\n ","Bonilla");
        System.out.println("");
        
        System.out.printf("Tu apellido %S es\n", "Bonilla");
        
        System.out.println("Hola \n este es \n un nuevo \n amanecer");
        System.out.println("Hola \t este es \t un nuevo \t amanecer");
        
        //Variables 
        int edad; // Tipo entero
        double peso; // Tipo decimal
        char inicial; // Tipo caracter ->letras, digitos, simbolos especiales
        String nombre; // Tipo cadena
        boolean estado; // Tipo estado -> true(verdadero) / false (falso)
        
        edad = 26;
        peso = 60.5;
        inicial ='J';// Alt + 39 -> '
        nombre = "Javier";
        
        System.out.printf("Tengo %d años \n",edad);
        System.out.printf("Mi peso ideal es %.1f \n", peso);
        System.out.printf("Dime %c por mi inicial ", inicial);
        System.out.printf("%s es mi nombre", nombre);
    }//Fin de Main
    
}// Fin de Class
