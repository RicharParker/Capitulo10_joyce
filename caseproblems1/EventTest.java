/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseproblems1;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author ARCHV
 */
public class EventTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         ArrayList<EventDemo> eventos = new ArrayList<>();
         
         for (int i = 0; i < 10; i++) {
             System.out.println("Nombre del evento: "+i+1);
             System.out.println("Numero de telefono: ");
        } 
         for (int i = 0; i < eventos.size(); i++) {
             System.out.println(eventos.get(i).getEvento());
             System.out.println(eventos.get(i).getnTelefono());
             System.out.println(eventos.get(i).getCosto());
        }
    }
    
}
