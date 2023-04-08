/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondoopproject;

/**
 *
 * @author M7md_2
 */
public class SecondOOPProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        Car C = new Car();
        C.setMaker("BMW");
        C.setYearModel(2020);
        System.out.println(C.getMaker());
        System.out.println(C.getYearModel());
        System.out.println();
        Car ME=new Car(2020);
        
        //new Car();
        //System.out.println(new Car(2022).getYearModel());
        System.out.println();
        Car refTest=new Car(2023);
        /*System.out.println(C);
          C=new Car(5);        
          System.out.println(C);*/
    }
    
}
