package Tarea_1_Estructuras_de_Control.K_Declaración_métodos;

import java.util.Scanner;

public class P1_TablaMutiplicar {
    
//declaracion de metodos

/*
    Confeccionar una clase que permita ingresar valores enteros por teclado y 
    nos muestre la tabla de multiplicar de dicho valor. Finalizar el programa al ingresar el -1.

*/
    
    private Scanner SCANNER = new Scanner(System.in);

    public void cargarValor() {

        int valor_n;
        do {
            System.out.print("Ingrese valor:");
            valor_n = SCANNER.nextInt();
            
            if (valor_n !=-1) {

                calcularTabla(valor_n);
            }

        } while (valor_n!=-1);
    }


    public void calcularTabla(int v) {
        int contador =0;
        System.out.print("\nLa tabla de Multiplicar del "+v+" es:\n");
        for(int i=v; i<=v*10; i+=v) {

            contador++;
            System.out.println(v+"x"+contador+"="+i);
        }
    }


    public static void main(String[] ar) {
    	
        P1_TablaMutiplicar p1_TablaMutiplicar = new P1_TablaMutiplicar();
        p1_TablaMutiplicar.cargarValor();
        
    }


}
