// Lesson - Java I - Introduction To Java
// Status - Complete
// Lesson - Java I - Syntax, Types and Variables
// Status -

public class HelloWorld {
	public static void main (String[] args) {

//=========================================== Lesson - Java I - Introduction To Java

//		System.out.println("Hello, World!"); // This...

//		System.out.print("Hello, "); //---- is the same as this
//		System.out.print("World!"); //---- and this

//===== BONUS =====
	//	1.	Build the project from the command line
	//
	//	1.	Open a terminal and navigate to your project.
	//
	//	2.	Change directories into the src directory. You should see your HelloWorld.java file here.
	//
	//	3.	Run the following command to compile your java file
	//			javac HelloWorld.java

	//	4.	View the contents of the directory again, you should now see a file named HelloWorld.class, this is the compiled java bytecode.
	//
	//	5.	Run your program with the following command
	//			java HelloWorld

//=========================================== Lesson - Java I - Syntax, Types and Variables

//		1. Create an int variable named myFavoriteNumber and assign your favorite number to it,
// 			then print it out to the console.

//				int myFavoriteNumber = 33;
//				System.out.println(myFavoriteNumber);
//
//		2. Create a String variable named myString and assign a string value to it, then print
// 			the variable out to the console.
//
//				String myString = "Xanadu Rolls Deep!";
//				System.out.println(myString);

//		3. Change your code to assign a character value to myString. What do you notice?

//				myString = 'y'; // Incompatible types error message. String and char
//			S	ystem.out.println(myString);
//
//		4. Change your code to assign the value 3.14159 to myString. What happens?

//				myString = 3.14159; // Incompatible types error message. String and double
//
//		5. Declare a long variable named myNumber, but do not assign anything to it.
// 			Next try to print out myNumber to the console. What happens?

//				long myNumber;
//				System.out.println(myNumber); // Error java: variable myNumber might not have been initialized
//
//		6. Change your code to assign the value 3.14 to myNumber. What do you notice?

//				long myNumber = 3.14; //Error: java: incompatible types: possible lossy conversion from double to long
//				System.out.println(myNumber);
//
//		7. Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.

//				long myNumber = 123L;
//				System.out.println(myNumber);
//
//		8. Change your code to assign the value 123 to myNumber.
//			Why does assigning the value 3.14 to a variable declared as a long not compile,
// 			but assigning an integer value does?
// 			3.14 is a double (is a decimal) which makes it an incompatible
//			type when assigned to a long. You would need to cast it as a double.
// 			Assigning an integer value to a long will work because it will result in implicit casting

//				long myNumber = 123;
//				double myNewNumber = (double) myNumber;
//				System.out.println(myNewNumber);

//				long myNumber = 123;
//				System.out.println(myNumber);
//
//		9. Change your code to declare myNumber as a float. Assign the value 3.14 to it.
// 			What happens? What are two ways we could fix this?
//
//		10. Copy and paste the following code blocks one at a time and execute them

		//		int x = 5;
		//		System.out.println(x++);
		//		System.out.println(x);
		//
		//		int x = 5;
		//		System.out.println(++x);
		//		System.out.println(x);

		// What is the difference between the above code blocks? Explain why the code outputs what it does.

//		11. Try to create a variable named class. What happens?
//
//		12. Object is the most generic type in Java. You can assign any value to a variable of type Object.
// 			What do you think will happen when the following code is run?
//
		//		String theNumberThree = "three";
		//		Object o = theNumberThree;
		//		int three = (int) o;

//		Copy and paste the code above and then run it. Does the result match with your expectation?
//		How is the above example different from this code block?
//
//		int three = (int) "three";

//		What are the two different types of errors we are observing?
//
//		13. Rewrite the following expressions using the relevant shorthand assignment operators:
//
//
		//		int x = 4;
		//		x = x + 5;
		//
		//		int x = 3;
		//		int y = 4;
		//		y = y * x;
		//
		//		int x = 10;
		//		int y = 2;
		//		x = x / y;
		//		y = y - x;

//		14. What happens if you assign a value to a numerical variable that is larger (or smaller)
// 			than the type can hold? What happens if you increment a numeric variable past the type's capacity?
//
//		Hint: Integer.MAX_VALUE is a class constant (we'll learn more about these later) that holds the maximum value for the int type.
	}
}
