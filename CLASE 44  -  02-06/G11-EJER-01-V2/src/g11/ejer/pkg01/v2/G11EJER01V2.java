/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g11.ejer.pkg01.v2;

import Entidad.Perro;
import Entidad.Persona;
import Entidad.Servicio.PerroServicio;
import Entidad.Servicio.PersonaServicio;

/**
 *
 * @author Pablo
 */
public class G11EJER01V2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        PersonaServicio ps = new PersonaServicio();
        Persona pers1;
        Persona pers2;
        Perro perro1;
        Perro perro2;
        
        
        pers1= ps.crearPersona();
        pers2= ps.crearPersona();
        
        System.out.println("P1 "+pers1.toString());
        System.out.println("P2 "+pers2.toString());
        
        PerroServicio perroS = new PerroServicio();
        
        perro1 = perroS.crearPerro();
        perro2 = perroS.crearPerro();
        
        System.out.println("perro1 "+perro1.toString());
        System.out.println("perro2 "+perro2.toString());
        
        System.out.println("Agregar perro1 a persona 1");
        pers1.setMascota(perro1);
        
        System.out.println("Agregar perro1 a persona 2");
        pers2.setMascota(perro2);
        
        
        System.out.println("P1 "+pers1.toString());
        System.out.println("P2 "+pers2.toString());
        
        
    }
    
}
