package Tarea_1_Estructuras_de_Control.V_Constructor_de_clase;

public class ConstructoresP3_TablaMultiplicar {
    
    /*
        Plantear una clase TablaMultiplicar. 
        Definir dos constructores uno con un parámetro que llegue un entero indicando
         que tabla queremos ver y otro con dos enteros que indique 
         el primero que tabla queremos ver y el segundo parámetro indica cuantos términos mostrar.
        Si no llega la cantidad de términos a mostrar inicializar en 10 los términos a mostrar
    
    */

    private int tabla;
    private int terminos;
    
    public ConstructoresP3_TablaMultiplicar(int tabla,int terminos) {
        this.tabla = tabla;
        this.terminos = terminos;
    }

    public ConstructoresP3_TablaMultiplicar(int tabla) {
        this.tabla = tabla;
        terminos=10;
    }
    
    public void imprimir() {
        System.out.println("Tabla de multiplicar del "+tabla);
        for(int i=1; i<=terminos; i++) {
            int resultado = i*tabla;
            System.out.println(tabla + "*" + i + "=" + resultado);
        }
    }

    public static void main(String[] ar) {
    
        ConstructoresP3_TablaMultiplicar constructoresP3_TablaMultiplicar1 = new ConstructoresP3_TablaMultiplicar(5);
        constructoresP3_TablaMultiplicar1.imprimir();
        
        ConstructoresP3_TablaMultiplicar constructoresP3_TablaMultiplicar2 = new ConstructoresP3_TablaMultiplicar(3,5);
        constructoresP3_TablaMultiplicar2.imprimir();
    }
}
