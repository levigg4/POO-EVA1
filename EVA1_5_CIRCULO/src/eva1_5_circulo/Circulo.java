package eva1_5_circulo;
//RODRIGO LEVI GARCIA GARAY//

public class Circulo{
    private double radio;
    private double area;
    private double perimetro;
    //CONSTRUCTORES
    public Circulo (){ //Default
        radio = 0;  // ya que no existe el circulo valdra 0
    }
    public Circulo(double rad){ //Pide el dato radio directo
        radio = rad;
    }
    //METODOS
    public double getRadio(){ //me da el radio 
        return radio;
    }
    public double getArea(){ //me da el area
        area = (radio*radio*Math.PI);
        return area;
    }
    public double getPerimetro(){ //me da el perimetro 
        perimetro = (radio*2*Math.PI);
        return perimetro;
    }
    public void setRadio(double valor){ //le otorga el valor al radio 
        radio = valor;
    }
    public void imprimirDatos(double valor1, double valor2, double valor3){ //impirme los datos que son
        System.out.println("Tu radio: "+valor1);                            //enviados desde el main
        System.out.println("Tu area: "+valor2);
        System.out.println("Tu perimetro: "+valor3+"\n");
    }
 
}