/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstracciones;

/**
 *
 * @author migueldedios
 */
public class Personaje extends Elemento  {
    
    private int vida; 
    
    public Personaje() { }


    public Personaje(int nivel, int vida) {
        super (nivel);
        this.vida = vida;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida, int nivel ) {
       
        this.vida = vida;
    }

    
    
}
