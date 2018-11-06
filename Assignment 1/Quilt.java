//Program that creates a quilt pattern in a JFrame window
//Reid Schneyer
//9-24-2018

import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;

public class Quilt extends JFrame {
    public Quilt () {
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
    }
    
    public void paint(Graphics g) {
        //Setup for Graphics/painting
        int frameWidth = this.getWidth();
        int frameHeight = this.getHeight();
        super.paint(g);
        
        //Create X and Y arrays for each of the 4 polygons
        int[] polygonOneXPoints = {(frameWidth/4), (frameWidth/4), (frameWidth/2), (frameWidth/2) };
        int[] polygonOneYPoints = {0, (frameHeight/4), (frameHeight/2), (frameHeight/4)};

        int[] polygonTwoXPoints = {(frameWidth/2), (frameWidth/2), (3*(frameWidth/4)), (3*(frameWidth/4))};
        int[] polygonTwoYPoints = {(frameHeight/2), (frameHeight/4), 0, (frameHeight/4)};

        int[] polygonThreeXPoints = {(frameWidth/2), (3*(frameWidth/4)), (frameWidth), (3*(frameWidth/4))};
        int[] polygonThreeYPoints = {(frameHeight/2), (frameHeight/4), (frameHeight/4), (frameHeight/2)};

        int[] polygonFourXPoints = {(frameWidth/2), (3*(frameWidth/4)), (frameWidth), (3*(frameWidth/4))};
        int[] polygonFourYPoints = {(frameHeight/2), (frameHeight/2), (3*(frameHeight/4)), (3*(frameHeight/4))};

        int[] polygonFiveXPoints = {0, (frameWidth/4), (frameWidth/2), (frameWidth/4)};
        int[] polygonFiveYPoints = {(frameHeight/4), (frameHeight/4), (frameHeight/2), (frameHeight/2)};

        int[] polygonSixXPoints = {(frameWidth/4), (frameWidth/2), (frameWidth/4), 0};
        int[] polygonSixYPoints = {(frameHeight/2), (frameHeight/2), (3*(frameHeight/4)), (3*(frameHeight/4))};

        int[] polygonSevenXPoints = {(frameWidth/2), (frameWidth/2), (frameWidth/4), (frameWidth/4)};
        int[] polygonSevenYPoints = {(frameHeight/2), (3*(frameHeight/4)), (frameHeight), (3*(frameHeight/4))};

        int[] polygonEightXPoints = {(frameWidth/2), (3*(frameWidth/4)), (3*(frameWidth/4)), (frameWidth/2)};
        int[] polygonEightYPoints = {(frameHeight/2), (3*(frameHeight/4)), (frameHeight), (3*(frameHeight/4))};

        //Set background
        g.setColor(Color.BLUE);
        g.fillRect(0,0,frameWidth,frameHeight);
        
        //Draw borders of shapes
        g.setColor(Color.BLACK);
        g.drawPolygon(polygonOneXPoints, polygonOneYPoints, 4);
        g.drawPolygon(polygonTwoXPoints, polygonTwoYPoints, 4);
        g.drawPolygon(polygonThreeXPoints, polygonThreeYPoints, 4);
        g.drawPolygon(polygonFourXPoints, polygonFourYPoints, 4);
        g.drawPolygon(polygonFiveXPoints, polygonFiveYPoints, 4);
        g.drawPolygon(polygonSixXPoints, polygonSixYPoints, 4);
        g.drawPolygon(polygonSevenXPoints, polygonSevenYPoints, 4);
        g.drawPolygon(polygonEightXPoints, polygonEightYPoints, 4);

        //Fill shapes in with different colors
        g.setColor(Color.RED);
        g.fillPolygon(polygonOneXPoints, polygonOneYPoints, 4);
        g.fillPolygon(polygonEightXPoints, polygonEightYPoints, 4);

        g.setColor(Color.ORANGE);
        g.fillPolygon(polygonTwoXPoints, polygonTwoYPoints, 4);
        g.fillPolygon(polygonSevenXPoints, polygonSevenYPoints, 4);

        g.setColor(Color.YELLOW);
        g.fillPolygon(polygonThreeXPoints, polygonThreeYPoints, 4);
        g.fillPolygon(polygonSixXPoints, polygonSixYPoints, 4);

        g.setColor(Color.GREEN);
        g.fillPolygon(polygonFourXPoints, polygonFourYPoints, 4);
        g.fillPolygon(polygonFiveXPoints,polygonFiveYPoints,4);





    }
    
    public static void main(String [] args) {
        Quilt prog = new Quilt();
        prog.setVisible(true);
    }
}