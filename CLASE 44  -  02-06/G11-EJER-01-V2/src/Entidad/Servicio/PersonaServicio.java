/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad.Servicio;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class PersonaServicio {

    private Persona p1;
    Scanner leer;
    public PersonaServicio() {
        leer = new Scanner(System.in).useDelimiter("\n");
    }
    
    
    
    
    public Persona crearPersona(){
        
        System.out.println("Ingrese nombre: ");
        String nombre = leer.next();
        System.out.println("Ingrese apellido: ");
        String apellido = leer.next();
        System.out.println("Ingrese edad: ");
        Integer edad = leer.nextInt();
        System.out.println("Ingrese DNI: ");
        Integer dni= leer.nextInt();
        p1 = new Persona(nombre, apellido, edad, dni);
        return p1;
    }

    
}
