package Tarea_1_Estructuras_de_Control.J_Declaració_clase_definición_objetos.Clases_EJ;

import java.util.Scanner;

public class EJ_Operaciones {

    /*
        Implementar la clase operaciones. 
        Se deben cargar dos valores enteros, calcular su suma, resta, 
        multiplicación y división, cada una en un método, imprimir dichos resultados.
    
    */

    private Scanner SCANNER = new Scanner(System.in);

    private int valor_n1;
    private int valor_n2;

    public void inicializar_ClassOperaciones() {
        
        System.out.print("Ingrese primer valor:");
        valor_n1 = SCANNER.nextInt();
        System.out.print("Ingrese segundo valor:");
        valor_n2 = SCANNER.nextInt();
    }


    public void sumar() {

        int suma_ = valor_n1 + valor_n2;
        System.out.println("La suma es:"+suma_);
    }

    public void restar() {

        int resta = valor_n1 - valor_n2;
        System.out.println("La resta es:"+resta);
    }

    public void multiplicar() {

        int multiplicacion=valor_n1 * valor_n2;
        System.out.println("La multiplicación es:"+multiplicacion);
    }

    public void dividir() {

        int division = valor_n1 / valor_n2;
        System.out.println("La división es:"+division);
    }



    public static void main(String[] ar) {
    	
        EJ_Operaciones ej_Operaciones = new EJ_Operaciones();
        ej_Operaciones.inicializar_ClassOperaciones();
        ej_Operaciones.sumar();
        ej_Operaciones.restar();
        ej_Operaciones.multiplicar();
        ej_Operaciones.dividir();
        
    }
}
