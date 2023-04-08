/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package astractproject;

/**
 *
 * @author M7md_2
 */
public class AstractProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*CD C = new CD(50, "Ma balash", "Mohammad Hamaki");
        C.display();*/
        RetailItem R = new CD(50, "Ma balash", "Mohammad Hamaki");
        System.out.println(R.get_price());
        System.out.println(R.get_title());
        System.out.println(R.get_artist());
        
        Display D = new CD(50, "Ma balash", "Mohammad Hamaki");
        D.display();
    }
    
}
