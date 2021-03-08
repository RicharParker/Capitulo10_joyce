/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

/**
 *
 * @author ARCHV
 */
public class CarRental {
    private String name;
    private Integer zipCode;
    private String size;
    protected double dailyFree;
    private Integer days;
    protected double total;

    public CarRental(String size) {
        if (size.charAt(0)== 'e') {
            dailyFree = 29.99;
        }else if (size.charAt(0)== 'm') {
            dailyFree = 38.99;
        }else{
            dailyFree = 43.50;
        }
    }
    
    public void calcularTotal(Integer days){
        total = dailyFree *days;
    }
    
    public void imprimir(){
        System.out.println("El costo total de tu renta es: "+total);
    }
    

    public String getName() {
        return name;
    }

    public Integer getZipCode() {
        return zipCode;
    }

    public String getSize() {
        return size;
    }

    public Integer getDays() {
        return days;
    }
    
    
    
}
