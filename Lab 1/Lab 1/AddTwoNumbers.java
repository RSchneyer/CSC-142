import java.util.Scanner;

public class AddTwoNumbers{
    public static void main (String [] args){
        Scanner kb = new Scanner(System.in);
        int x, y, z;
        
        System.out.print("Input int x: ");
        x = kb.nextInt();
        
        System.out.print("Input int y: ");
        y = kb.nextInt();
        
        z = x + y;
        
        System.out.println("The sum of " + x + " and " + y + " is " +z); 
    }
}