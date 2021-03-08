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
public class LoadedDie extends Die{

    public LoadedDie() {
        this.lanzar();
    }
    
    @Override
    public void lanzar(){
        this.number = (int)(Math.random() * 6 + 2);
    }

    
  
}
