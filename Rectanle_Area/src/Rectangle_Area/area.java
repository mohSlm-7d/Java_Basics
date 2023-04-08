package Rectangle_Area;
import java.util.Scanner;
public class area{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int length,width,area;
        System.out.print("Input rectangle length: ");
        length=input.nextInt();
        System.out.print("Input rectangle width: ");
        width=input.nextInt();
        area=length*width;
        System.out.printf("The area of the rectangle is: %d",area);
    }
}