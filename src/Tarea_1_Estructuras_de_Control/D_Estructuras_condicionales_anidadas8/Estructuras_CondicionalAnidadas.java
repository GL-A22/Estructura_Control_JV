package Tarea_1_Estructuras_de_Control.D_Estructuras_condicionales_anidadas8;

import java.util.Scanner;

public class Estructuras_CondicionalAnidadas {
 
    private static final Scanner SCANNER = new Scanner(System.in);
    private int calif_1;
    private int calif_2;
    private int calif_3;
    private int promedio;
    
/*
    8 - Estructuras condicionales anidadas

    un programa que pida por teclado tres notas de un alumno, 
    calcule el promedio e imprima alguno de estos mensajes:
    Si el promedio es >=7 mostrar "Promocionado".
    Si el promedio es >=4 y <7 mostrar "Regular".
    Si el promedio es <4 mostrar "Reprobado".
*/

    public void Estructura_CondicionalAnidada(){

        // ingreso por consola
        System.out.print("\nIngrese la primera calificacion: ");
        calif_1 = SCANNER.nextInt();

        System.out.print("\nIngrese la segunda calificacion: ");
        calif_2 = SCANNER.nextInt();

        System.out.print("\nIngrese la tercera calificacion: ");
        calif_3 = SCANNER.nextInt();

        promedio = (calif_1 + calif_2 + calif_3)/3;

        //condicion anidada
        if(promedio >=7){
            System.out.print("\nPromocionado");
        
        }else if(promedio >=4 ){
            System.out.print("\nRegular");
        
        }else{
            System.out.print("\nReprobado");
        }

    }


    //Ejercicios

    /*
        -Se cargan por teclado tres números distintos. Mostrar por pantalla el mayor de ellos.

    */

    public void Ejercicio_P1(){
        // ingreso por consola
        System.out.print("\nIngrese el primer valor numerico: ");
        int num_1 = SCANNER.nextInt();

        System.out.print("\nIngrese el segundo valor numerico: ");
        int num_2 = SCANNER.nextInt();

        System.out.print("\nIngrese el tercer valor numerico: ");
        int num_3 = SCANNER.nextInt();

        if(num_1 > num_2){
            
            if (num_1 > 3){
                System.out.print("\nEl numero mayor de los valores ingresados es:"+num_1);
            
            }else{
                System.out.print("\nEl numero mayor de los valores ingresados es:"+num_3);
            }
        
        }else{
            if(num_2 > num_3){
                System.out.print("\nEl numero mayor de los valores ingresados es:"+num_2);
            
            }else{
                System.out.print("\nEl numero mayor de los valores ingresados es:"+num_3);
            }

        }
    }


    /*
        -Se ingresa por teclado un valor entero, mostrar una leyenda que indique si el número es positivo, 
         nulo o negativo.

    */

    public void Ejercicio_P2(){

        // ingreso por consola
        System.out.print("\nIngrese un valor numerico: ");
        int num = SCANNER.nextInt();

        if(num >0){
            System.out.print("\nEl numero  ingresado es positivo"); 
        
        }else if(num == 0){
            System.out.print("\nEl numero  ingresado es nulo"); 
        
        }else{
            System.out.print("\nEl numero  ingresado es negativo");
        }
    }


    /*
        -Confeccionar un programa que permita cargar un número entero positivo de hasta tres cifras y 
         muestre un mensaje indicando si tiene 1, 2, o 3 cifras. Mostrar un mensaje de error si el número de cifras es mayor.

    */

    public void Ejercicio_P3(int numero_Entero){

        if (numero_Entero < 10) {
            System.out.println("Usted a ingresado un numero de solo un dijitos|cifras");

        } else if (numero_Entero < 100) {
            System.out.println("Usted a ingresado un numero de solo dos dijitos|cifras");

        } else if (numero_Entero < 1000) {
            System.out.println("Usted a ingresado un numero de tres dijito|cifras");

        } else {
            System.out.println("Error... el numero ingresado supera el limite de cifras requeridos");
        }
        
    }


    /*
        -Un postulante a un empleo, realiza un test de capacitación, se obtuvo la siguiente información: 
         cantidad total de preguntas que se le realizaron y la cantidad de preguntas que contestó correctamente.
         Se pide confeccionar un programa que ingrese los dos datos por teclado e informe el nivel del mismo según 
         el porcentaje de respuestas correctas que ha obtenido, y sabiendo que:

                                    Nivel máximo:	Porcentaje>=90%.
                                    Nivel medio:	Porcentaje>=75% y <90%.
                                    Nivel regular:	Porcentaje>=50% y <75%.
                                    Fuera de nivel:	Porcentaje<50%.
    */


    public void Ejercicio_P4(){

        // ingreso por consola
        System.out.print("\nIngrese el numero total de preguntas: ");
        int n_Preguntas = SCANNER.nextInt();

        System.out.print("\nIngrese el numero de preguntas correctas: ");
        int Preguntas_correctas = SCANNER.nextInt();

        int porcentaje = (Preguntas_correctas * 100) / n_Preguntas;

        //condicion
        if(porcentaje >=90){
            System.out.print("\nObtuvo el nivel maximo");

        }else if(porcentaje >=75){
            System.out.print("\nObtuvo el nivel medio");

        }else if(porcentaje >=50){
            System.out.print("\nObtuvo el nivel regular");
        
        }else{
            System.out.print("\nUsted está fuera de nivel");
        }

        
    }

    public static void main(String[] ar) {
    	
        Estructuras_CondicionalAnidadas condicionalesAnidadas = new Estructuras_CondicionalAnidadas();
        condicionalesAnidadas.Estructura_CondicionalAnidada();
        condicionalesAnidadas.Ejercicio_P1();
        condicionalesAnidadas.Ejercicio_P2();
        condicionalesAnidadas.Ejercicio_P3(6);
        condicionalesAnidadas.Ejercicio_P4();
    }

}
