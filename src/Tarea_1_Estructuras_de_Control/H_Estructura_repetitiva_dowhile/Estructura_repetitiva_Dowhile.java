package Tarea_1_Estructuras_de_Control.H_Estructura_repetitiva_dowhile;

import java.util.Scanner;

public class Estructura_repetitiva_Dowhile {
    
    private static final Scanner SCANNER = new Scanner(System.in);

    /*
        12 - Estructura repetitiva do while

        Escribir un programa que solicite la carga de un número entre 0 y 999, y 
        nos muestre un mensaje de cuántos dígitos tiene el mismo. 
        Finalizar el programa cuando se cargue el valor 0
        
        Realizar un programa que acumule (sume) valores ingresados por teclado hasta ingresar el 9999 
        (no sumar dicho valor, indica que ha finalizado la carga). Imprimir el valor acumulado e informar 
        si dicho valor es cero, mayor a cero o menor a cero.
    
    */

    public void Estructura_repetitiva_Dowhile_1(){

        int n_valor;

        do {
            System.out.print("Ingrese un valor entre 0 y 999 (0 finaliza):");
            n_valor = SCANNER.nextInt();

            if (n_valor>=100) {
                System.out.println("Tiene 3 dígitos.");
            } else if(n_valor >=10){
                
                System.out.println("Tiene 2 dígitos.");
                    
            }else{
                System.out.println("Tiene 1 dígito.");
            }
        } while (n_valor!=0);
    }
    
    /*
        Escribir un programa que solicite la carga de números por teclado, obtener su promedio.
        Finalizar la carga de valores cuando se cargue el valor 0.
    
    */

    public void Estructura_repetitiva_Dowhile_2(){

        int valor_n;
        int suma=0;
        int cant=0;
        

        do {
            System.out.print("Ingrese un valor (0 para finalizar):");
            valor_n = SCANNER.nextInt();
            if (valor_n !=0) {
                suma += valor_n;
                cant++;
            }
        } while (valor_n !=0);

        if (cant !=0) {

            int promedio=suma/cant;
            System.out.print("\nEl promedio de los valores ingresados es:"+promedio);

        } else {
            System.out.println("No se ingresaron valores.");
        }

    }


    /*
        Realizar un programa que permita ingresar el peso (en kilogramos) de piezas. 
        El proceso termina cuando ingresamos el valor 0. Se debe informar:
                a) Cuántas piezas tienen un peso entre 9.8 Kg. y 10.2 Kg.?, 
                   cuántas con más de 10.2 Kg.? y cuántas con menos de 9.8 Kg.?

                b) La cantidad total de piezas procesadas.
    
    */

    public void Estructura_repetitiva_Dowhile_3(){

        float n_peso;
        int cant_1=0;
        int cant_2=0;
        int cant_3=0;
        do {
            System.out.print("Ingrese el peso de la pieza (0 pera finalizar):");
            n_peso= SCANNER.nextFloat();
            
            if (n_peso >10.2) {
                cant_1++;
            
            } else if(n_peso >=9.8 && n_peso <=10.2) {
                cant_2++;
                
            }else if(n_peso <9.8){
                cant_3++;
            }

        } while(n_peso !=0);
        
        int suma=cant_1 + cant_2 + cant_3;

        System.out.print("\nPiezas aptas entre 9.8 Kg. y 10.2: "+cant_2);
        System.out.print("\nPiezas con un peso superior a 10.2: "+cant_1);
        System.out.print("Piezas con un peso inferior a 9.8: "+cant_3);
        System.out.print("Total de piezas procesadas "+suma);
    }


    //Problema propuestos

    /*
        Realizar un programa que acumule (sume) valores ingresados por teclado hasta ingresar el 9999 
        (no sumar dicho valor, indica que ha finalizado la carga). Imprimir el valor acumulado e 
        informar si dicho valor es cero, mayor a cero o menor a cero.
    
    */

    public void Ejercicio_P1(){

        int n_valores = 0;
        int suma = 0;

        do{

            // ingreso por consola
            System.out.print("\nIngrese cualquier valor numerico diferente a '9999': ");
            n_valores = SCANNER.nextInt();

            if(n_valores != 9999){
                suma += n_valores;
            }

        }while(n_valores != 9999 );

        System.out.println("\nEl valor acumulado de los numeros ingresados es: "+suma);
        if(suma == 0){
            System.out.println("El valor acumulado fue de Cero");
        }else if(suma > 0){
            System.out.println("El valor acumulado es Positivo");
        }else{
            System.out.println("El valor acumulado es negativo");
        }
    }

    /*
        -En un banco se procesan datos de las cuentas corrientes de sus clientes. 
         De cada cuenta corriente se conoce: número de cuenta y saldo actual. 
         El ingreso de datos debe finalizar al ingresar un valor negativo en el número de cuenta.

         Se pide confeccionar un programa que lea los datos de las cuentas corrientes e informe:

             a)De cada cuenta: número de cuenta y estado de la cuenta según su saldo, sabiendo que:
               Estado de la cuenta	'Acreedor' si el saldo es >0.
                                    'Deudor' si el saldo es <0.
			                        'Nulo' si el saldo es =0.

             b) La suma total de los saldos acreedores.
    
    */

    public void Ejercicio_P2(){

        int cuenta_;
        float saldo_;
        float suma_ =0;

        do {
            System.out.print("Ingrese número de cuenta:");
            cuenta_ = SCANNER.nextInt();

            if (cuenta_>=0) {
                System.out.print("Ingrese saldo:");
                saldo_ = SCANNER.nextFloat();

                if (saldo_ >0) {
                    System.out.println("Saldo Acreedor.");
                    suma_+= saldo_;
                } else if(saldo_ <0) {
                    System.out.println("Saldo Deudor.");
                    
                }else{
                    System.out.println("Saldo Nulo.");
                }
            }
            
        } while(cuenta_ >=0);
        System.out.print("\nTotal de saldos Acreedores:"+suma_);
    }


    public static void main(String[] ar) {
    	
        Estructura_repetitiva_Dowhile estructura_repetitiva_Dowhile = new Estructura_repetitiva_Dowhile();
        estructura_repetitiva_Dowhile.Estructura_repetitiva_Dowhile_1();
        estructura_repetitiva_Dowhile.Estructura_repetitiva_Dowhile_2();
        estructura_repetitiva_Dowhile.Estructura_repetitiva_Dowhile_3();

        //Ejercicios
        estructura_repetitiva_Dowhile.Ejercicio_P1();
        estructura_repetitiva_Dowhile.Ejercicio_P2();
        
        
    }

}
