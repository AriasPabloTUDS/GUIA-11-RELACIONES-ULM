/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.Scanner;
import Entidades.Perro;

/**
 *
 * @author Rodrigo
 */
public class PerroServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private Perro m;

    public Perro crearMascota() {
        m = new Perro();
        System.out.println("Ingrese el nombre del perrro");
        m.setNombre(leer.next());
        System.out.println("Ingrese la edad de la mascota");
        m.setEdad(leer.nextInt());
        System.out.println("Ingrese la raza de la mascota");
        m.setRaza(leer.next());
        System.out.println("Ingrese el tamaño de la mascota");
        m.setTamaño(leer.next());
        return m;
    }

}
