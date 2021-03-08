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
public class TestDie {
    public static void main(String[] args) {
        Integer a =0;
        Die dado = new Die();
        Die dado2 = new Die();
        for (int i = 0; i < 101; i++) {
            
            dado.lanzar();
            dado2.lanzar();
            if (dado.getNumber()>dado2.getNumber()) {
                a++;
            }
            
        }  System.out.println(a);
        
        for (int i = 0; i < 101; i++) {
            dado.lanzar();
            dado2.lanzar();
            if (dado.getNumber()< dado2.getNumber()) {
                a++;
            }
        }
        System.out.println(a);
    }
    
    
}
