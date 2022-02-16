package Tarea_1_Estructuras_de_Control.W_Clase_String;

import java.util.Scanner;

public class Clase_String {
    /*
    
        Confeccionar una clase que solicite 
        el ingreso de dos String y luego emplee los métodos más comunes de la clase String.
    
    */
    private static final Scanner SCANNER = new Scanner(System.in);

    public void StrigP1() {
 
        String cadenatx_1;
        String cadenatx_2;
        System.out.print("Ingrese la primer cadena:");
        cadenatx_1=SCANNER.nextLine();

        System.out.print("Ingrese la segunda cadena:");
        cadenatx_2=SCANNER.nextLine();

        if (cadenatx_2.equals(cadenatx_2)==true) {
            System.out.println(cadenatx_1+" es exactamente igual a "+cadenatx_2);
        } else {
            System.out.println(cadenatx_1+" no es exactamente igual a "+cadenatx_2);        
        }
        if (cadenatx_1.equalsIgnoreCase(cadenatx_2)==true) {
            System.out.println(cadenatx_1+" es igual a "+cadenatx_2+" sin tener en cuenta mayúsculas/minúsculas");
        } else {
            System.out.println(cadenatx_1+" no es igual a "+cadenatx_2+" sin tener en cuenta mayúsculas/minúsculas");        
        }
        if (cadenatx_1.compareTo(cadenatx_2)==0) {
            System.out.println(cadenatx_1+" es exactamente igual a "+cadenatx_2);
        } else {
            if (cadenatx_1.compareTo(cadenatx_2)>0) {
                System.out.println(cadenatx_1+ " es mayor alfabéticamente que "+cadenatx_2);
            } else {
                System.out.println(cadenatx_2+ " es mayor alfabéticamente que "+cadenatx_2);            
            }
        }        
        char carac1=cadenatx_1.charAt(0);
        System.out.println("El primer caracter de "+cadenatx_1+" es "+carac1);
        int largo=cadenatx_1.length();
        System.out.println("El largo del String "+cadenatx_1+" es "+largo);
        String cad3=cadenatx_1.substring(0,3);
        System.out.println("Los primeros tres caracteres de "+cadenatx_1+" son "+cad3);
        int posi=cadenatx_1.indexOf(cadenatx_2);
        if (posi==-1) {
            System.out.println(cadenatx_2+" no está contenido en "+cadenatx_1);
        } else {
            System.out.println(cadenatx_2+" está contenido en "+cadenatx_1+" a partir de la posición "+posi);
        }
        System.out.println(cadenatx_1+ " convertido a mayúsculas es "+cadenatx_1.toUpperCase());
        System.out.println(cadenatx_1+ " convertido a minúsculas es "+cadenatx_1.toLowerCase());        
    }



    public static void main(String[] ar) {
    
        Clase_String clase_string = new Clase_String();
        clase_string.StrigP1();
        
    }
}
