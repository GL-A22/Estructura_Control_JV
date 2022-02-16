package Tarea_1_Estructuras_de_Control.J_Declaració_clase_definición_objetos.Clases_EJ;

import java.util.Scanner;

public class EJ_Empleado {

    /*
        Confeccionar una clase que represente un empleado. 
        Definir como atributos su nombre y su sueldo. 
        Confeccionar los métodos para la carga, otro para imprimir sus datos y 
        por último uno que imprima un mensaje si debe pagar impuestos (si el sueldo supera a 3000)
    
    */
    
    private Scanner SCANNER = new Scanner(System.in);
    
    private String nombre_empleado;
    private Float Sueldo_Emp;

    public void inicializar_ClassEmpelado() {

        System.out.print("Ingrese el nombre del empleado:");
        nombre_empleado = SCANNER.next();
        System.out.print("Ingrese su sueldo:");
        Sueldo_Emp = SCANNER.nextFloat();
    
    }
    

    public void pagaImpuestos() {
        if (Sueldo_Emp >3000) {

            System.out.print(nombre_empleado+" Debe abonar impuestos");

        } else {
            System.out.print(nombre_empleado+" No paga impuestos");
        }
    }

    public static void main(String[] ar) {
    	
        EJ_Empleado ej_Empleado = new EJ_Empleado();
        ej_Empleado.inicializar_ClassEmpelado();
        ej_Empleado.pagaImpuestos();  
        
    }
}
