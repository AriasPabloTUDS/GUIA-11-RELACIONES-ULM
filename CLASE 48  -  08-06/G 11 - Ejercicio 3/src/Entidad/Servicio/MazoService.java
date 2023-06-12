package Entidad.Servicio;

import Entidad.Carta;
import Entidad.Mazo;
import Enum.Palo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class MazoService {

    private final Mazo montonPrin;
    private final Mazo montonEntreg;
    private final Scanner leer;

    public MazoService() {
        montonPrin = new Mazo();//acá se guardarán las cartas del mazo principal
        montonEntreg = new Mazo();//acá se guardarán las cartas entregadas
        leer = new Scanner(System.in);
    }

    /*
     * Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1 y 12 (el 8 y el 9 no los incluimos) 
     *y un palo (espadas, bastos, oros y copas). Esta clase debe contener un método toString() que retorne el número de carta y el palo. 
     *La baraja estará compuesta por un conjunto de cartas, 40 exactamente.
     */
    public Mazo crearMazo() {

        ArrayList<Carta> carMonton = new ArrayList<>();
        ArrayList<Carta> carEntregadas = new ArrayList<>();
        montonEntreg.setCartas(carEntregadas);

        for (Palo elemento : Palo.values()) {//Palo es una clase unum para predefinir los 4 palos del mazo este bucle usa cada palo
            //para iterar y crear 12 cartas por cada palo del mazo
            String palo = elemento.getNombre();//el palo actual se guarda en un auxiliar elemento
            for (int i = 0; i < 12; i++) {
                if (i + 1 == 8 || i + 1 == 9) {
                    //Este if filtra los 8 y 9 de las iteraciones para no crear cartas con esos dos números
                } else {
                    Carta carta = new Carta(i + 1, elemento); //Crear una carta con el constructor con parametros de la clase carta
                    carMonton.add(carta);//la carta creada se guarda en el arraylist car monton
                }
            }
        }
        montonPrin.setCartas(carMonton);//ya todas las cartas cradas y puestas dentro de carMonton se las pasamos a montonPrin con un set
        System.out.println("Baraja iniciada");
        System.out.println(montonPrin.toString());

        return montonPrin;

    }

    /*
    barajar(): cambia de posición todas las cartas aleatoriamente.
     */
    public void barajar() {
        Collections.shuffle(montonPrin.getMazo());
    }

    /*
     * siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o se haya llegado al final, se indica 
     * al usuario que no hay más cartas.
     */
    public void siguienteCarta() {

        if (montonPrin.getMazo().size() > 1) {
            System.out.println(montonPrin.getMazo().get(0));
        } else {
            System.out.println("No hay más cartas para mostrar");
        }
    }

    /*
     * cartasDisponibles(): indica el número de cartas que aún se puede repartir.
     */
    public Integer cartasDisponibles() {
        return montonPrin.getMazo().size();
    }

    /*
     * darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
     *cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
     *debemos indicárselo al usuario.
     */
    public void darCartas() {
        System.out.println("Seleccione la cantidad de cartas a recibir: ");
        int cant = leer.nextInt();

        if (cant <= montonPrin.getMazo().size()) {
            for (int i = 0; i < cant; i++) {
                System.out.println("se entrega el " + montonPrin.getMazo().get(i).toString() + " al jugador");
            }
            for (int i = 0; i < cant; i++) {
                montonEntreg.getMazo().add(montonPrin.getMazo().get(0));
                montonPrin.getMazo().remove(0);
            }
        } else {
            System.out.println("Cartas insuficientes. No se entregó ninguna carta al jugador");
            cartasDisponibles();
        }
    
    }

    /*
     *cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
     *indicárselo al usuario
     */
    public void cartasMonton() {
        if (montonEntreg.getMazo().size() == 1) {
            System.out.println("Las carta que salio hasta ahora es: ");
            System.out.println(montonEntreg.getMazo());
        } else if (montonEntreg.getMazo().size() > 1) {
            System.out.println("Las cartas que salieron hasta ahora son: ");
            System.out.println(montonEntreg.getMazo());
        } else if (montonEntreg.getMazo().isEmpty()) {
            System.out.println("No han salido cartas por ahora");
        }
    }

    /*
     * mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
     *luego se llama al método, este no mostrara esa primera carta.
     */
    public void mostrarBaraja() {
        System.out.println("Se muestra el mazo");
        //montonPrin.getMazo().toString();
        for (Palo elemento : Palo.values()) {
            System.out.println("");
            System.out.println(elemento.toString());
            for (int i = 0; i < montonPrin.getMazo().size(); i++) {
                //System.out.print(montonPrin.getMazo().get(i));
                if (elemento.getNombre().equals(montonPrin.getPaloStrin(i))) {
                    System.out.print(montonPrin.getMazo().get(i));
                } 
            }
        }
    }

    /*
     * Menú para seleccionar las opciones
     */
    public void menu() {
        System.out.println("");
        System.out.println("----- MENU -----");
        System.out.println("Seleccione una opción: ");
        System.out.println("1 Ver cartas en el mazo");
        System.out.println("2 Ver siguiente carta");
        System.out.println("3 Ver cartas ya usadas");
        System.out.println("4 Pedir cartas");
        System.out.println("5 Barajar el mazo");
        System.out.println("6 Salir del programa");
        System.out.println("");
        String opc = leer.next();
        switch (opc) {
            case "1":
                mostrarBaraja();
                menu();
                break;
            case "2":
                siguienteCarta();
                menu();
                break;
            case "3":
                cartasMonton();
                menu();
                break;
            case "4":
                darCartas();
                menu();
                break;
            case "5":
                barajar();
                System.out.println("Mazo barajado");
                menu();
                break;
            case "6":
                System.out.println("Saliendo del programa");
                break;
            default:
                System.out.println("Opcion inválida");
                ;
                menu();
        }

    }
}
