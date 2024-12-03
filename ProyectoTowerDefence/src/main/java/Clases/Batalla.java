/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author user
 */
public class Batalla {
    Jugador jugador;
    Jugador CPU;
    cola caminoJugador;
    cola camunoCPU;

    public Batalla() {
    }

    public Batalla(Jugador jugador, Jugador CPU, cola caminoJugador, cola camunoCPU) {
        this.jugador = jugador;
        this.CPU = CPU;
        this.caminoJugador = caminoJugador;
        this.camunoCPU = camunoCPU;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public Jugador getCPU() {
        return CPU;
    }

    public void setCPU(Jugador CPU) {
        this.CPU = CPU;
    }

    public cola getCaminoJugador() {
        return caminoJugador;
    }

    public void setCaminoJugador(cola caminoJugador) {
        this.caminoJugador = caminoJugador;
    }

    public cola getCamunoCPU() {
        return camunoCPU;
    }

    public void setCamunoCPU(cola camunoCPU) {
        this.camunoCPU = camunoCPU;
    }
    
    
    
}
