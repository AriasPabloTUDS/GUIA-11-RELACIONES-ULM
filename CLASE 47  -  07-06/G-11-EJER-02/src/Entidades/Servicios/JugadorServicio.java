/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades.Servicios;

import Entidades.Jugador;

/**
 *
 * @author Pablo
 */
public class JugadorServicio {

    private RevolverServicio RevolverS;
    private Jugador j;

    public JugadorServicio(RevolverServicio revolver) {
        RevolverS = new RevolverServicio();
        this.j = new Jugador();
        this.RevolverS = revolver;
    }


    public Boolean disparo(RevolverServicio revolver){
        boolean verif = false;
        if (revolver.mojar()) {
            j.setMojado(true);
            verif = true;
        }

        return verif;
    }

}
