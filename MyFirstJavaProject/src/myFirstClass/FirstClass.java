package myFirstClass;

public class FirstClass {

	public static void main(String[] args) {
		
		// Printing using SOPL : Short for System.out.println
		System.out.println("Hello world!");
		System.out.println(""); // print a blank line
		
		/*
		 * Defining variables
		 */
		
		int x = 5;
		
		double y = 5.0;
		
		boolean flag = true;
		
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		System.out.println("flag: " + flag);
		
		/*
		 * Strings and characters
		 */
		
		String dept = "cit"; //String
		char letter = 'a'; // char
		
		String course = dept + 590; // String with int
		String grade = letter + ""; // char with String
		
		String courseInformation = course + ": " + grade;
		System.out.println(courseInformation);
	}
}
