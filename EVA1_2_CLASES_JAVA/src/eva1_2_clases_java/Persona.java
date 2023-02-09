/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_2_clases_java;

/**
 *
 * @author invitado
 */
public class Persona {
   //ATRIBUTOSD DE LA CALSE
    //lo encapsula con el private
    private String nombre;
    private String apellido;
    private int edad;
    private boolean estadoCivil; //true es casado 
    //METODOS: COMPORTAMIENTO 
    //Lectura y escritura de atributos:
    //Método get --> leer
    //Método set --> escribir
    /*metodos:
    modificador valor de retorno nombre (argumentos) {
    impelmentación
    }*/
    //set y get para atravesar el acceso privado
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String name){
        nombre = name ;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int age){
        edad = age;
    }
    public String getApellido(){
        return apellido;
    }
    public void setApellido(String last){
        apellido = last ;
    }
    public boolean getEstadoCivil(){
        return estadoCivil;
    }
    public void setEstadoCivil(boolean valor){
        estadoCivil = valor ;
    }
    
    public void imprimirDatos(){ //Este metodo imprimi los datos de la clase persona y sus objetos 
        System.out.println("Datos Almacenados:");
        System.out.println("Nombre Completo: " + nombre + " " + apellido); //concatenacion
        System.out.println("Edad: " + edad);
        if(estadoCivil) //el valor es true asi que el caso primero es casado; lo contrario es soltero
            System.out.println("Estado Civil: Casado\n");
        else 
            System.out.println("Estado Civil: Soltero\n");        
    }
}
