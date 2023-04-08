/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorproject;
import java.util.Scanner;
/**
 *
 * @author M7md_2
 */
public class CalculatorProject {
    static Scanner input=new Scanner(System.in);
    /**
     * @param args the command line arguments
    */    
   
    /*public static void Hello(){
    System.out.println("Hello Test.");
    }*/
    public static void main(String[] args) {
        // TODO code application logic here
        /*CalculatorProject Test= new CalculatorProject();
        Test.Hello();*/
        //CalculatorProject.Hello();
        //Hello();
        System.out.println("Please choose an operation from the following: ");
        System.out.println("A.Addition\nS.Subtraction\nM.Multiplication\nD.Division\nTo Exit the program enter \"E\"");
        char choice;
        do{
          System.out.print("\nEnter your choice please: ");
          choice = CalculatorProject.input.next().charAt(0);
          double num1, num2;
       
        switch(choice){
            case'A':{
                System.out.print("Enter two numbers: \nEnter the first number: ");
                num1 = CalculatorProject.input.nextDouble();
                System.out.print("enter the second number: ");
                num2 = input.nextDouble();
                System.out.println("The result of the addition is "+Calc.Addition(num1,num2));
                break;
            }
            case 'S':{
                System.out.print("Enter two numbers:\nEnter the first number: ");
                num1 = CalculatorProject.input.nextDouble();
                System.out.print("enter the second number: ");
                num2 = input.nextDouble();
                System.out.println("The result is "+Calc.Subtraction(num1,num2));
                break;
            }
            case 'M':{
                System.out.print("Enter two numbers:\nEnter the first number: ");
                num1 = input.nextDouble();
                System.out.print("Enter the second number: ");
                num2 = input.nextDouble();
                System.out.println("The result is "+Calc.Multiply(num1,num2));
                break;
            }
            case 'D':{
            System.out.print("Enter two numbers:\nEnter the first number: ");
            num1 = input.nextDouble();
            System.out.print("Enter the second number: ");
            num2 = input.nextDouble();
            System.out.println("The result is "+Calc.Division(num1, num2));
            break;
            }
            default:{
                System.out.println("Are you sure you want to exit the program?if yes enter \"E\" again. And if you want to continue enter\"N\"");
                choice = input.next().charAt(0);
                if(choice=='E')
                {
                    System.out.println("Goodbye!");
                   // break;
                }
                else
                {
                    System.out.println("The program will continue...");
                    //continue;
                }
            }
        }
        
        
       }while(choice!='E');

    }
}