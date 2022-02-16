package Tarea_1_Estructuras_de_Control.Z_Herencia.Clases_EJ_Herencia;

import java.util.Scanner;

public class EJ1_Persona {
    /*
    
        Confeccionar una clase Persona que tenga como atributos el nombre y la edad.
         Definir como responsabilidades un método que cargue los datos personales y otro que los imprima.
        Plantear una segunda clase Empleado que herede de la clase Persona. 
        Añadir un atributo sueldo y los métodos de cargar el sueldo e imprimir su sueldo.
        Definir un objeto de la clase Persona y llamar a sus métodos. 
        También crear un objeto de la clase Empleado y llamar a sus métodos.
    
    */

    protected Scanner SCANNER;
    protected String nombre_P;
    protected int edad_;
    
    public EJ1_Persona() {
        SCANNER=new Scanner(System.in);
    }
    
    public void cargarDatosPersonales() {

        System.out.print("Ingrese el nombre:");
        nombre_P=SCANNER.next();

        System.out.print("Ingrese edad:");
        edad_=SCANNER.nextInt();
    }
    
    public void imprimirDatosPersonales() {
        System.out.println("Nombre:"+nombre_P);
        System.out.println("Edad:"+edad_);
    }



    public static void main(String[] ar) {
    
        EJ1_Persona persona1 = new EJ1_Persona();
        persona1.cargarDatosPersonales();

        Empleado empleado1 =new Empleado();
        empleado1.cargarDatosPersonales();
        empleado1.cargarSueldo();
        persona1.imprimirDatosPersonales();        
        empleado1.imprimirDatosPersonales();
        empleado1.imprimirSueldo();

        
    }
}

