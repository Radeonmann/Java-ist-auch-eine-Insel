package examples;

public class CharAndStringExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		chartypes();
		
		System.out.println(isNullOrEmpty(""));
		System.out.println();
		System.out.println();
		
		someStrings();
		someStrings2();
		charsAndStrings();

	}
	
	static void chartypes() {
		
		System.out.println("Some chartypes:");
		
		System.out.println( Character.isDigit( '0' ) );      // true
		System.out.println( Character.isDigit( '-' ) );      // false
		
		System.out.println( Character.isLetter( 'ß' ) );     // true
		System.out.println( Character.isLetter( '0' ) );     // false
		
		System.out.println( Character.isLetterOrDigit( '0' ) ); // true
		System.out.println( Character.isLetterOrDigit( 'a' ) ); // true
		System.out.println( Character.isLetterOrDigit( '-' ) ); // false
		
		System.out.println( Character.isLowerCase( 'a' ) ); // true
		System.out.println( Character.isLowerCase( 'A' ) ); // false
		
		System.out.println( Character.isWhitespace( ' ' ) ); // true
		System.out.println( Character.isWhitespace( '-' ) ); // false
		
		
		System.out.println( Character.toUpperCase( 'a' ) );
		System.out.println();
		System.out.println();
	}
	
	
	static void someStrings() {
		
		System.out.println("Some strings:");
		
		String str = "Hallö du tröti";
		int index;
		
		// Enthält? Position?
		System.out.println(str.contains("ö")); // True
		System.out.println(index = str.indexOf('t')); // 9
		System.out.println(str.indexOf('t', index+1)); // 12
		System.out.println(str.lastIndexOf('ö')); // 11
		
		// Gleichheit?
		String str1 = "Hallo",
				str2 = "hallo",
				str3 = "Hallo";
		
		System.out.println(str1.equals(str2)); // False
		System.out.println(str1.equals(str3)); // True
		System.out.println(str1.equalsIgnoreCase(str2)); // True
		System.out.println(str.startsWith("Hal")); // True
		System.out.println(str.endsWith("oti")); // False
		
		String s = "Deutsche Kinder sind zu dick";
		boolean b = s.regionMatches( 9, "Bewegungsarmut bei Kindern", 19, 6 );
		
		// Region ohne gross kleinschreibung
		s = "Deutsche KINDER sind zu dick";
		b = s.regionMatches( true, 9, "Bewegungsarmut bei kindern", 19, 6 );
		System.out.println(b);
		
		// Lexikographisch
		System.out.println( "Justus".compareTo( "Bob" )    > 0 );
		System.out.println( "Justus".compareTo( "Justus" ) == 0 );
		System.out.println( "Justus".compareTo( "Peter" )  < 0 );
		
		System.out.println();
		System.out.println();
	}
	
	
	
	static void someStrings2() {
		
		String s = "Ich bin nicht dick! Ich habe nur weiche Formen.";
		char first = s.charAt( 0 );                          // 'I'
		char last  = s.charAt( s.length() - 1 );             // '.'
		
		String s1 = "Infiltration durch Penetration";
		String s2 = s1.substring( 19 ); // Penetration
		
		// Startposition inklusiv, Endpos exklusiv
		String tear = "'Jede Träne kitzelt auch die Wange.'";
		System.out.println( tear.substring( 6, 11 ) ); // Träne
		
		System.out.println();
		System.out.println();
	}
	
	static void charsAndStrings() {
		
		String s = "Blasiussegen";
		char[] chars = new char[ 5 ];
		int srcBegin = 7;
		s.getChars( srcBegin, srcBegin + 5, chars, 0 );
		System.out.println( new String(chars) );  // segen
		
		System.out.println();
		System.out.println();
		
		String string = "Herr, schmeiß Java vom Himmel!";
		char[] c = string.toCharArray();
		c.clone();
		
		for (int i = 0; i<10; i++) string += "!";
		System.out.println(string);
		
	}
	
	
	
	
	
	// Eine Methode mit entsprechenden Kommentaren
	/**
	 * Checks if a String is {@code null} or empty ({@code ""}).
	 *
	 * <pre>
	 * StringUtils.isEmpty(null) == true
	 * StringUtils.isEmpty(&quot;&quot;) == true
	 * StringUtils.isEmpty(&quot; &quot;) == false
	 * StringUtils.isEmpty(&quot;bob&quot;) == false
	 * StringUtils.isEmpty(&quot; bob &quot;) == false
	 * </pre>
	 * @param str The String to check, may be {@code null}.
	 * @return {@code true} if the String is empty or {@code null}, 
	 * {@code false} otherwise.
	 */
	public static boolean isNullOrEmpty( String str ) {
		return str == null || str.length() == 0;
	}

}
