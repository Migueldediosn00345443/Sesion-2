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
public class Espacio extends Elemento {
    
    private int tiempo;

    public Espacio(int tiempo, int ambiente, int nivel) {
        super(nivel);
        this.tiempo = tiempo;
        this.ambiente = ambiente;
    }
   
    private int ambiente;

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public int getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(int ambiente) {
        this.ambiente = ambiente;
    }

    public Espacio() {}
    
}
