
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Persona p1;
        Dni dniP1;
        
        System.out.println("Crear Persona");
        System.out.println("Ingrese nombre: ");
        String nom = leer.next();
        System.out.println("Ingrese Apellido: ");
        String ape = leer.next();
        System.out.println("Ingrese el tipo de Dni: ");
        String tipoDni = leer.next();
        System.out.println("Ingrese el Dni: ");
        Integer dni = leer.nextInt();
        dniP1 = new Dni(tipoDni, dni);
        p1 = new Persona(nom, ape, dniP1);
        
        System.out.println("Datos de la persona: ");
        System.out.println(p1.toString());
    }
    
    
}
