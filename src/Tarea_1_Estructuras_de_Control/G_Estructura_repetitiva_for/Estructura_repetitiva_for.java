package Tarea_1_Estructuras_de_Control.G_Estructura_repetitiva_for;

import java.util.Scanner;

public class Estructura_repetitiva_for {
    
    private static final Scanner SCANNER = new Scanner(System.in);

    /*
        11 - Estructura repetitiva for

        Realizar un programa que imprima en pantalla los números del 1 al 100.
    
    */

    public void Estructura_repetitiva_for_1(){

        
        for(int i=1; i<=100; i++) {

            System.out.print("\n"+i);
        }

    }

    /*
        Desarrollar un programa que permita la carga de 10 valores por teclado 
        y nos muestre posteriormente la suma de los valores ingresados y su promedio. 
        Este problema ya lo desarrollamos , lo resolveremos empleando la estructura for.
    
    */

    public void Estructura_repetitiva_for_2(){

        int suma_ =0;
        int n_valor;
        

        for(int i=1; i<=10; i++) {
            System.out.print("Ingrese valor:");
            n_valor = SCANNER.nextInt();
            
            suma_ += n_valor;
        }

        int promedio_ = suma_/10;

        System.out.print("\nLa suma es:"+suma_);
        System.out.print("\nEl promedio es:"+promedio_);

    }


    /*
        Escribir un programa que lea 10 notas de alumnos y nos informe 
        cuántos tienen notas mayores o iguales a 7 y cuántos menores.

    */

    public void Estructura_repetitiva_for_3(){

        int nota_;
        int A_aprobados=0;
        int A_reprobados=0;

        for(int i=1; i<=10; i++) {
            System.out.print("\nIngrese la "+i+" nota: ");
            nota_ = SCANNER.nextInt();
            if (nota_ >=7) {
                A_aprobados +=1;
            } else {
            	A_reprobados +=1;
            }
        }
        System.out.print("\nCantidad de alumnos aprobados: "+A_aprobados);
        System.out.print("Cantidad de alumnos reprobados: "+A_reprobados); 

    }


    /*
        Escribir un programa que lea 10 números enteros y luego muestre cuántos valores ingresados 
        fueron múltiplos de 3 y cuántos de 5.
        Debemos tener en cuenta que hay números que son múltiplos de 3 y de 5 a la vez.

    */

    public void Estructura_repetitiva_for_4(){

        int n_valor;
        int mul_3 =0;
        int mul_5 =0;

        for(int i=1; i<=10; i++) {

            System.out.print("/nIngrese el "+i+" valor:");
            n_valor = SCANNER.nextInt();

            if (n_valor%3 == 0) {
                mul_3 +=1;

            } 
            
            if (n_valor%5 == 0) {
                mul_5 +=1;
            
            }
        }
        System.out.print("Cantidad de valores ingresados múltiplos de 3 es: "+mul_3);
        System.out.print("Cantidad de valores ingresados múltiplos de 5 es: "+mul_5);

    }



    //Ejercicos Propuestos

    /*
        -Confeccionar un programa que lea n pares de datos, 
         cada par de datos corresponde a la medida de la base y la altura de un triángulo. 
         El programa deberá informar:

            a) De cada triángulo la medida de su base, su altura y su superficie.
            b) La cantidad de triángulos cuya superficie es mayor a 12.      

    */

    public void Ejercicio_P1(int n_triangulos){

        int base_t;
        int altura_t;
        int contador_t = 0;
        int area;
    
        for (int i=1; i<=n_triangulos; i++){
    
            // ingreso por consola
            System.out.print("\nIngrese la base del "+i+" triangulo: ");
            base_t = SCANNER.nextInt();
    
            System.out.print("\nIngrese la altura del "+i+" triangulo: ");
            altura_t = SCANNER.nextInt();
    
            //Operaciones
            area = (base_t * altura_t) /2;
            
            //condicion de triangulos con area mayor a 12
            if(area >12){
                contador_t++;
            }
            
            //salida
            System.out.println("\nLa base ingresada del "+i+" triangulo es: "+base_t);
            System.out.println("\nLa altura ingresada del "+i+" triangulo es: "+altura_t);
            System.out.println("\nEl area del "+i+" triangulo es: "+area);
        }
    
        System.out.println("\nLa cantidad de triángulos cuya superficie es mayor a 12 es: "+contador_t);

    }

