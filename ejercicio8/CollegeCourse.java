/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

/**
 *
 * @author ARCHV
 */
public class CollegeCourse {
   private final double costxCredit = 120.00;
   private String department;
   private Integer numberCourse;
   private Integer credits;
   private double fee;

    public CollegeCourse(String department, Integer numberCourse, double fee) {
        this.department = department;
        this.numberCourse = numberCourse;
        this.fee = fee;
        calcularTarifa();
        
    }
    
    public void calcularTarifa(){
       fee = costxCredit * credits;
    }
    
    public void display(){
        System.out.println("Departamento: "+department);
        System.out.println("Numero de curso: "+numberCourse);
        System.out.println("horas de creditos: "+credits);
        System.out.println("Tarifa de curso: "+ fee);
    }

    public double getCostxCredit() {
        return costxCredit;
    }

    public String getDepartment() {
        return department;
    }

    public Integer getNumberCourse() {
        return numberCourse;
    }

    public double getFee() {
        return fee;
    }

    public Integer getCredits() {
        return credits;
    }
    
    
   
   
    
}
