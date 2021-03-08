/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

/**
 *
 * @author ARCHV
 */
public class DemoCabinRental {
    public static void main(String[] args) {
        CabinRental cabaña1 = new CabinRental(2);
        System.out.println("La renta semanal por la cabaña es: "+cabaña1.getWeeklyRentalRate());
        
        HolidayCabinRental cabaña2 = new HolidayCabinRental(3);
        System.out.println("La renta semanal por la cabaña vacional es :  "+cabaña2.getWeeklyRentalRate());

    }
}
