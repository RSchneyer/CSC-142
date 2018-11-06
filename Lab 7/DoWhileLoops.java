import java.util.*;
public class DoWhileLoops {
    public static void main (String [] args) {
        Scanner kb = new Scanner(System.in);
        int sumOfAllInputs = 0,
        inputCount = 0;
        String input = "";
        do {
            System.out.println("Enter a whole number, or q to quit.");
            int currentInputNum=0, currentCharIndex=0;
            char currentChar;
            boolean isNegative = false;
            input = kb.nextLine();
            do {
                currentChar = input.charAt(currentCharIndex);
                if(!isNegative && currentChar == '-'){
                  isNegative = true;  
                }
                if (currentChar >= '0' && currentChar <= '9')
                {
                    currentInputNum = currentInputNum * 10;
                    currentInputNum += (int)(currentChar - '0');
                }
                currentCharIndex++;
            } while (currentCharIndex < input.length());
            if (currentInputNum > 0) {
                if(isNegative){
                    currentInputNum *= -1;
                }
                sumOfAllInputs += currentInputNum;
                inputCount++;
            }
        } while (!input.equalsIgnoreCase("q"));
        System.out.printf("The sum of the %d numbers you entered is: %d\n", inputCount, sumOfAllInputs);
        if(inputCount > 0)
            System.out.printf("The average is: %.2f", (double)sumOfAllInputs/inputCount);
        else
            System.out.printf("No numbers entered - can't compute average");
    }
}