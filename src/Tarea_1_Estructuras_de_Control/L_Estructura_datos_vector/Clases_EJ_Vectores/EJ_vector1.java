package Tarea_1_Estructuras_de_Control.L_Estructura_datos_vector.Clases_EJ_Vectores;

import java.util.Scanner;

public class EJ_vector1 {
    
    /*
        Desarrollar un programa que permita ingresar un vector de 8 elementos, e informe:
        El valor acumulado de todos los elementos del vector.
        El valor acumulado de los elementos del vector que sean mayores a 36.
        Cantidad de valores mayores a 50.
    
    */

    private Scanner SCANNER = new Scanner(System.in);
    private int[] vector_;
    
    public void cargarDatosEj1() {

        vector_ =new int[8];

        for(int i=0; i<8; i++) {
            System.out.print("\nIngrese el "+(i+1)+" elemento:");
            vector_[i] = SCANNER.nextInt();
        }

        System.out.print("\nDatos Calculados...\n");
        System.out.print("\n...");
        acumularElementos();
        acumularMayores36();
        cantidadMayores50();

    }

    public void acumularElementos() {
        int suma=0;

        for(int i=0; i<8; i++) {
            suma += vector_[i];
        }
        System.out.print("\nLa suma de los 8 elementos es: "+suma);
    }

    public void acumularMayores36() {
        int suma =0;
        for(int i=0; i<8; i++) {

            if (vector_[i] >36) {
                suma += vector_[i];
            }
        }
        System.out.print("\nLa suma de los elementos mayores a 36 es: "+suma);
    }

    public void cantidadMayores50() {
        int cantidad_ =0;
        for(int i=0; i<8; i++) {

            if (vector_[i] >50) {
                cantidad_++;
            }    
        }
        System.out.print("\nLa cantidad de valores mayores a 50 es: "+cantidad_);
    }

    public static void main(String[] ar) {
    	
        EJ_vector1 ej_vector1 = new EJ_vector1();
        ej_vector1.cargarDatosEj1();  
        
    }


}
