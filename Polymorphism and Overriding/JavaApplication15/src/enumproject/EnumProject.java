/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumproject;

/**
 *
 * @author M7md_2
 */
public class EnumProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RegisterForm R = new RegisterForm("Mohammad",Gender.Male, Course.Java, Semester.Winter);
        R.print();
        System.out.println("\n\n");
        RegisterForm R1 = new RegisterForm();
        R1.print();
        Course C = Course.JavaScript;
        System.out.println("\n\n");
        System.out.println(C.toString());
        System.out.println(C.ordinal());
        System.out.println(C.equals(Course.JavaScript));
        System.out.println(C.compareTo(Course.Database));
    }
    
}
