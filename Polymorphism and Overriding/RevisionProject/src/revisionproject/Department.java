/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisionproject;
import java.util.ArrayList;
/**
 *
 * @author M7md_2
 */
public class Department {
    private int dno;
    private String dName;
    private ArrayList<Employee> Emplist;
    
      public Department(){
        
    }
    public Department(int dno, String dName){
        this.dno = dno;
        this.dName = dName;
        Emplist = new ArrayList<Employee>();
    }
    
    public int getDno() {
        return dno;
    }

    public void setDno(int dno) {
        this.dno = dno;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

//    public ArrayList<Employee> getEmplist() {
//        return Emplist;
//    }
//
//    public void setEmplist(ArrayList<Employee> Emplist) {
//        this.Emplist = Emplist;
//    }
    
    public void add_employee(Employee E){
        Emplist.add(E);
    }
    public void add_employee(int index, Employee E){
        Emplist.add(index,E);
    }
    
    public void remove_employee(int index){
        Emplist.remove(index);
    }
    
    public void set_employee(int index, Employee E){
        Emplist.set(index, E);
    }
    
    public Employee get(int index){
        return Emplist.get(index);
    }
    
    public int getEmpNo(){
        return Emplist.size();
    }
    
    public void printBasicData(){
        System.out.println("Name\tGender\t\tSSN");
        for(int i=0;i<getEmpNo();i++){
            System.out.print(Emplist.get(i).getName()+"\t");
            System.out.print(Emplist.get(i).get_gender()+"\t");
            System.out.println(Emplist.get(i).getSSN());
        }
    }
        public void printDetails(){
            for(int i=0;i<Emplist.size();i++){
                if(Emplist.get(i) instanceof SalariedEmp)
                    ((SalariedEmp)Emplist.get(i)).DisplayAllDetails();
                if(Emplist.get(i) instanceof CommissionEmp)
                    ((CommissionEmp)Emplist.get(i)).DisplayAllDetails();
                if(Emplist.get(i) instanceof HourlyEmp)
                    ((HourlyEmp)Emplist.get(i)).DisplayAllDetails();
            }
        }
    
}
