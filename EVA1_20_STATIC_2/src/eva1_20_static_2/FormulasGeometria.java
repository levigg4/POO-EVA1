package eva1_20_static_2;
//RODRIGO LEVI GARCIA GARAY //
public class FormulasGeometria {
    //constante:
    public static final double PI = 3.14159;
    public static double areaTriangulo(double base, double altura){
        return (base*altura)/2.0;
    }
    public static double areaCirculo(double radio){
        return PI*radio*radio;
    }
    public static double perimetroCirculo(double radio){
        return PI*(radio*2.0);
    }
    public static double volumenEsfera(double radio){
        return ((4.0/3.0)*PI*(radio*radio*radio));
    }
}
