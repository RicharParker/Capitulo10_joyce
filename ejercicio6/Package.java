/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

/**
 *
 * @author ARCHV
 */
public class Package {
    private final char defaultShipping = 'M';
    private Integer weight;
    private char shippingMethod;
    private double shippingCost;
    
    private final double[] costAir = {2.00, 3.00, 4.50};
    private final double[] costTruck = {1.50, 2.35, 3.25};
    private final double[] costMail = {0.50, 1.50, 2.15};

    public Package(Integer weight , char shippingMethod) {
        setWeight(weight);
        setShippingMethod(shippingMethod);
    }
    
    public void calcularCosto(){
        switch (getShippingMethod()){
            case 'A': if (getWeight()<=8) {
                    shippingCost= costAir[0];
                }else if (getWeight()>=9&& getWeight()<=16) {
                    shippingCost = costAir[1];
                }else if (getWeight()>=17) {
                    shippingCost = costAir[2];
                } break;
                
            case 'T' : if (getWeight()<=8) {
                    shippingCost= costTruck[0];
                }else if (getWeight()>=9&& getWeight()<=16) {
                    shippingCost = costTruck[1];
                }else if (getWeight()>=17) {
                    shippingCost = costTruck[2];
                } break;  
             
              case 'M' : if (getWeight()<=8) {
                    shippingCost= costMail [0];
                }else if (getWeight()>=9&& getWeight()<=16) {
                    shippingCost = costMail [1];
                }else if (getWeight()>=17) {
                    shippingCost = costMail [2];
                } break;    
        }
    }
    public void display(){
        
        System.out.println("El peso es "+ getWeight());
        System.out.println("El metodo de envio es :"+ getShippingMethod() );
        System.out.println("El costo de envio es :" +getShippingCost() );
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public char getShippingMethod() {
        return shippingMethod;
    }

    public void setShippingMethod(char shippingMethod) {
        char caracter;
        String texto;
        
        texto = String.valueOf(shippingMethod);
        texto = texto.toUpperCase();
        caracter = texto.charAt(0);
        
        switch(caracter){
            case'A': case 'T': case 'M' : shippingMethod = caracter; break;
            default : System.out.println("Valor invalido "+caracter);break;
        }
        
    }

    public double getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(double shippingCost) {
        this.shippingCost = shippingCost;
    }
    
    
}
