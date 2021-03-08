/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseproblems2;

/**
 *
 * @author ARCHV
 */
public class LessonWithRental extends Rental{
    private Boolean lection;

    public LessonWithRental(Boolean lection, String contract, Integer minutes) {
        super(contract, minutes);
        this.lection = lection;
    }
    
    
}
