/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.Scanner;
import Entidades.Persona;

public class PersonaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private Persona p;
    

    public Persona crearPersona() {
        p = new Persona();
        System.out.println("Ingrese el nombre de la persona");
        p.setNombre(leer.next());
        System.out.println("Ingrese el apellido de la persona");
        p.setApellido(leer.next());
        System.out.println("Ingrese el DNI de la persona");
        p.setDNI(leer.nextInt());
        System.out.println("Ingrese la edad de la persona");
        p.setEdad(leer.nextInt());
        return p;
       
    }

    
    public void print() {
        System.out.println(p.toString());
    }

}
