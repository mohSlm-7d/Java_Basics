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
public class Employee extends Person{
    private double Salary;
    private int Rank;
    private String Job;
    
    public Employee(){
       
    }
    public Employee(String Name ,int Age, String Address, String Nationality,double Salary, int Rank, String Job){
        super(Name, Age, Address, Nationality);
        this.Salary = Salary;
        this.Rank = Rank;
        this.Job = Job;
    }
    public void Set_Salary(double Salary){
        this.Salary = Salary;
    }
    public double Get_Salary(){
        return Salary;
    }
    public void Set_Rank(int Rank){
        this.Rank = Rank;
    }
    public int Get_Rank(){
        return Rank;
    }
    public void Set_Job(String Job){
        this.Job = Job;
    }
    public String Get_Job(){
        return Job;
    }
    @Override
    public void printAll_details(){
       super.printAll_details();
        System.out.println("The Salary: "+this.Get_Salary());
        System.out.println("The Rank: "+this.Get_Rank());
        System.out.println("The Job: "+this.Get_Job());
    }
}