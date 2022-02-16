package Tarea_1_Estructuras_de_Control.O_Vectores_mayor_menor_elemento;

import java.util.Scanner;

public class Vectores_Mayor_Menor_Elem {
    
    /*
        19 - Vectores (mayor y menor elemento)

        Confeccionar un programa que permita cargar los nombres de 5 operarios
         y sus sueldos respectivos. Mostrar el sueldo mayor y el nombre del operario.

    */

    private Scanner SCANNER = new Scanner(System.in);
    private String[] nombres_Op;
    private float[] sueldos_Op;

    public void cargarDatos() {
    
        nombres_Op =new String[5];
        sueldos_Op =new float[5];

        for(int i=0; i<nombres_Op.length; i++) {

            System.out.print("\nIngrese el "+(i+1)+" nombre del empleado:");
            nombres_Op [i] = SCANNER.next();
            System.out.print("\nIngrese el sueldo:");
            sueldos_Op [i] = SCANNER.nextFloat();
        }

        System.out.print("\nDatos Calculados...\n");
        System.out.print("\n...");
        mayorSueldo();
    }
    
    public void mayorSueldo() {
        float mayor = sueldos_Op[0];
        int Op_mayorS =0;

        for(int i=1; i<nombres_Op.length; i++) {

            if (sueldos_Op[i] >mayor) {
                mayor =sueldos_Op[i];
                Op_mayorS = i;
            }
        }
        System.out.println("El empleado con sueldo mayor es: "+nombres_Op[Op_mayorS]);
        System.out.println("Tiene un sueldo: "+mayor);
    }

    public static void main(String[] ar) {
    
        Vectores_Mayor_Menor_Elem vectores_Mayor_Menor_Elem = new Vectores_Mayor_Menor_Elem();
        vectores_Mayor_Menor_Elem.cargarDatos();
        
    }
}
