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
public class TennisGame {
    private String player1;
    private String player2;
    private Integer score1;
    private Integer score2;
    private String finalscore;
    private String finalscore2;
    
    
    public void darNombres(String name1, String name2){
        player1 = name1;
        player2= name2;
    }
   
    
    public void darPuntaje(Integer valor1,Integer valor2){
        if ((valor1<0||valor1>4||valor2<0||valor2>4)||(valor1==4&&valor2==4)) {
            score1= score2=0;
            finalscore= finalscore2="error";
        }
        
        score1 =valor1;
        score2 = valor2;
        switch(score1){
            case 0: finalscore = "Love";break;
            case 1 : finalscore= "15";break;
            case 2 : finalscore = "30";break;
            case 3 : finalscore="40"; break;
            case 4 : finalscore= "game";break;
        }
        
        switch (score2){
            case 0 : finalscore2 = "Love";break;
            case 1 : finalscore2= "15";break;
            case 2 : finalscore2 = "30";break;
            case 3 : finalscore2="40"; break;
            case 4 : finalscore2= "game";break;
        }
        
      
    }
    
    public void imprimir(){
        System.out.println(player1+" y" +player2);
        System.out.println("Puntaje: "+score1 +" a "+score2);
        System.out.println("Puntaje: "+finalscore+" a "+finalscore2);
    }

    public String getPlayer1() {
        return player1;
    }

    public String getPlayer2() {
        return player2;
    }

    public Integer getScore1() {
        return score1;
    }

    public Integer getScore2() {
        return score2;
    }

    public String getFinalscore() {
        return finalscore;
    }

    public String getFinalscore2() {
        return finalscore2;
    }
    
    
    
    
    
}
