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
public class Person
{
    protected String firstName;
    protected String lastName;
    protected String address;
    protected String zipCode;
    protected String phoneNumber;
    
     
     public void display(){
        System.out.println("nombre del usuario: "+firstName+lastName );
        System.out.println("vive en "+ address+","+address );
        System.out.println("Telefono: "+phoneNumber );
        
    }
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
     
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
     
    public void setAddress(String address){
        this.address = address;
    }
     
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
     
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
     
    public String getFirstName(){
        return firstName;
    }
 
    public String getLastName(){
        return lastName;
    }
     
    public String getAddress(){
        return address;
    }
     
    public String getZipCode() {
        return zipCode;
    }
     
    public String getPhoneNumber(){
        return phoneNumber;
    }

    
    
}