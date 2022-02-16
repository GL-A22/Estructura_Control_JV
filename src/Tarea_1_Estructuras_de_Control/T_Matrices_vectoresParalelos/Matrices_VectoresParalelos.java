package Tarea_1_Estructuras_de_Control.T_Matrices_vectoresParalelos;

import java.util.Scanner;

public class Matrices_VectoresParalelos {
    
    /*
    Se tiene la siguiente información:
·   Nombres de 4 empleados.
·   Ingresos en concepto de sueldo, cobrado por cada empleado, en los últimos 3 meses.
    Confeccionar el programa para:

            a) Realizar la carga de la información mencionada.
            b) Generar un vector que contenga el ingreso acumulado en sueldos en los últimos 3 meses para cada empleado.
            c) Mostrar por pantalla el total pagado en sueldos a todos los empleados en los últimos 3 meses
            d) Obtener el nombre del empleado que tuvo el mayor ingreso acumulado
    
    */

    private Scanner SCANNER = new Scanner(System.in);
    private String[] empleados;
    private int[][] sueldos;
    private int[] sueldostot;
    
    public void cargarDatos() {

        empleados=new String[4];
        sueldos=new int[4][3];
        for(int i=0; i<empleados.length; i++){
            System.out.print("Ingrese el nombre del empleado:");
            empleados[i]=SCANNER.next();
            for(int c=0;c<sueldos[i].length;c++) {
                System.out.print("Ingrese sueldo:");
                sueldos[i][c]= SCANNER.nextInt();
            }
        }

        

        calcularSumaSueldos();
        System.out.print("\nimprimiendo Datos...\n");
        imprimirTotalPagado();

        System.out.print("\n....");
        empleadoMayorSueldo();
    }
    
    public void calcularSumaSueldos() {
    	sueldostot=new int[4];
        for(int i=0; i<sueldos.length; i++) {
          int suma=0;
          for(int j=0; j<sueldos[i].length; j++) {
              suma += sueldos[i][j];
          }
          sueldostot[i]=suma;
        }
    }
    
    public void imprimirTotalPagado() {
    	System.out.println("Total de sueldos pagados por empleado.");
        for(int i=0; i<sueldostot.length; i++) {
            System.out.println(empleados[i]+" - "+sueldostot[i]);
        }
    }
    
    public void empleadoMayorSueldo() {
        int may=sueldostot[0];
        String nom=empleados[0];
        for(int i=0; i<sueldostot.length; i++) {
            if (sueldostot[i]>may) {
                may=sueldostot[i];
                nom=empleados[i];
            }
        }
        System.out.println("El empleado con mayor sueldo es "+ nom + " que tiene un sueldo de "+may);
    }

    public static void main(String[] ar) {
    
        Matrices_VectoresParalelos matrices_VectoresParalelos = new Matrices_VectoresParalelos();
        matrices_VectoresParalelos.cargarDatos();
        
    }
}
