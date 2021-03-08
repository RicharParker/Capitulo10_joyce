/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseproblems1;

/**
 *
 * @author ARCHV
 */
public class DinnerEvent extends EventDemo{
    private Integer entree;
    private Integer dish1;
    private Integer dish2;
    private Integer dessert;

    public DinnerEvent(Integer entree, Integer dish1, Integer dessert, String evento, Integer nInvitados) {
        super(evento, nInvitados);
        this.entree = entree;
        this.dish1 = dish1;
        this.dish2=dish2;
        this.dessert = dessert;
    }
    
    public String getMenu(){
       return"DinnerEvent{" +
                "princiapl=" + entree +
                ", guarnicion1=" + dish1 +
                ", guarnicion2=" + dish2 +
                ", postre=" + dessert +
                '}';
    }

    public Integer getDish1() {
        return dish1;
    }

    public void setDish1(Integer dish1) {
        this.dish1 = dish1;
    }

    public Integer getDessert() {
        return dessert;
    }

    public void setDessert(Integer dessert) {
        this.dessert = dessert;
    }
    
    
    
}
