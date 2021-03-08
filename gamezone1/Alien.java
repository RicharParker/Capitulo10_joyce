/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamezone1;

/**
 *
 * @author ARCHV
 */
public class Alien {
    private Integer numbreEyes;
    private Integer numberFoot;
    private String color;

    public Alien(Integer numbreEyes, Integer numberFoot, String colot) {
        this.numbreEyes = numbreEyes;
        this.numberFoot = numberFoot;
        this.color = color;
    }
    
    @Override
    public String toString() {
        return "Alien{" +
                "numero de Ojos;" + numbreEyes +
                ", numero de pies:" + numberFoot +
                ", color:'" + color + '\'' +
                '}';
    }
    
}
