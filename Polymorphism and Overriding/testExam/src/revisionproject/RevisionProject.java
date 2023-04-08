/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisionproject;
import java.util.Scanner;
//import java.lang.String;
/**
 *
 * @author M7md_2
 */
public class RevisionProject {
    int index;
    /**
     * @param args the command line arguments
     */
    static Scanner input = new Scanner(System.in);
    public static void lengthOf(String word){
        System.out.println(word.length());
        //System.out.println("TEST"+word);
        word = null;
        System.out.println("TEST"+word);
        
    }
        //static TEST T = new TEST();
    
    public static void main(String[] args) {
        // TODO code application logic here
        /*try{
        int [] array;//= {10,20};
        //int& a = array;
        //addressOf(&array);
        System.out.println(array);
        }
        catch(Exception Error){
            System.out.println(Error.getMessage());
        }*/
        System.out.println("Hello!");
        //System.out.println(&array);  
        System.out.print("Enter the word: ");
        String word = input.next();
        System.out.println();
        lengthOf(word);
        System.out.println(word);
        //TEST t = new TEST();
        //t.hello();
        //t.print();
        /*int a [] = new int[5];
        for(int i=0;i<5;i++)
            a[i] = input.nextInt();
        for(int j=0;j<5;j++)
            System.out.println(a[j]);*/
        Main.main();
}
    
}
