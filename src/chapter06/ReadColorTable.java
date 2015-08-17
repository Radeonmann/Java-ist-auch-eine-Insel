/**
 * Multicatch
 */
package chapter06;
import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadColorTable {
	
	
	private static int[] readColorTable(String filename) {
		Scanner input = null;
		int[] colors = new int[256];
		try {
			input = new Scanner(new File(filename));
			while( input.hasNextLine() ){
				int index = input.nextInt();
				int rgb = input.nextInt(16);
				colors[index] = rgb;
			}
			return colors;
		}
		catch ( IOException e){
			System.err.printf("Dateioperationen fehlgeschlagen%n%s%n", e);
		}
		catch ( InputMismatchException | ArrayIndexOutOfBoundsException e) {
			System.err.printf("Datenformat falsch%n%s%n", e);
		}
		finally {
			if (input != null) {
				input.close();
			}
		}
		return null;
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		readColorTable("basiscolors.txt");
	}

}
