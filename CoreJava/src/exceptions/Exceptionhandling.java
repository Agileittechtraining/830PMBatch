package exceptions;

public class Exceptionhandling {
	public static void main(String[] args) {
		System.out.println("Line 1");
		System.out.println("Line 2");
		System.out.println("Line 3");
		try {
		System.out.println(1/1);
		}catch(Exception e) {
			System.out.println("exception is handled");
		}
		System.out.println("Line 4");
	}
}
