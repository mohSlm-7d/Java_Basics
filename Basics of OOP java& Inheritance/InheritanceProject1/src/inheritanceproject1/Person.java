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
public class Person {
private String Name;
private int Age;
private String Address;
private String Nationality;
public Person(){
System.out.println("Person Constructor.(super class's Constructor).");
}
public Person(String Name, int Age, String Address, String Nationality){
System.out.println("Person Parameterized Constructor. (super class's Constructor).");
this.Name = Name;
this.Age = Age;
this.Address = Address;
this.Nationality = Nationality;
}
public void Set_Age(int Age){
    this.Age = Age;
}
public int Get_Age(){
    return this.Age;
}
public void Set_Address(String Address){
    this.Address = Address;
}
public String Get_Address(){
    return this.Address;
}
public void Set_Nationality(String Nationality){
    this.Nationality = Nationality;
}
public String Get_Nationality(){
    return this.Nationality;
}
public void Set_Name(String Name){
    this.Name = Name;
}
public String Get_Name(){
    return this.Name;
}
public void printAll_details(){
 System.out.println("\nThe Name: "+Name+"\nThe Age: "+Age+"\nThe Address: "+Address+"\nThe Nationality: "+Nationality);
}
}