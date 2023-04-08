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
public class CommissionEmp extends Employee {
    private double Gross_Sales;
    private double Commission_rate;
    
    public CommissionEmp(String Name, Gender gender, int SSN, String Address, double Gross_Sales, double Commission_rate){
        super(Name, gender, SSN, Address);
        this.Gross_Sales = Gross_Sales;
        this.Commission_rate = Commission_rate;
    }
    public void setGross_Sales(double Gross_Sales){
        this.Gross_Sales = Gross_Sales;
    }
    public double getGross_Sales(){
        return Gross_Sales;
    }
    
    public void setCommission_rate(double Commission_rate){
        this.Commission_rate = Commission_rate;
    }
    public double getCommission_rate(){
        return Commission_rate;
    }
    
    public double Earning(){
        return Gross_Sales * Commission_rate;
    }
    public void DisplayAllDetails(){
        super.DisplayAllDetails();
        System.out.println("Gross Sales: " +getGross_Sales());
        System.out.println("TRhe Commission Rate: " +getCommission_rate());
        DisplayEarning();
    }
    public void DisplayEarning(){
        System.out.println("The Earning of this salaried Employee: " + Earning());
    }
}
