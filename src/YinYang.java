import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class YinYang extends JFrame {

	private static final long serialVersionUID = 1L;

	public YinYang(){
		super("Yin-Yang Draw Application.");
		this.setSize(500,500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void paint(Graphics g){
		super.paint(g);

		int xCenter = getWidth() / 2;
		int yCenter = getHeight() / 2;
		int radius = (int)(Math.min(getWidth(), getHeight()) * 0.4);
		int x = xCenter - radius;
		int y = yCenter - radius;

		g.setColor(Color.white);
		g.fillOval(x, y, 2 * radius, 2 * radius);
		g.setColor(Color.black);
		g.drawOval(x, y, 2 * radius, 2 * radius);
		g.setColor(Color.black);
		g.fillArc(x, y, 2 * radius, 2 * radius, 270, 180);
		g.setColor(Color.white);
		g.fillOval(x + (radius / 2), y, radius, radius);
		g.setColor(Color.black);
		g.fillOval(x + (radius / 2), y + radius, radius, radius);

		g.setColor(Color.black);
		g.fillOval(x + radius - (radius / 4), y + radius / 4, radius / 2, radius / 2);
		g.setColor(Color.white);
		g.fillOval(x + radius - (radius / 4), y + radius + radius / 4, radius / 2, radius / 2);
	}
}