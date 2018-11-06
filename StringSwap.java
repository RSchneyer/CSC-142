import java.util.*;
import java.io.*;

public class StringSwap {
    public static void main(String [] args) {
        String s1 = new String("France");
        String s2 = new String("Germany");

        System.out.println(s1.compareTo(s2) < 0);
        System.out.println(s1.compareToIgnoreCase("france") == 0);
        System.out.println(s2.compareTo(s1) > 0);
        System.out.println(s2.equals("germany"));
        System.out.println(s2.equalsIgnoreCase("GERMANY"));
    }
}