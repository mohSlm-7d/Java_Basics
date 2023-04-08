/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisionproject;

/**
 *
 * @author M7md_2
 */

enum string{Null}
/*abstract*/ public abstract class TEST implements Example1{
   int index;
    public void hello(){
        System.out.println("Hello");
    }
    public TEST(){
        System.out.println("Constructor with no args");
    }
    public void print(){
        string E = string.Null;
     System.out.println(E);
           
    }   
    public void get(){
        System.out.println("GETTER.");
    }
    public void PRINT(){
        System.out.println("Super class.");
    }
}
