/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseproblems2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ARCHV
 */
public class LessonWithRentalDemo {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         ArrayList<Rental> renta = new ArrayList<>();
         
         for (int i = 0; i < 10; i++) {
             System.out.println("Nombre del contrato: "+i+1);
             System.out.println("Numero de telefono: ");
        } 
         for (int i = 0; i < renta.size(); i++) {
             System.out.println();
             System.out.println(renta.get(i).getContract());
             System.out.println(renta.get(i).getnTelefono());
        }
    }
}
