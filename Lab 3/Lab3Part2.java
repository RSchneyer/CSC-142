import java.util.*; // brings in Random & Scanner
public class Lab3Part2 {
    public static void main (String [] args) {
    Random rg = new Random();       // random generator
        int     randVal1 = rg.nextInt(100)+1,  
            randVal2 = rg.nextInt(50)+1,   
            max = Integer.MAX_VALUE, 
            min = Integer.MIN_VALUE; 
        System.out.println("The numbers are: " + randVal1 + 
            " and " + randVal2);
        // find & print sum:
        int sum = randVal1 + randVal2;
        System.out.println("The sum is: " + sum);

        int diff = randVal1 - randVal2;
        System.out.println("The difference is: " + diff);

        int product = randVal1 * randVal2;
        System.out.println("The product is: " + product);

        int intQuot = randVal1 / randVal2;
        System.out.println("The integer quotient is: " + intQuot);

        int intRem = randVal1 % randVal2;
        System.out.println("The integer remainder is: " + intRem);

        double realQuot = randVal1 / (double)randVal2;
        System.out.println("The real quotient is: " + realQuot);
        
    
        System.out.println("The biggest integer is " + max +
                        " and the smallest is " + min);
         // Add code here to compute & output the difference,
         // product, quotient & modulus of max & min:
         int maxDiff = max - min;
         System.out.println("The difference is: " + maxDiff);

         int maxProd = max * min;
         System.out.println("The product is: " + maxProd);

         int maxQuot = max / min;
         System.out.println("The quotient is: " + maxQuot);

         int maxMod = max % min;
         System.out.println("The modulus is: " + maxMod);

    } // end of main
} // end of class