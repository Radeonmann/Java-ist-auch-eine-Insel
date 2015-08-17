package examples;

public class OverloadExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// In Java können Methoden überladen werden
		// das heisst, dass der selbe Methodenname mit verschiedenen Datentypen
		// deklariert werden kann
		//
		// Ausserdem kann man durch ... Kennzeichnen, das mehrere Werte übergeben
		// werden können (Varargs)
		// In der Funktion wird die Variable als Array behandelt
		
		int i;
		double d;
		
		//Int
		System.out.println("Zuerst int:");
		i = max(1,4,5,2);
		System.out.println("i ist: " + i);
		System.out.println();
		
		//Double
		System.out.println("Jetzt double:");
		d = max(1., 4., 5., 2.);
		System.out.println("d ist: " + d);
		System.out.println();

	}
	
	
	/*
	 * Double Methode max
	 */
	static double max(double... zahlen) {
		if (zahlen.length > 0) {
			double max=0;
			
			//Hierdurch erkennt man welche Methode nun aufergufen wurde
			System.out.println("Ich bin doublemax");
			
			for( double e : zahlen) {
				if (max < e) max = e;
			}
			return max;
		}
		
		return Double.NaN;
	}
	
	
	/*
	 * IntMethode max
	 */
	static int max(int... zahlen) {
		int max=0;
		
		//Hierdurch erkennt man welche Methode nun aufergufen wurde
		System.out.println("Ich bin intmax");
		
		for( int e : zahlen) {
			if (max < e) max = e;
		}
		return max;
	}

}
