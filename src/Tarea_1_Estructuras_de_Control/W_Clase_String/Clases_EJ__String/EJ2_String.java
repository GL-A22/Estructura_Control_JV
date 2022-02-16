package Tarea_1_Estructuras_de_Control.W_Clase_String.Clases_EJ__String;

import java.util.Scanner;

public class EJ2_String {
    /*
        Desarrollar un programa que solicite la carga de una clave. 
        La clase debe tener dos métodos uno para la carga y 
        otro que muestre si la clave es la correcta (la clave a comparar es "123abc")
    
    */

    private Scanner SCANNER = new Scanner(System.in);
    private String clave_;
    
    public EJ2_String() {

        System.out.print("Ingrese clave:");
        clave_=SCANNER.nextLine();
    }
    
    public void verificarClave() {
        if (clave_.equals("123abc")==true) {
            System.out.println("Se ingresó la clave en forma correcta");
        } else {
            System.out.println("No se ingresó la clave en forma correcta");        	
        }       
    }

    public static void main(String[] ar) {
    
        EJ2_String ej_Ej2_String = new EJ2_String();
        ej_Ej2_String.verificarClave();
        
    }
}
