/**
 * Set of methods for drawing geometric shapes on the terminal screen
 * @author Cate Sheller
 * @version 23-October-2018
 */
public class LoopArtUtility {
    /**
     * Draws a square using the specified size and drawing character
     * @param size: the length and width of the square
     * @param ch: the character to draw with
     */
    public static void drawSquare(int size, char ch) {
        for (int x=0; x<size; x++) {
            for (int y=0; y<size; y++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
    /**
     * Draws the outline of a rectangle using the specified dimensions
     * and drawing character
     * @param ht: the height of the rectangle
     * @param wid: the width of the rectangle
     * @param ch: the character to draw with
     */
    public static void drawHollowRectangle(int ht, int wid, char ch) {
        for (int x=0; x<ht; x++) {
            for (int y=0; y<wid; y++) {
                if(x==0 || x==ht-1 || y==0 || y==wid-1) {
                    System.out.print(ch + " ");
                }
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    /**
     * Draws a right triangle using specified height and drawing character
     * @param ht: height of the triangle
     * @param ch: character to draw with
     */
    public static void drawRightTriangle(int ht, char ch) {
        for (int x=0; x<ht; x++) {
            for (int y=0; y<=x; y++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    public static void drawSolidRectangle(int ht, int wid, char ch){
        for (int x=0; x<ht; x++) {
            for (int y=0; y<wid; y++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    public static void drawHollowSquare(int size, char ch){
        for (int x=0; x<size; x++) {
            for (int y=0; y<size; y++) {
                if(x==0 || x==size-1 || y==0 || y==size-1) {
                    System.out.print(ch + " ");
                }
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void drawOppositeRightTriangle(int ht, char ch){
        for (int x=0; x<ht; x++) {
            for (int y=ht; y>x; y--) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    public static void drawEquilateralTrianglePointDown(int size, char ch){
        int x, y, z;
        for(x = size; x>0; x--){
            for(z = 0; z<(size-x); z++){
                System.out.print(" ");
            }
            for(y = size-z; y>0; y--){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }


}