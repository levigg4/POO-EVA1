package eva1_8_llamada_funcion;
///RODRIGO LEVI GARCIA GARAY/////
public class EVA1_8_LLAMADA_FUNCION {

    public static void main(String[] args) {
        System.out.println("INICIA main");
        A();//LAMADA A FUNCION
        System.out.println("TERMINA main");
    }
    public static void A(){
        System.out.println("INICIA A()");
        B();//LAMADA A FUNCION
        System.out.println("TERMINA A()");
    }
    public static void B(){
        System.out.println("INICIA B()");
        System.out.println("TERMINA B()");
    }
}
