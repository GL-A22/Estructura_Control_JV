package Tarea_1_Estructuras_de_Control.J_Declaració_clase_definición_objetos.Clases_P;

import java.util.Scanner;

public class P2_Triangulo {
    
   /*
    Desarrollar un programa que cargue los lados de un triángulo e implemente los siguientes métodos: inicializar los atributos, 
    imprimir el valor del lado mayor y otro método que muestre si es equilátero o no.

   */ 
    private Scanner SCANNER = new Scanner(System.in);

    private int lado_1;
    private int lado_2;
    private int lado_3;

    public void inicializar() {

        System.out.print("Medida lado 1:");
        lado_1 = SCANNER.nextInt();
        System.out.print("Medida lado 2:");
        lado_2 = SCANNER.nextInt();
        System.out.print("Medida lado 3:");
        lado_3 = SCANNER.nextInt();       
    }


    public void ladoMayor() {
        
    	System.out.print("Lado mayor:");
        if (lado_1 > lado_2 && lado_1 > lado_3) {
            System.out.println(lado_1);
            
        } else if(lado_2 > lado_3) {
            System.out.println(lado_2);
            
        }else{
            System.out.println(lado_3);
        }
    }


    public void esEquilatero() {

        if (lado_1==lado_2 && lado_1==lado_3) {
            System.out.print("Es un triángulo equilátero");
        } else {
            System.out.print("No es un triángulo equilátero");            
        }

    }

    public static void main(String[] ar) {
    	
        P2_Triangulo p2_Triangulo = new P2_Triangulo();
        p2_Triangulo.inicializar();
        p2_Triangulo.ladoMayor();
        p2_Triangulo.esEquilatero();
        
    }
}
