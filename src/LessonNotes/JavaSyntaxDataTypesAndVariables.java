package LessonNotes;

public class JavaSyntaxDataTypesAndVariables {

	public static void main (String[] args) {


	}

//====== Comments

	// I am a single line comment

	/* I take up one line */

	/**
	 * I take up
	 * multiple
	 * lines
	 */

//====== Data Types

	//=== 2 Categories of types

		//=== Primitive (8 types) - the "building blocks" of the language; any variable that holds a primitive
		// 	  type has a value.

//			TYPE 	  BYTES 	DESCRIPTION
			//byte		1		Very short integers from -128 to 127
			//short		2		Short integers from -32,768 to 32,767
			//int		4		Integers from -2,147,483,648 to 2,147,483,647
			//long		8		Long integers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
			//float		4		Single-precision, floating-point numbers from -3.4E38 to 3.4E38 with up to 7 significant digits
			//double	8		Double-precision, floating-point numbers from -1.7E308 to 1.7E308 with up to 16 significant digits
			//char		2		A single Unicode character that’s stored in two bytes
			//boolean	1		A true or false value

		//=== Reference types - those that refer to objects or arrays; they default to the special value null,
		// 	 which indicates a lack of an object.

//====== Strings

	//=== Quotes

		// "I am a string!" //--------- Double quotes represent a string
		// 'c' //---------------------- Single quotes represent a character

	//=== Syntax Error

		// 'This is a string' //------- DONT DO THIS

	//=== Special Characters

		// "\"" //=====> "
		// "\\" //=====> \
		// "\n" //=====> the newline character
		// "\t" //=====> the tab character

//====== Variables - All variables in Java must be declared before they are used

	// A variable declaration includes a type for the variable, as well as a
	// name (a valid identifier) for the variable

		//int id; //------------------- "int" is the data type, "id" is the variable name
		//boolean isLoggedIn; //------- "boolean" is the data type, "isLoggedIn" is variable name
		//float bankAccountBalance; //- "float" is data type, "bankAccountBalance" is variable name

	// Variables are initialized when they are assigned a value.

		// id = 123; //--------------------- value of 123
		//isLoggedIn = false; //------------ value of false
		//bankAccountBalance = 1000.23; //-- value of 1000.23

	// We can make variable declaration and initialization two separate steps:

		//int theAnswer; //----------------- Declaration
		//String question; //--------------- Declaration

		//theAnswer = 42; //------------------------------ Initialization
		//question = "What is your favorite color?"; // -- Initialization

	// or we can do both at the same time:
		// int theAnswer = 42;
		// String question = "What is your favorite color?";

//====== Identifiers And Keywords

	// An identifier is a valid name for a class, method or variable. Identifiers must:
		// -start with a letter, ** underscore, or ** dollar sign
		// -consist of letters, dollar signs, underscores and digits
		// -be no more than 255 characters

	// ********************** Naming Conventions ***************************
		// ** Although allowed, we discourage the use of underscores, dollar signs or digits for identifiers.
		// ** Use camelCase for variable and method names, and PascalCase for class names


	// Identifier CANNOT be one of the reserved words in java:
		// abstract continue for new switch assert default goto package synchronized boolean do if private
		// this break double implements protected throw byte else import public throws case enum instanceof
		// return transient catch extends int short try char final interface static void class finally long
		// strictfp volatile const float native super while

//====== Constants

	// Represented by "final" keyword. Values cannot be changed.
		// common to see constants named with all caps, with underscores separating words.
			// final int SIDES_OF_A_DICE = 6;
			// final String API_KEY = "b75b703d8195f6f433ca";
			// final String GITHUB_API_BASE_URL = "https://api.github.com";

//====== Arithmetic Expressions




//====== Casting - converting an object or variable of one type into another.

	// Implicit Casting - less precise data type to higher precision data type,
	// 	                  or more specific type to less specific type.

		// int myInteger = 900;
		// long morePrecise = myInteger;

	// Explicit Casting - less specific type to a more specific type,
	// 					  or higher precision type to lower precision type.
	//				***** Need to explicitly put the name of type we are casting *****
	// 				***** to inside of parenthesis before the value to be cast. *****

		// double pi = 3.14159;
		// int almostPi = (int) pi; //------------------ Casting double to "(int)"

}
