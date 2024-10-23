/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ex01.adapterpinos;

/**
 *
 * @author rafaelamoreira
 */
public class AdapterPinos {

    public static void main(String[] args) {

        BuracoRedondo buraco = new BuracoRedondo(5);

        PinoRedondo pinoRedondo = new PinoRedondoConcreto(5);
        System.out.println("Pino redondo de raio 5 encaixa: " + buraco.encaixa(pinoRedondo));

        PinoQuadrado pequenoPinoQuadrado = new PinoQuadrado(5);
        PinoRedondo adaptadorPinoQuadradoPequeno = new AdaptadorPinoQuadrado(pequenoPinoQuadrado);
        System.out.println("Pino quadrado de largura 5 encaixa: " + buraco.encaixa(adaptadorPinoQuadradoPequeno));

        PinoQuadrado grandePinoQuadrado = new PinoQuadrado(10);
        PinoRedondo adaptadorPinoQuadradoGrande = new AdaptadorPinoQuadrado(grandePinoQuadrado);
        System.out.println("Pino quadrado de largura 10 encaixa: " + buraco.encaixa(adaptadorPinoQuadradoGrande));
    }
}
