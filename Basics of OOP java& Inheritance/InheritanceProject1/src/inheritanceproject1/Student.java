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
public class Student extends Person {
    private int Study_Level;
    private String Specialization;
    private double GPA;
    
    public Student(){
        super();
    }
    public Student(String Name, int Age, String Address, String Nationality, int Study_Level, String Specialization, double GPA){
        super(Name, Age, Address, Nationality);
        this.Study_Level = Study_Level;
        this.Specialization = Specialization;
        this.GPA = GPA;
    }
    public void Set_Study_Level(int Study_Level){
        this.Study_Level = Study_Level;
    }
    public int Get_Study_Level(){
        return Study_Level;
    }
    public void Set_Specialization(String Specialization){
        this.Specialization = Specialization;
    }
   public String Get_Specialization(){
       return Specialization;
   }
   public void Set_GPA(double GPA){
       this.GPA = GPA;
   }
   public double Get_GPA(){
       return GPA;
   }
}