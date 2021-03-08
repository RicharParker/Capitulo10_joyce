/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author ARCHV
 */
public class DoublesTennisGame extends TennisGame {
    private String partner1;
    private String partner2;

     
    public void darNombres(String name1,String name2, String name3,String name4){
     darNombres(name1,name2);
     partner1 = name3;
     partner2 = name4;
    }
    
    public void imprimir(){
        System.out.println(getPlayer1() + " y " + partner1);
        System.out.println("y " + getPlayer2() + " y " + partner2);
        System.out.println("Puntaje "+ getScore1() +" a " + getScore2());
        System.out.println("Puntaje "+ getFinalscore() +" a "+ getFinalscore2());
    }
    
    public String getPartner1() {
        return partner1;
    }

    public String getPartner2() {
        return partner2;
    }
    
    
}
