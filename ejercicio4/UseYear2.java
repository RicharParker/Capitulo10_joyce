/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author ARCHV
 */
public class UseYear2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Year2 año2 = new Year2();
        LeapYear2 Laño2 = new LeapYear2();
        
        System.out.println("Indique el dia");
        Integer day = sc.nextInt();
        
        System.out.println("Indique el mes");
        Integer month = sc.nextInt();
        
        System.out.println("Dias transcurridos en un año "+año2.daysElapsed(day, month));
        System.out.println("Dias transcurridos en un año  "+Laño2.daysElapsed(day, month));
   
    
    }
}
