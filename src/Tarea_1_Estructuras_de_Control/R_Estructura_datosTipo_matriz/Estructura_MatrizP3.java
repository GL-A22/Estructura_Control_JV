package Tarea_1_Estructuras_de_Control.R_Estructura_datosTipo_matriz;

import java.util.Scanner;

public class Estructura_MatrizP3 {
    /*
        Crear y cargar una matriz de 3 filas por 4 columnas.
        Imprimir la primer fila. Imprimir la última fila e imprimir la primer columna.
    
    */

    private Scanner SCANNER = new Scanner(System.in);
    private int[][] matriz;
    
    public void cargar() {
 
        matriz=new int[3][4];
        for(int i=0; i<3; i++) {
            for(int j=0; j<4; j++) {
                System.out.print("Ingrese componente:");
                matriz[i][j]=SCANNER.nextInt();
            }
        }

        System.out.print("\n¿Como desea imprimir la Matriz?... \n");
        System.out.println(" 1... Primera fila");
        System.out.println(" 2... Ultima fila");
        System.out.println(" 3... Primer columna");
        int opcion = SCANNER.nextInt();

        if(opcion == 1){
            System.out.println(" Eligió... Primera fila");
            primerFila();

        }else if(opcion == 2){
            System.out.println(" Eligió... Ultima fila");
            ultimaFila();

        }else{
            System.out.println(" Eligió... Primer columna");
            primerColumna();
        }
    }


    
    public void primerFila() {
    	System.out.println("Primer fila de la matriz:");
        for(int j=0; j<4; j++) {
            System.out.println(matriz[0][j]);
        }
    }
    
    public void ultimaFila() {
    	System.out.println("Ultima fila de la matriz:");
        for(int j=0; j<4; j++) {
            System.out.println(matriz[2][j]);
        }
    }
    
    public void primerColumna() {
    	System.out.println("Primer columna:");
        for(int i=0; i<3; i++) {
            System.out.println(matriz[i][0]);
        }
    }

    public static void main(String[] ar) {
    
        Estructura_MatrizP3 estructura_MatrizP3 = new Estructura_MatrizP3();
        estructura_MatrizP3.cargar();
        
    }
}
