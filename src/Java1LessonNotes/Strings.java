// Lesson - Java I - Strings

package Java1LessonNotes;

public class Strings {
	public static void main (String[] args) {

// String Definition
			// - A string is letters, numbers, and special characters strung together.
			// - Are objects, not primitives. String variables are reference type, not primitive type.
			// - Compare using .equals() instead of ==
			// -  Using == with 2 objects checks if both sides are same reference; refer to same object.

// Immutability and Concatenation
			// - Strings are immutable; once created, cannot be changed.

				// String Concatenation
					// The + operator performs string concatenation if one of it's operand is a string; will convert
					//		any other types to a string as well.

					// 		String message = "Hello";
					//		System.out.println(message); // prints "Hello"
					//		message = message + " World!";
					//		System.out.println(message); // prints "Hello, World!"

				// You might be tempted to say that the example above disproves string immutability, as we
				// 		clearly changed the value of the message variable. You would, however, be wrong.
				// 		While we are changing what is stored in the message variable, we are changing a
				// 		reference. Meaning that when we do the string concatenation (message + " World"),
				// 		we aren't modifying the original string, rather, we are creating a new string object,
				// 		and updating message to reference the new string object, instead of the old one.

// Comparing Strings
			// Must use methods to compare strings instead of relational operators

					// 		Scanner sc = new Scanner(System.in);
					//		System.out.print("Continue? [y/N] ")
					//		String userInput = sc.next();
					//
					//		// Don't do this!
					//		boolean confirmation = userInput == "y";

			// While they have the same value, "userInput" and the string literal "y" refer to different objects,
			// 		and comparing them with == will not work they way we want it to.

					//		 // DONT DO THIS
					//		if ("I am a string" == "I am a string") {
					//		    System.out.println("Strings are equal");
					//		}

					//		// Do this instead
					//		if ("I am a string".equals("I am a string")) {
					//		    System.out.println("Strings are equal");
					//		}

// String Comparison Methods

			// All of the following methods return either true or false.

					// 		-method-			-description-
					//		.equals				determine, case-sensitively, if two strings have the same value
					//		.equalsIgnoreCase	determine if two strings have the same value, disregarding their casing
					//		.startsWith			determine if one string starts with another
					//		.endsWith			determine if one string ends with another


						//		String input = "Codeup Rocks!";
						//
						//		input.equals("codeup rocks!"); // false
						//		input.equals("Codeup Rocks!"); // true
						//
						//		input.equalsIgnoreCase("codeup rocks!"); // true
						//		input.equalsIgnoreCase("Codeup Rocks!"); // true
						//
						//		input.startsWith("codeup") // false
						//		input.startsWith("Codeup") // true
						//
						//		input.endsWith("rocks") // false
						//		input.endsWith("rocks!") // false
						//		input.endsWith("Rocks!") // true

// String Manipulation Methods

			// The following methods can be used to manipulate strings.

				//	char charAt(int index)
				//			- Returns the character at the specified index of the string.

							//	boolean firstLetterCapitalized = false;
							//	String word = "Test";
							//
							//	char firstLetter = word.charAt(0);
							//
							//	if (firstLetter == Character.toUpperCase(firstLetter)) {
							//		firstLetterCapitalized = true;
							//	}
							//
							//	System.out.println(firstLetterCapitalized);

				//	int indexOf(String subString)
				//			- Returns the index of the first occurrence of a certain substring.
				// 			Returns -1 if the substring is not found.

							//  String cat = "cat";
							//  System.out.println(cat.indexOf("at"));

				//	int lastIndexOf(String subString)
				//			- like indexOf, but start the search from the end of the string

							//  String good = "Good";
							//  System.out.println(good.lastIndexOf("o"));

				//	int length()
				//			- Returns the length of a string.

							//  String longestWord = "pneumonoultramicroscopicsilicovolcanoconiosis";
							//  System.out.println(longestWord.length());

				//	String replace(String pattern, String replacement)
				//			- Returns a copy of the string that has oldChar replaced with newChar.

							//  String search = "tiny cats looking cute";
							//  String parsedSearch = search.replace("cats", "dogs");
							//  System.out.println(parsedSearch);

				//	String substring(int beginIndex[, int endIndex])
				//			- Returns a new a substring that starts at a specified index and
				// 			(optionally) ends at the specified index

							//  String name = "Justin Bob Reich";
							//  String firstName = name.substring(0, name.indexOf(" "));
							//  String lastName = name.substring(name.lastIndexOf(" ") + 1);
							//  System.out.println(firstName);
							//  System.out.println(lastName);

				//	String toLowerCase()
				//			- Returns a string that has all lower case letters.
				//
				//	String toUpperCase()
				//			- Returns a string that has all upper case letters.

							//  String hello = "hELlo";
							//  System.out.println(hello.toUpperCase());
							//  System.out.println(hello.toLowerCase());
							//  System.out.println(hello);

				//	String trim()
				//			- Returns a copy of the string without leading and trailing whitespaces.

							//	String input = "   bob      smith \n\n  ";
							//	String trimmedInput = input.trim();
							//	System.out.println("|" + trimmedInput + "|");
							//	System.out.print("|" + input + "|");

// FURTHER READING
		// - Manipulating Strings
		// 		http://docs.oracle.com/javase/tutorial/java/data/manipstrings.html

		// - Converting Between Numbers and Strings
		// 		http://docs.oracle.com/javase/tutorial/java/data/converting.html

		// - StringBuilder: a mutable string
		// 		https://docs.oracle.com/javase/tutorial/java/data/buffers.html



	}

}
