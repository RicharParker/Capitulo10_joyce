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
public class CollegeEmployee extends Person {
    protected String ssn;
    protected double annSalary;
    protected String department;

    public CollegeEmployee() {
        super();
    }
    
    public void display(){
        
        System.out.println("SSN: "+getSSN());
        System.out.println("Salario Anual: "+getAnnSalary());
        System.out.println("Departamento"+getDepartment());
    }
     

    public void setSSN(String ssn) {
        this.ssn = ssn;
    }
     
    public void setAnnSalary(double annSalary) {
        this.annSalary = annSalary;
    }
     
    public void setDepartment(String department){
        this.department = department;
    }   
     
    public String getSSN() {
        return ssn;
    }
     
    public double getAnnSalary(){
        return annSalary;
    }
     
    public String getDepartment(){
        return department;
    }
     

        
}

