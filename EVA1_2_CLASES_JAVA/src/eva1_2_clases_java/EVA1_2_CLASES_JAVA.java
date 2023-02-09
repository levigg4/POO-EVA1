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
public class EVA1_2_CLASES_JAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //@ es igual a "at" 
        // getclass, hash code ... es por herencia POO
        Persona perso1 = new Persona(); // crear objeto 1
        Persona perso2 = new Persona(); // crear otro objeto 2
       //System.out.println(perso1);
        /*
        --ESTA SECCIÓN ES PORQUE INICIAMOS CON LOS --
        --ATRIBUTOS CON MODIFICADOR DEFAULT --
        perso1.nombre = "Levi";
        perso1.apellido = "Garcia";
        perso1.edad = 18;
        perso1.estadoCivil = false; // false es soltero ; true es casado
        
        System.out.println(perso1.nombre);*/
       //set(escribir) de todos los datos del objeto 1
        perso1.setNombre("Rodrigo Levi");
        perso1.setApellido("Garcia Garay");
        perso1.setEdad(18);
        perso1.setEstadoCivil(false);
        //impirmier por medio de un metodo todos los datos
        perso1.imprimirDatos();
        //set (escribir)de todos los dato del objeto 2
        perso2.setNombre("Garigo Garvi");
        perso2.setApellido("Rodcia Leray");
        perso2.setEdad(81);
        perso2.setEstadoCivil(true);
        //impirmir por medio de un metodo todos los datos
        perso2.imprimirDatos();
        
    }  
}
