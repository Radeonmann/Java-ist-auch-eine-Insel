package chapter16;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class Dir {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File userdir = new File( System.getProperty("user.dir") );
		System.out.println( userdir );
		
		
		FileFilter filter = new FileFilter()
			{

				@Override
				public boolean accept(File pathname) {
					return pathname.isDirectory();
				}
			};
		
		for ( File file : userdir.listFiles(filter) )
		  System.out.println( file );
	}

}
