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
public class SalariedEmp extends Employee {
    private double Salary;
    private double Bonus;
    private double Deductions;
    
    public SalariedEmp(String Name, Gender gender, int SSN, String Address,double Salary, double Bonus, double Deductions){
        super(Name,gender,SSN,Address);
        this.Salary = Salary;
        this.Bonus = Bonus;
        this.Deductions = Deductions;
    }
    public void setSalary(double Salary){
        this.Salary = Salary;
    }
    public double getSalary(){
        return Salary;
    }
    
    public void setBonus(double Bonus){
        this.Bonus = Bonus;
    }
    public double getBonus(){
        return Bonus;
    }
    
    public void setDeductions(double Deductions){
        this.Deductions = Deductions;
    }
    public double getDeductions(){
        return Deductions;
    }
    public double Earning(){
        return Salary + Bonus  - Deductions;
    }
    public void DisplayAllDetails(){
        super.DisplayAllDetails();
        System.out.println("The salary: " + getSalary());
        System.out.println("The Bonus for this Employee: " + getBonus());
        System.out.println("The Deductions of this Employee: " + getDeductions());
        DisplayEarning();
    }
    public void DisplayEarning(){ 
        System.out.println("The Earning of this salaried Employee: " + Earning());
    }
}
