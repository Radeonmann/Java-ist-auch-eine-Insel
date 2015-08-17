package userUtils;

public class Input {

	public static String getString(String argument) {
		String input = javax.swing.JOptionPane.showInputDialog( argument );
		return input;
	}
	
	public static int getInt(String argument) {
		int result;
		
		while(true){
			try {
				result = Integer.parseInt(javax.swing.JOptionPane.showInputDialog( argument ));
				break;
				
			} catch (Exception e) {
				javax.swing.JOptionPane.showMessageDialog( null, "Keine Zahl eingegeben!" );
			}
			
		}
		return result;
	}
	
	public static double getDouble(String argument) {
		double result;
		
		while(true){
			try {
				result = Double.parseDouble(javax.swing.JOptionPane.showInputDialog( argument ));
				break;
				
			} catch (Exception e) {
				javax.swing.JOptionPane.showMessageDialog( null, "Keine Zahl eingegeben!" );
			}
			
		}
		return result;
	}
	
}
