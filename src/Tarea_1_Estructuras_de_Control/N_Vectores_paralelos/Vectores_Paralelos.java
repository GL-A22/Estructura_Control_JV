package Tarea_1_Estructuras_de_Control.N_Vectores_paralelos;

import java.util.Scanner;

public class Vectores_Paralelos {
    
    /*
        18 - Vectores paralelos

        Desarrollar un programa que permita cargar 5 nombres de personas y sus edades respectivas.
        Luego de realizar la carga por teclado de todos los datos imprimir los nombres de las personas mayores de edad (mayores o iguales a 18 años)
    
    */

    private Scanner SCANNER = new Scanner(System.in);
    private String[] nombres_P;
    private int[] edades_P;
    
    public void cargarDatos() {
        
        nombres_P =new String[5];
        edades_P =new int[5];

        for(int i=0; i<nombres_P.length; i++) {

            System.out.print("\nIngrese el "+(i+1)+" nombre: ");
            nombres_P[i] = SCANNER.next();

            System.out.print("\nIngrese la edad:");
            edades_P[i] = SCANNER.nextInt();            
        }

        System.out.print("\nDatos Calculados...\n");
        System.out.print("\n...");
        mayoresEdad();

    }    
    
    public void mayoresEdad() {

        System.out.println("Personas mayores de edad.\n");
    	for(int i=0; i<nombres_P.length; i++) {

            if (edades_P[i] >=18) {
                System.out.println(nombres_P[i]);
            }
    	}    
    }


    public static void main(String[] ar) {
    	
        Vectores_Paralelos vectores_Paralelos = new Vectores_Paralelos();
        vectores_Paralelos.cargarDatos();
        
    }

}
