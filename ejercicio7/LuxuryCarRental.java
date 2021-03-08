/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import java.util.Scanner;

/**
 *
 * @author ARCHV
 */
public class LuxuryCarRental extends CarRental {

    public LuxuryCarRental(String size) {
        super(size);
    }
    

    @Override
     public void calcularTotal(Integer days){
        super.calcularTotal(days);
        dailyFree = 79.99;
        total = dailyFree;       
    }
     
    @Override
     public void imprimir(){
         Integer chofer ;
         Scanner sc = new Scanner(System.in);
         System.out.println("¿Le gustaria añadir un chofer por $200 extra? presione 0 para SI y presione 1 para NO");
         chofer = sc.nextInt();
         
         if (chofer == 0) {
            total = dailyFree +200;
             System.out.println("el costo total de tu renta junto con un chofer: "+ total);
        }else if (chofer == 1) {
            total = dailyFree;
             System.out.println("el costo total de tu renta es : "+total);
        }
     
     }
}
