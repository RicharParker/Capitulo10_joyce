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
public class Candle {
    private String color;
    private Integer height;
    protected double price;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        double pricexInch = 2;
        this.height = height;
        this.price= height * pricexInch;
    }

    public double getPrice() {
        return price;
    }

    
    
    
}
