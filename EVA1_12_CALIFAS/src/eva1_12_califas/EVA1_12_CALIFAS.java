package eva1_12_califas;
//RODRIGO LEVI GARCIA GARAY////

public class EVA1_12_CALIFAS {
    public static void main(String[] args) {
        String calif = grade(86);///guardo el valor de retorno 
        System.out.println("Tu Calificacion(86): " + calif); 
        System.out.println("Tu Calificacion(64): " + grade(64));//directo se usa pero se pierde ese valor 
        grade(100);//ignora el resultado para el output
    }
    public static String grade(int n){
        String califa = "";
        if((n>=91)&&(n<=100)){
            califa = "A";
        }
        else if((n>=81)&&(n<=90)){
            califa = "B";
        }
        else if((n>=71)&&(n<=80)){
            califa = "C";
        }
        else{
            califa = "D";
        }
        return califa;
    } 
}