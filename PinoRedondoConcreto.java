/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex01.adapterpinos;

/**
 *
 * @author rafaelamoreira
 */
public class PinoRedondoConcreto implements PinoRedondo{

    private double raio;

    public PinoRedondoConcreto(double raio) {
        this.raio = raio;
    }

    @Override
    public double getRaio() {
        return raio;
    }
    
}
