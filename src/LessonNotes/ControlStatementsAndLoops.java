// Lesson - Java I - Control statements and loops

package LessonNotes;

public class ControlStatementsAndLoops {
	public static void main(String[] args) {


// Boolean Expressions
	// evaluates to a boolean value, that is, either true or false

		// 6 relational operators

			//		Operator	Name
			//		   ==		Equality
			//		   !=		Inequality
			//		    >		Greater Than
			//			<		Less Than
			//		   >=		Greater Than Or Equal
			//		   <=		Less Than Or Equal

		// examples of boolean expressions

			// discountPercent == 2.3       // equal to a numeric literal
			// letter == 'y'                // equal to a char literal
			// isValid == false             // equal to the false value

			// subtotal != 0                // not equal to a numeric literal
			// loggedInUser != accountOwner // not equal to a variable

			// years > 0                    // greater than a numeric literal
			// i < months                   // less than a variable

			// subtotal >= 500              // greater than or equal to a numeric literal
			// quantity <= reorderPoint     // less than or equal to a variable

// Logical Operators
	// Allow us to combine multiple boolean values to produce a single boolean value.
	// Value that is produced depends on the boolean operands, and the rules the operator
 	// follows, summarized in the table below:

			// 		Operator	Name		Description

			// 		&&			And			Returns a true value if both expressions are true.
			// 								This operator only evaluates the second expression if necessary.

			// 		||			Or			Returns a true value if either expression is true.
			// 								This operator only evaluates the second expression if necessary.

			// 		&			And			Returns a true value if both expressions are true.
			// 								This operator always evaluates both expressions.

			// 		|			Or			Returns a true value if either expressions is true.
			// 								This operator always evaluates both expressions.

			// 		!			Not			Reverses the value of the expression.

	// Examples of logical operators being used

			// if (isLoggedIn && isAdmin) { // user is logged in *and* is an admin
			//     // show the admin panel
			// }

			// if (isAdmin || isAuthor) { // user is an admin *or* user is the author
			//     // edit the content
			// }

			// if (!loggedIn) { // user is *not* logged in
			//     // redirect to login page
			// }

			// // Determine if the input submitted from a site registration form is valid
				// boolean inputHasErrors = username.isEmpty()
				//     || email.isEmpty()
				//     || password.isEmpty()
				//     || (! password.equals(passwordConfirmation));

// String Comparison
	//While we use == to compare primitive types, we need to handle Strings a little differently.

			// Scanner sc = new Scanner(System.in);
			// System.out.print("Continue? [y/N] ")
			// String userInput = sc.next();

			// // DON'T do this!
			// boolean confirmation = userInput == "y";

			// // Do this instead
			// boolean confirmation = userInput.equals("y");
			//			or
			// boolean confirmation = userInput.equalsIgnoreCase("y");


// Control Structures
	// let us control the flow of execution of our code, either executing code conditionally, or repeatedly.

		// Control structures fall into two categories:

			// - Selection Statements (Conditionals)
			//		Control structures that conditionally execute code. Includes the if and switch statements.

			// - Loops
			//		Control structures that repeatedly execute code. Includes the while, do, and for loops.



		// If Statement
					// In most basic form:

						//		if (/* condition */) {
						//    		// conditional code
						//		}

					// - Code inside body of "if" statement will only execute if condition evaluates to true.
					// - "If" can be combined with "else" or "else if" to create multiple branches of
					//	 	conditional execution.

						//		bool someCondition = false;
						//		bool someOtherCondition = true;
						//
						//		if (someCondition) {
						//			// executes if someCondition is true
						//		} else if (someOtherCondition) {
						//			// executes if someOtherCondition is true *and* all of the previous ifs in
						//			// this block were false
						//		} else {
						//			// executes if none of the conditions checked in this block were true
						//		}


		// Switch Statement
					// - special case of "if-else if" block
					// - compares given value (expression in parenthesis) to
					// 		multiple known values (values in "case" labels)
					// - all values in case labels of given switch statement must be of same type, and
					//		must be either literals or final variables
					// - It's good practice to include "break" statements in each "case" block
					//		Without it, flow control will continue onto the code in the next case block.
					//		Also called, "falling through", which should generally be avoided.
					// 		If intended, code should be commented as such.

						// 		int caseSwitch = 1;
						//
						//		switch (caseSwitch) {
						//    		case 1:
						//        		System.out.println("Case 1");
						//        		// Fall through!
						//    		case 2:
						//       		 System.out.println("Case 2");
						//        		break;
						//    		default:
						//        		System.out.println("Default case");
						//        		break;
						//		}

						// Will print
							//	Case 1
							//	Case 2

		// While Loop
				// - Executes body of loop as long as loop condition evaluates to true
				// - Condition evaluated before body executes, and after body of loop finishes

					//		int i = 0;
					//		while (i < 10) {
					//		    System.out.println("i is " + i);
					//		    i++;
					//		}

		// Do Loop (Do-While Loop)
				// - Same as while loop, except body executes before condition is evaluated
				// - Use if you want body code to run at least once, or you want body to be
				// 		evaluated before condition.

					//		do {
					//		    Sytem.out.println("You will see this despite the condition!");
					//		} while (false);


		// For Loop
				// - Used where single statement needs to happen before loop starts, and single statement needs to be
				//		evaluated after body of loop during each iteration.
				// - Useful when we know beforehand how many times our loop needs to execute.
				// - Commonly used with arrays.
				// - Can also be expressed as a while loop

					// 		for(int i = 0; i < 10; i += 1) {
					//		    System.out.println("i is " + i);
					//		}

		// Break And Continue Statements
					// - Used to alter flow of loop, regardless of loop's condition

				// Break Statement
						// - Break statement used to exit current loop.
						// - Labeled break statement can be used to differentiate which loop to exit
						// 		when using multiple nested loops.

								// - Loop below will only print numbers 1 through 5, even though
								//	 	condition says it should run 100 times.

								//		for(int i = 1; i < 100; i++) {
								//		    System.out.println(i);
								//		    if (i == 5) {
								//		        break; // --------------+
								//		    } //                        |
								//		} //                            |
								//		// <----------------------------+

				// Continue Statement
						// - Used to skip remaining statements in current loop and jump to top of current loop.
						// - Labeled continue statement can be used to jump to top of labeled loop.

								// - Loop below prints all even numbers between 1 and 10 and uses a continue statement.

								//		for(int i = 1; i <= 10; i++) { // <--+
								//		    if(i % 2 == 1) { //              |
								//		        continue; // ----------------+
								//		    }
								//		    System.out.println(i);
								//		}

	}

}
