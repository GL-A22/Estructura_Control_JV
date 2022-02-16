package Tarea_1_Estructuras_de_Control.I_Cadenas_caracteresJava;

import java.util.Scanner;

public class Cadenas_caracteres {
    
    private Scanner SCANNER = new Scanner(System.in);

    /*
        13 - Cadenas de caracteres en Java

        Solicitar el ingreso del nombre y edad de dos personas. Mostrar el nombre
    
    */

    public void Cadenas_caracteres_1(){
        
        System.out.print("Ingrese el nombre:");
        String nombre_1 = SCANNER.next();

        System.out.print("\nIngrese edad: ");
        int edad_1= SCANNER.nextInt();

        System.out.print("\nIngrese el nombre: ");
        String nombre_2 = SCANNER.next();

        System.out.print("\nIngrese edad: ");
        int edad_2= SCANNER.nextInt();

        System.out.print("\nLa persona de mayor edad es: ");

        if (edad_1>edad_2) {
            System.out.print(nombre_1);
        } else {
            System.out.print(nombre_2);
        }
    }


    /*
        Solicitar el ingreso del apellido, nombre y edad de dos personas.
        Mostrar el nombre de la persona con mayor edad. Realizar la carga del apellido y 
        nombre en una variable de tipo String.
    
    */
    
    public void Cadenas_caracteres_2(){

        System.out.print("Ingrese el apellido y el nombre de la primera persona:");
        String persona_1 = SCANNER.next();

        System.out.print("\nIngrese la edad: ");
        int edad_P1= SCANNER.nextInt();

        System.out.print("\nIngrese el apellido y el nombre de la segunda persona: ");
        String persona_2 = SCANNER.next();

        System.out.print("\nIngrese edad: ");
        int edad_P2= SCANNER.nextInt();

        System.out.print("\nLa persona de mayor edad es: ");

        if (edad_P1 > edad_P2) {
            System.out.print(persona_1);
        } else {
            System.out.print(persona_2);
        }        
    }


    /*
        Solicitar el ingreso de dos apellidos. Mostrar un mensaje si son iguales o distintos.
    
    */

    public void Cadenas_caracteres_3(){
        // ingreso por consola
        System.out.print("\nIngrese su primer apellido: ");
        String apellido_1 = SCANNER.next();

        System.out.print("Ingrese su primer apellido: ");
        String apellido_2 = SCANNER.next();

        if(apellido_1.equalsIgnoreCase(apellido_2)){

            System.out.print("\nLos apellidos ingresados son iguales");

        }else{
            System.out.print("\nLos apellidos ingresados son distintos");
        }
    }

    public static void main(String[] ar) {
    	
        Cadenas_caracteres cadenas_caracteres = new Cadenas_caracteres();
        cadenas_caracteres.Cadenas_caracteres_1();
        cadenas_caracteres.Cadenas_caracteres_2();
        cadenas_caracteres.Cadenas_caracteres_3();
        
    }

}

