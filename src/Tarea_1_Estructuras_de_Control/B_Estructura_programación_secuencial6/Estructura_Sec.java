package Tarea_1_Estructuras_de_Control.B_Estructura_programación_secuencial6;

import java.util.Scanner;

public class Estructura_Sec {

    private static final Scanner SCANNER = new Scanner(System.in);
    private int num_1 = 0;
    private int num_2 = 0;
    private int suma;
    private int producto;

    // Estructura de programación secuencial
    // Realizar la carga de dos números enteros por teclado e imprimir su suma y su
    // producto

    public void Operacion() {

        Scanner teclado = SCANNER;

        // ingreso por consola
        System.out.print("Ingrese su primer valor: ");
        num_1 = teclado.nextInt();

        System.out.print("Ingrese su segundo valor: ");
        num_2 = teclado.nextInt();

        // operacion
        suma = num_1 + num_2;
        producto = num_1 * num_2;

        // resulatdo por consola
        System.out.println("La suma y el producto de los valores ingresados son los siguiente: " + "\nSuma: " + suma
                + "\nProducto: " + producto);
    }

    // Ejercicios Propuestos
    // Realizar la carga del lado de un cuadrado, mostrar por pantalla el perímetro
    // del mismo
    // (El perímetro de un cuadrado se calcula multiplicando el valor del lado por
    // cuatro)

    public void Ejercicio_P1() {

        Scanner entrada = SCANNER;
        int lado;
        int perimetro;

        // ingreso por consola
        System.out.print("Ingrese el lado del cuadrado: ");
        lado = entrada.nextInt();

        perimetro = lado * 4;

        // salida de datos por consola;
        System.out.print("\nEl perimetro del cuadrado es: " + perimetro);

    }

    // Escribir un programa en el cual se ingresen cuatro números, calcular
    // e informar la suma de los dos primeros y el producto del tercero y el cuarto.

    public void Ejercicio_P2() {

        Scanner entrada = SCANNER;
        int num_1;
        int num_2;
        int num_3;
        int num_4;
        int suma;
        int producto;

        // ingreso por consola
        System.out.print("Ingrese el primer valor: ");
        num_1 = entrada.nextInt();

        System.out.print("/nIngrese el segundo valor: ");
        num_2 = entrada.nextInt();

        System.out.print("Ingrese el tercer valor: ");
        num_3 = entrada.nextInt();

        System.out.print("Ingrese el cuarto valor: ");
        num_4 = entrada.nextInt();

        suma = num_1 + num_2;
        producto = num_3 * num_4;

        // Salida de datos por consola
        System.out.println("La suma de los dos primero valores " + num_1 + " + " + num_2 + " es: " + suma);
        System.out.println("El producto del tercer y cuarto valores " + num_3 + " + " + num_4 + " es: " + producto);

    }

    // Realizar un programa que lea cuatro valores numéricos e informar su suma y
    // promedio

    public void Ejercicio_P3() {

        Scanner entrada = SCANNER;
        int num_1;
        int num_2;
        int num_3;
        int num_4;
        int suma;
        int promedio;

        // ingreso por consola
        System.out.print("Ingrese el primer valor: ");
        num_1 = entrada.nextInt();

        System.out.print("/nIngrese el segundo valor: ");
        num_2 = entrada.nextInt();

        System.out.print("Ingrese el tercer valor: ");
        num_3 = entrada.nextInt();

        System.out.print("Ingrese el cuarto valor: ");
        num_4 = entrada.nextInt();

        // procedimiento
        suma = num_1 + num_2 + num_3 + num_4;
        promedio = suma / 4;

        // Salida de datos por consola
        System.out.println("La suma de los valores ingresados es: " + suma);
        System.out.println("El promedio de la suma de los valores es: " + promedio);

    }

    // Se debe desarrollar un programa que pida el ingreso del precio de un artículo
    // y la cantidad que lleva el cliente. Mostrar lo que debe abonar el comprador.

    public void Ejercicio_P4() {

        Scanner entrada = SCANNER;
        float precio_Art;
        float valor_Pagar;
        int   cantida_Art;

        // ingreso por consola
        System.out.print("Ingrese el precio del Articulo a comprar: ");
        precio_Art= entrada.nextFloat();

        System.out.print("Ingrese la cantidad del Articulo a comprar: ");
        cantida_Art= entrada.nextInt();

        //procedimiento
        valor_Pagar = precio_Art * cantida_Art;

        // Salida de datos por consola
        System.out.println("El valor total a pagar del articulo es: " + valor_Pagar);

    }

    public static void main(String[] ar) {
        
        Estructura_Sec estrucSecuencial = new Estructura_Sec();
        estrucSecuencial.Operacion();
        estrucSecuencial.Ejercicio_P1();
        estrucSecuencial.Ejercicio_P2();
        estrucSecuencial.Ejercicio_P3();
        estrucSecuencial.Ejercicio_P4();

        
    }

}
