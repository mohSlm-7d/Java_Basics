/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author DELL
 */
import java.util.Scanner;
public class Solution {
    private static Scanner Read = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    private static String Reverse(String Original){
        //0 1 2 3 4 5      6   6/2=3  0 1 2  3  4 5 
        //0 1 2 3 4 5 6    7
        //  7 / 2 = 3.5   3   0 1 2    3    4 5 6
        char[] Chars = Original.toCharArray();
        int i=0, j=Chars.length-1;
        while(i!=j){
            char temp = Chars[i];
            Chars[i] = Chars[j];
            Chars[j] = temp;
            i++;
            j--;
        }
        Original = String.copyValueOf(Chars);
        return Original;
    }
    public static void main(String[] args) {
        System.out.println("Please enter a text: ");
        String text = Read.nextLine();
        
        System.out.println("Original: "+ text);
        
        text = Reverse(text);
        
        System.out.println("Reverse: "+ text);
    }
    
}
