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
public class OutP extends Patient{    
    private String doctor;
    private String diagnosis;
    private double fee;
    public OutP(double national_No, String name, Date DOB, ArrayList<String> symptoms, String doctor, String diagnosis, double fee){
        super(national_No, name, DOB, symptoms);
        HospitalProject.Pcount++;
        HospitalProject.OutPCount++;
        this.doctor = doctor;
        this.diagnosis = diagnosis;
        this.fee = fee;
    }

    protected String getDoctor() {
        return doctor;
    }

    private void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    protected String getDiagnosis() {
        return diagnosis;
    }

    private void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    protected double getFee() {
        return fee;
    }

    private void setFee(double fee) {
        this.fee = fee;
    }
    public void PrintDetails(){
        super.PrintDetails();
        System.out.println("The doctor Name: "+this.getDoctor());
        System.out.println("The Diagnosis: "+this.getDiagnosis());
        System.out.println("The Fee: "+this.getFee());
    }
}
