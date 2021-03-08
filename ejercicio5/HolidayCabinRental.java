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
class HolidayCabinRental extends CabinRental {
	
	private final int surcharge = 150;

	public HolidayCabinRental(Integer cabinNumber) {
		super(cabinNumber);
		añadirRecargo();
	}
	
	public void añadirRecargo(){
		weeklyRentalRate = weeklyRentalRate + surcharge;
	}
	
}

