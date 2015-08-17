public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Start des Programms
//		shit();
		arraytest();
		
		


	}
	
	static void greet(int y) {
		System.out.println(methodee.test(4));
		java.awt.Point p = null;
		
		if (y>10) p = new java.awt.Point(1,3);
		java.awt.Point q = p;
		
		if (p != null) p.setLocation(3, 3);
		
		System.out.println(p);
		System.out.println(q);
	}
	
	static void shit() {
		//http://www.tutego.de/
		System.out.println( "Da gibt's Java-Tipps und -Tricks." );
		greet(11);
		java.awt.Point p;
		
		p = new java.awt.Point(3,5);
		p.x = 4;
		p.y = 10;
		p.translate(3, 1);
		System.out.println(p);
		int a = p.toString().length();
		System.out.println(a);
		long size = new java.io.File("E:\test.txt").length();
		System.out.println(size);
	}
	
	static void arraytest() {
		int[] a={1,5};
		
//		System.out.println(a.length);
		
		
		java.awt.Point[] q = new java.awt.Point[5];
		System.out.println(q.length);
		
		printArray(a);
		int sum = 0;
		for (int n : a) {
			sum += n;
		}
		printArray(a);
		System.out.println(sum);
		
		System.out.println(a.toString());
		System.out.println(q.toString());
	}
	
	static void printArray(int[] a) {
		for (int n : a) {
			System.out.print(n+" ");
		}
		System.out.println();
	}
	
	

}
