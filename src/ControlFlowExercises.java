import java.util.Locale;
import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        // 1. Loop Basics
        //    1.a While
        //        1.a.1 Create an integer variable i with a value of 5.
        //        1.a.2 Create An while loop that runs so long as i is less than or equal to 15
        //        1.a.3 Each loop iteration, output the current value of i, then increment i by one.
        //              - Your output should look like this:
        //                5 6 7 8 9 10 11 12 13 14 15

        /**
        int i = 5;
        while(i <= 15){
            System.out.print(i + " ");
            i++;
        }
         */

        //    1.b Do While
        //        1.b.1 Create a do-while loop that will count by 2's starting with 0 and ending at
        //              100. Follow each number with a new line.
        //        1.b.2 Alter your loop to count backwards by 5's from 100 to -10.
        //        1.b.3 Create a do-while loop that starts at 2, and displays the number squared on
        //              each line while the number is less than 1,000,000. Output should equal:

        /**
        int x = 0;
        do {
            System.out.println(x);
            x += 2;
        } while(x <= 100);

        x = x -2;

        do {
            System.out.println(x);
            x = x -5;
         } while(x >= -10);

        long y = 2;

        do {
            System.out.println("z is: " + y);
            y *= y;
        } while(y < 1000000);
        */

        //    1.c For
        //        1.c.1 Refactor the previous two exercises to use a for loop instead.

        /**
        for (int i = 0; i <= 100; i = i + 2) {
            System.out.println(i);
        }

        for (int i = 100; i >= -10 ; i = i - 5) {
            System.out.println(i);
        }

        for (long i = 2; i < 1000000 ; i = i * i) {
            System.out.println(i);
        }
         */


        // 2. Fizzbuzz
        //    2.a One of the most common interview questions for entry-level programmers is the
        //        FizzBuzz test. Developed by Imran Ghory, the test is designed to assess basic
        //        looping and conditional logic skills.
        //        2.a.1 Write a program that prints the numbers from 1 to 100.
        //        2.a.2 For multiples of three: print “Fizz” instead of the number.
        //        2.a.3 For the multiples of five: print “Buzz”.
        //        2.a.4 For numbers which are multiples of both three and five: print “FizzBuzz”.

        /**
        for (int i = 0; i <= 100; i++) {
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0){
                System.out.println("Fizz");
            } else if (i % 5 == 0){
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
         */

        // 3. Display a table of powers.
        //    3.a Prompt the user to enter an integer.
        //    3.b Display a table of squares and cubes from 1 to the value entered.
        //    3.c Ask if the user wants to continue.
        //    3.d Assume that the user will enter valid data.
        //    3.e Only continue if the user agrees to.

        /**
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter an integer:  ");
        int userInt = sc.nextInt();

        System.out.println("Would you like to continue?  (Yes/No)");
        String userStr = sc.next();

        String th = "here is your table!\n" +
                    "\n" +
                    "number\t| squared\t| cubed \n" +
                    "------\t| -------\t| -----";


        if(userStr.toLowerCase().equals("yes") || userStr.toLowerCase().equals("y")){
            System.out.println(th);
            for (int i = 0; i < userInt; i++) {
                System.out.println(i + "\t\t |" + (i * i) + " \t\t| " + (i * i * i));
            }
        } else {
            System.out.println("That is too bad.  I see your number was " + userInt + ".\n" +
                    "That would have been fun to calculate");
        }
         */


        // 4. Convert given number grades into letter grades.
        //    4.a Prompt the user for a numerical grade from 0 to 100.
        //    4.b Display the corresponding letter grade.
        //    4.c Prompt the user to continue.
        //    4.d Assume that the user will enter valid integers for the grades.
        //    4.e The application should only continue if the user agrees to.
        //
        //        - Grade Ranges:
        //          -- A : 100 - 88
        //          -- B : 87 - 80
        //          -- C : 79 - 67
        //          -- D : 66 - 60
        //          -- F : 59 - 0

        /**
        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide a numeric grade from 0 to 100:  ");
        int scInt = sc.nextInt();

        System.out.println("Thank you, would you like the letter grade?  (Yes/No)");
        String scStr = sc.next();

        if(scStr.toLowerCase().equals("yes") || scStr.toLowerCase().equals("y")){
            if(scInt > 87 ){
                System.out.print(scInt + " : A");
            } else if(scInt > 79){
                System.out.println(scInt + " : B");
            } else if(scInt > 66){
                System.out.println(scInt + " : C");
            } else if(scInt > 59){
                System.out.println(scInt + " : D");
            } else {
                System.out.println(scInt + " : F");
            }
        } else {
            System.out.println("Ok, that's fine.  Have a nice day.");
        }
        */


        // BONUS
        // 5. Edit your grade ranges to include pluses and minuses (ex: 99-100 = A+).

        /**
        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide a numeric grade from 0 to 100:  ");
        int scInt = sc.nextInt();

        System.out.println("Thank you, would you like the letter grade?  (Yes/No)");
        String scStr = sc.next();

        if(scStr.toLowerCase().equals("yes") || scStr.toLowerCase().equals("y")){
            if(scInt > 96 ){
                System.out.print(scInt + " : +A");
            } else if(scInt > 93){
                System.out.println(scInt + " : A");
            } else if(scInt > 89){
                System.out.println(scInt + " : A-");
            } else if(scInt > 86){
                System.out.println(scInt + " : B+");
            } else if(scInt > 83){
                System.out.println(scInt + " : B");
            } else if(scInt > 79){
                System.out.println(scInt + " : B-");
            } else if(scInt > 76){
                System.out.println(scInt + " : C+");
            } else if(scInt > 73){
                System.out.println(scInt + " : C");
            } else if(scInt > 69){
                System.out.println(scInt + " : C-");
            } else if(scInt > 66){
                System.out.println(scInt + " : D+");
            } else if(scInt > 63){
                System.out.println(scInt + " : D");
            } else if(scInt > 59){
                System.out.println(scInt + " : D-");
            } else {
                System.out.println(scInt + " : F");
            }
        } else {
            System.out.println("Ok, that's fine.  Have a nice day.");
        }
        */

    }
}
