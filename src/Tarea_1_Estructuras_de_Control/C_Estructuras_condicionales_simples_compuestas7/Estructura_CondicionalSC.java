package Tarea_1_Estructuras_de_Control.C_Estructuras_condicionales_simples_compuestas7;

import java.util.Scanner;

public class Estructura_CondicionalSC {
    
    private static final Scanner SCANNER = new Scanner(System.in);
    
    private int num_1;
    private int num_2;

    
    // 7 - Estructuras condicionales simples y compuestas

    //Ingresar el sueldo de una persona, si supera los 3000 
    //pesos mostrar un mensaje en pantalla indicando que debe abonar impuestos.

    //estructura Simple
    public void Condicionales_SC1() {

        float sueldo;

        // ingreso por consola
        System.out.print("\nIngrese el sueldo de la persona: ");
        sueldo = SCANNER.nextFloat();

        //condicion
        if (sueldo > 3000) {
    	    System.out.println("Esta persona debe abonar impuestos");
    	}
    }

    //Realizar un programa que solicite 
    //ingresar dos números distintos y muestre por pantalla el mayor de ellos.

    //estructura compuesta
    public void Condicionales_SC2() {

        int num_1;
        int num_2;

        // ingreso por consola
        System.out.print("\nIngrese un numero ");
        num_1 = SCANNER.nextInt();

        System.out.print("\nIngrese un segundo numero ");
        num_2 = SCANNER.nextInt();    
        
        //condicion
        if (num_1 > num_2) {
    		System.out.println("De los numero ingresados el mayor es: "+num_1);
    	} else {
    		System.out.println("De los numero ingresados el mayor es: "+num_2);
    	}
        
    }





    //Ejercicios Propuestos

    // Realizar un programa que lea por teclado dos números, si el primero es mayor
    // al segundo informar su suma y diferencia, en caso contrario informar el producto y la
    // división del primero respecto al segundo.

    public void Ejercico_P1() {

        // ingreso por consola
        System.out.print("\nIngrese su primer valor: ");
        num_1 = SCANNER.nextInt();

        System.out.print("\nIngrese su segundo valor: ");
        num_2 = SCANNER.nextInt();

        // condicion
        if (num_1 > num_2) {
            int suma = num_1 + num_2;
            int resta = num_1 - num_2;
            System.out.println("La suma y la diferencia de los valores ingresados son los siguiente: " + "\nSuma: "
                    + suma + "\nDiferencia: " + resta);
        } else {
            int producto = num_1 * num_2;
            float div = num_1 / num_2;
            System.out.println("El producto y la division de los valores ingresados son los siguiente: "
                    + "\nProducto: " + producto + "\nDivision: " + div);

        }

    }


    //Se ingresan tres notas de un alumno, si el promedio es mayor o 
    //igual a siete mostrar un mensaje "Promocionado".

    public void Ejercicio_P2(){

        int nota_1;
        int nota_2;
        int nota_3;

        // ingreso por consola
        System.out.print("\nIngrese su primera calificacion: ");
        nota_1 = SCANNER.nextInt();

        System.out.print("\nIngrese su segunda calificacion: ");
        nota_2 = SCANNER.nextInt();

        System.out.print("\nIngrese su tercera calificacion: ");
        nota_3 = SCANNER.nextInt();

        int promedio = (nota_1 + nota_2 + nota_3 )/3;

        if(promedio >= 7){
            System.out.print("\nPromocionado");
        }

    }

    //Se ingresa por teclado un número positivo de uno o dos dígitos (1..99) 
    //mostrar un mensaje indicando si el número tiene uno o dos dígitos.
    //(Tener en cuenta que condición debe cumplirse para tener dos dígitos, un número entero)

    public void Ejercicio_P3(){

        int num;

        // ingreso por consola
        System.out.print("\nIngrese un numero positivo de 1 o 2 digitos ");
        num = SCANNER.nextInt();

        if(num <10){
            System.out.print("\nEl numero ingresado Tiene un dígito ");
        }else{
            System.out.print("\nEl numero ingresado Tiene dos dígitos ");
        }

    }

    public static void main(String[] ar) {
        
        Estructura_CondicionalSC condicionalSC = new Estructura_CondicionalSC();
        condicionalSC.Condicionales_SC1();
        condicionalSC.Condicionales_SC2();

        //ejrcicos propuesto
        condicionalSC.Ejercico_P1();
        condicionalSC.Ejercicio_P2();
        condicionalSC.Ejercicio_P3();


        

        
    }
}
