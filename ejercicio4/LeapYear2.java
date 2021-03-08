/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

/**
 *
 * @author ARCHV
 */
public class LeapYear2 extends Year2 {

    public LeapYear2() {
        super();
        daysYear = 366;
    }
    
    @Override
     public Integer daysElapsed(Integer day,Integer month){
        Integer nMes =0;
        for (int i = 1; i < month; i++) {
            if (i==1 || i==3 || i==5|| i ==7|| i ==8|| i ==10|| i ==12) {
                nMes +=31;
            }else if (i ==4 || i ==6 || i ==9 || i ==11) {
                nMes += 30;
            }else if (i ==2) {
                nMes +=28;
            }
        }
        nMes +=day;
        return nMes;
    }
      

    
}
