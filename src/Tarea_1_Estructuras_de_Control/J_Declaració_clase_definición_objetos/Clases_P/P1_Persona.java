package Tarea_1_Estructuras_de_Control.J_Declaració_clase_definición_objetos.Clases_P;

import java.util.Scanner;

public class P1_Persona {

    /*
    
        Confeccionar una clase que permita carga el nombre y la edad de una persona. 
        Mostrar los datos cargados. Imprimir un mensaje si es mayor de edad (edad>=18)
    
    */

    private Scanner SCANNER = new Scanner(System.in);
    private String nombre_;
    private int edad_;
    

    public void inicializar() {

        System.out.print("Ingrese nombre:");
        nombre_ = SCANNER.next();
        System.out.print("\nIngrese edad:");
        edad_ = SCANNER.nextInt();
    }

    public void imprimir() {

        System.out.println("Nombre: "+nombre_);
        System.out.println("Edad: "+edad_);
    }

    public void esMayorEdad() {
        if (edad_ >=18) {
            System.out.print(nombre_+" es mayor de edad.");
        
        } else {
            System.out.print(nombre_+" no es mayor de edad.");
        }
    }

    public static void main(String[] ar) {
    	
     P1_Persona p1_Persona = new P1_Persona();
     p1_Persona.inicializar();
     p1_Persona.imprimir();
     p1_Persona.esMayorEdad(); 
        
    }    
    
}
