package Tarea_1_Estructuras_de_Control.Z_Herencia;

import java.util.Scanner;

public class Herencia_P1_Operacion {
    /*

        29 - Herencia

        Supongamos que necesitamos implementar dos clases que llamaremos Suma y Resta. 
        Cada clase tiene como atributo valor1, valor2 y resultado. 
        Los métodos a definir son cargar1 (que inicializa el atributo valor1), 
        carga2 (que inicializa el atributo valor2), 
        operar (que en el caso de la clase "Suma" suma los dos atributos y 
        en el caso de la clase "Resta" hace la diferencia entre valor1 y valor2, y 
        otro método mostrarResultado.
    
    */

    protected Scanner SCANNER;
    protected int valor_1;
    protected int valor_2;
    protected int resultado;

    public Herencia_P1_Operacion() {
        SCANNER=new Scanner(System.in);
    }
    
    public void cargar1() {
        System.out.print("Ingrese el primer valor:");
        valor_1=SCANNER.nextInt();        
    }
    
    public void cargar2() {
        System.out.print("Ingrese el segundo valor:");
        valor_2=SCANNER.nextInt();
    }
    
    public void mostrarResultado() {
        System.out.println(resultado);
        
    }
    

    public static void main(String[] ar) {
    
        Suma suma1=new Suma();
        suma1.cargar1();
        suma1.cargar2();
        suma1.operar();
        System.out.print("El resultado de la suma es: ");
        suma1.mostrarResultado();

        System.out.print("\n");

        Resta resta1=new Resta();
        resta1.cargar1();
        resta1.cargar2();
        resta1.operar();
        System.out.print("\nEl resultado de la resta es:");        
        resta1.mostrarResultado();
        
    }
}






