/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import hospitalproject.HospitalProject;

/**
 *
 * @author M7md_2
 */
public class Main {
    public static void main(String[] args){
        HospitalProject.main(args);
        System.out.println("The number of All Patients: "+HospitalProject.Pcount);
        System.out.println("The Out-Patients number: "+HospitalProject.OutPCount);
        System.out.println("The In-Patients number: "+HospitalProject.InPCount);
        System.out.println("The COVID-Patients number: "+HospitalProject.CovdCount);
        System.out.println("HAVE A GOOD DAY!");
                        
        for(int i=0;i<5;i++){
            for(int j=i+1;j>0;j--)
                System.out.print("*");
            System.out.println();
        }
    }
}
