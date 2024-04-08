/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import Abstracciones.Elemento;

/**
 *
 * @author migueldedios
 */
public class Bala extends Elemento {
    
    
    public int getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    
    private int tipo;

    public Bala(int nivel, int tipo) {
        super(nivel);
        this.tipo = tipo;
    }

    public Bala() {
    }

    
}

    

