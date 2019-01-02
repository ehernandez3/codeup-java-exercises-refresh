package Java1LessonNotes;

public class MethodsNotes {
    public static void main (String[] args) {

// Defining Methods
        // Sequence of statements that perform a specific task.

                // Most basic syntax for a method definition:

//                          public static returnType methodName([param1[, param2[, ...]]) {
//                              // the statements of the method
//                              // a return statement, if a return type is declared
//                          }

                // Method example:

//                          public static String sayHello(String name) {
//                              return String.format("Hello, %s!", name);
//                          }

                // A look at all the individual pieces of the method example above

                    // - public -- this is the visibility modifier
                            // defines whether other classes can see this method

                    // - static -- presence of this keyword defines that method belongs to the class,
                    //              as opposed to instances of it.

                    // - String -- this is the return type of the method.
                            // In Java, all methods must define type of value they will return.
                            // If method doesn't return anything, special keyword "void" is used here.
                            // If method defines a return type, it must have a return statement.
                            // Compile time error will occur:
                                    // method defines a return type to not return anything,
                                    // or to return a value of a type other than the one specified.
                            // If return type is void, it is a compile time error to return anything
                                // inside the method. However, methods with void return type can still use
                                // "return" keyword to exit method early.

                    // - sayHello -- name of the method.
                            // Method names follow the same rules as variable names.

                    // - (String name) -- the parameter the method accepts
                            // method can be defined with no parameters, one parameter (like in our example), or
                            // multiple parameters (separated by commas). A type must be specified for each parameter.

                    // - Everything inside curly braces is the body of the method


                // Simple examples of methods:

//                          public static void sayHello(String greeting, String name) {
//                              System.out.printf("%s, %s!\n", greeting, name);
//                          }
//
//                          public static int returnThree() {
//                              return 3;
//                          }
//
//                          public static String shout(String s) {
//                              return s.toUpperCase() + "!!!";
//                          }


// Calling Methods
        // - Code inside method never runs until we call, or invoke the method.
        // - When defining method, we define parameters (inputs to the method), and
        //      when we call a function, we call it with arguments (actual values passed to the method).
        // - Arguments can be literal values, variables, or expressions that will evaluate to a value that
        //      is passed to the method.
        // - Data type of arguments must be same as data type of parameters that the method is defined with.

                // Examples of Calling Methods:

//                          startApplication();                         // called with no arguments
//                          logInfo("User #214 registered!");           // called with one argument
//                          addAttribute("loggedInUser", loggedInUser); // called with multiple arguments
//                          
//                          // using the return value
//                          int three = add(6, 3) / subtract(4, 1);
//                          boolean isLoggedIn = checkLoginStatus();


// Method Overloading
        // - Method overloading is defining multiple methods with same name, but with
        //      different parameter type, parameter order or number of parameters.
        // - Overloaded methods can call other versions of themselves, and commonly used
        //      to provide default values for arguments.

                // Method Overloading Example:

//                          // version 1
//                          public static void sayHello(int times) {
//                              for (int i = 0; i < times; i += 1) {
//                                  sayHello();
//                              }
//                          }
//                          // version 2
//                          public static void sayHello() {
//                              sayHello("Hello", "World");
//                          }
//                          // version 3
//                          public static void sayHello(String name) {
//                              sayHello("Hello", name);
//                          }
//                          // version 4
//                          public static void sayHello(String greeting, String name) {
//                              System.out.println(greeting + ", " name "!");
//                          }

                    // Explanation:
                        // - When we call sayHello, code that runs depends on arguments we pass to it
                        // - If we call "sayHello();", version 2 runs because we are calling the method
                        //      with no arguments, and version two is defined with no parameters.
                        //      The method defined in version 2 will call sayHello again, but with two
                        //      arguments, which invoke version 4, and we see the following output:

                        //              Hello, World

                        //      Notice version 2 and 3 are calling version 4. This is an example of using
                        //      method overloading to provide default values for methods. The most generic
                        //      version (version 4) of our method needs to be passed a greeting and a name,
                        //      but we can use method overloading to provide default values of "Hello" and "World"
                        //      if only one, or no arguments are passed.

                        //      We could call version 3 by passing a single string argument:

                        //              sayHello("Codeup");

                        //      Which will again invoke version 4 and produce the output:

                        //              Hello, Codeup!

                        //      Or we could call version 4 directly:

                        //              sayHello("Salutations", "Codeup");

                        //      to produce the output:

                        //              Salutations, Codeup!

                        //      We could also call the method like this:

                        //              sayHello(3);

                        //      Even though both version 1 and 3 are defined with a single parameter, the
                        //      parameter's type is different for both of them. Because we are now passing
                        //      a value of type int, version 1 will be invoked, and we will see the following
                        //      output:

                        //              Hello, World!
                        //              Hello, World!
                        //              Hello, World!

// Passing Parameters To Methods
        // Parameters are passed by value.
                // - Copy of value is created inside method.
                // - Reassigning a value inside of method will not change it outside of method.

                    // Example:

//                          public static void changeString(String s) {
//                              s = "Wub a lub a dub dub";
//                          }
//                          
//                          public static void main(String[] args) {
//                              String changeMe = "hello codeup!";
//                          
//                              changeString(changeMe);
//                          
//                              System.out.println(changeMe);
//                          }

                        //  - First we define a method named changeString that takes in a string and
                        //      re-assigns it. When we call changeString inside of our main method, we pass
                        //      it the changeMe variable. Even though the string variable inside of changeString
                        //      is re-assigned, the changeMe variable will still have the same value after the
                        //      method call. That is, after running the main method, the code above will output:

                        //              hello codeup!

// Recursion
        // Concept that aims to solve a problem by dividing it to smaller chunks.
        // Involves creating a method that calls itself, but with different parameters
        //      than were originally passed.
        // When writing recursive method, make sure to have a "base case" or "stop condition" so
        //      method doesn't call itself over and over again (recursive equivalent of an infinite loop).

                // Recursion Example - Counting 5 to 1 (recursion instead of loop):

//                          public static void count(int n) {
//                              if (n <= 0) {
//                                  System.out.println("All done!");
//                                  return;
//                              }
//                              System.out.println(n);
//                              count(n - 1);
//                          }
//                          
//                          public static void main(String[] args) {
//                              count(5);
//                          }

                    // Explanation:
                        // - Method is recursive because it calls itself, and continues to do so with
                        //      an argument of 1 less than the value originally passed. "if" statement
                        //      and condition "n <= 0" is our condition for stopping the recursion. Without
                        //      the "if" to check if we are done counting, we would get a
                        //      stack overflow error (equivalent of an infinite loop).

                // Another Example - Raising a given number to a given power:

// ================== A For Loop
//
//                          public static long getPower(int base, int exponent) {
//                              long result = 1;
//                              for (int i = 1; i <= exponent; i++) {
//                                  result = result * base;
//                              }
//                              return result;
//                          }
//                          Instead of a for loop, we can use recursion here:
//
//==================== vs Recursion
//
//                          public static long getPower(int base, int exponent) {
//                              if (exponent == 0) {
//                                  return 1;
//                              } else if (exponent == 1) {
//                                  return base;
//                              } else if (exponent == 2) {
//                                  return base * base;
//                              }
//                              return base * getPower(base, exponent - 1);
//                          }


    }
}
