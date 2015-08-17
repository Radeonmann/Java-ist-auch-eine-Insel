package examples;

import java.util.*;

public class ArrayExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Ein paar Beispiele zu Arrays
		
		intArray();
		stringArray();
		twoDimArray();
		listen();

	}
	
	
	/*
	 * Beispiele an einem Int Array
	 */
	static void intArray() {
		int[] a = {1,2,3,4};
		int[] b = new int[]{6,3,1,30,9};
		int[] c = new int[5];
		
		//a
		System.out.println("Das ist a:");
		System.out.println("Adresse: " + a.toString());
		System.out.println("Inhalt: " + Arrays.toString(a));
		System.out.println("Länge: " + a.length);
		System.out.println();
		
		
		//b
		System.out.println("Das ist b:");
		System.out.println("Unsortiert: " + Arrays.toString(b));
		
		Arrays.sort(b);
		System.out.println("Sortiert: " + Arrays.toString(b));
		
		//Achtung!! binarySearch funkt. nur bei sort. Arrays
		System.out.println("Das Element '6' steht an " + Arrays.binarySearch(b, 6) + ". Stelle");
		System.out.println();
		
		
		//c
		System.out.println("Das ist c:");
		System.out.println("C wird automatisch mit Nullen initialisiert:");
		System.out.println(Arrays.toString(c));
		
		System.out.println();
		System.out.println();
		
		
	}
	
	
	/*
	 * Beispiele an einem String Array
	 */
	static void stringArray() {
		String[] s = {"Homo", "Hallo","Zoo", "Affe"};
		
		System.out.println("Strings Arrays werden auch sortiert");
		
		System.out.println("Zuerst unsortiert:");
		System.out.println(Arrays.toString(s));
		
		System.out.println("Jetzt sortiert:");
		Arrays.sort(s);
		System.out.println(Arrays.toString(s));
		
		System.out.println();
		System.out.println();
	}
	
	
	/*
	 * Beispiele an einem 2D Array
	 */
	static void twoDimArray() {
		// 2D Array mit 3x5 Elementen
		int[][] a = new int[3][5];
		
		// 2D Array mit direkter Werteangabe
		// Ein Java Array muss nicht rechteckig sein
		int[][] b = { {1,5,3}, {7,5}, {1,20,15,4,5} };
		
		// 2D Array ohne Wert mit unterschiedlichen Feldgrössen
		// Normalerweise über Schleifen gelöst
		int[][] c = new int[3][];
		c[0] = new int[5];
		c[1] = new int [2];
		c[2] = new int [10];
		
		//Arrays müssen keine definierte Grösse haben
		//Diese wird beim ersten Beschreiben automatisch festgelegt
		//z.B. aus der Rückgabe einer funktion
		int[][] d;
		
		
		//a
		System.out.println("Nun die Ausgabe von a:");
		System.out.println(Arrays.toString(a));
		System.out.println("Adressen? Ja es ist ein 2D Array");
		System.out.println("Noch ein Versuch:");
		System.out.println(Arrays.deepToString(a));
		System.out.println();
		
		
		//b
		System.out.println("Nun zu b:");
		System.out.println("Unsortiert:");
		System.out.println(Arrays.deepToString(b));
		
		System.out.println("Mehrdimensionale Arrays muss man manuell sortieren:");
		for (int i=0; i < b.length; i++) Arrays.sort(b[i]);
		System.out.println(Arrays.deepToString(b));
		System.out.println();
		
		
		
		//d
		d = pascalTriang(5);
		System.out.println("Hier noch d mit dem pascalschen Dreieck:");
		System.out.println(Arrays.deepToString(d));
		System.out.println();
		System.out.println();
		
	}
	
	
	/*
	 * Ein etwas komplexeres Beispiel:
	 * Ein Pascalsches Dreieck als 2D Array generieren
	 * int cols = Anzahl Zeilen
	 * Das Rückgabearray ist Dreieckig
	 */
	static int[][] pascalTriang(int cols) {
		
		if (cols > 0) {
			
			// Erzeugen der Zeilen und beschreiben der obersten Zeile
			int[][] pasc = new int[cols][];
			pasc[0] = new int[]{1};
			
			for (int i=1; i<cols; i++) {
				int rows = i+1;
				pasc[i] = new int[rows];
				
				for (int j=0; j<rows; j++) {
					if (j>0) pasc[i][j] += pasc[i-1][j-1];
					if (j<rows-1) pasc[i][j] += pasc[i-1][j];
				}
			}
			
			
			return pasc;
		}
		
		return null;
	}
	
	static void listen() {
		
		System.out.println("Hier noch ein paar Funktionen von Arrays.asList");
		
		System.out.println("Stimmen die ausgewählten Teile überein?");
		// vergleichen in unsortiertem Array über Arrays.asList
		String[] a = { "Asus",       "Elitegroup", "MSI" };
		String[] b = { "Elitegroup", "MSI",        "Shuttle" };
		
		//Unterer Index ist inklusive, oberer exklusive
		System.out.println( Arrays.asList( a ).subList( 1, 3 ).
		                    equals( Arrays.asList( b ).subList( 0, 2 ) ) );
		
		System.out.println("primitive Arrays können nicht über Arrays.asList ausgedrückt werden:");
		int[] nums = { 1, 2 };
		System.out.println( Arrays.asList(nums).toString() ); // [[I@82ba41]
		System.out.println("Dafür nehmen wir wie gewohnt Arrays.toString");
		System.out.println( Arrays.toString(nums) );          // [1, 2]
		
		
		System.out.println();
		System.out.println();
		
		
	}
	

}
