import java.util.*;
public class Lab5Part1 {
    public static void main(String [] args) {
        Scanner kb = new Scanner(System.in);
        int n1=0, n2=0;
        boolean doAgain = true;

        while (doAgain) {
             
            try {
                System.out.print("Enter first number: ");
                n1 = kb.nextInt();
                System.out.print("Enter second number: ");
                n2 = kb.nextInt();                
                
                System.out.printf("The sum is: %d\n",(n1 + n2)); 
                System.out.printf("The product is: %d\n", (n1 * n2));
                doAgain = false; 
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Try again.");
                kb.nextLine();
            }
        }
        
        
    }
} 
