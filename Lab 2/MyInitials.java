import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;

public class MyInitials extends JFrame {
    public MyInitials () {
        setSize(500,500);
        setAlwaysOnTop(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static void main (String [] args) {
        MyInitials id = new MyInitials();
        id.setVisible(true);
    }
    
    public void paint(Graphics g) {
        int x = this.getWidth();
        int y = this.getHeight();
        super.paint(g);

        g.setColor(Color.BLACK);
        // Left leg of R
        g.fillRect(50, 50 , 25, 300);
        // Top of R
        g.fillRect(50, 50, 100, 25);
        // Bottom of R
        g.fillRect(50, 150, 100, 25);
        // Right of R
        g.fillRect(125,50,25,100);
        // Leg of R
        g.fillRect(100,150,25,175);


        g.setColor(Color.RED);
        // Top of S
        g.fillRect(200, 50, 100, 25);
        // Top left of S
        g.fillRect(200, 50, 25, 100);
        // Middle of S
        g.fillRect(200, 150, 100, 25);
        // Bottom Right of S
        g.fillRect(275, 150, 25, 100);
        // Bottom of S
        g.fillRect(200, 250, 100, 25);

		
	}
}








