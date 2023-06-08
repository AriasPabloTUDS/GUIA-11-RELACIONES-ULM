/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades.Servicios;

/**
 *
 * @author Pablo
 */
import Entidades.Revolver;
import Entidades.Jugador;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;


public class JuegoServicio {
    private Scanner leer ;
    private Jugador j;
    private ArrayList<Jugador> jugadores;

    public JuegoServicio() {
        leer = new Scanner(System.in).useDelimiter("\n");
        jugadores = new ArrayList();
    }


    public void llenarJuego( Revolver revolver){
        int cant = 0;
        System.out.println("Ingrese la cantidad de jugadores entre 2 y 6");
        cant = leer.nextInt();
        if (cant >=2 && cant <=6) {
            for (int i = 0; i < cant; i++) {
            //System.out.println("Jugador "+(i+1));
            j = new Jugador(i+1);
            jugadores.add(j);
        }
        } else System.out.println("error ingrese de 2 a 6 jugadores");

    }

    public boolean ronda(RevolverServicio rvServicio){
        boolean juegoSigue = true;
        int turno = 0;
        while (juegoSigue) {

            if (turno == jugadores.size()){
                turno = 0;
            }
            System.out.println("El " + jugadores.get(turno).toString() + " procede a disparar");
            if(Objects.equals(rvServicio.posicionTambor(), rvServicio.posicionBalaDeAgua())) {
                System.out.println("Mojado perdiste!!");
                juegoSigue = false;
            } else {
                System.out.println("Uh se salvo ");
                juegoSigue = true;
                rvServicio.siguienteChorro();
                turno ++;
            }
        }

        return juegoSigue;
    }

    @Override
    public String toString() {
        return "JuegoServicio{" + "jugadores=" + jugadores + '}';
    }
}