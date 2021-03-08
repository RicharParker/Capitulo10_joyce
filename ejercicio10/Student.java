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
public class Student extends Person{
        protected String major;
    protected double gradePointAverage;
     
    public Student(){
        super();
    }
            @Override
    public void display(){
        super.display(); 
        System.out.println("Major: "+getMajor());
        System.out.println("GPA"+getGPA() );
    }
     
    public void setMajor(String major){
        this.major = major;
    }
     
    public void setGPA(double gradePointAverage){
        this.gradePointAverage = gradePointAverage;
    }
     
    public String getMajor(){
        return major;
    }
     
    public double getGPA(){
        return gradePointAverage;
    }
 

}
