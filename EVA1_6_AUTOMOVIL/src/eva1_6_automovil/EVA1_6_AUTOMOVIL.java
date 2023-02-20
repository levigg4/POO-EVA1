package eva1_6_automovil;
///RODRIGO LEVI GARCIA GARAY ////

public class EVA1_6_AUTOMOVIL {

    public static void main(String[] args) {
        Autos auto1 = new Autos();
        auto1.setMarca("Nissan");
        auto1.setModelo("GTR");
        auto1.setPlacas("Y3-S-IR");
        auto1.setDueño("Levi Garcia");
        auto1.setAño(2023);
        auto1.imprimirDatos();
        Autos auto2 = new Autos("Honda", "Civic", "GAG-R04", 2006, "Rodrigo Garay");
        auto2.setAño(2004);
        auto2.imprimirDatos();
        Autos auto3 = new Autos();
        auto3.imprimirDatos();
    }
}
