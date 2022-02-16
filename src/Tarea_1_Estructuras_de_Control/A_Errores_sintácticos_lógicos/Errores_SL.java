package Tarea_1_Estructuras_de_Control.A_Errores_sintácticos_lógicos;

public class Errores_SL {

    private int lado;
    private int superficie;

    // Errores sintácticos y lógicos:
    // Hallar la superficie de un cuadrdo conociendo el valor de un lado.

    public void Superficie_Cuadrado(int lado) {
        this.lado = lado;
        superficie = this.lado * this.lado;
        System.out.println("la superficie del cuadrado es " + superficie);

    }

    public static void main(String[] ar) {
        
        
        Errores_SL superficieCuadrado = new Errores_SL();
        superficieCuadrado.Superficie_Cuadrado(4);
        
    }



}
