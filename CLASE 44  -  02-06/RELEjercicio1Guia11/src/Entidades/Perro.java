/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
*/
package Entidades;

public class Perro {
    private String Nombre;
    private String Raza;
    private Integer Edad;
    private String tamanio;

    public Perro() {
    }

    public Perro(String Nombre, String Raza, Integer Edad, String Tamaño) {
        this.Nombre = Nombre;
        this.Raza = Raza;
        this.Edad = Edad;
        this.tamanio = Tamaño;
    }


    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    public Integer getEdad() {
        return Edad;
    }

    public void setEdad(Integer Edad) {
        this.Edad = Edad;
    }

    public String getTamaño() {
        return tamanio;
    }

    public void setTamaño(String Tamaño) {
        this.tamanio = Tamaño;
    }

    @Override
    public String toString() {
        return "Perro{" + "Nombre=" + Nombre + ", Raza=" + Raza + ", Edad=" + Edad + ", Tama\u00f1o=" + tamanio + '}';
    }

    
}
