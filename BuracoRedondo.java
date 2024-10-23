/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex01.adapterpinos;

/**
 *
 * @author rafaelamoreira
 */
public class BuracoRedondo {
    private double raio;

    public BuracoRedondo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    // Verifica se um pino redondo se encaixa no buraco
    public boolean encaixa(PinoRedondo pino) {
        return this.raio >= pino.getRaio();
    }
}
