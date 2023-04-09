/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;
import java.util.Scanner;
/**
 *
 * @author M7md_2
 */
public class Arrays {
    static Scanner input= new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Please Enter the number of Employees: ");
        int size= input.nextInt();
        double [] salaries = new double[size];
        double sum=0;
        
        for(int i=0;i<salaries.length;i++){
            System.out.println("Please Enter salary for Employee NO "+(i+1));
            salaries[i]=input.nextDouble();
        }
        for(int j=0;j<salaries.length;j++)
            sum+=salaries[j];
        System.out.println("\nThe average of the salaries is "+sum/salaries.length);
        /*System.out.println("How many numbers you want to Enter? ");
        int Size=input.nextInt();
        int [] numbers = new int [Size];
        System.out.println("Please Enter the integer numbers to find the average for positive numbers only.");
        for(int i=0; i<numbers.length;i++){
         numbers[i]=input.nextInt();
        }
        //int AllSum=0 ;
        int Sum=0,count=0;
        for(int j=0;j<numbers.length;j++){
            //AllSum+=numbers[j];
            if(numbers[j]>0)
            {
                Sum+=numbers[j];
                count++;
            }
            
        }
        System.out.println("The average of the positive integeres you Entered is "+Sum/count);
        //System.out.println("The average of all numbers you Entered is "+Sum/numbers.length);*/
        
        for(;;){
            System.out.println("Please Enter you choice from the following\n1.Enter the salaries.\n2.Print the salaries.");
            System.out.println("3.Search for particular salary.\nEnter -1 to Exit.");
            int choice=input.nextInt();
            switch(choice){
                case 1:fillArray(salaries);break;
                case 2: printArray(salaries);break;
                case 3:         
                {
                    System.out.println("Please enter the salary you are looking for: ");
                    double search=input.nextDouble();
                    SearchArray(salaries, search);
                }
                case -1:return;
                default:System.out.println("Please enter a valid choice!");
        
            }
        }

        
    }
    public static void SearchArray(double [] salary, double search){
        for(int i=0;i<salary.length;i++)
        {
            if(salary[i]==search)
            {
                System.out.println("The salary you are looking for is found at index "+i);
                return;
            }
            if(i==salary.length-1)
                System.out.println("The salary you are looking for is not found!");
        }
    }
    public static void printArray(double[]salary){
        System.out.println("The salaries of the Employees: ");
        for(int j=0;j<salary.length;j++)
            System.out.println("The salary of Employee NO "+(j+1)+" is "+salary[j]);
    }
    public static void fillArray(double [] salary){
        System.out.println("Please Enter the salaries: ");
        for(int i=0;i<salary.length;i++){
            System.out.print("The salary of Employee NO "+(i+1)+" : ");
            salary[i]=input.nextDouble();
        }
    }
}
