package Tarea_1_Estructuras_de_Control.U_Matrices_irregulares.Clases_EJ_MatricesIrregulares;

import java.util.Scanner;

public class EJ_Matrices_Irregulares_2 {
    
    /*
        Confeccionar una clase para administrar los días que han faltado los 3 empleados de una empresa.
        Definir un vector de 3 elementos de tipo String para cargar los nombres y una matriz irregular para
        cargar los días que han faltado cada empleado (cargar el número de día que faltó)
        Cada fila de la matriz representan los días de cada empleado.
        Mostrar los empleados con la cantidad de inasistencias.
        Cuál empleado faltó menos días.
    
    
    */

    private Scanner SCANNER = new Scanner(System.in);
    private String[] nombres;
    private int[][] dias;
    
    public void cargar() {

        nombres=new String[3];
        dias=new int[3][];
        for(int f=0;f<nombres.length;f++) {
            System.out.print("Ingrese el nombre del empleado:");
            nombres[f]=SCANNER.next();
            System.out.print("Cuantas días faltó el empleado:");
            int faltas=SCANNER.nextInt();
            dias[f]=new int[faltas];            
            for(int c=0;c<dias[f].length;c++) {
                System.out.print("Ingrese nro de día:");
                dias[f][c]=SCANNER.nextInt();
            }
        }
    }
    
    public void inasistencias() {
        for(int f=0;f<nombres.length;f++) {
            System.out.println(nombres[f] + " faltó " + dias[f].length + " días");
        }
    }
    
    public void empleadoMenosFaltas() {
        int faltas=dias[0].length;
        String nom=nombres[0];
        for(int f=1;f<dias.length;f++) {
            if (dias[f].length<faltas) {
                faltas=dias[f].length;
                nom=nombres[f];
            }
        }
        System.out.println("El empleado que faltó menos es "+nom+" con "+faltas+" faltas.");
    }

    public static void main(String[] ar) {
    
        EJ_Matrices_Irregulares_2 ej_Matrices_Irregulares_2 = new EJ_Matrices_Irregulares_2();
        ej_Matrices_Irregulares_2.inasistencias();
        ej_Matrices_Irregulares_2.empleadoMenosFaltas();
        
    }
}
