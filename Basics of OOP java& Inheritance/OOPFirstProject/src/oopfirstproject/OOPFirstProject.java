/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopfirstproject;

/**
 *
 * @author M7md_2
 */
public class OOPFirstProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CellPhone Phone;
        Phone = new CellPhone();
        Phone.setManufact("Apple");
        Phone.setModel("12Pro");
        Phone.setRetailPrice(1000);
        System.out.println(Phone.getManufact());
        System.out.println(Phone.getModel());
        System.out.println(Phone.getRetailPrice());
    }
    
}
