/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author user
 */
public class Juego {
    Jugador jugador;
    Jugador cpu1,cpu2,cpu3;
    int progeso;

    public Juego() {
    }

    public Juego(Jugador jugador, Jugador cpu1, Jugador cpu2, Jugador cpu3, int progeso) {
        this.jugador = jugador;
        this.cpu1 = cpu1;
        this.cpu2 = cpu2;
        this.cpu3 = cpu3;
        this.progeso = progeso;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public Jugador getCpu1() {
        return cpu1;
    }

    public void setCpu1(Jugador cpu1) {
        this.cpu1 = cpu1;
    }

    public Jugador getCpu2() {
        return cpu2;
    }

    public void setCpu2(Jugador cpu2) {
        this.cpu2 = cpu2;
    }

    public Jugador getCpu3() {
        return cpu3;
    }

    public void setCpu3(Jugador cpu3) {
        this.cpu3 = cpu3;
    }

    public int getProgeso() {
        return progeso;
    }

    public void setProgeso(int progeso) {
        this.progeso = progeso;
    }
    
}
