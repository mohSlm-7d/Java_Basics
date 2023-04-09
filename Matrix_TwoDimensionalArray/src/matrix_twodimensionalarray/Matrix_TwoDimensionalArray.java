/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix_twodimensionalarray;
import java.util.Scanner;
/**
 *
 * @author M7md_2
 */
public class Matrix_TwoDimensionalArray {
    static Scanner input = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Please Enter the number of Rows of the array: ");
        int rows=input.nextInt();
        System.out.println("Please Enter the number of Columns of the array: ");
        int columns=input.nextInt();
        String [][] matrix= new String[rows][columns];
        fillArray(matrix);
        printArray(matrix);
        String total=Summary(matrix);
        System.out.println("The Full String(Script)is "+total);
    }
    public static void fillArray(String [][] Arr){
        for(int i=0;i<Arr.length;i++)
        {
            System.out.println("Enter the Symbols of Row No "+(i+1));
            for(int j=0;j<Arr[0].length;j++)
                Arr[i][j]=input.next();
        }
    }
    public static void printArray(String [][] Arr){
        System.out.println("The Output: ");
        for(int i=0;i<Arr.length;i++)
        {
            for(int j=0;j<Arr[0].length;j++)
                System.out.print(Arr[i][j]+"\t");
            System.out.println();
        }
    }
    public static String Summary(String [][]Arr){
        String Sum="";
        for(int i=0;i<Arr.length;i++){
            for(int j=0;j<Arr[i].length;j++)
                Sum+=Arr[i][j];
        }
        return Sum;
        
    }
}
