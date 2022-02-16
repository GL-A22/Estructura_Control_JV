package Tarea_1_Estructuras_de_Control.Q_Vectores_paralelos_ordenamiento;

import java.util.Scanner;

public class Vectores_Ord_paralelos {
    
    /*
        21-Vectores (ordenamiento con vectores paralelos)
    
        Confeccionar un programa que permita cargar los nombres de 5 alumnos y sus notas respectivas. 
        Luego ordenar las notas de mayor a menor. Imprimir las notas y los nombres de los alumnos.
    */

    private Scanner SCANNER = new Scanner(System.in);
    private String[] nombres_A;
    private int[] notas;
    
    public void cargar() {
   
        nombres_A =new String[5];
        notas =new int[5];

        System.out.println("Carga de nombres y notas");

        for(int i=0; i<nombres_A.length; i++) {

            System.out.print("\nIngese el nombre del "+(i+1)+" alumno:");
            nombres_A[i] = SCANNER.next();

            System.out.print("\nIngrese la nota del alumno:");
            notas[i] = SCANNER.nextInt();
        }

        System.out.print("\nDatos siendo Ordenados...\n");
        ordenar();
        System.out.print("\n...");
        System.out.print("\nDatos Ordenados...\n");
        
        imprimir();
    }        
    
    public void ordenar() {
        for(int i=0; i<notas.length; i++) {
            for(int j=0; j<notas.length-1-i; j++) {

                if (notas[j]<notas[j+1]) {
                    int aux_nota;
                    aux_nota = notas[j];
                    notas[j] = notas[j+1];
                    notas[j+1] = aux_nota;
                    String aux_nombre;
                    aux_nombre = nombres_A[j];
                    nombres_A[j] = nombres_A[j+1];
                    nombres_A[j+1] = aux_nombre;
                }
            }
        }
        
    }
        
    public void imprimir() {
   	System.out.println("Nombres de alumnos y notas de mayor a menor\n");

        for(int i=0; i<notas.length; i++) {
            System.out.println(nombres_A[i] + " - " + notas[i]);
        }
    }     

    public static void main(String[] ar) {
    
        Vectores_Ord_paralelos vectores_Ord_paralelos = new Vectores_Ord_paralelos();
        vectores_Ord_paralelos.cargar();
        
    }

}
