package eva1_18_sobrecarga_rfc;
//RODRIGO LEVI GARCIA GARAY///

public class EVA1_18_SOBRECARGA_RFC {

    public static void main(String[] args) {
        String rfc = generarRFC("RODRIGO", "GARCIA", "GARAY", 2004, 2, 10);
        String rfc2 = generarRFC("RODRIGO", "GARCIA", 2004, 2, 10);
        String rfc3 = generarRFC("RODRIGO", 2004, 2, 10);

        System.out.println("Tu RFC: " + rfc);
        System.out.println("Tu RFC(falta un apellido): " + rfc2);
        System.out.println("Tu RFC(falta dos apellido): " + rfc3);
    }
    public static String generarRFC(String nombre, String apellidoP, String apellidoM, int año, int mes, int dia){
        String apP1 = apellidoP.charAt(0) + "";
        String apP2 = apellidoP.charAt(1) + "";
        String apM = apellidoM.charAt(0) + "";
        String nom = nombre.charAt(0) + "";
        String rfc = apP1+ apP2 + apM + nom + año + mes + dia + "";
        return rfc;
    }
    public static String generarRFC(String nombre, String apellidoP, int año, int mes, int dia){
        String apP1 = apellidoP.charAt(0) + "";
        String apP2 = apellidoP.charAt(1) + "";
        String apM = "X";
        String nom = nombre.charAt(0) + "";
        String rfc = apP1+ apP2 + apM + nom + año + mes + dia + "";
        return rfc;
    }
    public static String generarRFC(String nombre, int año, int mes, int dia){
        String apP = "X";
        String apM = "X";
        String nom = nombre.charAt(0) + "";
        String rfc = apP + apM + nom + año + mes + dia + "";
        return rfc;
    }
    
}
