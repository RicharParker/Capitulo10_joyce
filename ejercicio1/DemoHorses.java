/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author ARCHV
 */
public class DemoHorses {
    public static void main(String[] args) {
        Horse caballo = new Horse();
        RaceHorse carrera = new RaceHorse();
        
        caballo.setName("Otis");
        caballo.setColor("Blanco");
        caballo.setBirthYear(2001);
        
        carrera.setRaceNum(7);
        
        System.out.println("El nombre del caballo es : " +caballo.getName());
        System.out.println("El color del caballo es : "+ caballo.getColor());
        System.out.println("El año de nacimiento del caballo es : "+ caballo.getBirthYear());
        
        System.out.println("El numero de la carrera es: "+carrera.getRaceNum());
     
        
        
    }
}
