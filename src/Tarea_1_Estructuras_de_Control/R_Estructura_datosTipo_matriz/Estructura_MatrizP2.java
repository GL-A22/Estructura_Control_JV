package Tarea_1_Estructuras_de_Control.R_Estructura_datosTipo_matriz;

import java.util.Scanner;

public class Estructura_MatrizP2 {

    /*
        Crear y cargar una matriz de 4 filas por 4 columnas. Imprimir la diagonal principal.
    
    */

    private Scanner SCANNER = new Scanner(System.in);
    private int[][] matriz;
    
    public void cargar() {

        matriz =new int[4][4];
        for(int i=0; i<4; i++) {
            for(int j=0; j<4; j++) {
                System.out.print("Ingrese componente:");
                matriz[i][j] = SCANNER.nextInt();
            }
        }

        System.out.print("\nImprimiendo Datos... Diagonal Principal - Matriz\n");
        System.out.print("\n...");
        imprimirDiagonalPrincipal();
    }
    
    public void imprimirDiagonalPrincipal() {
        for(int i=0;i<4;i++) {
            System.out.print(matriz[i][i]+" ");
        }
    }

    public static void main(String[] ar) {
    
        Estructura_MatrizP2 estructura_MatrizP2 = new Estructura_MatrizP2();
        estructura_MatrizP2.cargar(); 
        
    }
    
}
