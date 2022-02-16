package Tarea_1_Estructuras_de_Control.W_Clase_String.Clases_EJ__String;

import java.util.Scanner;

public class EJ3_String {
    /*
    
        Codifique un programa que permita cargar una oración por teclado, luego mostrar cada palabra ingresada en una línea distinta.
 
                                    Por ejemplo si cargo: 
                                    La mañana está fría. 
                                    Debe aparecer: 
                                    
                                    La 
                                    mañana 
                                    está 
                                    fría. 
    
    */

    
    private Scanner SCANNER = new Scanner(System.in);
    private String oracion;
    
    public  EJ3_String() {

         System.out.print("Ingrese oración:");
         oracion=SCANNER .nextLine();
    }
    
    public void imprimir() {
        for(int i=0; i<oracion.length(); i++) {

            if (oracion.charAt(i)==' ') {
                System.out.println();
            } else {
                System.out.print(oracion.charAt(i));
            }
        }
    }


    public static void main(String[] ar) {
    
        EJ3_String ej3_String =new EJ3_String();
        ej3_String.imprimir();
        
    }
}
