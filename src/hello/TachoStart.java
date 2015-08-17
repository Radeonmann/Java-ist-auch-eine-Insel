package hello;


public class TachoStart {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		TachoFrame frame = new TachoFrame();
		
		while (true) {
			
			int choice = userUtils.Input.getInt("Tachostand?");
			if (choice < 0) break;
			frame.setTacho(choice);
			frame.repaint();
			
			
		}

		

	}

}
