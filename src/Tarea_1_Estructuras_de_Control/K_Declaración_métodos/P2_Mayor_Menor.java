package Tarea_1_Estructuras_de_Control.K_Declaración_métodos;

import java.util.Scanner;

public class P2_Mayor_Menor {

    //Declaracion de Metodos

    /*
        Confeccionar una clase que permita ingresar tres valores por teclado. 
        Luego mostrar el mayor y el menor.

    */

    private Scanner SCANNER = new Scanner(System.in);
    
    public void cargarValores() {
    	
        System.out.print("Ingrese primer valor:");
        int valor_1 = SCANNER.nextInt();

        System.out.print("Ingrese segundo valor:");
        int valor_2=SCANNER.nextInt();

        System.out.print("Ingrese tercer valor:");
        int valor_3=SCANNER.nextInt();

       
        int mayor = calcularMayor (valor_1,valor_2,valor_3);
        int menor = calcularMenor (valor_1,valor_2,valor_3);
        
        System.out.println("El valor mayor de los tres es:"+mayor);
        System.out.println("El valor menor de los tres es:"+menor);
    }


    public int calcularMayor(int v1,int v2,int v3) {
        int mayor_;

        if(v1>v2 && v1>v3) {
          mayor_=v1;

        } else if(v2>v3) {
            mayor_=v2;

        } else {
            mayor_=v3;
        }
        return mayor_;
    }

    public int calcularMenor(int v1,int v2,int v3) {
        int menor_;

        if(v1<v2 && v1<v3) {
          menor_ =v1;

        } else if(v2<v3) {
            menor_ =v2;

        } else{
            menor_ =v3;   
        }
        return menor_;
    }

    public static void main(String[] ar) {
    	
        P2_Mayor_Menor p2_Mayor_Menor = new P2_Mayor_Menor();
        p2_Mayor_Menor.cargarValores();
        
    }

}
