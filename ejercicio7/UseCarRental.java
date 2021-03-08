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
public class UseCarRental {
    public static void main(String[] args) {
      CarRental carro1 = new CarRental("Publico");
      carro1.calcularTotal(2);
      carro1.imprimir();
      
      LuxuryCarRental carro2 = new LuxuryCarRental("lamborgini");
      carro2.calcularTotal(2);
      carro2.imprimir();
    }
}
