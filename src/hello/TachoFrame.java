package hello;

import java.awt.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class TachoFrame extends JFrame {
	
	private int zeroX, zeroY, tachoValue, tachoLength;
	
	TachoFrame(){
		super("Tacho");
		this.initFrame();
	}
	
	private void initFrame() {
		int width, height;
		
		width = Toolkit.getDefaultToolkit().getScreenSize().width / 2;
		height = Toolkit.getDefaultToolkit().getScreenSize().height / 2;
		
		
		this.setSize(width, height);
		this.setVisible(true);
		
		zeroX = width / 2;
		zeroY = height - 10;
		tachoValue = 0;
		tachoLength = height / 2;
		
	}
	
	
	@Override public void paint(Graphics g){
		int width = this.getWidth(),
				height = this.getHeight();
		
		
		zeroX = width / 2;
		zeroY = height - 10;
		
		if ( height <= width)
			tachoLength = height / 2;
		
		g.setFont(new Font("Dialog", Font.PLAIN, 18));
	    g.setColor(Color.BLUE);
		g.drawString("Breite = " + width, 30, 50);
		
		drawTacho(g);
	}
	
	private void drawTacho(Graphics g) {
		
		int deltaX, deltaY;
		
		deltaX = (int) - ( Math.cos(Math.toRadians(tachoValue)) * tachoLength );
		deltaY = (int) - ( Math.sin(Math.toRadians(tachoValue)) * tachoLength );
		
		g.setColor(Color.WHITE);
		g.fillArc(zeroX-tachoLength, zeroY-tachoLength, tachoLength*2, tachoLength*2, 0, 180);
		
		g.setColor(Color.BLACK);
		g.drawLine(zeroX, zeroY, zeroX + deltaX, zeroY + deltaY);
		
	}
	
	public void setTacho(int value) {
		if ( value > 0 && value <= 180)
			this.tachoValue = value;
	}

}
