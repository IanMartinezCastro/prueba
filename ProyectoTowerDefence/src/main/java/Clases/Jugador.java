/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author user
 */
public class Jugador {
    Castillo castillo;
    pila tropasDispnibles;
    cola caminoJugador;

    public Jugador() {
    }

    public Jugador(Castillo castillo, pila tropasDispnibles, cola caminoJugador) {
        this.castillo = castillo;
        this.tropasDispnibles = tropasDispnibles;
        this.caminoJugador = caminoJugador;
    }

    public Castillo getCastillo() {
        return castillo;
    }

    public void setCastillo(Castillo castillo) {
        this.castillo = castillo;
    }

    public pila getTropasDispnibles() {
        return tropasDispnibles;
    }

    public void setTropasDispnibles(pila tropasDispnibles) {
        this.tropasDispnibles = tropasDispnibles;
    }

    public cola getCaminoJugador() {
        return caminoJugador;
    }

    public void setCaminoJugador(cola caminoJugador) {
        this.caminoJugador = caminoJugador;
    }
    
    
}
