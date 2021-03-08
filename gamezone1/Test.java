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
public class Test {
    public static void main(String[] args) {
        Alien personaje = new Martian(4,8,"Verde");
        System.out.println(personaje.toString());
        
        Alien personaje2 = new Jupiterian (4,3,"Rosa");
        System.out.println(personaje.toString());
    }
}
