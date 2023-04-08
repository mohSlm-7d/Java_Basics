/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalproject;
import java.util.ArrayList;
/**
 *
 * @author M7md_2
 */
public abstract class Patient {
    private double national_No;
    private String name;
    private Date DOB;
    private ArrayList<String> symptoms;
    public Patient(double national_No, String name, Date DOB, ArrayList<String> symptoms){
        if((int)(national_No / 1000000000) != 0 && (int)(national_No / 10000000000d) == 0)
            this.national_No = national_No;
        this.name = name;
        if(DOB.checkDate()){
         /*Without using setters and gettres
            this.DOB = DOB;
            Assigning the address or reference that the 
            received reference variable points to (Assigning this address)
            to the reference variable DOB that is inside the object of type Patient.
            (making two reference variables point to the same allocated object in memory)
            (by pointing to its address).*/   
            this.DOB.set_day(DOB.get_day());
            this.DOB.set_month(DOB.get_month());
            this.DOB.set_year(DOB.get_year());
        }
        this.symptoms = new ArrayList<String>(symptoms.size());
        for(int i=0;i< this.symptoms.size();i++){
            this.symptoms.set(i,symptoms.get(i));
        }
    }

    protected double getNational_No() {
        return national_No;
    }

    private void setNational_No(double national_No) {
        this.national_No = national_No;
    }

    protected String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    protected Date getDOB() {
        return DOB;
    }

    private void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    protected ArrayList<String> getSymptoms() {
        return symptoms;
    }

    private void setSymptoms(ArrayList<String> symptoms) {
        this.symptoms = symptoms;
    }
    public void PrintDetails(){
        System.out.print("The national No of the patient: "+ this.getNational_No());
        System.out.println("The Patient Name: "+this.getName());
        System.out.println("The Birth date of the Patient: "+this.getDOB().get_day()+"/"+this.getDOB().get_month()+"/"+this.getDOB().get_year());
        System.out.println("The symptoms: "+this.getSymptoms());
    }
}