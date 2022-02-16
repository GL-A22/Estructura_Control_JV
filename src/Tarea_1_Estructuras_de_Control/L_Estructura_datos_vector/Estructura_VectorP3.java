package Tarea_1_Estructuras_de_Control.L_Estructura_datos_vector;

import java.util.Scanner;

public class Estructura_VectorP3 {
    
    /*
        Una empresa tiene dos turnos (mañana y tarde) en los que trabajan 8 empleados (4 por la mañana y 4 por la tarde)
        Confeccionar un programa que permita almacenar los sueldos de los empleados agrupados por turno.
        Imprimir los gastos en sueldos de cada turno.
    
    */

    private Scanner SCANNER = new Scanner(System.in);
    private float[] turno_Man;
    private float[] turno_Tar;
	
    public void cargarDatosP3() {
    
        turno_Man =new float[4];
        turno_Tar =new float[4];

        System.out.println("Sueldos de empleados del turno de la mañana.");

        for(int i=0; i<4; i++) {
            System.out.print("\nIngrese el "+(i+1)+" sueldo:");
            turno_Man[i]=SCANNER.nextFloat();
        }

        System.out.println("Sueldos de empleados del turno de la tarde.");

        for(int i=0; i<4; i++) {
            System.out.print("\nIngrese el "+(i+1)+" sueldo:");
            turno_Tar[i]=SCANNER.nextFloat();
        }
        
        System.out.print("\nDatos Calculados...\n");
        calcularGastos();
    }


    public void calcularGastos() {
        float manana =0;
        float tarde =0;

        for(int i=0; i<4; i++){

            tarde += turno_Tar[i];
            manana += turno_Man[i];
            
        }
        System.out.println("Total de gastos del turno de la mañana: "+manana);
        System.out.println("Total de gastos del turno de la tarde: "+tarde);
    }

    public static void main(String[] ar) {
    	
        Estructura_VectorP3 estructura_VectorP3 = new Estructura_VectorP3();
        estructura_VectorP3.cargarDatosP3();
        
    }
}
