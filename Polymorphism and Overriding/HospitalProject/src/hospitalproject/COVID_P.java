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
public class COVID_P extends InP{
    private boolean oxygen, ICU;
    private int inICU;
    public COVID_P(double national_No, String name, Date DOB, ArrayList<String> symptoms, String doctor, int daysIn, double fee, boolean oxygen, boolean ICU, int inICU){        
        super(national_No, name, DOB, symptoms, "COVID", doctor, daysIn, "COVID-19", fee);
        HospitalProject.Pcount++;
        HospitalProject.CovdCount++;
        this.oxygen = oxygen;
        this.ICU = ICU;
        this.inICU = inICU;
    }
    public double CalculateHospitalFee(){
        if(oxygen){
            if(ICU)
                return (this.getDaysIn() *(50 + 20) + inICU * 50);
            else
                return this.getDaysIn() *(50 + 20);
        }
            
        else {
            if(ICU)
                return super.CalculateHospitalFee() + inICU * 50;
            else
                return super.CalculateHospitalFee();
        }            
    }

    protected boolean isOxygen() {
        return oxygen;
    }

    private void setOxygen(boolean oxygen) {
        this.oxygen = oxygen;
    }

    protected boolean isICU() {
        return ICU;
    }

    private void setICU(boolean ICU) {
        this.ICU = ICU;
    }

    protected int getInICU() {
        return inICU;
    }

    private void setInICU(int inICU) {
        this.inICU = inICU;
    }
    public void PrintDetails(){
        super.PrintDetails();
        if(this.isOxygen())
            System.out.println("Used suplimental oxygen treatment: yes");
        else
            System.out.println("Used suplimental oxygen treatment: no");
        
        if(this.isICU()){
            System.out.println("Needed ICU: yes");
            System.out.println("The days Patient spent in ICU: "+this.getInICU());            
        }            
        else
            System.out.println("Needed ICU: no");
        
    }
}
