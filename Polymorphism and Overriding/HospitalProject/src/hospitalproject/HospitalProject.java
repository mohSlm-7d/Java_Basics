/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalproject;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author M7md_2
 */
public class HospitalProject {
    public static Scanner input = new Scanner(System.in);
    public static int Pcount = 0, OutPCount =0, InPCount = 0, CovdCount = 0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int choice;
        String name, doctor, diagnosis, ward, OXG_ICU;
        boolean oxygen, ICU;
        double nationalNo, fee;
        int day, month, year, daysIn, inICU = 0;
        Date DOB;
        String symptom;
        ArrayList<String> symptoms;
        do{ 
            System.out.println("Please Enter the type of the new Patient from the following: ");
            System.out.println(" 1.OutPatient\n2.In Patient\n3.COVID Patient");
            System.out.println("\nTo Exit the program enter 0\n Please Enter your choice: ");
            choice = input.nextInt();
            if(choice != 0){
                switch(choice){
                    case 1:{
                        System.out.print("Please Enter the Patient National No: ");
                        nationalNo = input.nextDouble();
                        System.out.print("Please Enter the Patient Name: ");
                        name = input.next();
                        System.out.print("Please Enter the Patient Date Of Birth: \nThe day: ");
                        day = input.nextInt();
                        System.out.print("The month: ");
                        month = input.nextInt();
                        System.out.print("The year: ");
                        year = input.nextInt();
                        DOB = new Date(day, month, year);
                        symptoms = new ArrayList<String>();
                        System.out.println("Please Enter the symptoms of the patient: (Enter end when finished)");
                        for(int i=0;i<symptoms.size();i++){
                            symptom = input.next();
                            if(symptom != "end")
                                symptoms.set(i, symptom);
                            if(i+1 == symptoms.size()){
                                symptom = input.next();
                                if(symptom != "end"){                                    
                                    do{
                                        symptoms.add(symptom);
                                        symptom = input.next();                                        
                                    }while(symptom !="end");
                                    break;
                                }
                            }
                            
                        }
                        System.out.print("Please Enter the doctor Name: ");
                        doctor = input.next();
                        System.out.print("Please Enter the Diagnosis: ");
                        diagnosis = input.next();
                        System.out.print("Please Enter the Fee: ");
                        fee = input.nextDouble();
                        Patient patient = new OutP(nationalNo, name, DOB, symptoms, doctor, diagnosis, fee);
                        System.out.println("The Details Of  the Patient: ");
                        patient.PrintDetails();
                        break;
                    }
                    case 2:{
                        System.out.print("Please Enter the Patient National No: ");
                        nationalNo = input.nextDouble();
                        System.out.print("Please Enter the Patient Name: ");
                        name = input.next();
                        System.out.print("Please Enter the Patient Date Of Birth: \nThe day: ");
                        day = input.nextInt();
                        System.out.print("The month: ");
                        month = input.nextInt();
                        System.out.print("The year: ");
                        year = input.nextInt();
                        DOB = new Date(day, month, year);
                        symptoms = new ArrayList<String>();
                        System.out.println("Please Enter the symptoms of the patient: (Enter end when finished)");
                        for(int i=0;i<symptoms.size();i++){
                            symptom = input.next();
                            if(symptom != "end")
                                symptoms.set(i, symptom);
                            if(i+1 == symptoms.size()){
                                symptom = input.next();
                                if(symptom != "end"){                                    
                                    do{
                                        symptoms.add(symptom);
                                        symptom = input.next();                                        
                                    }while(symptom !="end");
                                    break;
                                }
                            }
                            
                        }
                        System.out.print("Please Enter the Ward Name: ");
                        ward = input.next();
                        System.out.print("Please Enter the doctor Name: ");
                        doctor = input.next();
                        System.out.print("Please Enter the number of days Patient spent in hospital: ");
                        daysIn = input.nextInt();
                        System.out.print("Please Enter the Diagnosis: ");
                        diagnosis = input.next();
                        System.out.print("Please Enter the Fee: ");
                        fee = input.nextDouble();
                        Patient patient = new InP(nationalNo, name, DOB, symptoms, ward, doctor, daysIn, diagnosis, fee);
                        System.out.println("The Details Of  the Patient: ");
                        patient.PrintDetails();
                        break;
                    }
                    case 3:{
                        System.out.print("Please Enter the Patient National No: ");
                        nationalNo = input.nextDouble();
                        System.out.print("Please Enter the Patient Name: ");
                        name = input.next();
                        System.out.print("Please Enter the Patient Date Of Birth: \nThe day: ");
                        day = input.nextInt();
                        System.out.print("The month: ");
                        month = input.nextInt();
                        System.out.print("The year: ");
                        year = input.nextInt();
                        DOB = new Date(day, month, year);
                        symptoms = new ArrayList<String>();
                        System.out.println("Please Enter the symptoms of the patient: (Enter end when finished)");
                        for(int i=0;i<symptoms.size();i++){
                            symptom = input.next();
                            if(symptom != "end")
                                symptoms.set(i, symptom);
                            if(i+1 == symptoms.size()){
                                symptom = input.next();
                                if(symptom != "end"){                                    
                                    do{
                                        symptoms.add(symptom);
                                        symptom = input.next();                                        
                                    }while(symptom !="end");
                                    break;
                                }
                            }
                            
                        }
                        System.out.print("Please Enter the doctor Name: ");
                        doctor = input.next();
                        System.out.print("Please Enter the number of days Patient spent in hospital: ");
                        daysIn = input.nextInt();
                        System.out.print("Please Enter the Fee: ");
                        fee = input.nextDouble();
                        System.out.print("Did the Patient use suplimental oxygen treatment: (answer only by yes or no).");
                        OXG_ICU = input.next();
                        if(OXG_ICU == "yes")
                            oxygen = true;
                        else
                            oxygen = false;
                        System.out.print("Did the Patient need ICU: (answer only by yes or no).");
                        if(OXG_ICU == "yes"){
                            ICU = true;
                            System.out.print("Please Enter the number of days Patient spent in ICU: ");
                            inICU = input.nextInt();
                        }
                            
                        else
                            ICU = false;
                    
                        Patient patient = new COVID_P(nationalNo, name, DOB, symptoms, doctor, daysIn, fee, oxygen, ICU, inICU);
                        System.out.println("The Details Of  the Patient: ");
                        patient.PrintDetails();
                        break;
                    }
                    case 0: break;
                    default:System.out.println("Invalid Choice!");break;
                }
            }
        }while(choice != 0);
        System.out.println("GOODBYE! ;)");
    }
    
}