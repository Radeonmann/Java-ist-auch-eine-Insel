
public class Squared {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2;
		System.out.println( "Quadrat: " + n*n);
		System.out.println("Hello");
		
		while(true){
			try {
				n = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Hallloooo"));
				break;
				
			} catch (Exception e) {
				javax.swing.JOptionPane.showMessageDialog( null, "Keine Zahl eingegeben!" );
			}
			
		}
		
		
		
		System.out.println(n);

	}

}
