/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import Abstracciones.Personaje;
import java.security.Permission;

/**
 *
 * @author migueldedios
 */
public class Nave extends Personaje {

    public Nave() {
    }

    public int getPuntaje() {
        return puntaje;
    }

    /**
     * @param puntaje the puntaje to set
     */
    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
    
  
  
    private int puntaje;

    public Nave(int vidas, int nivel, int puntaje) {
        super (nivel,vidas);
        this.puntaje = puntaje;
    }
    
    
}
