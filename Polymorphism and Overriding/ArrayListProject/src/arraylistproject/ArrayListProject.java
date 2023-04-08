/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistproject;
import java.util.ArrayList;
/**
 *
 * @author M7md_2
 */
public class ArrayListProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList <String> List = new ArrayList<String>();
        List.add("Mohammad");
        List.add("Abdulrahman Wasfi");
        List.add("Ma3n");
        List.add("Ibrahim");
        List.add("Samer");
        System.out.println(List.size());
        System.out.println(List);
        System.out.println(List.get(1));
        List.add(4,"Loay");
        System.out.println(List);
        List.set(5, "Rafeeq");
        System.out.println(List);
        List.remove(4);
        System.out.println(List);
        List.add(5,"Mohammed Abu Sbeitan");
        System.out.println(List);
        List.add("Me");
        System.out.println(List);
        List.add(4,"Njoud");
        System.out.println(List);;
    }
    
}
