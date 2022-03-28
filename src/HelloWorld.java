public class HelloWorld {
    public static void main(String[] args) {
        // System.out.println("Hello, World");

        // 1. Create an int variable named myFavoriteNumber and assign your favorite
        //    number to it, then print it out to the console.

                int myFavoriteNumber = 3;

        // 2. Create a String variable named myString and assign a string value to it,
        //    then print the variable out to the console.

                String myString = "hello";
                // System.out.println(myString);

        // 3. Change your code to assign a character value to myString. What do you
        //    notice?

                /** myString = (char) 'x';      */

                // It breaks

        // 4. Change your code to assign the value 3.14159 to myString. What happens?

               /** myString = 3.14159;      */

                // It breaks

        // 5. Declare a long variable named myNumber, but do not assign anything to it.
        //    Next try to print out myNumber to the console. What happens?

                long myNumber;
                /** System.out.println(myNumber);         */

                // Not initialized

        // 6. Change your code to assign the value 3.14 to myNumber. What do you notice?

                /** myNumber = 3.14;                     */

                // Cannot assign a float within a long data type


        // 7. Change your code to assign the value 123L (Note the 'L' at the end) to
        //    myNumber.

                myNumber = 123L;

        // 8. Change your code to assign the value 123 to myNumber.

                myNumber = 123;

        // 9. Change your code to declare myNumber as a float. Assign the value
        //    3.14 to it. What happens? What are two ways we could fix this?

                /** myNumber = (float) 3.14;            */

        // 10. Copy and paste the following code blocks one at a time and execute them

                /** int x = 5;
                System.out.println(x++);
                System.out.println(x);

                System.out.println(++x);
                System.out.println(x);               */


                // What is the difference between the above code blocks? Explain why
                // the code outputs what it does.

        // 11. Try to create a variable named class. What happens?

                /** String class;                  */

                // class is a keyword word

        // 12. Object is the most generic type in Java. You can assign any value
        //     to a variable of type Object. What do you think will happen when
        //     the following code is run?


                String theNumberThree = "three";
                Object o = theNumberThree;
                /** int three = (int) o;                       */

                // Yes.  We get an error because you cannot store an obj in a var that
                // expects an int.  The int memory cannot hold the data

        // 12.a How is the above example different from the code block below? What are
        //      the two different types of errors we are observing?

                /** int three = (int) "three";                 */

                // java: incompatible types: java.lang.String cannot be converted to int

        // 13. Rewrite the following expressions using the relevant shorthand assignment
        //     operators:

                /**
                int x = 4;
                x++;                                            */

                /**
                int x = 3;
                int y = 4;
                y = y * x;                                      */

                /**
                int x = 10;
                int y = 2;
                x = x / y;
                y = y - x;                                      */


        // 14. What happens if you assign a value to a numerical variable that is larger
        //     (or smaller) than the type can hold? What happens if you increment a
        //     numeric variable past the type's capacity?

                // 1) It will not compile
                // 2) I expect it will roll over

    }
}
