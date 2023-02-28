package PAQUETE_2;
//RODRIGO LEVI GARCIA GARAY//

import PAQUETE_1.ClaseA;
import PAQUETE_1.ClaseC;

public class ClaseE {
    public int publicE;
    int defaultE;
    private int privateE;
     public void prueba(){
        ClaseA objA = new ClaseA();
        //objA.publicA
        
        //ClaseB / NO ES VISIBLE porque es DEFAULT
        //objB = new ClaseB();
        
        ClaseC objC = new ClaseC();
        //objC.publicC; atributos visibles
        
        //Clase D / NO ES VISIBLE porque es DEFAULT                                                                 
        //objD = new ClaseD();                           
        
        
        //ClaseF es default y es invisible para las clases de este paquete_1 
        ClaseF objF = new ClaseF();
        //objF.publicF; visible aqui
        //objF.defaultF; visible mismo paquete 
    }
    
}
class ClaseF{
    public int publicF;
    int defaultF;
    private int privateF;
}
