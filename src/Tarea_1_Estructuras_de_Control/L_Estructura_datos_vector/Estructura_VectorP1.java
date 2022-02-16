package Tarea_1_Estructuras_de_Control.L_Estructura_datos_vector;

import java.util.Scanner;

public class Estructura_VectorP1 {

    /*
        16 - Estructura de datos tipo vector.

        Se desea guardar los sueldos de 5 operarios.

    */

    private Scanner SCANNER = new Scanner(System.in);
    private int[] sueldos_;

    public void cargarDatos(){

        sueldos_ = new int[5];

        for(int i=0; i<5; i++) {
            System.out.print("\nIngrese el "+(i+1)+" sueldo a guardar: ");
            sueldos_[i] = SCANNER.nextInt();

        }
        System.out.print("\nSueldos guardados recientemente...\n ");
        imprimirVector();
    }

    public void imprimirVector() {
        for(int i=0; i<5; i++) {
            System.out.println(sueldos_[i]);
        }
    }


    public static void main(String[] ar) {
    	
        Estructura_VectorP1 estructura_VectorP1 = new Estructura_VectorP1();
        estructura_VectorP1.cargarDatos();
        
    }
    
}
