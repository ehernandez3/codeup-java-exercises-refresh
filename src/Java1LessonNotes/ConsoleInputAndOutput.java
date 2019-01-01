// Lesson - Java I - Console Input and Output
package Java1LessonNotes;

public class ConsoleInputAndOutput {

	public static void main (String[] args) {


// Printing Data To The Console

		// Placeholders - %s, %d etc.

//			String name = "codeup";
//			System.out.format("Hello there, %s. Nice to see you.\n", name); // Output: Hello there, codeup. Nice to see you.
//				// %s is replaced with the value of "name"
//				// Can use System.out.format() or System.out.printf()
//				// However, need to explicitly use \n to add a new line to the output

		// Multiple Placeholders

//			String greeting = "Salutations";
//			String name = "codeup";
//			System.out.format("%s, %s!", greeting, name); // Output: Salutations, codeup!
//				// %s is replaced with additional passed arguments in the order they are passed. "greeting" then "name"

// Getting Input From The Console

		// Scanner Class - allows us to get data input that user enters in the console
			// Need to import it first.
				//Place the following import statement at the top of the file, above class definition:
					// import java.util.Scanner;
					// Can also press (option + Enter) in IntelliJ after typing the Scanner class name.

//Using Scanner Class

//		// 1. declare variable of type Scanner, assign to it a new Scanner object, and specify
//		// 		System.in for the source of the scanner.
//				Scanner scanner = new Scanner(System.in);
//
//		// 2. prompt user to type something and use expression "scanner.next()" to obtain value the user entered as a
//		//		string, and store it in variable "userInput".
//				System.out.print("Enter something: ");
//				String userInput = scanner.next(); // *** use scanner.next() for single words, or scanner.nextLine() for entire line
//
//		// 3. print out the value the user entered.
//				System.out.println("You entered: --> \"" + userInput + "\" <--");



//		double dblTotal = 36;
//		System.out.printf("Total is: $%,.2f%n", dblTotal);
//		System.out.printf("Total: %-10.2f: ", dblTotal);

//		int intValue = 45;
//		System.out.printf("% 4d", intValue);

		String s = "Hello World";
		System.out.printf("The String object %s is at hash code %h%n", s, s);


	}
}
