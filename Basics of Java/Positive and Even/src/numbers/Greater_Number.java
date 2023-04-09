package numbers;
import java.util.Scanner;
public class Greater_Number
{
    public int num1;
    public int num2;
    public int num3;
    public Greater_Number()
    {
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter 3 numbers:\nFirst number: ");
        num1= input.nextInt();
        System.out.print("Second number: ");
        num2= input.nextInt();
        System.out.print("Third number: ");
        num3= input.nextInt();
     
        if(num1>num2)
        {
             if(num1>num3)
            System.out.printf("\nThe Greater number is %d",num1);
            else
                System.out.printf("\nThe Greater number is %d", num3);
        }
        else if(num2>num1)
        {
             if(num2>num3)
                System.out.printf("\nThe Greater number is %d", num2);
            else
                System.out.printf("\nThe Greater number is %d",num3);
         
        }
        else
        {
             if(num3>num1)
                System.out.printf("\nThe Greater number is %d", num3);
        }
    }
}