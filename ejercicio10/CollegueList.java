/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

import java.util.Scanner;

/**
 *
 * @author ARCHV
 */
public class CollegueList {
    public static void main(String[] args)
    {
        CollegeEmployee[] grupo1 = new CollegeEmployee[4];
        Faculty[] grupo2 = new Faculty[3];
        Student[] grupo3 = new Student[7];
        Scanner scan = new Scanner(System.in);
        String response;
        String fname;
        String lname;
        String address;
        String zip;
        String phone;
        String cont ="Y";
        String QUIT = "Q";
         
        System.out.println("(C)ollege employee, (F)aculty or (S)tudent, (" + QUIT + ") to quit:");
        response = scan.nextLine();
        switch (response)
        {
            case "C":
            while(cont.equals("Y"))
            {
                int i = 0;
                System.out.println("Introduzca su nombre: ");
                fname = scan.nextLine();
                grupo1[i].setFirstName(fname);
                     
                System.out.println("Indroduzca su apelliso: ");
                lname = scan.nextLine();
                grupo1[i].setLastName(lname);               
                 
                System.out.println("Introduzca su dirección: ");
                address = scan.nextLine();  
                grupo1[i].setAddress(address);              
                         
                System.out.println("Introduzca su codigo postal: ");
                zip = scan.nextLine();
                grupo1[i].setZipCode(zip);
                 
                System.out.println("Introduzca su numero de telfono: ");
                phone = scan.nextLine();
                grupo1[i].setPhoneNumber(phone);
                 
                System.out.println("¿Desea ingresar mas datos? (Y/N)");
                cont = scan.nextLine();
 
                i++;
         
            }
        }
    }
}
