import java.util.Scanner;

public class MiddleLetter {
    public static void main (String [] args){
        Scanner keyBoard = new Scanner(System.in);

        System.out.print("Enter your word: ");
        String userInput = keyBoard.next();

        int middleIndex = (userInput.length())/2;
        char middleChar = userInput.charAt(middleIndex);
        System.out.println(middleChar + userInput + middleChar);


    }
}