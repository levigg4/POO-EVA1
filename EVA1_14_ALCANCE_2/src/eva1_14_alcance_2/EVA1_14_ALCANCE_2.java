package eva1_14_alcance_2;
//RODRIGO LEVI GARCIA GARAY ///

public class EVA1_14_ALCANCE_2 {

    public static void main(String[] args) {
        int x=100;//visible dentro del todo el bloque main 
        for (int i = 0; i < 10; i++) {
            int x = 100; //la varible esta declarada en main() es visible dentro del for
            int y = 100;
            if(i==5){
                
            }
        }
        int y=100;//aqui la variable y del ciclo for no existe podemos declarar una varibale del mismo nombre
    }   
}