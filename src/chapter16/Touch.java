package chapter16;

import java.io.*;

public class Touch {

	public static void main(String[] args) {
		
		for (String s : args){
			
			File f = new File(s);
			
			if( f.exists() ){
				
				if( f.setLastModified( System.currentTimeMillis() ) )
					System.out.println("ber�hrte");
				else
					System.out.println("konnte nicht ber�hren");
				
			} else {
				
				try {
					f.createNewFile();
					System.out.println("Legte eine neue datei an " + s);
				} catch (IOException e){
					e.printStackTrace();
				}
				
			}
			
		}

	}

}
