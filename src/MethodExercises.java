import java.util.Locale;
import java.util.Scanner;

public class MethodExercises {
    public static void main(String[] args) {

        /**
        // Problem 1.
        System.out.println(addition(2, 4));
        System.out.println(subtraction(2, 4));
        System.out.println(multiplication(2, 4));
        System.out.println(division(2, 4));
        System.out.println(modulas(2, 4));

        // Problem 1 Bonus
        System.out.println(multiply2(3, 10));
        System.out.println(multiply3(2, 15));
        */

        /**
        // Problem 2
        inRange(5, 7);
        */

        // Problem 3
        factorialConversation();



        // BONUS

        //    3.B.1 Test the application and find the integer for the highest factorial that
        //          can be accurately calculated by this application, then modify the prompt
        //          so that it prompts the user for a number "from 1 to {the highest integer
        //          that returns accurate factorial calculation}". Don’t forget to change your
        //          verification too!
        //    3.B.2 Use recursion to implement the factorial.






        //    4. Create an application that simulates dice rolling.
        //       4.1 Ask the user to enter the number of sides for a pair of dice.
        //       4.2 Prompt the user to roll the dice.
        //       4.3 "Roll" two n-sided dice, display the results of each, and then ask the user
        //           if he/she wants to roll the dice again.
        //       4.4 Use static methods to implement the method(s) that generate the random numbers.
        //       4.5 Use the .random method of the java.lang.Math class to generate random numbers.






        //    5. Game Development 101
        //       5.1 Welcome to the world of game development!
        //           You are going to build a high-low guessing game. Create a class named HighLow
        //           inside of src.
        //
        //       5.2 The specs for the game are:
        //
        //           5.2.1 Game picks a random number between 1 and 100.
        //           5.2.2 Prompts user to guess the number.
        //           5.2.3 All user inputs are validated.
        //           5.2.4 If user's guess is less than the number, it outputs "HIGHER".
        //           5.2.5 If user's guess is more than the number, it outputs "LOWER".
        //           5.2.6 If a user guesses the number, the game should declare "GOOD GUESS!"
        //
        //           --- Hints
        //
        //               Use the random method of the java.lang.Math class to generate a random number.

        // BONUS

        //   5.B.1 Keep track of how many guesses a user makes.
        //   5.B.2 Set an upper limit on the number of guesses.



    }  //  <-- MAIN

// 1. Basic Arithmetic
//    1.1 Create four separate methods. Each will perform an arithmetic operation:
//        - Addition
//        - Subtraction
//        - Multiplication
//        - Division
//
//    1.2 Each function needs to take two parameters/arguments so that the operation
//        can be performed.
//    1.3 Test your methods and verify the output.
//    1.4 Add a modulus method that finds the modulus of two numbers.
//
//    ---> Food for thought: What happens if we try to divide by zero? What should happen?

// BONUS

//    1.B.1 Create your multiplication method without the * operator (Hint: a loop might
//          be helpful).
//    1.B.2 Do the above with recursion.

    public static int addition(int n1, int n2){
        return n1 + n2;
    }
    public static int subtraction(int n1, int n2){
        return n2 - n1;
    }
    public static int multiplication(int n1, int n2){
        return n1 * n2;
    }
    public static int division(int n1, int n2){
        return n2 / n1;
    }
    public static int modulas(int n1, int n2){
        return n2 % n1;
    }
    // Bonus...
    public static int multiply2(int n1, int n2){
        int out = n1;
        for (int i = 0; i < (n2 - 1); i++) {
            out += n1;
        }
        return out;
    }
    public static int multiply3(int n1, int n2){
        n2--;
        if(n2 == 0) return n1;

        int n3 = n1;
        n1 += n3;
        return multiply3(n1, n2, n3);
    }
    public static int multiply3(int n1, int n2, int n3){
        n2--;
        if(n2 == 0) return n1;

        n1 += n3;
        return multiply3(n1, n2, n3);
    }

    //    2. Create a method that validates that user input is in a certain range
    //       - The method signature should look like this:
    //
    // -C-     public static int getInteger(int min, int max);
    //
    //       - and is used like this:
    //
    // -C-     System.out.print("Enter a number between 1 and 10: ");
    //         int userInput = getInteger(1, 10);
    //
    //      - IF THE INPUT IS INVALID, PROMPT THE USER AGAIN
    //      - Hint: recursion might be helpful here!

    public static int inRange(int min, int max){
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("Please enter a number between " + min + " and " + max + ".");
            int scInt = sc.nextInt();
            if(scInt > min && scInt < max){
                System.out.println("Thank you, the number " + scInt + " you selected is" +
                        " between " + min + " and " + max + ".");
                return scInt;
            } else {
                System.out.println("I'm sorry, please try again.  The number you selected was not between " + min +
                        " and " + max + ".");
            }
        }

    }

    //    3. Calculate the factorial of a number.
    //       3.1 Prompt the user to enter an integer from 1 to 10.
    //       3.2 Display the factorial of the number entered by the user.
    //       3.3 Ask if the user wants to continue.
    //       3.4 Use a for loop to calculate the factorial.
    //       3.5 Assume that the user will enter an integer, but verify it’s between 1 and 10.
    //       3.6 Use the long type to store the factorial.
    //       3.7 Continue only if the user agrees to.
    //       3.8 A factorial is a number multiplied by each of the numbers before it.
    //       3.9 Factorials are denoted by the exclamation point (n!). Ex:

    public static int factorialNum(int n){
        int f = n;
        for (int i = (n-1); i > 0; i--) {
            f = f * i;
        }
        return f;
    }

    public static Boolean factorialNumProcess(int n, int f){
        if(n < 1){
            System.out.println(f + "\n");
            System.out.println("Process is completed...");
            return true;
        };
        System.out.print(f + " * " + n + " = ");
        f *= n;
        return factorialNumProcess(n-1, f);

    }

    public static void factorialConversation(){
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        int n =  inRange(1, 10);

        System.out.println("The Factorial Number of " + n + " is: " + factorialNum(n) +"\n");

        while(!flag){
            System.out.println("Would you like to see the process? (Yes/No)");
            String scStr = sc.nextLine().toLowerCase(Locale.ROOT);
            if(scStr.equals("yes") || scStr.equals("y")){
                flag = factorialNumProcess(n - 1, n);

            } else {
                System.out.println("Ok.  Have a great day.");
                flag = true;
            }
        }




    }
            //------KEY------------------------------
            // 5 * 4 = 20 * 3 = 60 * 2 = 120 * 1 = 120
            // f * i
            //         f * i
            //                   f * i
            //                            f * i




}