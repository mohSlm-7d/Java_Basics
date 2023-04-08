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
public class InheritanceProject1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student S = new Student("Mohammad",20,"Amman","Jordanian",2,"CS",85);
        System.out.println(S.Get_Address());
        System.out.println();
        Employee E = new Employee("Mohammad",20,"Amman","Joradanian",5000,7,"Developper and Leader");
        System.out.println(E.Get_Age()+" "+E.Get_Name());
        System.out.println("My Job is "+E.Get_Job());
        System.out.println("\n\n\n\n Overriding Output.");
        //@Override //Testing Overriding.
        SalariedEmployee Emp = new SalariedEmployee("Mohammad",20,"Amman","Jordanian",5000,10,"Manager",2500,0);
        System.out.println(Emp.Get_Salary());
       Employee E0 = new Employee("Mohammad",20,"Amman","Jordanian",5000,10,"Manager");
       E0.printAll_details();
       Employee E1 = new SalariedEmployee("Mohammad",20,"Amman","Jordanian",5000,10,"Manager",2500,0);
       E1.printAll_details();
       /*Reference variable of type base class(Employee) 
       and it points to object of type derived class(SalariedEmployee)
       this Rederence variable
       cannot access or call methods exists in the object of type derived class(SalariedEmployee)
       (that the reference variable points to)but it doesn't exist in the base class(Employee)(Which is reference data type).
       E1.printHello();*/
    }
    
}
