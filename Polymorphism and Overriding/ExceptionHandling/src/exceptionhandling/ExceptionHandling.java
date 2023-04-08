/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandling;
import java.util.Scanner;
/**
 *
 * @author M7md_2
 */
public class ExceptionHandling {

    /**
     * @param args the command line arguments
     */
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        int x,y;
        try{
            System.out.print("Please enter X: ");
            x = input.nextInt();
            System.out.print("Please enter Y: ");
            y = input.nextInt();
            System.out.println(x/y);
        }
        catch(Exception Error){
        System.out.println("\n"+Error.getMessage());
        }
        
    }
    
}
