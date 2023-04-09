/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;
import java.util.Scanner;
/**
 *
 * @author M7md_2
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        int num, factorial=1;
        System.out.println("Please enter the number: ");
        num=input.nextInt();
        for(;num>1;num--)
            factorial*=num;
//continye statement
        /*for(int i=0;i<4;i++)
        {
            System.out.println("Iteration "+i);
            num=input.nextInt();
            if(num<0)
                continue;
        
        }*/
            
        
        System.out.println("The factorial is "+factorial);
    }
    
}
