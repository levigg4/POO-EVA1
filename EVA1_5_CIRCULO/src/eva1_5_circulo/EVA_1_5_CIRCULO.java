package eva1_5_circulo;
import java.util.Scanner;
public class EVA_1_5_CIRCULO{
	public static void main(String[] args) {
	    ///CREACION DE CIRCULO////
	    //////creado por Set Manualmente///////
		Circulo Circle1 = new Circulo(); 
		double r1 = 5.46;
		Circle1.setRadio(r1);
		double a1 = Circle1.getArea();
		double p1 = Circle1.getPerimetro();
		Circle1.imprimirDatos(r1, a1, p1);
		///// creado por un constructor DEFAULT ///////
		Circulo Circle2 = new Circulo(); 
		double r2 = Circle2.getRadio();
		double a2 = Circle2.getArea();
		double p2 = Circle2.getPerimetro();
		Circle2.imprimirDatos(r2, a2, p2);
		////creado por constructor  circulo (double rad) //////
		Circulo Circle3 = new Circulo(3);
		double r3 = Circle3.getRadio();
		double a3 = Circle3.getArea();
		double p3 = Circle3.getPerimetro();
		Circle3.imprimirDatos(r3, a3, p3);
		////creado por Set Scanner //////
		Scanner sc = new Scanner(System.in); //creacion del scanner 
		System.out.print("Ingrese su radio: ");
		Circulo Circle4 = new Circulo();
		double r4 = sc.nextDouble();
		Circle4.setRadio(r4);
		double a4 = Circle4.getArea();
		double p4 = Circle4.getPerimetro();
		Circle4.imprimirDatos(r4, a4, p4);
	}
}