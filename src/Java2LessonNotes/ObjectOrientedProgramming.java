package Java2LessonNotes;

public class ObjectOrientedProgramming {

// Classes And Objects

    // Class - used to define a custom type in Java.
    //          + Think of it as a template or blueprint for objects that will be created
    //            based on it.

    // Field - variable or method that belongs to an object or a class
    //          + Are accessed with the "." operator. By default fields belong to objects,
    //            but can be defined as belonging to a class with the static keyword. Fields
    //            are either properties (variables) or methods (functions).

    // Object - an instance of a class
    //          + have properties and methods, and are instantiated, i.e. created, with the
    //            "new" keyword.

            // Example of defining a Person class and creating an instance of it

//                  class Person {
//                      public String firstName;
//                      public String lastName;
//                  
//                      public String sayHello() {
//                          return String.format("Hello from %s %s!", firstName, lastName);
//                      }
//                  
//                      public static void main(String[] args) {
//                          Person rick = new Person();
//                          rick.firstName = "Rick";
//                          rick.lastName = "Sanchez";
//                          System.out.println(rick.sayHello());
//                          // prints "Hello from Rick Sanchez!"
//                      }
//                  }

            // We define a class named "Person" with two instance variables, or properties,
            // "firstName" and "lastName". The class also defines an instance method, "sayHello".

            // The "sayHello" method can refer to "firstName" and "lastName", despite them having
            // variables with those names defined in the method. If we had defined a variable
            // with the same name as a property, any reference would refer to the variables,
            // not the property.

            //
}