    /*
        Desarrollar un programa que solicite la carga de 10 números e 
        imprima la suma de los últimos 5 valores ingresados.

    */

    public void Ejercicio_P2(){

        int n_valor;
        int suma_ =0;
    
        for(int i=1; i<=10; i++) {
            System.out.print("Ingrese un valor:");
            n_valor = SCANNER.nextInt();
            
            if (i>5) {
                suma_ += n_valor;

            }
        }
        System.out.print("\nLa suma de los últimos 5 valores es: "+suma_);;
    }

    /*
        -Desarrollar un programa que muestre la tabla de multiplicar del 5 (del 5 al 50)

    */

    public void Ejercicio_P3(){
        System.out.print("\nTabla de multiplicar del 5... (5 al 50): ");

	    for(int i=5; i<=50; i+=5) {

	         System.out.print("\n"+i);
	    }

    }

    /*
        -Confeccionar un programa que permita ingresar un valor del 1 al 10 y 
         nos muestre la tabla de multiplicar del mismo (los primeros 12 términos)
            
         Ejemplo: 
         Si ingreso 3 deberá aparecer en pantalla los valores 3, 6, 9, hasta el 36.

    */

    public void Ejercicio_P4(int n_valor ){

        int contador =0;
        System.out.print("\nLa tabla de Multiplicar del "+n_valor+" es:\n");
        
        for(int i=n_valor; i<=n_valor*12; i+=n_valor) {
            contador++;
            System.out.println(n_valor+"x"+contador+"="+i);
        }

    }

    /*
        -Realizar un programa que lea los lados de n triángulos, e informar:
            a) De cada uno de ellos, qué tipo de triángulo es: equilátero (tres lados iguales), 
               isósceles (dos lados iguales), o escaleno (ningún lado igual)
            b) Cantidad de triángulos de cada tipo.
            c) Tipo de triángulo que posee menor cantidad.

    */

    public void Ejercicio_P5(int n_cantidad_Triangulos){

        int lado_T1;
        int lado_T2;
        int lado_T3;
        int cant_T1 =0;
        int cant_T2 =0;
        int cant_T3 =0;

        for(int i=1; i<=n_cantidad_Triangulos; i++) {
           System.out.print("\nIngrese la longitud del lado 1 del "+i+" Triangulo: ");
           lado_T1 = SCANNER.nextInt();

           System.out.print("\nIngrese la longitud del lado 2 del "+i+" Triangulo: ");
           lado_T2 = SCANNER.nextInt();

           System.out.print("\nIngrese la longitud del lado 3 del "+i+" Triangulo: ");
           lado_T3 = SCANNER.nextInt();

           if (lado_T1 == lado_T2 && lado_T1 == lado_T3) {
               System.out.println("Es un triángulo equilatero.");
               cant_T1++;
               
           } else if (lado_T1 == lado_T2 || lado_T1 == lado_T3 || lado_T2 == lado_T3) {
                System.out.println("Es un triángulo isósceles.");
                cant_T2++;

            }else {
                cant_T3++;
                System.out.println("Es un triángulo escaleno.");
                }
        }
        System.out.println("Cantidad de triángulos equilateros: "+cant_T1);
        System.out.print("Cantidad de triángulos isósceles: "+cant_T2);
        System.out.print("Cantidad de triángulos escalenos: "+cant_T3);
        
        if (cant_T1 < cant_T2 && cant_T1 < cant_T3) {
            System.out.println("Hay menor cantidad de triángulos equilateros.");
        
        }else if(cant_T2 < cant_T3){
            
            System.out.println("Hay menor cantidad de triángulos isósceles");	
           
        }else{
            System.out.println("Hay menor cantidad de triángulos escalenos");	
        }
    }


    public static void main(String[] ar) {
    	
        Estructura_repetitiva_for estructura_repetitiva_for = new Estructura_repetitiva_for();
        estructura_repetitiva_for.Estructura_repetitiva_for_1();
        estructura_repetitiva_for.Estructura_repetitiva_for_2();
        estructura_repetitiva_for.Estructura_repetitiva_for_3();
        estructura_repetitiva_for.Estructura_repetitiva_for_4();


        //ejercicios
        estructura_repetitiva_for.Ejercicio_P1(5);
        estructura_repetitiva_for.Ejercicio_P2();
        estructura_repetitiva_for.Ejercicio_P3();
        estructura_repetitiva_for.Ejercicio_P4(5);
        
    }

    
}
