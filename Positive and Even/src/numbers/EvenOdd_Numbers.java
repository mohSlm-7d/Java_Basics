package numbers;
import java.util.Scanner;
import numbers.Greater_Number;
public class EvenOdd_Numbers{
    public static void main(String [] args){
        Greater_Number Object;
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Please enter the number: ");
        num=input.nextInt();
       /* if(num>0)
        {
            if(num%2==0)
                System.out.println("Positive Even Number.");
            else
                System.out.println("Positive Odd Number.");
        }
         else
            System.out.println("Negative Number.");*/
       if(num>0 && num%2==0)
           System.out.println("Positive Even Number.");
       else if(num>0 && num%2!=0)
           System.out.println("Positive Odd Number.");
       else
           System.out.println("Negative Number.");
       
               
    }
}