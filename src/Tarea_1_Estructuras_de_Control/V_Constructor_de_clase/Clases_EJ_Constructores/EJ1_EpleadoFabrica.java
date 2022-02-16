package Tarea_1_Estructuras_de_Control.V_Constructor_de_clase.Clases_EJ_Constructores;

import java.util.Scanner;

public class EJ1_EpleadoFabrica {
    /*
    
        Confeccionar una clase que represente un empleado. 
        Definir como atributos su nombre y su sueldo. En el constructor cargar los atributos 
        y luego en otro método imprimir sus datos y 
        por último uno que imprima un mensaje si debe pagar impuestos (si el sueldo supera a 3000)

    */
    private Scanner SCANNER = new Scanner(System.in);
    private String nombre_Empl;
    private float sueldo_Eml;
    
    public EJ1_EpleadoFabrica() {
   
        System.out.print("Ingrese el nombre del empleado:");
        nombre_Empl=SCANNER.next();

        System.out.print("Ingrese su sueldo:");
        sueldo_Eml=SCANNER.nextFloat();
    }
    
    public void pagaImpuestos() {
        if (sueldo_Eml>3000) {
            System.out.print(nombre_Empl+" Debe abonar impuestos");
        } else {
            System.out.print(nombre_Empl+" No paga impuestos");
        }
    }


    public static void main(String[] ar) {
    
        EJ1_EpleadoFabrica ej1_EpleadoFabrica = new EJ1_EpleadoFabrica();
        ej1_EpleadoFabrica.pagaImpuestos();
        
    }
}
