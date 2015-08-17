package chapter16;

import java.io.File;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File f = new File("duke.gif");
		System.out.println(f.getAbsolutePath());
		
		System.out.println(f.isDirectory());
		
		
		for(String s: f.list()){
			System.out.println(s.toString());
		}

	}

}
