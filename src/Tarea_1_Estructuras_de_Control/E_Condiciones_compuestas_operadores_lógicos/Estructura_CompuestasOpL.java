package Tarea_1_Estructuras_de_Control.E_Condiciones_compuestas_operadores_lógicos;

import java.util.Scanner;

public class Estructura_CompuestasOpL {

    private static final Scanner SCANNER = new Scanner(System.in);

    /*
     * 9 - Condiciones compuestas con operadores lógicos
     * Confeccionar un programa que lea por teclado tres números distintos y nos
     * muestre el mayor.
     * 
     */

    public void Estructura_CompuestasOpL1() {

        // ingreso por consola
        System.out.print("\nIngrese cualquier valor numerico: ");
        int num_1 = SCANNER.nextInt();

        System.out.print("\nIngrese cualquier valor numerico: ");
        int num_2 = SCANNER.nextInt();

        System.out.print("\nIngrese cualquier valor numerico: ");
        int num_3 = SCANNER.nextInt();

        if (num_1 > num_2 && num_1 > num_3) {
            System.out.print("\nEl numero mayor de los valores ingresados es:" + num_1);

        } else if (num_2 > num_3) {
            System.out.print("\nEl numero mayor de los valores ingresados es:" + num_2);

        } else {
            System.out.print("\nEl numero mayor de los valores ingresados es:" + num_3);
        }
    }

    /*
     * Se carga una fecha (día, mes y año) por teclado.
     * Mostrar un mensaje si corresponde al primer trimestre del año (enero, febrero
     * o marzo)
     * Cargar por teclado el valor numérico del día, mes y año.
     * Ejemplo: dia:10 mes:1 año:2010.
     * 
     */

    public void Estructura_CompuestasOpL2() {

        // ingreso por consola
        System.out.print("\nIngrese el numero del día: ");
        int dia_ = SCANNER.nextInt();

        System.out.print("\nIngrese el numero del Mes: ");
        int mes_ = SCANNER.nextInt();

        System.out.print("\nIngrese el año: ");
        int anio_ = SCANNER.nextInt();

        if (mes_ == 01 || mes_ == 1 || mes_ == 02 || mes_ == 2 || mes_ == 03 || mes_ == 3) {

            System.out.print("\nCorresponde al primer trimestre");
            System.out.print("\nFecha ingresada: "+dia_+" / "+mes_+" / "+anio_);

        }

    }



    //Ejercicos

    /*
        -Realizar un programa que pida cargar una fecha cualquiera, 
         luego verificar si dicha fecha corresponde a Navidad.
    
    */

    public void Ejercicio_P1(){

        // ingreso por consola
        System.out.print("\nIngrese el numero del día: ");
        int dia_ = SCANNER.nextInt();

        System.out.print("\nIngrese el numero del Mes: ");
        int mes_ = SCANNER.nextInt();

        System.out.print("\nIngrese el año: ");
        int anio_ = SCANNER.nextInt();


        if (mes_ == 12 && dia_ == 25) {

            System.out.print("\nLa fecha ingresada corresponde a navidad... Feliz Navidad");
            System.out.print("\n fecha ingresada ... "+dia_+" / "+mes_+" / "+anio_);
        }

    }


    /*
        -Se ingresan tres valores por teclado, si todos son iguales 
         se imprime la suma del primero con el segundo y a este resultado 
         se lo multiplica por el tercero.
    
    */

    public void Ejercicio_P2(){

        // ingreso por consola
        System.out.print("\nIngrese el primer valor numerico: ");
        int num_1 = SCANNER.nextInt();

        System.out.print("\nIngrese el segundo valor numerico: ");
        int num_2 = SCANNER.nextInt();

        System.out.print("\nIngrese el tercer valor numerico: ");
        int num_3 = SCANNER.nextInt();

        if(num_1 == num_2 && num_1 == num_3){
            int suma_ = num_1 + num_2;
            int producto_ = suma_ * num_3;

            System.out.print("\nLa suma de primer valor con el segundo"+num_1+" + "+num_2+" es:"+suma_);
            System.out.print("\nEl producto del resultado por el tercero"+suma_+" x "+num_3+" es:"+producto_);
        }



        
    }


    /*
        -Se ingresan por teclado tres números, si todos los valores ingresados 
         son menores a 10, imprimir en pantalla la leyenda "Todos los números son menores a diez".
    
    */

    public void Ejercicio_P3(){

        // ingreso por consola
        System.out.print("\nIngrese el primer valor numerico: ");
        int num_1 = SCANNER.nextInt();

        System.out.print("\nIngrese el segundo valor numerico: ");
        int num_2 = SCANNER.nextInt();

        System.out.print("\nIngrese el tercer valor numerico: ");
        int num_3 = SCANNER.nextInt();

        if(num_1 <10 && num_2 <10 && num_3 <10){
            System.out.print("\nTodos los números son menores a diez");
        
        }else{
            System.out.print("\nUno de los valores no cumplio con la condicion ._.");
        }
        
    }

    /*
        -Se ingresan por teclado tres números, si al menos uno de los valores ingresados es menor a 10, 
         imprimir en pantalla la leyenda "Alguno de los números es menor a diez".
    
    */

    public void Ejercicio_P4(){

        // ingreso por consola
        System.out.print("\nIngrese el primer valor numerico: ");
        int num_1 = SCANNER.nextInt();

        System.out.print("\nIngrese el segundo valor numerico: ");
        int num_2 = SCANNER.nextInt();

        System.out.print("\nIngrese el tercer valor numerico: ");
        int num_3 = SCANNER.nextInt();

        if(num_1 <10 || num_2 <10 || num_3 <10){
            System.out.print("\nAlguno de los números es menor a diez :)");
        
        }
        
    }

    /*
        -Escribir un programa que pida ingresar la coordenada de un punto en el plano,
         es decir dos valores enteros x e y (distintos a cero).
         Posteriormente imprimir en pantalla en que cuadrante se ubica dicho punto.
         (1º Cuadrante si x > 0 Y y > 0 , 2º Cuadrante: x < 0 Y y > 0, etc.)
    
    */

    public void Ejercicio_P5(){
        
        // ingreso por consola
        System.out.print("Ingrese una coordenada para x ");
        int x = SCANNER.nextInt();

        System.out.print("Ingrese una coordenada para y ");
        int y = SCANNER.nextInt();

        if (x > 0 && y > 0) {
            System.out.print("Se encuentra en el 1º primer cuadrante");

        } else if (x < 0 && y > 0) {
            System.out.print("Se encuentra en el 2º segundo cuadrante");

        } else if (x < 0 && y < 0) {
            System.out.print("Se encuentra en el 3º tercer cuadrante");

        } else {
            System.out.print("Se encuentra en el 4º cuarto cuadrante");
        }

    }

    public static void main(String[] ar) {
    	
        Estructura_CompuestasOpL estructura_CompuestasOpL = new Estructura_CompuestasOpL();
        estructura_CompuestasOpL.Estructura_CompuestasOpL1();
        estructura_CompuestasOpL.Estructura_CompuestasOpL2();

        //ejercicos
        estructura_CompuestasOpL.Ejercicio_P1();
        estructura_CompuestasOpL.Ejercicio_P2();
        estructura_CompuestasOpL.Ejercicio_P3();
        estructura_CompuestasOpL.Ejercicio_P4();
        estructura_CompuestasOpL.Ejercicio_P5();
    }

}
