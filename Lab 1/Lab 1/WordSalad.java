import java.util.Scanner;

public class WordSalad{
    public static void main(String [] args) {
        Scanner keyboard = new Scanner(System.in);
        String userInput;
        int userInputLength;

        System.out.print("Enter your full name: ");
        userInput = keyboard.nextLine();
        userInputLength = userInput.length();

        System.out.printf("%s\n", userInput);
        String padding = "%"+userInputLength+"s";
        System.out.printf("%5s", userInput);

    }


}