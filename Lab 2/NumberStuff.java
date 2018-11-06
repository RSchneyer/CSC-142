import java.util.Random;

public class NumberStuff {
    public static void main (String [] args){
        Random rng = new Random();
        int num1 = rng.nextInt(51)+50;
        int num2 = rng.nextInt(31)+10;
        
        double oneToTheTwo = Math.pow(num1, num2);
        double sqrtTwo = Math.sqrt(num2);
        double cbrtTwo = Math.cbrt(num1);
        double natLogTwo = Math.log(num2);
        double tenLogOne = Math.log10(num1);
        double hypotenuse = Math.sqrt( (Math.pow(num1,2.0)) + (Math.pow(num2,2.0)) );

        System.out.println("The values are: " + num1 + " and " + num2);
        System.out.println("----------------------------------------");
        System.out.println(num1 + " to the power of " + num2 + " = " + oneToTheTwo);
        System.out.println("The square root of " + num2 + " is " + sqrtTwo);
        System.out.println("The cube root of " + num1 + " is " + cbrtTwo);
        System.out.println("The natural log of " + num2 + " is " + natLogTwo);
        System.out.println("The log base 10 of " + num1 + " is " + tenLogOne);
        System.out.println("The hypotenuse of the right triangle with legs " + num1 + " and " + num2 + " is " + hypotenuse);
        
    }
}