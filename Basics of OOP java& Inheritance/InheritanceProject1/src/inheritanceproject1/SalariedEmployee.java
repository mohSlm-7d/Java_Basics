/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceproject1;

/**
 *
 * @author M7md_2
 */
public class SalariedEmployee extends Employee{
    private double Bonus;
    private double Deductions;
    
    public SalariedEmployee(){
        super();
    }
    public SalariedEmployee(String Name, int Age, String Address, String Nationality, double Salary, int Rank, String Job, double Bonus, double Deductions){
    
    super(Name, Age, Address, Nationality, Salary, Rank, Job);
    this.Bonus = Bonus;
    this.Deductions = Deductions;
    }
   public void Set_Bonus(double Bonus){
   this.Bonus = Bonus;
   }
   public double Get_Bonus(){
       return Bonus;
   }
   public void Set_Deductions(double Deductions){
       this.Deductions = Deductions;
   }
   public double Get_Deductions(){
       return Deductions;
   }
   @Override
   public double Get_Salary(){
       return super.Get_Salary() + Bonus - Deductions;
   }
   public void printHello(){
   System.out.println("Welcome to SalariedEmployee class \nPolymorphism!");
   }
   /*@Override
   public void Set_Salary(double Salary){
       
   }*/
}