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
public class HourlyEmp extends Employee {
    private double Hour_rate;
    private int No_of_hours;
    
    public HourlyEmp(String Name, Gender gender, int SSN, String Address, double Hour_rate, int No_of_hours){
        super(Name, gender, SSN, Address);
        this.Hour_rate = Hour_rate;
        this.No_of_hours = No_of_hours;
    }
    public void setHour_rate(double Hour_rate){
        this.Hour_rate = Hour_rate;
    }
    public double getHour_rate(){
        return Hour_rate;
    }
    
    public void setNo_of_hours(int No_of_hours){
        this.No_of_hours = No_of_hours;
    }
    public int getNo_of_hours(){
        return No_of_hours;
    }
    
    public double Earning(){
        return Hour_rate * No_of_hours;
    }
    public void DisplayEarning(){
        
        System.out.println("The Earning of this salaried Employee: " + Earning());
    }
    public void DisplayAllDetails(){
        super.DisplayAllDetails();
        System.out.println("The Hour rate for this Employee: " +getHour_rate());
        System.out.println("The No of hours for this Employee: " + getNo_of_hours());
        DisplayEarning();
    }
}
