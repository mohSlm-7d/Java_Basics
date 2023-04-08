/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

/**
 *
 * @author M7md_2
 */
public class Exam {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        // TODO code application logic here
      /* double y=  Math.pow(4,1);
       int x=1;
       switch(x){
           case 1: System.out.println("h");
           case 2: System.out.println("b");
           case 3: System.out.println("m");
           default:
                System.out.println("g");*/
      String name ="mohammad";
      name=name.toUpperCase();
      System.out.println(name);
      Employee Emp = new Employee(), Emp1 = new Employee();
      System.out.println(Emp);
      System.out.println(Emp1);
      Emp = Emp1;
      System.out.println("After:");
      System.out.println(Emp);
      System.out.println(Emp1);
    }
}
