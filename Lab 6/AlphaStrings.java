import java.util.*;
public class AlphaStrings {
    public static void main(String [] args) {
        String string1, string2, string3;
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        string1 = kb.next();
        System.out.print("Enter the second string: ");
        string2 = kb.next();
        System.out.print("Enter the third string: ");
        string3 = kb.next();
        
        String first;
        //Don't know why I have to do this, ask Cate
        String second = "";
        String third = "";
        first = returnEarlierString(string1, string2);
        first = returnEarlierString(first, string3);
        
        if(first.equalsIgnoreCase(string1)){
            second = returnEarlierString(string2, string3);
            if(second.equalsIgnoreCase(string2)){
                third = string3;
            }
            else if (second.equalsIgnoreCase(string3)){
                third = string2;
            }
        }
        else if (first.equalsIgnoreCase(string2)){
            second = returnEarlierString(string1, string3);
            if(second.equalsIgnoreCase(string1)){
                third = string3;
            }
            else if(second.equalsIgnoreCase(string3)){
                third = string1;
            }
        }
        else if (first.equalsIgnoreCase(string3)){
            second = returnEarlierString(string1, string2);
            if(second.equalsIgnoreCase(string1)){
                third = string2;
            }
            else if(second.equalsIgnoreCase(string2)){
                third = string1;
            }
        }
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
    }
    public static String returnEarlierString(String a, String b){
        // Returns the string that occurs earlier in the alphabet, returns first if equal
        // The whole compareToIgnoreCase thing was confusing me, so I made this method 
        String first = "";
        int x = a.compareToIgnoreCase(b);
        if(x > 0){
            first = b;
        } else if(x<=0){
            first = a;
        }
        return first;
    }
}