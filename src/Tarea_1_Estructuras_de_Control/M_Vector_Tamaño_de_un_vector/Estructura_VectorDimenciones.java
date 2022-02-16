package Tarea_1_Estructuras_de_Control.M_Vector_Tamaño_de_un_vector;

import java.util.Scanner;

public class Estructura_VectorDimenciones {
    
    /*
        Se desea almacenar los sueldos de operarios. Cuando se ejecuta 
        el programa se debe pedir la cantidad de sueldos a ingresar. 
        Luego crear un vector con dicho tamaño.
    
    */

    private Scanner SCANNER = new Scanner(System.in);
    private int[] sueldos;
	
    public void cargarDatos(){

        System.out.print("\nCuantos sueldos cargará:");
        int cant = SCANNER.nextInt();

        sueldos =new int[cant];

        for(int i=0; i<sueldos.length; i++) {
            System.out.print("Ingrese el "+(i+1)+" sueldo:");
            sueldos[i] = SCANNER.nextInt();
        }	

        System.out.print("\nImprimiendo datos...\n");
        System.out.print("\n...");
        imprimirDatos();
    }
	
    public void imprimirDatos() {
        for(int i=0; i<sueldos.length; i++) {
            System.out.println(sueldos[i]);
        }
    }


    public static void main(String[] ar) {
    	
        Estructura_VectorDimenciones estructura_VectorDimenciones = new Estructura_VectorDimenciones();
        estructura_VectorDimenciones.cargarDatos();
    }
}
