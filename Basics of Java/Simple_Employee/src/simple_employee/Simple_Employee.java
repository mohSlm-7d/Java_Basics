package simple_employee;
import java.util.Scanner;
public class Simple_Employee{
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        String Fname,Lname;
        float salary,net_salary;
        System.out.print("Please enter your first name: ");
        Fname=input.next();
        System.out.print("Please enter your last name: ");
        Lname=input.next();
        System.out.print("Please enter your salary: ");
        salary=input.nextFloat();
        net_salary=salary-(salary*0.10f);
        System.out.printf("The net salary is: %.1f\n",net_salary);
        
    }
}