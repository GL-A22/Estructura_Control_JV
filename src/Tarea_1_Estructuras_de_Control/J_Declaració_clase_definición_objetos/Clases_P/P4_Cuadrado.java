package Tarea_1_Estructuras_de_Control.J_Declaració_clase_definición_objetos.Clases_P;

import java.util.Scanner;

public class P4_Cuadrado {

    /*
    
    
    */

    private Scanner SCANNER = new Scanner(System.in);
    
    private int lado_C;


    public void inicializar() {

        System.out.print("\nIngrese valor del lado :");
        lado_C = SCANNER.nextInt();
    }
    

    public void imprimirPerimetro() {

        int perimetro = lado_C * 4;
        System.out.println("El perímetro es:"+perimetro);
    }


    public void imprimirSuperficie() {
        
        int superficie = lado_C * lado_C;
        System.out.println("La superficie es:"+superficie);
    }


    public static void main(String[] ar) {
    	
     P4_Cuadrado p4_Cuadrado = new P4_Cuadrado();
     p4_Cuadrado.inicializar();
     p4_Cuadrado.imprimirPerimetro();
     p4_Cuadrado.imprimirSuperficie();
        
    }


    
}
