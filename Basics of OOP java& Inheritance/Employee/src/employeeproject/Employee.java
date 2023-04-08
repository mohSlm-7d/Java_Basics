/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeproject;

/**
 *
 * @author M7md_2
 */
public class Employee {
    int Emp_ID;
    public String Name;
    public String Depart;
    public double Salary;
    public double Bonus;
    public boolean Resident;
    public Employee(){
        Emp_ID=0;
        Name="";
        Depart="";
        Salary=0;
        Bonus=0;
        Resident= false;
    }
    public Employee(int ID,String Name){
       /*calling the Constructor with no arguments.
       this();*/
        this.Name=Name;
        this.Emp_ID=ID;
    }
    public Employee(int ID, String Name, boolean RS){
        /*this.Name=Name;
        this.Emp_ID=ID;*/
        this(ID,Name);
        this.Resident=RS;
    }
    public Employee(int ID, String Name, String Depart, double Salary, double Bonus, boolean R){
        /*Emp_ID=ID;
        this.Name=name;
        Depart=depart;
        Salary = salary;
        Bonus = bonus;
        Resident = R;        */
        //call to another constructor in the next line.
        this(ID,Name,R);
        this.Depart = Depart;
        this.Salary = Salary;
        this.Bonus = Bonus;
    }
    public void Set_Salary(double Salary){
       this.Salary = Salary;
    }
    public void Set_Salary(double Salary, double Bonus){
        this.Set_Salary(Salary);
        this.Bonus=Bonus;
        //this.Salary += this.Bonus;
    }
    public void Set_depart(String Depart){
        this.Depart = Depart;
    }
    public void Set_Emp_ID(int Emp_ID){
        this.Emp_ID = Emp_ID;
    }
    public void Print_Emp_Data(){
    System.out.println("The Employee ID: " +Emp_ID);
    System.out.println("The Employee Name: " +Name);
    System.out.println("The Employee Department: " +Depart);
    System.out.println("The Employee Salary " +Salary);
    if(this.Resident==true)
        System.out.println("The Employee is Resident.");
    else
        System.out.println("The Employee is not Resident.");
    }
}
