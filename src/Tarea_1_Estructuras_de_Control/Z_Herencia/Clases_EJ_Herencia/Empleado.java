package Tarea_1_Estructuras_de_Control.Z_Herencia.Clases_EJ_Herencia;

import java.util.Scanner;

public class Empleado extends EJ1_Persona{
    
    protected Scanner SCANNER= new Scanner(System.in);
    protected int sueldo;

    public void cargarSueldo() {
        System.out.print("Ingrese su sueldo:");
        sueldo=SCANNER.nextInt();
    }
    
    public void imprimirSueldo() {
        System.out.println("El sueldo es:"+sueldo);
    }


    
}
