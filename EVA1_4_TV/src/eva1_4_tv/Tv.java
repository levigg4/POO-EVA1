package eva1_4_tv;
//RODRIGO LEVI GARCIA GARAY //

public class Tv {
    //ATRIBUTOS
    private int volumen;
    private int canal;
    private boolean poder; //true = prendido // false = apagado 
    //CONSTRUCTORES
    public Tv(){ ///constructor default
        volumen = 0;
        canal = 0; 
        poder = false; //apagado
    }
    //METODOS (INTERFAZ TV)
    //encender y apagar TV
    public void cambiarPoder(){
        //verificar el estado de la TV
        if(poder){
            poder = false;
            System.out.println("Apagando Pantalla");
        }else{
            poder = true;
            System.out.println("Encendiendo Pantalla");
        }
    }
    //volumen
    public void subirVolumen(){ //sube volumen 
        if(poder){// la tele esta prendida
            if(volumen<100){
                volumen++;//acumulador / volumen+=1
                System.out.println("Volumen: "+volumen);
            }else{
                System.out.println("VOLUMEN MAXIMO");
            }
        }
    }
    public void bajarVolumen(){
        if(poder){
            if(volumen>0){
                volumen--;//volumen-=1
                System.out.println("Volumen: "+volumen);
            }
        }
    }
    public void subirCanal(){ //sube canal para arriba
        if(poder){//si esta prendida
            if(canal<100){//si el canal es menor que 100 sigue corriendo 
                canal++;//acumulador //canal+=1
                System.out.println("Canal: "+canal);
            }else{
                canal=0;//pero si se pasa de 100 lo bajamos a 0
                System.out.println("Canal: "+canal);
            }
        }
    }
    public void bajarCanal(){ //baja canal para abajo 
        if(poder){//si esta prendida
            if(canal>0){//si el canal es mayor que 0 sigue corriendo 
                canal--;//canal-=1 disminuye
                System.out.println("Canal: "+canal);
            }else{
                canal=100;//pero si baja de 0 lo regreso a 100
                System.out.println("Canal: "+canal);
            }
        }
    }
}
