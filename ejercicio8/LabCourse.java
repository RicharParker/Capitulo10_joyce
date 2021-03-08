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
public class LabCourse extends CollegeCourse {
  
    private final double LabFee = 50.0;
    private double labCourseFee;
 

    public LabCourse(String department, Integer numberCourse, double fee) {
        super(department, numberCourse, fee);
        this.calcularTarifa();
    }
    
    @Override
    public void calcularTarifa(){
        labCourseFee = super.getFee() + LabFee;
    }
    
    @Override
    public void display(){
        System.out.println("Departamento: "+getDepartment());
        System.out.println("Numero de curso: "+getNumberCourse());
        System.out.println("Horas de creditos: "+getCredits());
        System.out.println("Tarifa del curso: "+getFee());
        System.out.println("Tarifa de laboratorio $"+LabFee);
    }
    
    
}
