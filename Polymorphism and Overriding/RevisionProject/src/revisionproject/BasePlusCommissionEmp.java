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
public class BasePlusCommissionEmp extends CommissionEmp{
    private double Base;
    
    public BasePlusCommissionEmp(String Name, Gender gender, int SSN, String Address, double Gross_Sales, double Commission_rate, double Base){
        super(Name, gender, SSN, Address, Gross_Sales, Commission_rate);
        this.Base = Base;
    }
    public void setBase(double Base){
        this.Base = Base;
    }
    public double getBase(){
        return Base;
    }
    
    public double Earning(){
        return super.Earning() + Base;
    }
    public void DisplayEarning(){
        System.out.println("The Earning: " +Earning());
    }
    public void DisplayAllDetails(){
        super.DisplayAllDetails();
        System.out.println("The Base Salary for this Employee: " +getBase());
        DisplayEarning();
    }
}
