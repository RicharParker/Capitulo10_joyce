/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamezone2;

/**
 *
 * @author ARCHV
 */
public class Die {
    protected Integer number;

    public Die() {
        this.lanzar();
    }
    
    public void lanzar(){
        this.number = (int)(Math.random() * 6 + 1);
    }

    public Integer getNumber() {
        return number;
    }
    
    
    
}
