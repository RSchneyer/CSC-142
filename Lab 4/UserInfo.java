import java.util.Scanner;

public class UserInfo {
    public static void main(String [] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Your name? ");
        String userName = kb.nextLine();
        System.out.print("Your age? ");
        int userAge = kb.nextInt();
        System.out.print("Your occupation? ");
        kb.nextLine();
        String userJob = kb.nextLine();
                
        String userNameJustify = "Name:%" + (userName.length()+8) + "s\n"; 
        String userAgeJustify  = "Age:%"  + (9+(String.valueOf(userAge).length()))  + "s\n";
        String userJobJustify  = "Occupation:%" + (userJob.length()+2) + "s\n"; 

        System.out.printf(userNameJustify, userName);
        System.out.printf(userAgeJustify, userAge);
        System.out.printf(userJobJustify, userJob);




    }
}