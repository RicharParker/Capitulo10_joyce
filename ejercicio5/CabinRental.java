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
public class CabinRental {
        private Integer cabinNumber;
	protected double weeklyRentalRate;
	
	
	public CabinRental( Integer cabinNumber) {
		this.cabinNumber = cabinNumber;
		calcularxSemana();
	}
	
	public void calcularxSemana(){
		if(cabinNumber > 0 && cabinNumber <= 3) {
			weeklyRentalRate = 950;
		} else {
			weeklyRentalRate = 1100;
		}
	}
	
	public Integer getCabinNumber() {
		return cabinNumber;
	}
	
	public double getWeeklyRentalRate() {
		return weeklyRentalRate;
	}
	
    
}
