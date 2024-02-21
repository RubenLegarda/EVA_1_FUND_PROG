/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_6_asignatura;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_6_ASIGNATURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //clave, nombre, creditos, hrTeo, hrPr, carrera
        //tipoMat
        String clave, nombre, carrera;
        int creditos, horasTeo, horasPrac;
        boolean tipoMat;
        Scanner captu = new Scanner(System.in);
        System.out.println("Introduce la clave de la asignatura");
        clave = captu.nextLine();
        System.out.println("Introduce el nombre de la asignatura");
        nombre = captu.nextLine();
        System.out.println("Introduce el nombre de la carrera");
        carrera = captu.nextLine();
        System.out.println("Introduce el numero de creditos");
        creditos = captu.nextInt();
        System.out.println("Introduce las horas de teoria");
        horasTeo = captu.nextInt();
        System.out.println("Introduce las horas de practica");
        horasPrac = captu.nextInt();
        System.out.println("Introduce tipo de asignatura [true --> genereica, false --> especialidad]");
        tipoMat = captu.nextBoolean();
        
        //HACER ALGO CON LOS DATOS CAPTURADOS
        System.out.println("DATOS DE LA ASIGNATURA");
        System.out.println(clave);
        System.out.println(nombre);
        System.out.println(carrera);
        System.out.println(creditos);
        System.out.println(horasTeo);
        System.out.println(horasPrac);
        System.out.println(tipoMat);
    }
    
}
