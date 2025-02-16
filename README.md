
```java
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

// do while loop    

// switch statement

// if statement

// if else statement

// if else if statement

// nested if statement

// nested if else statement

// nested if else if statement   

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


```