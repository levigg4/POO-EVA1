package eva1_3_constructores;
//RODRIGO LEVI GARCIA GARAY //
public class CuentaBancaria {
    //ATRIBUTOS
    private String usuario; // nombre del cliente rodrigo levi garcia garay 
    private String cuenta; //numero de cuenta 41250379658774
    private double saldo = 0; //cuanto dinero tiene... $100.00
    //CONSTRUCTORES
    //default y con argumemtos / todos se deben de llamar de la misma manera
    public CuentaBancaria (){ //este es el DEFAUKT 
        usuario = "----";
        cuenta = "----";
        saldo = 0;
    }
    // pide los datos directos desde la creacion del objeto 
    public CuentaBancaria(String user, String account, double money){ // se diferencia por lo que esta en el parentesis 
        usuario = user;
        cuenta = account;
        saldo = money;     
    }
    //METODOS get y set
    public String getUsuario (){
        return usuario;
    }
    public String getCuenta (){
        return cuenta;
    }
    public double getSaldo (){
        return saldo;
    }
    public void setUsuario (String user){
        usuario = user;
    }
    public void setCuenta (String account){
       cuenta = account;
    }
    public void setSaldo (double money){
        saldo = money;
    }
    /*public void imprimirDatos(){
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }*/
}
