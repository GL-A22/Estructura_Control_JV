package Tarea_1_Estructuras_de_Control.P_Vectores_ordenamiento;

import java.util.Scanner;

public class Vectores_Ordenamiento {
    
    /*
        20 - Vectores (ordenamiento)

        Se debe crear un vector donde almacenar 5 sueldos. Ordenar el vector sueldos de menor a mayor.
    
    */

    private Scanner SCANNER = new Scanner(System.in);
    private int[] sueldos;

    public void cargarDatos() {
 
        sueldos =new int[5];
        for(int i=0; i<sueldos.length; i++) {
            System.out.print("\nIngrese el "+(i+1)+" sueldo:");
            sueldos[i] = SCANNER.nextInt();
        }

        System.out.print("\nDatos siendo Ordenados...\n");
        ordenar();
        System.out.print("\n...");
        System.out.print("\nDatos Ordenados...\n");
        
        imprimir();
    }
	
    public void ordenar() {
        for(int i=0; i<4; i++) {
            for(int j=0; j<4-i; j++) {

                if (sueldos[j]>sueldos[j+1]) {
                    int aux;
                    aux=sueldos[j];
                    sueldos[j]=sueldos[j+1];
                    sueldos[j+1]=aux;
                }
            }
        }
    }
	
    public void imprimir() {
        System.out.println("Sueldos ordenados de menor a mayor.\n");
        for(int i=0; i<sueldos.length; i++) {
            System.out.println(sueldos[i]);
        }
    }

    public static void main(String[] ar) {
    	
        Vectores_Ordenamiento vectores_Ordenamiento = new Vectores_Ordenamiento();
        vectores_Ordenamiento.cargarDatos();
    }
}
