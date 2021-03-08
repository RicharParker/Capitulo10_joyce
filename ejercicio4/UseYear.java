/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

/**
 *
 * @author ARCHV
 */
public class UseYear {
    public static void main(String[] args) {
        Year año = new Year();
        LeapYear Laño = new LeapYear();
        
        System.out.println("Numero de dias al año "+año.getDaysYear());
        System.out.println("Numero de dias al año " +Laño.getDaysYear());
    }
    
}
