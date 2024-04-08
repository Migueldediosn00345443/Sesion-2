/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import Abstracciones.Personaje;

/**
 *
 * @author migueldedios
 */
    public class Enemigo extends Personaje {

    public int getTipo() {
        return tipo;
    }
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    private int tipo;
    
    public Enemigo(int vidas, int tipo, int nivel) {        
        super (nivel, vidas);
        this.tipo = tipo;        
    }

    public Enemigo() {
    }
    
    }

    

