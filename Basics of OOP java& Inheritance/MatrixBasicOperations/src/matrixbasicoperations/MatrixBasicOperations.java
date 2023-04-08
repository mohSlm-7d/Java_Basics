/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrixbasicoperations;

/**
 *
 * @author DELL
 */

import java.util.*;
public class MatrixBasicOperations {
    public static void main(String[] args) {
      /*Scanner Input= new Scanner(System.in); 
      char VT= Input.next().charAt(0);
      System.out.println("VT is"+VT);*/
      
      System.out.println("\nEnter the dimensions of matrix: ");
      Scanner Read = new Scanner(System.in);
     
      String diemensionEntry =Read.next();
      String [] Dimensions = diemensionEntry.split("x", 2);

      int rows= Integer.parseInt(Dimensions[0]);
      int cols= Integer.parseInt(Dimensions[1]);

      Matrix matrix= new Matrix(rows, cols);
     matrix.FillMatrix();

      boolean exit= false;
  do{
      try{
    System.out.println("Choose opertation that you want (to exit enter -1).");
    System.out.println("1. Interchange Rows.\n 2. Multiply Row by a const.\n 3. Multiply a Row by a const and add results to another Row.\n4. Compute |A| or Determinant of the matrix.");
   int choice= Read.nextInt();
    int R1, R2; 
    float num;
  
   switch(choice){
     case 1: {

       System.out.print("Enter the rows you want to interchange:\n row1: ");
       R1= Read.nextInt();
       System.out.print("\n row2: ");
       R2= Read.nextInt();
       matrix.RowInterchange(R1, R2);
       break;
     }
     case 2:{
       System.out.print("Enter the rows you want to multiply and the number to multiply it with:\n row: ");
       R1= Read.nextInt();
       System.out.print("\n num: ");
       num= Read.nextFloat();
       matrix.MultiplyRowByConst(R1, num);
       break;
     }       
     case 3: {
        System.out.print("Enter the row you want to multiply, the constant to multiply it with, and the row to add the results to:\n row1: ");
       R1= Read.nextInt();
      
       System.out.print("\n const: ");
       num= Read.nextInt();
      
       System.out.print("\n row2: ");
       R2= Read.nextInt();
       
       matrix.MulMatrixAndAddToRow(R1, num, R2);
       break;
   }
     case 4:{
       if(matrix.get_detExists())
        System.out.println("|matrix|= "+ matrix.ComputeDeterminant());
       else
         System.out.println("The matrix is not a square matrix. The determinant doesn't exist!");
       break;
     }
       default :{
         exit= true;
         System.out.println("Exited Successfully!");
       }
       
    }
          
      }catch(Exception UncheckedException){
          System.out.println("Please check the last procedure and check the following error: "+UncheckedException.getMessage());
      }
  }while(!exit);
}
}

