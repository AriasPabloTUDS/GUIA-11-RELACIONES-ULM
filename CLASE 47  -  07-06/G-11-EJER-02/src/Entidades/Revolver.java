/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;
/**
 *
 * @author Pablo
 */
public class Revolver {
    private Integer posAct;
    private Integer posAgua;

    public Revolver() {
    }

    public Integer getPasAct() {
    return posAct;
    }

    public Integer getPosAgua() {
        return posAgua;
    }

    public void setPosAgua(Integer posAgua) {
        this.posAgua = posAgua;
    }
    public void setPosAct(Integer posAct) {
        this.posAct = posAct;
    }

    @Override
    public String toString() {
        return "Arma{" + "pasAct=" + posAct + ", posH2o=" + posAgua + '}';
    }
}