/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_5_captura_datos;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_5_CAPTURA_DATOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //DECLARAR NUESTRAS VARIABLES
        String nombre;
        int edad;
        //CREAR NUESTRO SCANNER
        Scanner captura = new Scanner (System.in);
        //CAPTURA
        System.out.println("Introduce tu nombre:");
        nombre = captura.nextLine();
        System.out.println("Introduce tu edad:");
        edad = captura.nextInt();
        System.out.println("Tu nombre es:");
        System.out.println(nombre);
        System.out.println("Tu edad es:");
        System.out.println(edad);
                
    }
    
}
