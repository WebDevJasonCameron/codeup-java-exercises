import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ConsoleExercises {
    public static void main(String[] args) {

        // 1. Copy this code into your main method:
        //    1.a Write some Java code that uses the variable pi to output the following:
        //    1.b Don't change the value of the variable; instead, reference one of the
        //        links above and use System.out.format to accomplish this...

              /**
                double pi = 3.14159;
                System.out.printf("The value of pi is approximately %.2f", pi);
               */

        // EXPLORE THE SCANNER CLASS

        // 1. Prompt a user to enter an integer and store that value in an int variable
        //    using the nextInt method.
        //    1.a What happens if you input something that is not an integer?
        //          <--It breaks the code (give an exception)

            /**
                Scanner myScanner = new Scanner(System.in);

                System.out.println("Please enter an integer: ");
                int userInt = myScanner.nextInt();
                System.out.println("You entered the number: " + userInt);
             */


        // 2. Prompt a user to enter 3 words, and store each of them in a separate variable.
        //    Then, display them back in the console, each on a newline.
        //    1.a What happens if you enter less than 3 words?
        //      <--Program keeps running until you enter enough words
        //    1.b What happens if you enter more than 3 words?
        //      <--We loose the extra words because we do not have a var that captures each

              /**
                Scanner sc = new Scanner(System.in);

                System.out.println("Please inter three words:  ");
                String word1 = sc.next();
                String word2 = sc.next();
                String word3 = sc.next();

                System.out.printf("The tree words you entered was %s, %s, and %s", word1, word2, word3);
               */

        // 3. Prompt a user to enter a sentence, then store that sentence in a String variable using the
        //    next method. Then, display that sentence back to the user.
        //
        //    3.a Do you capture all the words?
        //      <--NO, you NEED to capture the whole string with .nextLine()

                /**
                Scanner sc = new Scanner(System.in);

                System.out.println("Please enter a string:  ");
                String userString = sc.nextLine();
                System.out.println("Wow, that is a great sentence:  \n" + userString);
                 */

        // 4. Rewrite the above example using the nextLine method. <--DONE


        // CALCULATE THE PERIMETER AND AREA OF CODEUP'S CLASSROOM

        // 1. Prompt the user to enter values of length and width of a classroom at Codeup
        //    (or your room if virtual).
        //    1.a  Use the nextLine method each time you need to get user input. In this case,
        //    we need it twice, once to get the user input for the length and again to get the
        //    user input for the width. Parse the resulting strings to a numeric type.
        //    - Assume that the rooms are perfect rectangles.
        //    - Assume that the user will enter valid numeric data for length and width.


                /**
                Scanner sc = new Scanner(System.in);

                System.out.println("Please enter the length of the room:  ");
                String length = sc.nextLine();
                System.out.println("Please enter the width of the room:  ");
                String width = sc.nextLine();
                int par = (parseInt(length) * 2) + (parseInt(width) * 2);
                int area = parseInt(length) * parseInt(width);
                System.out.println("The room's parameter is:  " + par + "ft.");
                System.out.println("The room's area is:  " + area + "ft.");
                */

        // 2. Display the area and perimeter of that classroom.
        //    2.a The area of a rectangle is equal to the length times the width, and the
        //        perimeter of a rectangle is equal to 2 times the length plus 2 times the width.


        // BONUS

        /**
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");

        System.out.println("Please enter the length, width and height of the room:  ");
        float length = sc.nextFloat();
        float width = sc.nextFloat();
        float height = sc.nextFloat();
        float par = (length * 2) + (width * 2);
        float area = length * width;
        float volume = length * height * width;
        System.out.println("The room's parameter is:  " + par + " ft.");
        System.out.println("The room's area is:  " + area + "ft.");
        System.out.println("The room's volume is:  " + volume + "ft.");
        */
    }
}
