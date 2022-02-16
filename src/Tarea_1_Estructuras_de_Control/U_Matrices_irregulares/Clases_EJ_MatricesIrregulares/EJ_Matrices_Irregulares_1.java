package Tarea_1_Estructuras_de_Control.U_Matrices_irregulares.Clases_EJ_MatricesIrregulares;

import java.util.Scanner;

public class EJ_Matrices_Irregulares_1 {
    /*
    
        Confeccionar una clase para administrar una matriz irregular de 5 filas y 1 columna la primer fila,
        2 columnas la segunda fila y así sucesivamente hasta 5 columnas la última fila 
        (crearla sin la intervención del operador)
        Realizar la carga por teclado e imprimir posteriormente.
    
    */

    private Scanner SCANNER = new Scanner(System.in);
    private int[][] mat;
    
    public void cargar() {

        mat=new int[5][];
        for(int i=0; i<mat.length; i++) {
            mat[i]=new int[i+1];            
            for(int c=0; c<mat[i].length; c++) {
                System.out.print("Ingrese componente:");
                mat[i][c]=SCANNER.nextInt();
            }
        }
    }
    
    public void imprimir() {
        for(int i=0; i<mat.length; i++) {
            for(int c=0; c<mat[i].length; c++) {
                System.out.print(mat[i][c]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] ar) {
    
        EJ_Matrices_Irregulares_1 ej_Matrices_Irregulares_1 = new EJ_Matrices_Irregulares_1();
        ej_Matrices_Irregulares_1.cargar();
        ej_Matrices_Irregulares_1.imprimir();
        
    }
}
