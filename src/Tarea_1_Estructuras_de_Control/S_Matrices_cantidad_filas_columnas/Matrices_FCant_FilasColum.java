package Tarea_1_Estructuras_de_Control.S_Matrices_cantidad_filas_columnas;

import java.util.Scanner;

public class Matrices_FCant_FilasColum {
    /*
    
    Crear una matriz de n * m filas (cargar n y m por teclado) Imprimir la matriz completa y la última fila.
    
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
    
    public void imprimir() {
        for(int f=0;f<mat.length;f++) {
            for(int c=0;c<mat[f].length;c++) {
                System.out.print(mat[f][c]+" ");
            }
            System.out.println();
        }
    }
    
    public void imprimirUltimaFila() {
    	System.out.println("Ultima fila");
        for(int c=0;c<mat[mat.length-1].length;c++) {
             System.out.print(mat[mat.length-1][c]+" ");
        }
    }
    
    public static void main(String[] ar) {
        Matrices_FCant_FilasColum ma=new Matrices_FCant_FilasColum();
        ma.cargar();
        ma.imprimir();
        ma.imprimirUltimaFila();
    }   
}

