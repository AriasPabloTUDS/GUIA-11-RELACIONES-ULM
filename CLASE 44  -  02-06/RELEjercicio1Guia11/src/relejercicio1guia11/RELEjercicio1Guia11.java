/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
package relejercicio1guia11;

import Entidades.Perro;
import Entidades.Persona;
import Servicios.PerroServicio;
import Servicios.PersonaServicio;


public class RELEjercicio1Guia11 {

    public static void main(String[] args) {

        PersonaServicio PS = new PersonaServicio();
        PerroServicio PR = new PerroServicio();

        Persona P1 = PS.crearPersona();
        Persona P2 = PS.crearPersona();
        Perro m1 = PR.crearMascota();
        Perro m2 = PR.crearMascota();

        P1.setMascota(m1);
        P2.setMascota(m2);

        System.out.println("Persona 1 = " + P1.toString());
        System.out.println("Persona 2 = " + P2.toString());
    }

}
