package Tarea_1_Estructuras_de_Control.S_Matrices_cantidad_filas_columnas;

import java.util.Scanner;

public class Matrices_Cant_FilasColumn_2 {
    /*
    
        Crear una matriz de n * m filas (cargar n y m por teclado) Imprimir el mayor elemento y la fila y columna donde se almacena.
    
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
            for(int c=0; c<mat[f].length; c++) {

                System.out.print("Ingrese componente:");
                mat[f][c]=SCANNER.nextInt();
            }
        }
    }
        
    public void imprimirMayor() {
    	int mayor=mat[0][0];
    	int filamay=0;
    	int columnamay=0;

        for(int f=0; f<mat.length; f++) {
            for(int c=0; c<mat[f].length; c++) {

                if (mat[f][c]>mayor) {
                    mayor=mat[f][c];
                    filamay=f;
                    columnamay=c;
                }
            }
        }
        System.out.println("El elemento mayor es:"+mayor);
        System.out.println("Se encuentra en la fila:"+filamay+ " y en la columna: "+columnamay);
    }
    
    public static void main(String[] ar) {
        Matrices_Cant_FilasColumn_2 ma=new Matrices_Cant_FilasColumn_2();
        ma.cargar();
        ma.imprimirMayor();
    } 

}
