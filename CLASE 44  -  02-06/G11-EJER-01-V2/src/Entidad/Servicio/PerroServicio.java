/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad.Servicio;

import Entidad.Perro;
import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class PerroServicio {
    
    Perro p1;
    Scanner leer = new Scanner(System.in);
    
    public Perro crearPerro(){
        
        System.out.println("Ingrese nombre: ");
        String nombre = leer.next();
        System.out.println("Ingrese raza: ");
        String raza = leer.next();
        System.out.println("Ingrese edad: ");
        Integer edad = leer.nextInt();
        System.out.println("Ingrese tamaño: ");
        String tamanio= leer.next();
        p1 = new Perro(nombre, raza, edad, tamanio);
        return p1;
    }
    
}
