import java.util.Scanner;

public class WordSalad{
    public static void main(String [] args) {
        Scanner keyboard = new Scanner(System.in);
        String userInput;
        int userInputLength;

        System.out.print("Enter your full name: ");
        userInput = keyboard.nextLine();
        userInputLength = userInput.length();
        String padding1 = "%"+(2*userInputLength)+"s\n";
        String padding2 = "%"+(4*userInputLength)+"s\n";

        System.out.printf("%s\n", userInput);
        System.out.printf(padding1, userInput);
        System.out.printf(padding2, userInput);
        System.out.printf(padding1, userInput);
        System.out.printf("%s\n", userInput);
        
        keyboard.close();
    }


}