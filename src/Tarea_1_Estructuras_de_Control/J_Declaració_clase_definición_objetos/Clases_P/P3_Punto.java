package Tarea_1_Estructuras_de_Control.J_Declaració_clase_definición_objetos.Clases_P;

import java.util.Scanner;

public class P3_Punto {
    

    /*
        Desarrollar una clase que represente un punto en el plano y 
        tenga los siguientes métodos: cargar los valores de x e y, 
        imprimir en que cuadrante se encuentra dicho punto 
        (concepto matemático, primer cuadrante si x e y son positivas, 
        si x<0 e y>0 segundo cuadrante, etc.)
    
    */

    private Scanner SCANNER = new Scanner(System.in);

    private int coordenada_X;
    private int coordenada_Y;



    public void inicializar() {

        System.out.print("Ingrese coordenada x :");
        coordenada_X = SCANNER.nextInt();
        System.out.print("Ingrese coordenada y :");
        coordenada_Y = SCANNER.nextInt();
    }

    void imprimirCuadrante() {
        if (coordenada_X >0 && coordenada_Y >0) {
            System.out.print("Se encuentra en el primer cuadrante.");

        } else if (coordenada_X <0 && coordenada_Y >0) {
            System.out.print("Se encuentra en el segundo cuadrante.");

        } else if (coordenada_X <0 && coordenada_Y <0) {
            System.out.print("Se encuentra en el tercer cuadrante.");

        } else if (coordenada_X >0 && coordenada_Y <0) {
            System.out.print("Se encuentra en el cuarto cuadrante.");

        } else {
            System.out.print("El punto no está en un cuadrante.");
            
        }
    }


    public static void main(String[] ar) {
    	
        P3_Punto p3_Punto = new P3_Punto();
        p3_Punto.inicializar();
        p3_Punto.imprimirCuadrante();
        
    }
    
}
