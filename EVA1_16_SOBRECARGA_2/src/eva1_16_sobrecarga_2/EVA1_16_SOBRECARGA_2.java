package eva1_16_sobrecarga_2;
///RODRGIO LEVI GARCIA GARAY ///
public class EVA1_16_SOBRECARGA_2 {

    public static void main(String[] args) {
        System.out.println("Suma: " + sumar(2,8));
        System.out.println("Suma: " + sumar(2.0,8.0));
        System.out.println("Suma: " + sumar("abc","def"));
        sumar();
        
    }
                     //sumar (int, int) es la firma
    public static int sumar(int n1, int n2){
        return n1+n2;   
    }
                        //sumar(double, double)
    public static double sumar(double n1, double n2){
        return n1+n2;
    }
                        //sumar (String, String)
    public static String sumar(String n1, String n2){
        return n1+n2;
    }
                       //sumar(sin argumentos)
    public static void sumar(){
        System.out.println("METODO SIN PARAMETROS SUMAR()");
    }
 
}