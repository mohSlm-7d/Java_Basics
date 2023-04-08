/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisionproject;
import java.util.Scanner;
/**
 *
 * @author M7md_2
 */
public class Main extends TEST {
    int index = 5;
    public Main(){
        super();
    }
    void printIndex(){
        System.out.println(index);
       // TEST ref = new TEST();
        //ref.get(); 
        
        super.get();
        PRINT();
        get();
    }
    @Override
    public void get(){
        System.out.println("Sub class.");
    }
    static void main(){
       System.out.println("\nb\n\n\n\nm\n");
        Main m = new Main();
      // TEST ref = new TEST();
       //System.out.println(ref.index);
       m.printIndex();
        System.out.println("main test");
         //RevisionProject.T.print();
         Super sup = new Sub();
         System.out.println(sup.index+", ");
         sup.printVal();
         
    }
}
