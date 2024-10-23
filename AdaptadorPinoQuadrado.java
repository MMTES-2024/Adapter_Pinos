/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex01.adapterpinos;

/**
 *
 * @author rafaelamoreira
 */
public class AdaptadorPinoQuadrado implements PinoRedondo{

    private PinoQuadrado pinoQuadrado;

    public AdaptadorPinoQuadrado(PinoQuadrado pinoQuadrado) {
        this.pinoQuadrado = pinoQuadrado;
    }

    @Override
    public double getRaio() {
        
        return (pinoQuadrado.getLargura() * Math.sqrt(2)) / 2;
    }
    
}
