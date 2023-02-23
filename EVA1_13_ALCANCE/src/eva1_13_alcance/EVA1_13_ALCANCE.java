package eva1_13_alcance;
//RODRIGO LEVI GARCIA GARAY///
public class EVA1_13_ALCANCE {

    public static void main(String[] args) {
        int x=100;//visible para todo lo que este dentro de main() 
        for (int i = 0; i < 10; i++) { //inicia el ciclo for
            System.out.println("x = "+x);//si es visible dentro del for
            System.out.println("i = "+i);
            System.out.println("j = "+j);//la j no es visible 
                                         //no esta declarada antes 
                                         //de la instruccion
            int j= 100; //apartir de aqui es visible 
            System.out.println("j = "+j);
            {
                int z =1000;
                System.out.println("z = "+z);
            }
                System.out.println("z = "+z);
        } //termina el bloque for
        System.out.println("i = "+i);//no estan desclaradas en el bloque 
        System.out.println("j = "+j);//no estan desclaradas en el bloque
    }
    public static void algo(){
        System.out.println("x = "+x);//no es visible en algo()
    }
    
}