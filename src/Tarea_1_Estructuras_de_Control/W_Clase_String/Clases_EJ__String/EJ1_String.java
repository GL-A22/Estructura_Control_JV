package Tarea_1_Estructuras_de_Control.W_Clase_String.Clases_EJ__String;

import java.util.Scanner;

public class EJ1_String {
    /*
        Realizar una clase, que permita cargar una dirección de mail en el constructor, 
        luego en otro método mostrar un mensaje si contiene el caracter '@'.
    
    */

    private Scanner SCANNER = new Scanner(System.in);
    private String mail;

    public EJ1_String() {

        System.out.print("Ingrese un mail:");
        mail=SCANNER.nextLine();
    }
    
    public void verificarArroba() {
        boolean existe=false;
        for(int f=0;f<mail.length();f++) {
            if (mail.charAt(f)=='@') {
                existe=true;
            }
        }
        if (existe==true) {
            System.out.println(mail+" contiene el caracter @");
        } else {
            System.out.println(mail+" no contiene el caracter @");        
        }
    }

    public static void main(String[] ar) {
    
        EJ1_String ej1_String = new EJ1_String();
        ej1_String.verificarArroba();
        
    }
}
