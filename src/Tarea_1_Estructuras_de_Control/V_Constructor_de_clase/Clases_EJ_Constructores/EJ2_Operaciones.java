package Tarea_1_Estructuras_de_Control.V_Constructor_de_clase.Clases_EJ_Constructores;

import java.util.Scanner;

public class EJ2_Operaciones {
    
    /*
        Implementar la clase operaciones. Se deben cargar dos valores enteros en el constructor, 
        calcular su suma, resta, multiplicación y división, cada una en un método, 
        imprimir dichos resultados.
    
    */

    private Scanner SCANNER = new Scanner(System.in);
    private int valor_1;
    private int valor_2;
    
    public EJ2_Operaciones() {
   
        System.out.print("Ingrese primer valor:");
        valor_1=SCANNER.nextInt();

        System.out.print("Ingrese segundo valor:");
        valor_2=SCANNER.nextInt();
    }
    
    public void sumar() {
        int suma=valor_1 + valor_2;
        System.out.print("\nLa suma es: "+suma);
    }
    
    public void restar() {
        int resta = valor_1 - valor_2;
        System.out.print("\nLa resta es: "+resta);
    }
    
    public void multiplicar() {
        int multiplicacion = valor_1 * valor_2;
        System.out.print("\nLa multiplicación es: "+multiplicacion);
    }
    
    public void dividir() {
        int division = valor_1 / valor_2;
        System.out.print("\nLa división es: "+division);
    }

    public static void main(String[] ar) {
    
        EJ2_Operaciones ej2_Operaciones = new EJ2_Operaciones();
        ej2_Operaciones.sumar();
        ej2_Operaciones.restar();
        ej2_Operaciones.multiplicar();
        ej2_Operaciones.dividir();
        
    }
}
