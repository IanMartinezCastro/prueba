/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author user
 */
public class CPU {
    pila tropasDisponibles;
    cola caminoCPU;

    public CPU() {
    }

    public CPU(pila tropasDisponibles, cola caminoCPU) {
        this.tropasDisponibles = tropasDisponibles;
        this.caminoCPU = caminoCPU;
    }

    public pila getTropasDisponibles() {
        return tropasDisponibles;
    }

    public void setTropasDisponibles(pila tropasDisponibles) {
        this.tropasDisponibles = tropasDisponibles;
    }

    public cola getCaminoCPU() {
        return caminoCPU;
    }

    public void setCaminoCPU(cola caminoCPU) {
        this.caminoCPU = caminoCPU;
    }
    
    
}
