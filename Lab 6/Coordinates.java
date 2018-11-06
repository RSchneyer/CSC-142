import java.util.Scanner;
public class Coordinates{
    public static void main(String [] args){
        Scanner kb = new Scanner(System.in);
        int[] coordinates = {0,0};
        System.out.print("Please enter the x coordinate: ");
        coordinates[0] = kb.nextInt();
        System.out.print("Please enter the y coordinate: ");
        coordinates[1] = kb.nextInt();

        if(coordinates[0]>0){
            if(coordinates[1]>0){
                System.out.println("("+coordinates[0]+","+coordinates[1]+")"+" is in Quadrant I");
            }
            else if(coordinates[1]<0){
                System.out.println("("+coordinates[0]+","+coordinates[1]+")"+" is in Quadrant IV");
            }
            else{
                System.out.println("("+coordinates[0]+","+coordinates[1]+")"+" is on the positive x axis");
            }
        } 
        else if(coordinates[0]<0){
            if(coordinates[1]>0){
                System.out.println("("+coordinates[0]+","+coordinates[1]+")"+" is in Quadrant II");
            }
            else if(coordinates[1]<0){
                System.out.println("("+coordinates[0]+","+coordinates[1]+")"+" is in Quadrant III");
            }
            else{
                System.out.println("("+coordinates[0]+","+coordinates[1]+")"+" is on the negative x axis ");
            }
        }
        else{
            if(coordinates[1]>0){
                System.out.println("("+coordinates[0]+","+coordinates[1]+")"+" is on the positive y axis");
            }
            else if(coordinates[1]<0){
                System.out.println("("+coordinates[0]+","+coordinates[1]+")"+" is on the negative y axis");
            }
            else{
                System.out.println("("+coordinates[0]+","+coordinates[1]+")"+" is the origin");
            }
        }
    }
}