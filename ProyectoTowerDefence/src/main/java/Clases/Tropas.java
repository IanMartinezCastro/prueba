/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author user
 */
public class Tropas {
    String tipo;
    int puntosDeVida;
    float puntosDeDanno;

    public Tropas() {
    }

    public Tropas(String tipo, int puntosDeVida, float puntosDeDanno) {
        this.tipo = tipo;
        this.puntosDeVida = puntosDeVida;
        this.puntosDeDanno = puntosDeDanno;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }

    public void setPuntosDeVida(int puntosDeVida) {
        this.puntosDeVida = puntosDeVida;
    }

    public float getPuntosDeDanno() {
        return puntosDeDanno;
    }

    public void setPuntosDeDanno(float puntosDeDanno) {
        this.puntosDeDanno = puntosDeDanno;
    }
    
    
}
