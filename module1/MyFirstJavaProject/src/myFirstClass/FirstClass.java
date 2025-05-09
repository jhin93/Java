package myFirstClass;
/**
 * My first Java class
 */
import java.util.Scanner;

public class FirstClass {

	/**
	 * This is the main method, the entry point to any Java program.
	 * @param args
	 */
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
		
		/*
		 * Math operations
		 */
		
		double d = 2 * x + 10;
		double z = 2 * y + 5;
		
		System.out.println("");
		System.out.println("d: " + d);
		System.out.println("z: " + z);
		
		// division with ints
		// uses integer division and ignores the remainder
		System.out.println("x / 2: " + (x / 2)); // x / 2: 2
		
		// division with floats
		System.out.println("x / 2.0: " + (x / 2.0)); // x / 2.0: 2.5
		
		// power operation
		System.out.println("x pow 4: " + Math.pow(x, 4)); // x pow 4: 625.0
		
		/*
		 * String operations
		 */
		
		// String concatenation
		String fullName = "Brandon" + " " + "Lee" + " " + "Krakowsky";
		
		// String Method for uppercase
		String upperCaseName = fullName.toUpperCase();
		System.out.println("Uppercase name: " + upperCaseName);

		/*
		 * Contional and loops
		 */

		 //Conditional checking if x is even, using the modulus or % operator
		 
		System.out.println();
		System.out.println("x: " + x);

		if (x % 2 == 0) {
			System.out.println(x + " is even");
		} else {
			System.out.println(x + " is odd");
		}
		
		double e = 2.3;
		double f = 2.4;
		double g = 2.5;

		// boolean operatoes
		// && (and) - true only if both operands are true
		if (e > 2 && e < f) {
			System.out.println(e +" is between 2 and " + f);
		}

		//|| (or) - true if either one operand is true
		if(f > 2 || f > g) {
			System.out.println(f + " is greater than 2 or " + e + " or greater than " + g);
		}

		// ! (not) - reverses the truth value of its one operand
		if (g != 2.6) {
			System.out.println(g + " is not equal to 2.6");
		}

		// while loop
		int i = 0;
		while (i < 5) {
			System.out.println("i: " + i);
			i ++;
		}	
		
		// for loop
		System.out.println();
		for (int k = 0; k < 10; k++) {
			System.out.println("k: " + k);
		}

		/*
		 *  Casting
		 */
		
		 // Cast int to String
		 String intToString = Integer.toString(1);

		 // Cast double to String
		 String doubleToString = Double.toString(1.1);

		 // Print the values and type of values
		 System.out.println();
		 System.out.println(intToString + " " + intToString.getClass());
		 System.out.println(doubleToString + " " + doubleToString.getClass());

		 //Cast String to int
		//  int stringToInt = Integer.parseInt("1");

		 //Cast String to double
		 double stringToDouble = Double.parseDouble("1.1");

		 //Print the values and type of values
		 System.out.println(stringToDouble);
		 //cast to Object then call getClass()
		 System.out.println(((Object)stringToDouble).getClass());
		 
		 /*
		  * User Input
		  */

		  // Create a Scanner object
		  Scanner scan = new Scanner(System.in);

		  // Prompt the user for input
		  System.out.println("Enter a number: ");
		  int myInt = scan.nextInt(); // get next input as int
		  System.out.println("Your number is: " + myInt);
		

		  // print the multiplication table up to 10 for myInt
		  for (int t = 1; t < 11; t++) {
			System.out.println(t + " x " + myInt + ":  + " + (t * myInt));
		  }
		  System.out.println();
		  System.out.println("Enter a String : ");
		  String myStr = scan.next();

		  // print each char in myStr separately
		  for (int u = 0; u < myStr.length(); u++) {
			System.out.println(myStr.charAt(u));
		  }

		  // close the Scanner
		  scan.close();
	}  // end of main method
	
	public class ClassName {
		// The fields (instance variables) of the object
		String name; // declaration to stor a String in the object
		int age = 0; // declaration to store an int in the object, initialized to 0
		double health; // declaration to store a double in the object

		// The constructor of the object
		public ClassName(String name, int age, double health) {
			this.name = name;
			this.age = age;
			this.health = health;
		}

		String getName(String name) { // return type is String
			return name;
		}
	}
}  // end of FirstClass
