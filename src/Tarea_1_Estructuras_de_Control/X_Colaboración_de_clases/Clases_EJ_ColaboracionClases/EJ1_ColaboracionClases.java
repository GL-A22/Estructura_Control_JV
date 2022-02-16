package Tarea_1_Estructuras_de_Control.X_Colaboración_de_clases.Clases_EJ_ColaboracionClases;

import java.util.Scanner;

public class EJ1_ColaboracionClases {
    
    /*
        Plantear una clase Club y otra clase Socio.
        La clase Socio debe tener los siguientes atributos privados: 
        nombre y la antigüedad en el club (en años). En el constructor 
        pedir la carga del nombre y su antigüedad. La clase Club debe tener como atributos 3 
        objetos de la clase Socio. Definir una responsabilidad 
        para imprimir el nombre del socio con mayor antigüedad en el club.
    
    */

    public class Socio {
        private String nombre_Socio;
        private int antiguedad;
        
        public Socio(Scanner SCANNER) {
            System.out.print("Ingrese el nombre del socio:");
            nombre_Socio=SCANNER.next();

            System.out.print("Ingrese la antiguedad:");
            antiguedad=SCANNER.nextInt();
        }
        
        public void imprimir() {
            System.out.println(nombre_Socio+" tiene una antiguedad de "+antiguedad);
        }
        
        public int retornarAntiguedad() {
            return antiguedad;
        }
    }


    public class Club {
        private Socio socio_1;
        private Socio socio_2;
        private Socio socio_3;
        private Scanner SCANNER;
        
        public Club() {
          SCANNER=new Scanner(System.in);
          socio_1=new Socio(SCANNER);
          socio_2=new Socio(SCANNER);
          socio_3=new Socio(SCANNER);
        }
    
        public void mayorAntiguedad() {
            System.out.print("Socio con mayor antiguedad:");
            if (socio_1.retornarAntiguedad()>socio_2.retornarAntiguedad() &&
                socio_1.retornarAntiguedad()>socio_3.retornarAntiguedad()) {
                socio_1.imprimir();
            } else {
                if (socio_2.retornarAntiguedad()>socio_3.retornarAntiguedad()) {
                    socio_2.imprimir();
                } else {
                    socio_3.imprimir();
                }
            }
     
        }
    
    }

/*
    public static void main(String[] ar) {
    
        Club club =  new Club();
        club.mayorAntiguedad();
        
    }
 */
    
}
