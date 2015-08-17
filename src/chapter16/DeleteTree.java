package chapter16;

import java.io.*;

public class DeleteTree {

	public static void deleteTree (File path) {
		
		for ( File file : path.listFiles() ){
			
			if ( file.isDirectory() )
				deleteTree(file);
			else
				if ( !file.delete() )
					System.err.println(file + " could not be deleted");
		}
		
		if ( !path.delete() )
			System.err.println(path + " could not be deleted");
		
	}
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		deleteTree(new File("hhhhhhhhhhh12312")); // ACHTUNG GEFAEHRLICH

	}

}
