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
public class InP extends Patient{
    private String ward , doctor;
    private int daysIn;
    private String diagnosis;
    private double fee;
    public InP(double national_No, String name, Date DOB, ArrayList<String> symptoms, String ward, String doctor, int daysIn, String diagnosis, double fee){
        super(national_No, name, DOB, symptoms);
        HospitalProject.Pcount++;
        HospitalProject.InPCount++;
        this.ward = ward;
        this.doctor = doctor;
        this.daysIn = daysIn;
        this.diagnosis = diagnosis;
        this.fee = fee;
    }

    protected String getWard() {
        return ward;
    }

    private void setWard(String ward) {
        this.ward = ward;
    }

    protected String getDoctor() {
        return doctor;
    }

    private void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    protected int getDaysIn() {
        return daysIn;
    }

    private void setDaysIn(int daysIn) {
        this.daysIn = daysIn;
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
    
    double CalculateHospitalFee(){
        return daysIn * 50;
    }
    public void PrintDetails(){
        super.PrintDetails();
        System.out.println("The Patient Ward: "+this.getWard());
        System.out.println("The monitoring doctor Name: "+this.getDoctor());
        System.out.println("The Diagnosis: "+this.getDiagnosis());
        System.out.println("The days Patient spent in hospital: "+this.getDaysIn());
        this.setFee(this.CalculateHospitalFee());
        System.out.println("The Fee: "+this.getFee());
    }
}
