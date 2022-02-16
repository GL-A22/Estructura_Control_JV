package Tarea_1_Estructuras_de_Control.P_Vectores_ordenamiento.Clases_EJ_VecOrdenamiento;

import java.util.Scanner;

public class EJ_VecOrdenamiento1 {
    
    /*
        Cargar un vector de n elementos de tipo entero. Ordenar posteriormente el vector.
    
    */

    private Scanner SCANNER = new Scanner(System.in);
    private int[] vector_n;
	
     public void cargarDatos() {
        
        System.out.print("Cuantos elementos tendrá el vector:");
        int cant_elemet = SCANNER.nextInt();
        vector_n =new int[cant_elemet];

	    for(int i=0; i<vector_n.length; i++) {

            System.out.print("Ingrese elemento:");
            vector_n[i] = SCANNER.nextInt();
	    }

        System.out.print("\nDatos siendo Ordenados...\n");
        ordenar();
        System.out.print("\n...");
        System.out.print("\nDatos Ordenados...\n");
        
        imprimir();
	}
	
    public void ordenar() {
        for(int i=0; i<vector_n.length; i++) {
            for(int j=0; j<vector_n.length-1-i; j++) {
                if (vector_n[j] > vector_n[j+1]) {
                    int aux;
                    aux = vector_n[j];
                    vector_n[j] = vector_n[j+1];
                    vector_n[j+1] = aux;
                }
            }
        }
    }
	
    public void imprimir() {
	    System.out.println("Vector ordenados de menor a mayor.\n");
        for(int i=0; i<vector_n.length; i++) {
            System.out.println(vector_n[i]);
        }
    }

    public static void main(String[] ar) {
    	
        EJ_VecOrdenamiento1 ej_VecOrdenamiento1 = new EJ_VecOrdenamiento1();
        ej_VecOrdenamiento1.cargarDatos();

        
    }
}
