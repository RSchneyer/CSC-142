import java.util.Random;
import java.util.Scanner;

public class DistForm{
    public static void main(String [] args) {
        Random rg = new Random();
        Scanner kb = new Scanner(System.in);

        int decimalPlaces;
        int x1 = (rg.nextInt(16)) + 5;
        int y1 = (rg.nextInt(16)) + 5;
        int x2 = (rg.nextInt(16)) + 5;
        int y2 = (rg.nextInt(16)) + 5;
        int x3 = (rg.nextInt(16)) + 5;
        int y3 = (rg.nextInt(16)) + 5;
        
        System.out.printf("%15s%15s%15s\n", "Point A", "Point B", "Point C");
        System.out.printf("%9s%6s%9s%6s%9s%6s\n", "x", "y", "x", "y", "x", "y");
        System.out.printf("%9d%6d%9d%6d%9d%6d\n", x1, y1, x2, y2, x3, y3);

        System.out.print("Enter number of visible decimal places: ");
        decimalPlaces = kb.nextInt();

        String precision = "%15."+ decimalPlaces + "f";
        double aToB = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2-y1), 2));
        double bToC = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3-y2), 2));
        double cToA = Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3-y1), 2));
        System.out.println("Distances");
        System.out.printf("%15s%15s%15s\n", "A to B", "B to C", "C to A");
        System.out.printf(precision, aToB);
        System.out.printf(precision, bToC);
        System.out.printf(precision, cToA);



    }
}