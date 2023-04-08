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
public class EmployeeProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee E= new Employee();
        E.Print_Emp_Data();
        System.out.println("\n\n");
        Employee E1= new Employee(2001,"Mohammad");
        E1.Print_Emp_Data();
        System.out.println("\n\n");
        Employee E2= new Employee(2001,"Mohammad",true);
        E2.Print_Emp_Data();
        System.out.println("\n\n");
        Employee E3= new Employee(2001,"Mohammad","Development Leaders",5000,2500,true);
        E3.Print_Emp_Data();
        /*Test on access modifiers. The default access modifier is public(in case you didin't write the access modifier).
        E3.Depart=null;
        System.out.println("\n\n");
        E3.Print_Emp_Data();*/
        
    }
    
}
