package Tarea_1_Estructuras_de_Control.P_Vectores_ordenamiento;

import java.util.Scanner;

public class Vectores_Ordenamiento2 {


    private Scanner SCANNER = new Scanner(System.in);
    private String[] paises_;
	
    public void cargar() {

        paises_ =new String[5];
        for(int i=0; i<paises_.length; i++) {
            System.out.print("\nIngrese el "+(i+1)+" nombre del pais:");
            paises_[i] = SCANNER.next();
        }

        System.out.print("\nDatos siendo Ordenados...\n");
        ordenar();
        System.out.print("\n...");
        System.out.print("\nDatos Ordenados...\n");
        imprimir();
    }

    public void ordenar() {
        for(int i=0; i<4; i++) {
            for(int j=0; j<4-i; j++) {
                if (paises_[j].compareTo(paises_[j+1])>0) {
                    String aux;
                    aux=paises_[j];
                    paises_[j] = paises_[j+1];
                    paises_[j+1] = aux;
                }
            }
        }
    }
	
    public void imprimir() {
    	System.out.println("Paises ordenados en forma alfabética:\n");
        for(int i=0; i<paises_.length; i++) {
            System.out.println(paises_[i]);
        }
    }

    public static void main(String[] ar) {
    	
        Vectores_Ordenamiento2 vectores_Ordenamiento2 = new Vectores_Ordenamiento2();
        vectores_Ordenamiento2.cargar();
        
    }
    
}
