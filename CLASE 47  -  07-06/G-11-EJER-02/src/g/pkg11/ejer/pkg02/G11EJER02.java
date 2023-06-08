/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g.pkg11.ejer.pkg02;
import Entidades.Revolver;
import Entidades.Servicios.RevolverServicio;
import Entidades.Servicios.JuegoServicio;

/**
 *
 * @author Pablo
 */
public class G11EJER02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // TODO code application logic here
         
        Revolver treintaYDos = new Revolver();
        RevolverServicio revolverServicio = new RevolverServicio(treintaYDos);
        JuegoServicio juegoServicio = new JuegoServicio();

        System.out.println("Se prepara revolver");
        revolverServicio.llenarRevolver();
        System.out.println("Revolver cargado :"+ treintaYDos.toString());
        System.out.println("Seleccione la cantidad de jugadores: ");
        juegoServicio.llenarJuego(treintaYDos);
        System.out.println("Jugadores :" + juegoServicio.toString());
        System.out.println("Comienza el juego: ");
        juegoServicio.ronda(revolverServicio);

    }

    
}
