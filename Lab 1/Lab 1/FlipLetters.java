import java.util.Scanner;

public class FlipLetters
{
    public static void main (String [] args){
        Scanner kb = new Scanner(System.in);
        String userInput, 
        firstLetter,
        lastLetter,
        newWord;
        
        System.out.print("What's your word? ");
        userInput = kb.next();
        int userInputLength = userInput.length();
        
        firstLetter = userInput.substring(0,1);
        lastLetter = userInput.substring(userInputLength-1);
        userInput = userInput.substring(1, userInputLength-1);
        newWord = lastLetter + userInput + firstLetter;
        System.out.println(newWord);
    }
}
