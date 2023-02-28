package eva1_19_static;
//RODRIGO LEVI GARCIA GARAY //
public class EVA1_19_STATIC {

    public static void main(String[] args) {
        //static: algo que se puede usar sin crear instancias de una clase
        Utilerias utileria = new Utilerias();
        utileria.Saludo();
        Utilerias.otroSaludo();
        System.out.println("Pi: "+Math.PI);
        System.out.println("Numero aleatorio: "+Math.random());
       // Saludo2();//si no es estatico y no se ha creado un objeto el metodo no existe
    }
    public void Saludo2(){
        System.out.println("HOLA!!!");
    }
}
class Utilerias{
    //Saludo(): ESTE METODO ECISTE HASTA QUE TENGAMOS UN OBJETO DE LA CLASE, 
    //SOLO SE USA ATRAVES DE UN OBJETO
    public void Saludo(){
        System.out.println("Hola!");
    }
    //otroSaludo(): ESTE METODO EXISTE EN EL MOMENTO QUE EL PROGRAMA INICIA SU EJECUCION. 
    //NO NECESITA QUE SE CREE UN OBJETO DE LA CLASE PARA PODERLO USAR
    //SE USA A TRAVÉS DE LA CLASE
    public static void otroSaludo(){
        System.out.println("Que rollo! (static)");
    }
    
}
class OtraClase{

}
