package PAQUETE_1;
//RODRIGO LEVI GARCIA GARAY//
import PAQUETE_2.ClaseE;

public class ClaseA {
    public int publicA;
    int defaultA;
    private int privateA;
    public void prueba(){
        ClaseB objB = new ClaseB();
        //objB.publicB; atributos visibles
        //objB.default;
        ClaseC objC = new ClaseC();
        //objC.publicC; atributos visibles
        //objC.default;
        
        //Clase D es default en otro archivo pero mismo paquete //si es default es viisble                                                                 
        ClaseD objD = new ClaseD();                             //en el mismo paquete
        //objD.publicD; atributo visible
        //objD.defaultD; atributo visible
        
        //Clase E esta en otro paquete y archivo 
        //hay que agragr la clausula "import"
        ClaseE objE = new ClaseE();
        //objE.publicE; solo el atributo publico es visible // entre paquete solo es visible el default
        
        //ClaseF es default y es invisible para las clases de este paquete_1 
        //ClaseF objF = new ClaseF();        
    }
}
class ClaseB{
    public int publicB;
    int defaultB;
    private int privateB;

}
