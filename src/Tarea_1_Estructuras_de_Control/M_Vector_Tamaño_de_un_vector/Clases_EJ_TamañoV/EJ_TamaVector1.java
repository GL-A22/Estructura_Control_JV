package Tarea_1_Estructuras_de_Control.M_Vector_Tamaño_de_un_vector.Clases_EJ_TamañoV;

import java.util.Scanner;

public class EJ_TamaVector1 {
 
    /*
        Desarrollar un programa que permita ingresar un vector de n elementos, 
        ingresar n por teclado. Luego imprimir la suma de todos sus elementos
    
    */

    private Scanner SCANNER = new Scanner(System.in);
    private int[] vector_E;
    
    public void cargarDatosEj1() {

        System.out.print("Cuantos elementos tiene el vector:");
        int n_dimencion = SCANNER.nextInt();
        vector_E =new int[n_dimencion];  

        for(int i=0; i<vector_E.length; i++) {
            System.out.print("Ingrese elemento:");
            vector_E[i] = SCANNER.nextInt();
        }

        System.out.print("\nDatos Calculados...\n");
        System.out.print("\n...");
        acumularElementos();
    }
    
    public void acumularElementos() {

        int suma=0;

        for(int i=0; i<vector_E.length; i++) {
            suma += vector_E[i];
        }
        System.out.println("La suma de los elementos es: "+suma);
    }
    

    public static void main(String[] ar) {
    	
        EJ_TamaVector1 ej_TamaVector1 = new EJ_TamaVector1();
        ej_TamaVector1.cargarDatosEj1();
        
    }
}
