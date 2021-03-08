/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author ARCHV
 */
public class DemoTennisGames {
    public static void main(String[] args) {
        TennisGame juego1 = new TennisGame();
        juego1.darNombres("Maria", " Jose");
        juego1.darPuntaje(4 , 3);
        juego1.imprimir();
        
        System.out.println("");
        
        DoublesTennisGame juego2 = new DoublesTennisGame();
        juego2.darNombres("Jonatan", "Hal", "Mario", "Robert");
        juego2.darPuntaje(4, 1);
        juego2.imprimir();
    }
}
