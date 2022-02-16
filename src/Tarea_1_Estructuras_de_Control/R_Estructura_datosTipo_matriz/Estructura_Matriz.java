package Tarea_1_Estructuras_de_Control.R_Estructura_datosTipo_matriz;

import java.util.Scanner;

public class Estructura_Matriz {
    
    /*
       23-Estructura de datos tipo matriz;

        Crear una matriz de 3 filas por 5 columnas con elementos de tipo int, cargar sus componentes y luego imprimirlas.
    
    */

    private Scanner SCANNER = new Scanner(System.in);
    private int[][] matriz;
    
    public void cargarDatosP1() {

        matriz=new int[3][5];

        for(int i=0; i<3; i++) {
            for(int j=0; j<5; j++) {
                System.out.print("\nIngrese componente:");
                matriz[i][j]=SCANNER.nextInt();
            }
        }

        System.out.print("\nImprimiendo Datos...\n");
        System.out.print("\n...");
        imprimir();
    }
    
    public void imprimir() {
        for(int i=0; i<3; i++) {
            for(int j=0; j<5; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] ar) {
    
        Estructura_Matriz estructura_Matriz = new Estructura_Matriz();
        estructura_Matriz.cargarDatosP1();
        
    }
}
