package Tarea_1_Estructuras_de_Control.S_Matrices_cantidad_filas_columnas.Clases_EJ_Matrices_FilaColumnas;

import java.util.Scanner;

public class EJ_MatricesCant_FilasColum_2 {
    

    private Scanner SCANNER = new Scanner(System.in);
    private int[][] mat;
    
    public void cargar() {
   
        System.out.print("Cuantas fila tiene la matriz:");
        int filas=SCANNER.nextInt();

        System.out.print("Cuantas columnas tiene la matriz:");
        int columnas=SCANNER.nextInt();

        mat=new int[filas][columnas];
        for(int f=0; f<mat.length; f++) {
            for(int c=0; c<mat[f].length; c++) {

                System.out.print("Ingrese componente:");
                mat[f][c]=SCANNER.nextInt();
            }
        }
    }
           
    public void imprimirVertices() {
    	System.out.println("Vértice superior izquierdo:");
        System.out.println(mat[0][0]);
    	System.out.println("Vértice superior derecho:");        
        System.out.println(mat[0][mat[0].length-1]);
    	System.out.println("Vértice inferior izquierdo:");        
        System.out.println(mat[mat.length-1][0]);
    	System.out.println("Vértice inferior derecho:");        
        System.out.println(mat[mat.length-1][mat[mat.length-1].length-1]);
    }    
    
    public static void main(String[] ar) {
        EJ_MatricesCant_FilasColum_2 ma=new EJ_MatricesCant_FilasColum_2();
        ma.cargar();
        ma.imprimirVertices();
    } 
}
