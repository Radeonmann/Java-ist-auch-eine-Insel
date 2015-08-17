/**
 * Throw own Exceptions
 */
package chapter06;

public class MyException_1 {

	private static int age=0;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		setAge(-2);

	}
	
	private static void setAge(int age){
		if (age<0)
			throw new IllegalArgumentException("Age below 0 not allowed!");
		MyException_1.age = age;
	}

}
