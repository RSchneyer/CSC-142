import java.util.*;
public class DoWhileDouble{
    public static void main (String [] args) {
        Scanner kb = new Scanner(System.in);
        double sumOfAllInputs = 0;
        int inputCount = 0;
        String input = "";
        do {
            System.out.println("Enter a whole number, or q to quit.");
            double currentInputNum=0;
            int currentCharIndex=0;
            double placesAfterDec = 1;
            char currentChar;
            boolean isNegative = false;
            boolean isDecimal = false;
            input = kb.nextLine();
            do {
                currentChar = input.charAt(currentCharIndex);

                if(!isNegative && currentChar == '-'){
                  isNegative = true;  
                } else if(!isDecimal && currentChar == '.'){
                    placesAfterDec *= 0.1;
                    isDecimal = true;
                } else if (currentChar >= '0' && currentChar <= '9'){
                    if(!isDecimal){
                        currentInputNum = currentInputNum * 10;
                        currentInputNum += (int)(currentChar - '0');
                    } else{
                        currentInputNum += (double)((currentChar - '0')*placesAfterDec);
                        placesAfterDec *= 0.1;
                    }
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

        System.out.printf("The sum of the %d numbers you entered is: %f\n", inputCount, sumOfAllInputs);
        if(inputCount > 0)
            System.out.printf("The average is: %.2f", (double)sumOfAllInputs/inputCount);
        else
            System.out.printf("No numbers entered - can't compute average");
    }
}