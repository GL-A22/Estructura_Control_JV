package Tarea_1_Estructuras_de_Control.Q_Vectores_paralelos_ordenamiento.Clases_EJ_VectOrd_Paralelo;

import java.util.Scanner;

public class EJ_Vectores_Ord_paralelos1 {
    
    /*
        Cargar en un vector los nombres de 5 paises y en otro vector paralelo la cantidad de habitantes del mismo.
        Ordenar alfabéticamente e imprimir los resultados. 
        Por último ordenar con respecto a la cantidad de habitantes (de mayor a menor) e imprimir nuevamente.
    
     */

    private Scanner SCANNER = new Scanner(System.in);
    private String[] vec_paises;
    private int[] vec_habitantes;
    
    public void cargarDatosEj1() {
 
        vec_paises=new String[5];
        vec_habitantes=new int[5];

        System.out.println("Carga de paises y habitantes");

        for(int i=0; i<vec_paises.length; i++) {
            System.out.print("\nIngese el nombre del "+(i+1)+" pais:");
            vec_paises[i] = SCANNER.next();

            System.out.print("\nIngrese la cantidad de habitantes:");
            vec_habitantes[i] = SCANNER.nextInt();
        }

        System.out.print("\n¿Como desea oredenar los datos?...\n");
        System.out.print("por Nombres presione 1... por numero de habitantes presione 2");
        int opcion = SCANNER.nextInt();

        System.out.print("\nDatos siendo Ordenados...\n");
    
        if(opcion == 1){
            ordenarPorNombres();
            System.out.print("\n...");
            System.out.print("\nDatos Ordenados...\n");
            
            imprimir();
            
        }else{
            ordenarPorHabitantes();
            System.out.print("\n...");
            System.out.print("\nDatos Ordenados...\n");
            
            imprimir();
        }
        
    }        
    
    public void ordenarPorNombres() {
        for(int i=0; i<vec_paises.length; i++) {
            for(int j=0; j<vec_paises.length-1-i; j++) {

                if (vec_paises[j].compareTo(vec_paises[j+1])>0) {
                    String aux_pais = vec_paises[j];

                    vec_paises[j] = vec_paises[j+1];
                    vec_paises[j+1] = aux_pais;
                   
                    int aux_habitante = vec_habitantes[j];
                    vec_habitantes[j] = vec_habitantes[j+1];
                    vec_habitantes[j+1] = aux_habitante;
                }
            }
        }
    }
        
    public void ordenarPorHabitantes() {
        for(int i=0; i<vec_paises.length; i++) {
            for(int j=0; j<vec_paises.length-1-i; j++) {

                if (vec_habitantes[j] < vec_habitantes[j+1]) {
                    String aux_pais = vec_paises[j];
                    vec_paises[j] = vec_paises[j+1];
                    vec_paises[j+1] = aux_pais;
                    
                    int aux_habitante = vec_habitantes[j];
                    vec_habitantes[j] = vec_habitantes[j+1];
                    vec_habitantes[j+1] = aux_habitante;
                }
            }
        }
    }
    
    public void imprimir() {
        for(int i=0; i<vec_paises.length; i++) {
            System.out.println(vec_paises[i] + " - " + vec_habitantes[i]);
        }
    }

    public static void main(String[] ar) {
    	
        EJ_Vectores_Ord_paralelos1 ej_Vectores_Ord_paralelos1 = new EJ_Vectores_Ord_paralelos1();
        ej_Vectores_Ord_paralelos1.cargarDatosEj1();
        
    }

}
