package Tarea_1_Estructuras_de_Control.U_Matrices_irregulares;

import java.util.Scanner;

public class Matrices_Irregulares {
    
    /*
    
        Confeccionaremos un programa que permita crear una matriz irregular
         y luego imprimir la matriz en forma completa.
    
    */

    private Scanner SCANNER = new Scanner(System.in);
    private int[][] matriz_;
    
    public void cargarDatos() {

        System.out.print("Cuantas fila tiene la matriz:");
        int filas=SCANNER.nextInt();
        matriz_=new int[filas][];
        for(int i=0; i<matriz_.length; i++) {
            System.out.print("Cuantas elementos tiene la fila " + i + ":");
            int elementos=SCANNER.nextInt();
            matriz_[i]=new int[elementos];            
            for(int j=0; j<matriz_[i].length; j++) {
                System.out.print("Ingrese componente:");
                matriz_[i][j]=SCANNER.nextInt();
            }
        }
    }
    
    public void imprimir() {
        for(int f=0;f<matriz_.length;f++) {
            for(int c=0;c<matriz_[f].length;c++) {
                System.out.print(matriz_[f][c]+" ");
            }
            System.out.println();
        }
    }


    public static void main(String[] ar) {
    
        Matrices_Irregulares matrices_Irregulares = new Matrices_Irregulares();
        matrices_Irregulares.cargarDatos();
        matrices_Irregulares.imprimir();
        
    }
}

