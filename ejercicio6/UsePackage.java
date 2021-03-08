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
public class UsePackage {
    public static void main(String[] args) {
       Package[] paqueteArray = new Package[3];
       paqueteArray [0] = new Package(2,'A');
       paqueteArray [1] = new Package(30,'T');
       paqueteArray [2] = new Package(20,'M');
       
       InsuredPackage [] InsuredPackageArray = new InsuredPackage[3];
       InsuredPackageArray [0]= new InsuredPackage(32,'M');
       InsuredPackageArray [1]= new InsuredPackage(25,'T');
       InsuredPackageArray [2]= new InsuredPackage(4,'A');
       
        for (Package i : paqueteArray) {
            i.display();
        }
        System.out.println("");
        
        for (InsuredPackage j :InsuredPackageArray  ) {
            j.display();
        }
    }
}
