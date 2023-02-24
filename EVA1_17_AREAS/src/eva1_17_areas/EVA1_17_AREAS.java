package eva1_17_areas;
///RODRIGO LEVI GARCIA GARAY ///

public class EVA1_17_AREAS {

    public static void main(String[] args) {
        System.out.println("ÁREA CÍRCULO: " + area(3));
        System.out.println("ÁREA TRÍANGULO: " + area(3,4));
        System.out.println("ÁREA TRAPECIO: " + area(2,4,10));
    }

    public static double area(double r){
        double circulo = (r*r)*Math.PI;
        return circulo;
    }
    
    public static double area(double b, double h){
        double triangulo = ((b*h)/2.0);
        return triangulo;
    }
    
    public static double area(double b1, double b2, double h){
        double trapecio = (((b1+b2)*h)/2.0);
        return trapecio;
    }

    
}
