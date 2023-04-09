package NUM;
import java.util.Scanner;
public class num{
    public static void main(String []args){
        Scanner input= new Scanner(System.in);
        int num;
        int Esum=0,Ecount=0,Osum=0;
        System.out.println("Please start entering the number to check whether they are even or odd, if \nyou want to exit enter -1");
        int i;
        for(i=0;;i++)
        {
         System.out.println("Please enter number "+(i+1));
         num=input.nextInt();
         if(num==-1)
         {
             if(i!=0)
             {
             i--;
             break;
             }
             else
                 break;
         }
         if(num%2==0)
         {
             Ecount++;
             Esum+=num;
         }
         else
             Osum+=num;
         
        }
        if(i!=0)
            i++;
        System.out.printf("\n\nYou entered %d Even numbers.\nYou entered %d Odd numbers.",Ecount,(i-Ecount));
        System.out.println("\nThe sum of Even numbers is: "+Esum);
        System.out.println("The sum of Odd numbers is: "+Osum);
        Average(i,Ecount,Esum,Osum);
        Numbers_10(input);
        Restricted();
        
    }    
   public static void Average(int Count, int Ecount,int Esum, int Osum){
        if(Count-Ecount!=0 || Ecount!=0)
            if(Ecount!=0)
                System.out.println("\nThe average of Even numbers is "+(Esum/Ecount));
            else if(Count - Ecount !=0)
                System.out.println("\nThe average of Odd numbers is "+(Osum/(Count-Ecount)));
    }
   public static void Numbers_10(Scanner Enter){
       
       System.out.println("Please enter 10 Numbers.");
       int num, Ecount=0, Esum=0,Osum=0;
       int j;
       for(j=0;j<10;j++){
           System.out.println("Please enter number "+(j+1));
           num=Enter.nextInt();
           if(num%2==0)
           {
               Ecount++;
               Esum+=num;
           }
           else
           {
               Osum+=num;
           }
       }
       
       System.out.println("The number of Even numbers you entered is "+Ecount);
       System.out.println("The number of Odd numbers you entered is " +(j-Ecount));
       System.out.println("The sum of Even numbers is "+Esum);
       System.out.println("The sum of Odd numbers is "+Osum);
   }
   public static void Restricted(){
       Scanner input= new Scanner(System.in);
       int Count,Ecount=0,Esum=0,Osum=0;
       System.out.println("Please enter the number of numbers you want to check: ");
       Count=input.nextInt();
       int num;
       for(int i=0;i<Count;i++)
       {
           System.out.println("Please enter number "+ (i+1));
           num=input.nextInt();
           if(num%2==0)
           {
               Ecount++;
               Esum+=num;
           }
           else
               Osum+=num;
       }
       System.out.println("The Counter of Even numbers is "+Ecount);
       System.out.println("The Counter of Odd numbers is "+ (Count-Ecount));
       System.out.println("The sum of Even numbers is "+Esum);
       System.out.println("The sum of Odd numbers is "+Osum);
   }
    
}