/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author ARCHV
 */
public class DemoCandles {
    public static void main(String[] args) {
        Candle vela = new Candle();
        ScentedCandle aroma = new ScentedCandle();
        
        vela.setColor("Amarillo");
        vela.setHeight(4);
        
        aroma.setColor("Blanca");
        aroma.setHeight(4);
        aroma.setScent("Vainilla");
        
        System.out.println(vela.getColor());
        System.out.println(vela.getHeight());
        System.out.println(vela.getPrice());
        
        System.out.println("");
        
        System.out.println(aroma.getColor());
        System.out.println(aroma.getHeight());
        System.out.println(aroma.getScent());
        System.out.println(aroma.getPrice());
        
       
    }
}
