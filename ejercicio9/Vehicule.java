/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

/**
 *
 * @author ARCHV
 */
public class Vehicule {
    protected Integer wheelNumber;
    protected Integer milesxGallon;

    public Vehicule(Integer wheelNumber, Integer milesxGallon) {
        this.wheelNumber = wheelNumber;
        this.milesxGallon = milesxGallon;
     
    }
    
    
    
    public void display() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Llantas: " + this.wheelNumber + " Millas por galon: " + this.milesxGallon;
    }
}

