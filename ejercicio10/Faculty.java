/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

/**
 *
 * @author ARCHV
 */
public class Faculty extends CollegeEmployee {
    protected boolean tenured;
    public Faculty()  {
        super();
         
        if(tenured)
            tenured = true;
        else
            tenured = false;
    }
     
    @Override
    public void display() {
        super.display();
        System.out.println("Titula: "+ tenured);
    }   
}
