import java.util.*;

public class DateConvert {
    public static void main(String [] args){
        final long startTime = System.currentTimeMillis();

        Scanner kb = new Scanner(System.in);
        
        System.out.print("Input a date (mm/dd/yyyy): ");
        String inputDate = kb.next();
        int firstSlash = inputDate.indexOf('/');
        int secondSlash = inputDate.indexOf('/', (firstSlash+1));
        String month = returnMonth(Integer.parseInt( inputDate.substring(0,firstSlash)) );
        String day = inputDate.substring((firstSlash+1),secondSlash);
        String year = inputDate.substring((secondSlash+1));
        


        System.out.println(day + "-" + month + "-" + year);
        final long endTime = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime - startTime));
    }
    public static String returnMonth(int monthAsNumber){
        String month;
        switch(monthAsNumber){
            case 1:
                month = "Jan";
                break;
            case 2:
                month = "Feb";
                break;
            case 3:
                month = "Mar";
                break;
            case 4:
                month = "Apr";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "Jun";
                break;
            case 7:
                month = "Jul";
                break;
            case 8:
                month = "Aug";
                break;
            case 9:
                month = "Sep";
                break;
            case 10:
                month = "Oct";
                break;
            case 11:
                month = "Nov";
                break;
            case 12:
                month = "Dec";
                break;
            default:
                month = "INVALID";
                break;
        }
        return month;
    }


    
}