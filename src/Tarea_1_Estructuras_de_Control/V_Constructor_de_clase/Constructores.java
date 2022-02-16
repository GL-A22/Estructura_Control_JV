package Tarea_1_Estructuras_de_Control.V_Constructor_de_clase;

import java.util.Scanner;

public class Constructores {
    
    /*
    26 - Constructor de la clase

        Se desea guardar los sueldos de 5 operarios en un vector. 
        Realizar la creación y carga del vector en el constructor.
    
    */

    private Scanner SCANNER = new Scanner(System.in);
    private int[] sueldos;
	
    public Constructores(){

        sueldos=new int[5];
        for(int f=0;f<5;f++) {
            System.out.print("Ingrese valor de la componente:");
            sueldos[f]=SCANNER.nextInt();
        }	
    }
	
    public void imprimir() {
        for(int f=0;f<5;f++) {
            System.out.println(sueldos[f]);
        }
    }

    public static void main(String[] ar) {
    
        Constructores constructores = new Constructores();
        constructores.imprimir();
        
    }
}
