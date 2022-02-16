package Tarea_1_Estructuras_de_Control.R_Estructura_datosTipo_matriz.Clases_EJ_EstructuraMatriz;

import java.util.Scanner;

public class EJ_EstructuraMAtriz_1 {

    /*
        Crear una matriz de 2 filas y 5 columnas. Realizar la carga de componentes por columna 
        (es decir primero ingresar toda la primer columna, luego la segunda columna y así sucesivamente)
        Imprimir luego la matriz.
    
     */
    
    private Scanner SCANNER = new Scanner(System.in);
    private int[][] mat;
    
    public void cargarDatosEj1() {

        mat=new int[2][5];
        System.out.println("Carga de la matriz por columna:");
        for(int c=0;c<5;c++) {        
           for(int f=0;f<2;f++) {
                System.out.print("Ingrese componente " + " de la fila " + f + " y la columna "+ c + " :");
                mat[f][c]=SCANNER.nextInt();
            }
        }

        System.out.print("\nImprimiendo datos....\n");
        imprimir();
    }
    
    public void imprimir() {
        for(int f=0;f<2;f++) {
            for(int c=0;c<5;c++) {
                System.out.print(mat[f][c]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] ar) {
    
        EJ_EstructuraMAtriz_1 ej_EstructuraMAtriz_1 = new EJ_EstructuraMAtriz_1();
        ej_EstructuraMAtriz_1.cargarDatosEj1();
    }
    
}
