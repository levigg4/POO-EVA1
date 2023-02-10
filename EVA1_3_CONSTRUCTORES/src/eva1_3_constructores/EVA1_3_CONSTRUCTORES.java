package eva1_3_constructores;
///RODRIGO LEVI GARCIA GARAY ////
public class EVA1_3_CONSTRUCTORES {
    
    public static void main(String[] args) {
        ////////////////////////////////////////
        CuentaBancaria user1 = new CuentaBancaria("Elon Musk", "002", 462456789); // usuario creado por medio de constructor (user, account, money)
        /*user1.setUsuario("Ricky Ricon");
        user1.setCuenta("001");
        user1.setSaldo(1000000);*/
        System.out.println("DATOS DEL USUARIO:"); 
        System.out.println("Cliente: " +user1.getUsuario());
        System.out.println("Cuenta: " + user1.getCuenta());
        System.out.println("Saldo: " + user1.getSaldo()+"\n");
        ////////////////////////////////////////
        CuentaBancaria user2 = new CuentaBancaria("Levi Garcia", "003", 27); // usuario creado por medio de constructor (user, account, money)
        System.out.println("DATOS DEL USUARIO:"); 
        System.out.println("Cliente: " +user2.getUsuario());
        System.out.println("Cuenta: " + user2.getCuenta());
        System.out.println("Saldo: " + user2.getSaldo()+ "\n");
        ///////////////////////////////////////
        CuentaBancaria user3 = new CuentaBancaria(); ///usuario creado por medio de constructor "DEFAULT"
        System.out.println("DATOS DEL USUARIO:");
        System.out.println("Cliente: " + user3.getUsuario());
        System.out.println("Cuenta: " + user3.getCuenta());
        System.out.println("Saldo: " + user3.getSaldo() + "\n");
    }
    
}
