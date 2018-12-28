import java.util.Scanner;

public class ConsoleExercises {

	public static void main (String[] args) {

//		1. Copy this code into your main method:
//
//				double pi = 3.14159;

//			Write some java code that uses the variable pi to output the following:
//
//				The value of pi is approximately 3.14.

//			Don't change the value of the variable, instead, reference one of the links above and
// 			use System.out.format to accomplish this.

//					double pi = 3.14159;
//					System.out.printf("The value of pi is approximately %.2f.", pi);


//	Explore the Scanner Class
//
//		1. Prompt a user to enter a integer and store that value in an int variable using the nextInt method.

//					Scanner scanner = new Scanner(System.in);
//					System.out.println("Please enter a number: ");
//					int userInput = scanner.nextInt();

//
//				- What happens if you input something that is not an integer?
					// An InputMismatchException is thrown
//
// 		2. Prompt a user to enter 3 words and store each of them in a separate variable,
// 			then display them back, each on a newline.

//					Scanner scanner = new Scanner(System.in);
//					System.out.println("Please enter 3 words: ");
//					String userInput1 = scanner.next();
//					String userInput2 = scanner.next();
//					String userInput3 = scanner.next();
//					System.out.format("%s\n%s\n%s\n", userInput1, userInput2, userInput3);

//
//				- What happens if you enter less than 3 words? // will keep waiting for third word until you enter it
//				- What happens if you enter more than 3 words? // it will only print out the first 3
//
// 		3. Prompt a user to enter a sentence, then store that sentence in a String variable
// 			using the .next method, then display that sentence back to the user.

//					Scanner scanner = new Scanner(System.in);
//					System.out.println("Please enter a sentence: ");
//					String userInput = scanner.next();
//					System.out.println(userInput);
//
//				- do you capture all of the words? // No, because .next() will only capture the first token

//		4. Rewrite the above example using the .nextLine method.

//					Scanner scanner = new Scanner(System.in);
//					System.out.println("Please enter a sentence: ");
//					String userInput = scanner.nextLine();
//					System.out.println(userInput);

//
//	Calculate the perimeter and area of Codeup's classrooms
//
//		1. Prompt the user to enter values of length and width of a classroom at Codeup.
//			Use the .nextLine method to get user input and cast the resulting string to a numeric type.

					Scanner sc = new Scanner(System.in);
					System.out.println("Please enter the length of the classroom in feet: ");
					String length = sc.nextLine();
					int lengthInFeet = Integer.parseInt(length);
					System.out.println("Please enter the width of the classroom in feet: ");
					String width = sc.nextLine();
					int widthInFeet = Integer.parseInt(width);

//
//				- Assume that the rooms are perfect rectangles.
//				- Assume that the user will enter valid numeric data for length and width.
//
// 		2. Display the area and perimeter of that classroom.
//
//			The area of a rectangle is equal to the length times the width, and the perimeter of a rectangle is equal to 2 times the length plus 2 times the width.
//
					int roomArea = lengthInFeet * widthInFeet;
					int roomPerimeter = (2 * lengthInFeet) + (2 * widthInFeet);
					System.out.printf("The area of the classroom is %d\n", roomArea);
					System.out.printf("The perimeter of the classroom is %d", roomPerimeter);

//		3. Bonuses
//
//				- Accept decimal entries
//				- Calculate the volume of the rooms in addition to the area and perimeter

	}
}
