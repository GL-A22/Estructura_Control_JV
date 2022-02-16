package Tarea_1_Estructuras_de_Control.X_Colaboración_de_clases;

public class ColaboracionClasesP2 {
    
    /*
        Plantear un programa que permita jugar a los dados. Las reglas de juego son:
         se tiran tres dados si los tres salen con el mismo valor mostrar un mensaje que "gano", 
         sino "perdió".

                                    Dado		
                                atributos
                                    valor
                                métodos
                                    tirar
                                    imprimir
                                    retornarValor

                            JuegoDeDados
                                atributos
                                    3 Dado (3 objetos de la clase Dado)
                                métodos
                                    constructor
                                    jugar
    
    */

    public class Dado {
        private int valor_dado;
        
        public void tirar() {
            valor_dado =1+(int)(Math.random()*6);
        }
        
        public void imprimir() {
            System.out.println("El valor del dado es:"+valor_dado);
        }
        
        public int retornarValor() {
            return valor_dado;
        }
    }


    public class JuegoDeDados {
        private Dado dado_1;
        private Dado dado_2;
        private Dado dado_3;
        
        public JuegoDeDados() {
            dado_1=new Dado();
            dado_2=new Dado();
            dado_3=new Dado();        	
        }
        
        public void jugar() {
            dado_1.tirar();
            dado_1.imprimir();
            dado_2.tirar();
            dado_2.imprimir();
            dado_3.tirar();
            dado_3.imprimir();
            if (dado_1.retornarValor()==dado_2.retornarValor() && 
                dado_1.retornarValor()==dado_3.retornarValor()) {
                System.out.println("Ganó");
            } else {
                System.out.println("Perdió");
            }        	
        }
    }
/*
    public static void main(String[] ar) {
    
        JuegoDeDados juegoDeDados = new JuegoDeDados();
        juegoDeDados.jugar();
        
    }
*/
}
