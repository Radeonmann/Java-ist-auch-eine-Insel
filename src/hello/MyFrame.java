package hello;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	
	  /**
	 * 
	 */
	private static final long serialVersionUID = -4020950840778254493L;
	
	MyFrame() {
		
	}
	
	MyFrame(String name) {
		super.setName(name);
	}
	
	private String text = "";
	
	@Override public void paint(Graphics g) {
	    super.paint(g);
	    g.setFont(new Font("Dialog", Font.PLAIN, 18));
	    g.setColor(Color.BLUE);
	    g.drawString(text, 10,40);
	  }
	
	public void setText (String text) {
		if (text != null)
			this.text = text;
	}
	
	public void drawTriangle(int x, int y, int width, int height) {
		Graphics g = getGraphics();
		
		g.drawLine(x, y, x+width, y);
		g.drawLine(x+width, y, x+(width/2), y+height);
		g.drawLine(x, y, x+(width/2), y+height);
	}
	  
}
