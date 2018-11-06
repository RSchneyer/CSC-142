import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;

public class ImageScramble extends JFrame {
    public ImageScramble () {
        setSize(500,500);
        setAlwaysOnTop(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static void main (String [] args) {
        ImageScramble id = new ImageScramble();
        id.setVisible(true);
    }
    
    public void paint(Graphics g) {
        int x = this.getWidth();
        int y = this.getHeight();
        super.paint(g);

        g.setColor(Color.BLACK);
        g.drawOval(x/4, y/4, x/2, y/2);

        g.setColor(Color.BLUE);
        g.fillRect(x/10, y/10, x/5, y/5);
        g.fillOval(x/10, (y - y/5 - y/10), x/5, y/5);

        g.setColor(Color.RED);
        g.fillRect((x - x/5 - x/10),(y - y/5 - y/10), x/5, y/5);
        g.fillOval((x - x/5 - x/10), y/10, x/5, y/5);
        
		g.setColor(Color.GREEN);
		g.fillArc(x/8, y/8, (4 * x / 5), (4 * y / 5), 270, 90);
		
		g.setColor(Color.YELLOW);
		g.fillArc(x/8, y/8, (3 * x / 5), (3 * y / 5), 90, 90);
		
	}
}








