/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrixbasicoperations;

/**
 *
 * @author DELL
 */
import java.util.*;
class Matrix {
  private float[][] MatrixData;
  private int Rows, Cols;
  private boolean detExists;
  private Scanner Enter= new Scanner(System.in);
  
  public Matrix(int Rows, int Cols){
    if(Rows != 0 && Cols !=0){
      this.Rows= Rows;
      this.Cols= Cols;
      this. MatrixData= new float [this.Rows][this.Cols];
    }
  }

  public void FillMatrix(){
    System.out.println("\nEnter Data of matrix entires: ");
    for(int i=0; i<this.Rows; i++){
      System.out.println("\nEntries of row "+(i+1)+": ");
      for(int j=0; j<this.Cols;j++){
       MatrixData[i][j]= Enter.nextInt();
      }
    }
    this.PrintMatrix();
  }
  public void PrintMatrix(){
    System.out.println("\n\nThe current matrix: ");
    for(int i=0; i<this.Rows; i++){
      for(int j=0; j<this.Cols;j++){
        if((MatrixData[i][j] % (int)MatrixData[i][j] == 0) || MatrixData[i][j] == 0){
          System.out.print((int)MatrixData[i][j]+"\t");
        }
        else{
          System.out.println(MatrixData[i][j]+"\t");
        }
      }
      System.out.println("\n");
    }
    System.out.println("\n");
  }
  public void RowInterchange(int R1, int R2){
    R1= R1-1;
    R2=R2-1;
    float Swap;
    for(int i=0; i<this.Cols; i++){
      Swap= this.MatrixData[R1][i];
      this.MatrixData[R1][i]= this.MatrixData[R2][i];
      this.MatrixData[R2][i]= Swap;
    }
    this.PrintMatrix();
  }
  public void MultiplyRowByConst(int Row, float num){
    Row=Row-1;
    for(int i=0; i<this.Cols; i++){
     this.MatrixData[Row][i]= this.MatrixData[Row][i] * num;
    }
    this.PrintMatrix();
  }
  public void MulMatrixAndAddToRow(int R1, float num, int R2){
    R1=R1-1;
    R2=R2-1;
    for(int i=0; i<this.Cols; i++){
      this.MatrixData[R2][i]+= num* MatrixData[R1][i];
    }
    this.PrintMatrix();
  }

  private Matrix ComputeMinorSubMatrix(int Row, int Col){
   
    Matrix MinorSubMatrix= new Matrix(this.Rows -1, this.Cols -1);
   
   int i=1, j=0;
   int x=0, y=0;
   while(x< MinorSubMatrix.Rows){
     /*if(i==Row){
      i++; 
     }*/
     if(j == Col && j <this.Cols){
       j++;
     }
     
     if(j< this.Cols){
      MinorSubMatrix.MatrixData[x][y++]=this.MatrixData[i][j++];
     }
     else{
       i++;
       x++;
       
       j=0;
       y=0;
     }
     
   }
    MinorSubMatrix.PrintMatrix();
   return MinorSubMatrix;
  }
  
  protected float ComputeDetOfMinorSubMatrix(int Row, int Col){
    
    Matrix MinorSubMatrix= this.ComputeMinorSubMatrix(Row, Col);
    
    int i=0, j=0;
    float MainDiagonalMul=1;
    while(i< MinorSubMatrix.Rows && j< MinorSubMatrix.Cols){
      MainDiagonalMul*= MinorSubMatrix.MatrixData[i][j];
      i++;
      j++;
    }

    float OtherDiagonalMul= 1;
    i=0;
    j= MinorSubMatrix.Cols-1;
    while(i< MinorSubMatrix.Rows && j>=0){
      OtherDiagonalMul*= MinorSubMatrix.MatrixData[i][j];
      i++;
      j--;
    }
 
    return MainDiagonalMul - OtherDiagonalMul;
  }
  
 public float ComputeDeterminant(){
   
   if(this.Rows != this.Cols){
    detExists= false;
    return -1;
   }
   
   int sign= 1, i=0;
   float Determinant=0;
   for(int j=0; j< this.Cols; j++){
    Determinant+= (sign*this.MatrixData[i][j])*(this.ComputeDetOfMinorSubMatrix(i, j));
    sign*= -1;
   }
   detExists=true;
   return Determinant;
 
 }

  public boolean get_detExists(){
    return detExists;
  }
  
}
