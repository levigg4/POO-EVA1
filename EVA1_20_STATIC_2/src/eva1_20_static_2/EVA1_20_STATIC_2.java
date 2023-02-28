package eva1_20_static_2;
///RODRIGO LEVI GARCIA GARAY ///
public class EVA1_20_STATIC_2 {

    public static void main(String[] args) {
       /*final int x;
        x=100;
        x=102;*/
       FormulasGeometria formulas = new FormulasGeometria();
       //formulas. no existe ningun metodo dentro del objeto 
        System.out.println("MI PI: "+FormulasGeometria.PI);
        System.out.println("Area Triangulo: "+FormulasGeometria.areaTriangulo(5.0,5.0));
        System.out.println("Volumen Esfera: "+FormulasGeometria.volumenEsfera(10.0));
        
    }  
}