package hello;

import javax.swing.WindowConstants;
import javax.swing.JOptionPane;

import java.awt.*;

public class Testing {

	/**
	 * @param args
	 */
	public static void main( String[] args ) {
		
		int width = 600;
		int height = 400;
		boolean isFullScreen;
		
		if (JOptionPane.showConfirmDialog(null, "Vollbild?", "Vollbild?", 0) == 0 ) {
			isFullScreen = true;
		} else {
			isFullScreen = false;
		}
		
		Toolkit.getDefaultToolkit().beep();
		
		
		
		
		MyFrame frame = new MyFrame("Mein Fenster");
	    if (isFullScreen) {
	    	frame.setSize(Toolkit.getDefaultToolkit().getScreenSize());
	    } else {
	    	frame.setSize(width,height);
	    }
	    frame.setVisible(true);
	    frame.setResizable(false);
	    JOptionPane.showMessageDialog(null, "Aktualisieren");
	    frame.setText("Haaaaloooo");
	    frame.repaint();
	    
	    
	    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	    
	    
	    
	    if (JOptionPane.showConfirmDialog(frame, "Hintergrund?", "Hintergrund?", 0) == 0 ) {
	    	frame.toBack();
	    }
	    frame.setTitle("Haaaloooo");
	    
	    frame.drawTriangle(100, 300, 100, 200);
	    

		
	}


}
