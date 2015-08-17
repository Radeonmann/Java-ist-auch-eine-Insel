package userUtils;

public class Strings {
	
	/**
	 * Returns the Substring before the first occurence of
	 * the delim String,
	 * delim is not part of the return value
	 * @param str		String to get Substring from
	 * @param delim		delimiter
	 * @return 	Substring before delimiter, {@code null} if delimiter was not
	 * 			found or any input argument is {@code null}
	 */
	public static String substringBefore(String str, String delim) {
		
		if (str == null || delim == null) return null;
		
		int pos = str.indexOf(delim);
		
		return pos >= 0 ? str.substring(0, pos) : null;
	}
	
	/**
	 * Returns the Substring after the first occurence of
	 * the delim String,
	 * delim is not part of the return value
	 * @param str		String to get Substring from
	 * @param delim		delimiter
	 * @return 	Substring after delimiter, {@code null} if delimiter was not
	 * 			found or any input argument is {@code null}
	 */
	public static String substringAfter(String str, String delim) {

		if (str == null || delim == null) return null;
		
		int pos = str.indexOf(delim);
		
		return pos >= 0 ? str.substring(pos + delim.length()) : null;
	}

}
