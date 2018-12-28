import java.sql.SQLOutput;
import java.util.Scanner;

public class ControlFlowExercises {
	public static void main (String[] args) {

// 1. Loop Basics
//
//		a. While
//
//			- Create an integer variable i with a value of 5.
//			- Create a while loop that runs so long as i is less than or equal to 15
//			- Each loop iteration, output the current value of i, then increment i by one.
//
// 			Your output should look like this:
//
//				5 6 7 8 9 10 11 12 13 14 15

//					int i = 5;
//					while (i <= 15) {
//						System.out.print(i + " ");
//						i++;
//					}

//
//		b. Do While
//
//			- Create a do-while loop that will count by 2's starting with 0 and ending at 100.
// 				Follow each number with a new line.

//					int num = 0;
//					do {
//						System.out.println(num);
//						num += 2;
//					} while (num <= 100);

//			- Alter your loop to count backwards by 5's from 100 to -10.

//					int num = 100;
//					do {
//						System.out.println(num);
//						num -= 5;
//					} while (num >= -10);

//			- Create a do-while loop that starts at 2, and displays the number squared on each
// 				line while the number is less than 1,000,000.
//
// 			Output should equal:
//
//				2
//				4
//				16
//				256
//				65536

//					Long num = 2L;
//					do {
//						System.out.println(num);
//						num *= num;
//					} while (num < 1000000);

//
// 		c. For
//
//			- refactor the previous two exercises to use a for loop instead

// 1a.
//					int i = 5;
//					while (i <= 15) {
//						System.out.print(i + " ");
//						i++;
//					}

		// For Loop
//					for (int i = 5; i <=15; i++) {
//						System.out.print(i + " ");
//					}

// 1b.
//					int num = 0;
//					do {
//						System.out.println(num);
//						num += 2;
//					} while (num <= 100);

		// For Loop
//					for (int num = 0; num <= 100; num += 2) {
//						System.out.println(num);
//					}

//					int num = 100;
//					do {
//						System.out.println(num);
//						num -= 5;
//					} while (num >= -10);

		// For Loop
//					for (int num = 100; num >= -10; num -= 5) {
//						System.out.println(num);
//					}

//					Long num = 2L;
//					do {
//						System.out.println(num);
//						num *= num;
//					} while (num < 1000000);

		// For Loop
//					for (Long num = 2L; num < 1000000; num *= num) {
//						System.out.println(num);
//					}


//
// 2. Fizzbuzz
//
//		One of the most common interview questions for entry-level programmers is the FizzBuzz test.
// 		Developed by Imran Ghory, the test is designed to test basic looping and conditional logic skills.
//
//			- Write a program that prints the numbers from 1 to 100.
//			- For multiples of three print “Fizz” instead of the number
//			- For the multiples of five print “Buzz”.
//			- For numbers which are multiples of both three and five print “FizzBuzz”.

//				for (int i = 1; i <= 100; i++) {
//					if ((i % 3 == 0) && (i % 5 == 0)) {
//						System.out.println("FizzBuzz");
//					} else if (i % 5 == 0) {
//						System.out.println("Buzz");
//					} else if (i % 3 == 0) {
//						System.out.println("Fizz");
//					} else {
//						System.out.println(i);
//					}
//				}

//
// 3. Display a table of powers.
//
//			- Prompt the user to enter an integer.
//			- Display a table of squares and cubes from 1 to the value entered.
//			- Ask if the user wants to continue.
//			- Assume that the user will enter valid data.
//			- Only continue if the user agrees to.
//
// 			Example Output:
//
//				What number would you like to go up to? 5
//
//				Here is your table!
//
//				number | squared | cubed
//				------ | ------- | -----
//				1      | 1       | 1
//				2      | 4       | 8
//				3      | 9       | 27
//				4      | 16      | 64
//				5      | 25      | 125


//				Scanner sc = new Scanner(System.in);
//				String proceed;
//
//				do {
//					System.out.println("What number would you like to go up to? ");
//					int userNum = sc.nextInt();
//
//					System.out.println("\nHere is your table!\n");
//					System.out.println("number | squared | cubed");
//					System.out.println("------ | ------- | -----");
//
//					for (int i = 1; i <= userNum; i ++) {
//						int numSquared = (int) Math.pow(i, 2);
//						int numCubed = (int) Math.pow(i, 3);
//						System.out.printf("%-7d| %-8d| %-5d\n", i, numSquared, numCubed);
//
//					}
//
//					System.out.println("\nWould you like to enter another number?");
//					proceed = sc.next();
//
//				} while (proceed.equalsIgnoreCase("y") || proceed.equalsIgnoreCase("yes"));



//
// 4. Convert given number grades into letter grades.
//
//			- Prompt the user for a numerical grade from 0 to 100.
//			- Display the corresponding letter grade.
//			- Prompt the user to continue.
//			- Assume that the user will enter valid integers for the grades.
//			- The application should only continue if the user agrees to.
//			Grade Ranges:
//
//				A : 100 - 88
//				B : 87 - 80
//				C : 79 - 67
//				D : 66 - 60
//				F : 59 - 0


				Scanner sc = new Scanner(System.in);
				String proceed;
				boolean confirm;

				do {
					System.out.println("\nPlease enter a grade from 0 to 100: ");
					int numGrade = sc.nextInt();

					if (numGrade <= 59) {
						System.out.println("\nYour grade is an F");
					} else if (numGrade <= 63) {
						System.out.println("\nYour grade is a D-");
					} else if (numGrade <= 66) {
						System.out.println("\nYour grade is a D+");
					} else if (numGrade <= 73) {
						System.out.println("\nYour grade is a C-");
					} else if (numGrade <= 79) {
						System.out.println("\nYour grade is a C+");
					} else if (numGrade <= 83) {
						System.out.println("\nYour grade is a B-");
					} else if (numGrade <= 87) {
						System.out.println("\nYour grade is a B+");
					} else if (numGrade <= 94) {
						System.out.println("\nYour grade is an A-");
					} else {
						System.out.println("\nYour grade is an A+");
					}

					System.out.println("\nWould you like to enter another grade?");
					proceed = sc.next();
					confirm = proceed.equalsIgnoreCase("y") || proceed.equalsIgnoreCase("yes");
				} while (confirm);

//
// **Bonus**
//
//			- Edit your grade ranges to include pluses and minuses (ex: 99-100 = A+).


	}
}
