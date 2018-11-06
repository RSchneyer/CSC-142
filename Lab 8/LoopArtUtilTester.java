import java.util.*;

public class LoopArtUtilTester{
    public static void main(String [] args){
        Random rg = new Random();
        char randCharacter;
        randCharacter = (char)(rg.nextInt(92) + 33);
        int randHeight = rg.nextInt(10) + 5;
        int randWidth = rg.nextInt(10) + 5;

        System.out.println("Testing drawSquare with size " + randHeight + " and character "+randCharacter);
        LoopArtUtility.drawSquare(randHeight, randCharacter);

        System.out.println("Testing drawHollowRectangle with height " + randHeight+", width "+randWidth+", and character "+randCharacter);
        LoopArtUtility.drawHollowRectangle(randHeight, randWidth, randCharacter);

        System.out.println("Testing drawRightTriangle with size " + randWidth + " and character "+randCharacter);
        LoopArtUtility.drawRightTriangle(randWidth, randCharacter);

        System.out.println("Testing drawSolidRectangle with height " + randHeight+", width "+randWidth+", and character "+randCharacter);
        LoopArtUtility.drawSolidRectangle(randHeight, randWidth, randCharacter);

        System.out.println("Testing drawHollowSquare with size " + randHeight + " and character "+randCharacter);
        LoopArtUtility.drawHollowSquare(randHeight, randCharacter);

        System.out.println("Testing drawOppositeRightTriangle with size " + randWidth + " and character "+randCharacter);
        LoopArtUtility.drawOppositeRightTriangle(randWidth, randCharacter);

        System.out.println("Testing drawEquilateralTrianglePointDown with size " + randWidth + " and character "+ randCharacter);
        LoopArtUtility.drawEquilateralTrianglePointDown(randWidth, randCharacter);



    }
}