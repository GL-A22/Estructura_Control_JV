package Tarea_1_Estructuras_de_Control.L_Estructura_datos_vector.Clases_EJ_Vectores;

import java.util.Scanner;

public class EJ_vectro2 {
    

    /*
        Realizar un programa que pida la carga de dos vectores numéricos enteros de 4 elementos. 
        Obtener la suma de los dos vectores, dicho resultado guardarlo en un tercer vector del mismo tamaño.
        Sumar componente a componente.
    
    */

    private Scanner SCANNER = new Scanner(System.in);
    private int[] vector_1;
    private int[] vector_2;
    private int[] vector_Suma;
    
    public void cargarDatosEj2() {

        vector_1 =new int[4];
        vector_2 =new int[4];

        System.out.println("Carga del primer vector.");

        for(int i=0; i<4; i++) {
            System.out.print("\nIngrese el "+(i+1)+" elemento:");
            vector_1[i] = SCANNER.nextInt();
        }

        System.out.println("Carga del segundo vector.");

        for(int i=0; i<4; i++) {
            System.out.print("\nIngrese el "+(i+1)+" elemento:");
            vector_2[i] = SCANNER.nextInt();
        } 
        
        
        System.out.print("\nDatos Calculados...\n");
        System.out.print("\n...");
        sumarizarVectores();
    } 
    
    public void sumarizarVectores() {

    	vector_Suma =new int[4];

        for(int i=0; i<4; i++) {
            vector_Suma[i] = vector_1[i] + vector_2[i];
        }

        System.out.println("Vector resultante.");
        for(int i=0; i<4; i++) {
            System.out.println(vector_Suma[i]);
        }
    }
    
    public static void main(String[] ar) {
    	
        EJ_vectro2 ej_vector2 = new EJ_vectro2();
        ej_vector2.cargarDatosEj2();  
        
    }
}
