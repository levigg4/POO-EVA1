package eva1_21_static_3;
//RODRIGO LEVI GARCIA GARAY//
public class EVA1_21_STATIC_3 {

    public static void main(String[] args) {
        //CON LA CLASE DIRECTO (STATIC)
        System.out.println(Prueba.valor);
        Prueba.valor++;
        System.out.println(Prueba.valor);
        //AHORA CON OBJETOS
        //objeto 1
        PruebaObjetos obj = new PruebaObjetos();
        System.out.println(obj.valor);
        obj.valor++;
        System.out.println(obj.valor);
        //objeto 2 
        PruebaObjetos obj2 = new PruebaObjetos();
        System.out.println(obj2.valor);
    }
    
}
class Prueba{
    public static int valor=100;
}
class PruebaObjetos{
    public int valor =100;
}