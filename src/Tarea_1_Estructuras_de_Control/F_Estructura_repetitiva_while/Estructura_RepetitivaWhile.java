package Tarea_1_Estructuras_de_Control.F_Estructura_repetitiva_while;

import java.util.Scanner;

public class Estructura_RepetitivaWhile {

    private static final Scanner SCANNER = new Scanner(System.in);
    /*
     * 10 - Estructura repetitiva while
     * 
     * Realizar un programa que imprima en pantalla los números del 1 al 100.
     * 
     */

    public void Estructura_RepetitivaWhile_1() {
        int n_numero = 1;

        while (n_numero <= 100) {
            System.out.print("\n:" + n_numero);
            n_numero++;
        }

    }

    /*
     * Escribir un programa que solicite la carga de un valor positivo y nos muestre
     * desde 1 hasta el valor ingresado de uno en uno.
     * Ejemplo: Si ingresamos 30 se debe mostrar en pantalla los números del 1 al
     * 30.
     * 
     */

    public void Estructura_RepetitivaWhile_2() {
        int contador = 1;
        // ingreso por consola
        System.out.print("\nIngrese cualquier valor numerico positivo: ");
        int n_valor = SCANNER.nextInt();

        while (contador <= n_valor) {
            System.out.print("\n:" + contador);
            contador++;
        }

    }

    /*
     * Desarrollar un programa que permita la carga de 10 valores por teclado y
     * nos muestre posteriormente la suma de los valores ingresados y su promedio.
     * 
     */

    public void Estructura_RepetitivaWhile_3() {

        int n_valor;
        int contador = 1;
        int suma_ = 0;

        while (contador <= 10) {
            // ingreso por consola
            System.out.print("\nIngrese el " + contador + " valor numerico positivo: ");
            n_valor = SCANNER.nextInt();

            suma_ += n_valor;
            contador++;

        }

        int promedio_ = suma_ / 10;

        System.out.print("\nLa suma de los valores ingresados es: " + suma_);
        System.out.print("\nEl promedio de los valores ingresados es: " + promedio_);
    }

    /*
     * Una planta que fabrica perfiles de hierro posee un lote de n piezas.
     * Confeccionar un programa que pida ingresar por teclado la cantidad de piezas
     * a procesar y
     * luego ingrese la longitud de cada perfil; sabiendo que la pieza cuya longitud
     * esté comprendida
     * en el rango de 1,20 y 1,30 son aptas. Imprimir por pantalla la cantidad de
     * piezas aptas que hay
     * en el lote.
     * 
     */

    public void Estructura_RepetitivaWhile_4() {

        
        int contador = 1;
        int cantidad_Piezas = 0;
        float longitud;

        System.out.print("\nCuantas piezas procesará: ");
        int n_Piezas = SCANNER.nextInt();

        while (contador <= n_Piezas) {
            // ingreso por consola
            System.out.print("\nIngrese la longitud de la " + contador + " pieza: ");
            longitud = SCANNER.nextFloat();

            if (longitud >= 1.20 && longitud <= 1.30) {
                cantidad_Piezas += 1;
            }
            contador++;
        }

        System.out.print("\nLa cantidad de piezas aptas son: " + cantidad_Piezas);
    }



    //Problemas Propuestos

    /*
        -Escribir un programa que solicite ingresar 10 notas de alumnos y nos informe 
         cuántos tienen notas mayores o iguales a 7 y cuántos menores.
    
    */

    public void Ejercicio_P1(){
        int nota;
        int contador =1;
        int n_mayores =0;
        int n_menores =0;

        while (contador <=10) {
            System.out.print("Ingrese la "+contador+" nota:");
            nota = SCANNER.nextInt();

            if (nota >= 7) {
                n_mayores += 1;
            
            }else {
                n_menores += 1;
            }
            contador++;
        }
        System.out.print("\nCantidad de alumnos con notas mayores o iguales a 7: "+n_mayores);
        System.out.print("\nCantidad de alumons con notas menores a 7: "+n_menores);
    
    }


    /*
        -Se ingresan un conjunto de n alturas de personas por teclado. 
         Mostrar la altura promedio de las personas.
    
    */

    public void Ejercicio_P2(){

        int contador = 1;
        float n_altura;
        float suma_ = 0;
        

        System.out.print("\n ingrese el numero personas hay: ");
        int n_personas = SCANNER.nextInt();

        while(contador <= n_personas){

            System.out.print("\n ingrese la altura de la "+contador+" persona: ");
            n_altura = SCANNER.nextFloat();
            suma_ += n_altura;

            contador++;
        }
        float promedio_ = suma_/n_personas;
        System.out.print("\nAltura promedio es: "+promedio_);
    }

    /*
        -En una empresa trabajan n empleados cuyos sueldos oscilan entre $100 y $500,
         realizar un programa que lea los sueldos que cobra cada empleado e informe
         cuántos empleados cobran entre $100 y $300 y cuántos cobran más de $300.
         Además el programa deberá informar el importe que gasta la empresa en sueldos
         al personal.
    
    */
    
    public void Ejercicio_P3(int n_empleados){
        int contador_Smenor = 0;
        int contador_Smayor = 0;
        int contador_Sbajo = 0;
        float gastos = 0;
        float sueldo = 0;
        int ciclo = 1;

        while (ciclo <= n_empleados) {

            // ingreso por consola
            System.out.print("Ingrese el sueldo del " + ciclo + " Empleado:");
            sueldo = SCANNER.nextFloat();
            if (sueldo >= 100 && sueldo <= 300) {
                contador_Smenor++;

            } else if (sueldo > 300) {
                contador_Smayor++;

            } else {
                contador_Sbajo = +contador_Sbajo;
            }

            gastos = gastos + sueldo;
            ciclo++;

        }

        System.out.print("Cantidad de empleados con sueldos entre 100 y 300: " + contador_Smenor);
        System.out.print("\nCantidad de empleados con sueldos mayores a 300: " + contador_Smayor);
        System.out.print("\nGastos total de la empresa en sueldos: " + gastos);
        
    }

    /*
        -Realizar un programa que imprima 25 términos de la serie 11 - 22 - 33 - 44, etc. 
         (No se ingresan valores por teclado)
    
    */

    public void Ejercicio_P4(){
        int contador = 1;
        int serie_Term = 11;

        while(contador <=25){

            System.out.print("\n"+serie_Term);
            serie_Term += 11;
            contador++;
        }
        
    }


    public static void main(String[] ar) {
    	
        Estructura_RepetitivaWhile estructura_RepetitivaWhile = new Estructura_RepetitivaWhile();
        estructura_RepetitivaWhile.Estructura_RepetitivaWhile_1();
        estructura_RepetitivaWhile.Estructura_RepetitivaWhile_2();
        estructura_RepetitivaWhile.Estructura_RepetitivaWhile_3();
        estructura_RepetitivaWhile.Estructura_RepetitivaWhile_4();


        //ejercicios
        estructura_RepetitivaWhile.Ejercicio_P1();
        estructura_RepetitivaWhile.Ejercicio_P2();
        estructura_RepetitivaWhile.Ejercicio_P3(3);
        estructura_RepetitivaWhile.Ejercicio_P4();
    }






}
