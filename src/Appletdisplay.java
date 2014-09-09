import javax.swing.JApplet;
import java.awt.Graphics;
public class Appletdisplay extends JApplet {
/** 
 * This program displaying a picture from chapter 2 question 10 
 * @author cbh2917
 * Date:9/9/2014
 */
	public void paint(Graphics canvas) {
		super.paint(canvas);
		canvas.drawOval(100, 100, 100, 100);
		canvas.fillOval(125, 125, 50, 50);
		canvas.drawArc(100, 0, 100, 100, 180, 180);
		canvas.drawArc(100, 200, 100, 100, 0, 180);
		canvas.drawArc(0, 100, 100, 100, -90, 180);
		canvas.drawArc(200, 100, 100, 100, 90, 180);
		//canvas.drawArc(x, y, Width, Height, StartAngle, ArcAngle)
		//canvas.drawOval(x, y, Width, Height)
		//canvas.fillOval(x, y, Width, Height)
	}

}
