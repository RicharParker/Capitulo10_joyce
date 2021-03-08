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
public class InsuredPackage extends Package{
    private final double[] insure = {2.45, 3.95, 5.55};
    private double shippingBefore;
    private double shippingCost;
    private double insuranceCost;

    public InsuredPackage(Integer weight, char shippingMethod) {
        super(weight, shippingMethod);
        
        this.calcularCosto();
    }
    
    @Override
    public void calcularCosto(){
        shippingBefore = super.getShippingCost();
        if (shippingBefore<=1.0) {
            insuranceCost = insure[0];
        }else if (shippingBefore>=1.0&&shippingBefore<=3.0) {
            insuranceCost = insure[1];
        }else if (shippingBefore>=3.0) {
            insuranceCost = insure[2];
        }
        shippingCost = shippingBefore + shippingBefore;
    }
    
    public void imprimir (){
        System.out.println("el peso es : "+super.getWeight());
        System.out.println("El metodo de envio es : "+super.getShippingMethod());
        System.out.println("El costo de adicion es : "+insuranceCost);
        System.out.println("El costo total : " +shippingCost);
    }
    
    
}
