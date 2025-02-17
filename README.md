
```java

/*
* 8 Primitive Data Types in Java : boolean, char, byte, short, int, long, float, double
* They can't call methods on them ex) boolean.length() is invalid, int.getClass() is invalid
*/


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
		

// Studying Java programming language

// print vs println
System.out.println("Hello, World!");
System.out.print("Hello, World!");

// while loop
int i = 0;
while (i < 10) {
    System.out.println(i);
    i++;
}

// for loop
for (int i = 0; i < 10; i++) {
    System.out.println(i);
}

// Getting user input
// import Scanner class
import java.util.Scanner;

// create Scanner object
Scanner scanner = new Scanner(System.in); // System.in tells Java that the input is coming from the keyboard

int myNumber = scanner.nextInt(); // nextInt() is used to get the next integer from the user

String myString = scanner.nextLine(); // nextLine() is used to get the next line of input from the user

// get user input
String myLine = scanner.nextLine(); // nextLine() is used to get the next line of input from the user

// close Scanner object
scanner.close();

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

		// do while loop
		
	}
}

```