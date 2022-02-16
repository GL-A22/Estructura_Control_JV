package Tarea_1_Estructuras_de_Control.X_Colaboración_de_clases;

/*
        28 - Colaboración de clases

        Un banco tiene 3 clientes que pueden hacer depósitos y extracciones. 
        tambien el banco requiere que al final del día calcule la cantidad de dinero que hay depositada.

                                    Cliente		
                                atributos
                                    nombre
                                    monto
                                métodos
                                    constructor
                                    depositar
                                    extraer
                                    retornarMonto

                            Banco
                                atributos
                                    3 Cliente (3 objetos de la clase Cliente)
                                métodos
                                    constructor
                                    operar
                                    depositosTotales
                                
    */

public class ColaboracionClasesP1_Cliente {
    
    public class Cliente{

        private String nombre;
    private int monto_;
    
    public Cliente(String nombre_client) {
        nombre = nombre_client;
        monto_ =0;
    }
    
    public void depositar(int monto) {
        monto_ += monto;
    }
    
    public void extraer(int monto) {
        monto_ -= monto;
    }
    
    public int retornarMonto() {
        return monto_;
    }
    
    public void imprimir() {
        System.out.println(nombre+" tiene depositado la suma de "+monto_);
    }

    }

    public class Banco {

        private Cliente cliente1,cliente2,cliente3;
        
        public Banco() {
            cliente1=new Cliente("Juan");
            cliente2=new Cliente("Ana");
            cliente3=new Cliente("Pedro"); 
        }
    
        public void operar() {
            cliente1.depositar (100);
            cliente2.depositar (150);
            cliente3.depositar (200);
            cliente3.extraer (150);
        }
        
        public void depositosTotales ()
        {
            int t = cliente1.retornarMonto () + cliente2.retornarMonto () + cliente3.retornarMonto ();
            System.out.println ("El total de dinero en el banco es:" + t);
            cliente1.imprimir();
            cliente2.imprimir();
            cliente3.imprimir();
        }
    
    
    }



/*
    public static void main(String[] ar) {
    
        Banco banco = new Banco();
        banco.operar();
        banco.depositosTotales();
        
    }
*/
}

