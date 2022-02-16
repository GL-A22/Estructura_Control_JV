package Tarea_1_Estructuras_de_Control.L_Estructura_datos_vector.Clases_EJ_Vectores;

import java.util.Scanner;

public class EJ_vector3 {
    /*
        Se tienen las notas del primer parcial de los alumnos de dos cursos, el curso A y el curso B, 
        cada curso cuenta con 5 alumnos.
        Realizar un programa que muestre el curso que obtuvo el mayor promedio general.
    
    */

    private Scanner SCANNER = new Scanner(System.in);
    private int[] curso_a;
    private int[] curso_b;
    
    public void cargarDatosEj3() {

        curso_a=new int[5];
        curso_b=new int[5];

        System.out.println("Carga de notas del curso A");

        for(int i=0; i<5; i++) {
            System.out.print("\nIngrese la "+(i+1)+" nota:");
            curso_a[i] = SCANNER.nextInt();
        }

        System.out.println("Carga del notas del curso B");

        for(int i=0; i<5; i++) {
            System.out.print("\nIngrese la "+(i+1)+" nota:");
            curso_b[i]= SCANNER.nextInt();
        }      
        
        System.out.print("\nDatos Calculados...\n");
        System.out.print("\n...");
        calcularPromedios();
        
    }

    public void calcularPromedios() {

        int suma_n1=0;
        int suma_n2=0;

        for(int i=0; i<5; i++) {
            suma_n1 += curso_a[i];
            suma_n2 += curso_b[i];            
        }

        int promedio_a =suma_n1/5;
        int promedio_b =suma_n2/5;

        if (promedio_a > promedio_b) {
            System.out.println("El curso A tiene un promedio mayor.");
        } else {
            System.out.println("El curso B tiene un promedio mayor.");
        }
    }

    public static void main(String[] ar) {
    	
        EJ_vector3 ej_vector3 = new EJ_vector3();
        ej_vector3.cargarDatosEj3();  
        
    }
}
