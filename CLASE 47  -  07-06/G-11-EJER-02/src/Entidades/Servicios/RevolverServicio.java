/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades.Servicios;

import Entidades.Revolver;

/**
 *
 * @author Pablo
 */
public class RevolverServicio {

    private Revolver revolver;

    public RevolverServicio(Revolver rev) {
        this.revolver = rev;
    }

    RevolverServicio() {
    }

    public void llenarRevolver() {
        Integer posran1 = (int) (Math.random() * 6 + 1);
        Integer posran2 = (int) (Math.random() * 6 + 1);

        revolver.setPosAct(posran1);
        revolver.setPosAgua(posran2);

    }

    public Boolean mojar() {
        Boolean mojar;
        if (revolver.getPasAct().equals(revolver.getPosAgua())) {
            mojar = true;
        } else {
            mojar = false;
        }

        return mojar;

    }

    public void mostrarPosiciones() {
        System.out.println("posición actual: " + revolver.getPasAct());
        System.out.println("posición de agua:  " + revolver.getPosAgua());

    }

    public void siguienteChorro() {
        if (revolver.getPasAct() == 6) {
            revolver.setPosAct(1);
        } else {
            revolver.setPosAct(revolver.getPasAct() + 1);
        }

    }

    public Integer posicionBalaDeAgua() {
        return revolver.getPosAgua();
    }

    public Integer posicionTambor() {
        return revolver.getPasAct();
    }

}
