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
enum Gender{Male,Female};
public class RevisionProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Department D1 = new Department(1,"Development");
        SalariedEmp S = new SalariedEmp("Mohammad",Gender.Male,5000,"Amman",100000,50000,10000);
        D1.add_employee(S);
        HourlyEmp H1 = new HourlyEmp("Rahaf",Gender.Female,2500, "Amman",25000,50000);
        D1.add_employee(H1);
        CommissionEmp C1 = new CommissionEmp("Ibrahim",Gender.Male,3000,"Amman",50000,0.75);
        D1.add_employee(C1);
        SalariedEmp S1 = new SalariedEmp("Aya",Gender.Female,4000,"Amman",75000,30000,7000);
        D1.set_employee(2, S1);
        D1.printBasicData();
        D1.remove_employee(1);
        D1.printDetails();
        D1.printBasicData();
    }
    
}
