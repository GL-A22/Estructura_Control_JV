package Tarea_1_Estructuras_de_Control.V_Constructor_de_clase;

import java.util.Scanner;

public class ConstructoresP2_Alumno {
 
    
    private Scanner SCANNER = new Scanner(System.in);
    private String nombre_Alum;
    private int edad_Alum;
    
    public ConstructoresP2_Alumno() {

        System.out.print("Ingrese nombre:");
        nombre_Alum=SCANNER.next();
        System.out.print("Ingrese edad:");
        edad_Alum=SCANNER.nextInt();
    }
    
    public void imprimir() {
        System.out.print("\nNombre: "+nombre_Alum);
        System.out.print("\nEdad: "+edad_Alum);
    }
    
    public void esMayorEdad() {
        if (edad_Alum>=18) {
            System.out.print(nombre_Alum+" es mayor de edad.");
        } else {
            System.out.print(nombre_Alum+" no es mayor de edad.");
        }
    }

    public static void main(String[] ar) {
    
        ConstructoresP2_Alumno constructoresP2_Alumno = new ConstructoresP2_Alumno();
        constructoresP2_Alumno.imprimir();
        constructoresP2_Alumno.esMayorEdad();
        
    }
}
