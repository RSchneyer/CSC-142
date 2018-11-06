import javax.swing.*;
import java.util.*;

public class ErrorHandlingDialog{
    public static void main(String [] args) {
        boolean failing = true;
        String n1, n2;
        int x,y;
        while(failing){
            try {
                n1 = JOptionPane.showInputDialog(null, "Enter your first number: ");
                x = Integer.parseInt(n1);
                n2 = JOptionPane.showInputDialog(null, "Enter your second number: ");
                y = Integer.parseInt(n2);
                JOptionPane.showMessageDialog(null, ("Product is: " + (x*y)));
                JOptionPane.showMessageDialog(null, ("Quotient is: " + (x/y)));
                failing = false;
            } catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "that's not an number, try again");
            }
        }
    }
}