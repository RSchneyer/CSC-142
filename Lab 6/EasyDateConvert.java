import java.util.*;

public class EasyDateConvert {
    public static void main(String [] args){
        final long startTime = System.currentTimeMillis();

        Scanner kb = new Scanner(System.in);
        String [] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec", };
        System.out.print("Input a date (mm/dd/yyyy): ");
        String inputDate = kb.next();

        int firstSlash = inputDate.indexOf('/');
        int secondSlash = inputDate.indexOf('/', (firstSlash+1));
        int monthIndex = (Integer.parseInt( inputDate.substring(0,firstSlash))) - 1;

        String day = inputDate.substring((firstSlash+1),secondSlash);
        String year = inputDate.substring((secondSlash+1));
        String month = months[monthIndex];


        System.out.println(day + "-" + month + "-" + year);
        final long endTime = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime - startTime));
    }    
}