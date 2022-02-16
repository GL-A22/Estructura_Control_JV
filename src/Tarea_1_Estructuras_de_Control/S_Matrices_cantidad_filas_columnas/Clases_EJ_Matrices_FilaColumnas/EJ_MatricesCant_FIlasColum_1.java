package Tarea_1_Estructuras_de_Control.S_Matrices_cantidad_filas_columnas.Clases_EJ_Matrices_FilaColumnas;

import java.util.Scanner;

public class EJ_MatricesCant_FIlasColum_1 {
    /*
    
        Crear una matriz de n * m filas (cargar n y m por teclado) Intercambiar la primer fila con la segundo. Imprimir luego la matriz.
    
    */

    private Scanner SCANNER = new Scanner(System.in);
    private int[][] mat;
    
    public void cargar() {

        System.out.print("Cuantas fila tiene la matriz:");
        int filas=SCANNER.nextInt();

        System.out.print("Cuantas columnas tiene la matriz:");
        int columnas=SCANNER.nextInt();

        mat=new int[filas][columnas];

        for(int f=0; f<mat.length; f++) {
            for(int c=0;c<mat[f].length;c++) {

                System.out.print("Ingrese componente:");
                mat[f][c]=SCANNER.nextInt();
            }
        }
    }
        
    public void intercambiar() {
        for(int c=0; c<mat[0].length; c++) {

            int aux=mat[0][c];
            mat[0][c]=mat[1][c];
            mat[1][c]=aux;
        }
    }
    
    public void imprimir() {
        for(int f=0; f<mat.length; f++) {
            for(int c=0;c<mat[f].length;c++) {
                
                System.out.print(mat[f][c]+" ");
            }
            System.out.println();
        }
    }    
    
    public static void main(String[] ar) {
        EJ_MatricesCant_FIlasColum_1 ma=new EJ_MatricesCant_FIlasColum_1();
        ma.cargar();
        ma.intercambiar();
        ma.imprimir();
    }
}
