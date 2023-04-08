/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisionproject;

/**
 *
 * @author M7md_2
 */
public abstract class Employee implements Displayable{
    private String Name;
    private Gender gender;
    private int SSN;
    private String Address;
    
    public Employee(String Name, Gender gender, int SSN, String Address){
        this.Name = Name;
        this.gender = gender;
        this.SSN = SSN;
        this.Address = Address;
    }
    public void setName(String Name){
        this.Name = Name;
    }
    public String getName(){
        return this.Name;
    }
    
    public void set_gender(Gender gender){
        this.gender = gender;
    }
    public Gender get_gender(){
        return gender;
    }
    
    public void setSSN(int SSN){
        this.SSN = SSN;
    }
    public int getSSN(){
        return SSN;
    }
    
    public void setAddress(String Address){
        this.Address = Address;
    }
    public String getAddress(){
        return Address;
    }
    
    //public abstract double Earning();
    
    public void DisplayAllDetails(){
        System.out.println("The Name: " + this.getName());
        System.out.println("The gender: " + this.get_gender());
        System.out.println("The SSN: " +this.getSSN());
        System.out.println("the Address: " +this.getAddress());
    }
}
