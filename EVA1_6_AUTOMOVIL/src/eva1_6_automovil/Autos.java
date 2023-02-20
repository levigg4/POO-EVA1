package eva1_6_automovil;
//RODRIGO LEVI GARCIA GARAY ////

public class Autos {
    private String marca;
    private String modelo;
    private String placas;
    private int año;
    private String dueño;
    public Autos(){
        marca = "______";
        modelo = "_______";
        placas = "_______";
        año = 1900;
        dueño = "_______";
    }
    public Autos(String mar, String mode, String pla, int a, String due){
        marca = mar;
        modelo = mode;
        placas = pla;
        año = a;
        dueño = due;
    }
    public void setMarca(String nombreMarca){
        marca = nombreMarca;
    }
    public void setModelo(String nombreModelo){
        modelo = nombreModelo;
    }
    public void setPlacas(String idPlacas){
        placas = idPlacas;
    }
    public void setAño(int numAño){
        año = numAño;
    }
    public void setDueño(String nombreDueño){
        dueño = nombreDueño;
    }
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public String getPlacas(){
        return placas;
    }
    public int getAño(){
        return año;
    }
    public String getDueño(){
        return dueño;
    }
    public int calcularReva(){
        int adeudo = 0;
        if(año<=2000){
            adeudo = 1500;
        }
        else if(año>=2001 && año<=2005){
            adeudo = 2000;
        }
        else if(año>=2006 && año<=2010){
            adeudo = 2500;
        }
        else if(año>=2011 && año<=2015){
            adeudo = 3000;
        }
        else{
            adeudo = 3500;
        }  
        return adeudo;       
    }
    public void imprimirDatos(){
        System.out.println("ADEUDO VEHICULAR");
        System.out.println("Dueño: "+dueño.toUpperCase());
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Placas: "+placas);
        System.out.println("Año: "+año);
        System.out.println("Tu adeudo es de: $"+calcularReva()+"\n");
    }
}
