package Tarea_1_Estructuras_de_Control.L_Estructura_datos_vector;

import java.util.Scanner;

public class Estructura_vectorP2 {

    /*
        Definir un vector de 5 componentes de tipo float que representen las alturas de 5 personas.
        Obtener el promedio de las mismas. Contar cuántas personas son más altas que el promedio y
         cuántas más bajas.
    
    */

    private Scanner SCANNER = new Scanner(System.in);
    private float[] alturas_;
    private float promedio_;

    public void cargarDatosP2() {

        alturas_ =new float[5];

        for(int i=0; i<5; i++) {

            System.out.print("\nIngrese la altura "+(i+1)+" de la persona:");
            alturas_[i]= SCANNER.nextFloat();
        }


        calcularPromedio();
    }

    public void calcularPromedio() {
        float suma =0;
        for(int f=0;f<5;f++) {
            suma += alturas_[f];
        }
        promedio_ = suma/5;
        System.out.println("Promedio de alturas:"+promedio_);
    }

    public void mayoresMenores() {
        
        int mayor_ =0;
        int menor_ =0;
        
        for(int i=0; i<5; i++) {
            if (alturas_[i] > promedio_) {
	        mayor_++;

            } else if (alturas_[i] < promedio_){
                 
            menor_++;
                
        }
    }
    System.out.println("Cantidad de personas mayores al promedio: "+mayor_);
    System.out.println("Cantidad de personas menores al promedio: "+menor_);
}

    public static void main(String[] ar) {
            
        Estructura_vectorP2 estructura_vectorP2 = new Estructura_vectorP2();
        estructura_vectorP2.cargarDatosP2();
        
    }
    
}
