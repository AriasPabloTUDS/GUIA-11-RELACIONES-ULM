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
public class Jugador {
    private Integer id;
    private String nombre;
    private boolean mojado;
    

    public Jugador() {
    }
    
    public Jugador(Integer id) {
        this.id = id;
        String ids = this.id.toString();
        ids = "Jugador ".concat(ids);
        this.nombre = ids;
        this.mojado = false;
    }

    
    
    public boolean getMojado() {
        return mojado;
    }
    
    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", nombre=" + nombre + ", mojado=" + mojado + '}';
    }
    
    
    

}