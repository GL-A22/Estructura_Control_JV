package Tarea_1_Estructuras_de_Control.L_Estructura_datos_vector.Clases_EJ_Vectores;

import java.util.Scanner;

public class EJ_vector4 {

    /*
        Cargar un vector de 10 elementos y verificar posteriormente si el mismo está ordenado de menor a mayor.
    
    */
    
    private Scanner SCANNER = new Scanner(System.in);
    private int[] vector_;
    
    public void cargarDatosEj4() {
        
        vector_=new int[10];

        for(int i=0; i<10; i++) {
            System.out.print("Ingrese elemento:");
            vector_[i]= SCANNER.nextInt();
        }

        System.out.print("\nDatos Calculados...\n");
        System.out.print("\n...");
        verificarOrdenado();
    }
    
    public void verificarOrdenado() {
        
        int orden=1;

        for(int f=0;f<9;f++) {
            if (vector_[f+1] <vector_[f]) {
                orden=0;
            }
        }

        if (orden==1) {
            System.out.println("Esta ordenado de menor a mayor");
        } else {
            System.out.println("No esta ordenado de menor a mayor");
        }
    }

    public static void main(String[] ar) {
    	
        EJ_vector4 ej_vector4 = new EJ_vector4();
        ej_vector4.cargarDatosEj4();  
        
    }

}
