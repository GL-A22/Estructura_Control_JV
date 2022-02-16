package Tarea_1_Estructuras_de_Control.O_Vectores_mayor_menor_elemento.Clases_EJ_VectoresTamanio;

import java.util.Scanner;

public class EJ_VecTama1 {
    
    /*
        Cargar un vector de n elementos. imprimir el menor y un mensaje si se repite dentro del vector.
    
    */

    private Scanner SCANNER = new Scanner(System.in);
    private int []vector;
    private int menor_Elm;

    public void cargarDatosEj1() {
 
        System.out.print("Cuantos elementos desea cargar:");
        int n_elementos = SCANNER.nextInt();

        vector =new int[n_elementos];

        for(int i=0; i<vector.length; i++) {
            System.out.print("Ingrese el "+(i+1)+" elemnto (tipo entero):");
            vector[i] = SCANNER.nextInt();
        }

        System.out.print("\nDatos Calculados...\n");
        System.out.print("\n...");
        menorElemento();
        repiteMenor();

    }
    
    public void menorElemento() {
        menor_Elm = vector[0];

        for(int i=1; i<vector.length; i++) {

            if (vector[i] <menor_Elm) {
                menor_Elm = vector[i];
            }
        }
        System.out.println("El elemento menor es: "+menor_Elm);        
    }
    
    public void repiteMenor() {
        int cant=0;
        for(int i=0; i<vector.length; i++) {
            if (vector[i] == menor_Elm) {
                cant++;
            }
        }
        if (cant>1) {
            System.out.println("Se repite el menor en el vector.");    
        } else {
            System.out.println("No se repite el menor en el vector.");
        }
    }

    public static void main(String[] ar) {
    	
        EJ_VecTama1 ej_VecTama1 = new EJ_VecTama1();
        ej_VecTama1.cargarDatosEj1();
        
    }
}
