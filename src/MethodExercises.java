import java.util.Locale;
import java.util.Scanner;
import java.util.Random;

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

        /**
        // Problem 3
        factorialConversation();
        */

        /**
        // Problem 4
        rollDice();
        */





    }  //  <-- END MAIN

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
    //       3.5 Assume that the user will enter an integer, but verify it???s between 1 and 10.
    //       3.6 Use the long type to store the factorial.
    //       3.7 Continue only if the user agrees to.
    //       3.8 A factorial is a number multiplied by each of the numbers before it.
    //       3.9 Factorials are denoted by the exclamation point (n!). Ex:

    //------KEY------------------------------
    // 5 * 4 = 20 * 3 = 60 * 2 = 120 * 1 = 120
    // f * i
    //         f * i
    //                   f * i
    //                            f * i

    // BONUS

    //    3.B.1 Test the application and find the integer for the highest factorial that
    //          can be accurately calculated by this application, then modify the prompt
    //          so that it prompts the user for a number "from 1 to {the highest integer
    //          that returns accurate factorial calculation}". Don???t forget to change your
    //          verification too!
    //          <--DONE
    //    3.B.2 Use recursion to implement the factorial.
    //          <--DONE



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
        int n =  inRange(1, 20);

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

    //    4. Create an application that simulates dice rolling.
    //       4.1 Ask the user to enter the number of sides for a pair of dice.
    //       4.2 Prompt the user to roll the dice.
    //       4.3 "Roll" two n-sided dice, display the results of each, and then ask the user
    //           if he/she wants to roll the dice again.
    //       4.4 Use static methods to implement the method(s) that generate the random numbers.
    //       4.5 Use the .random method of the java.lang.Math class to generate random numbers.

    public static int getMax(Scanner sc){
        while (true){
            System.out.println("How many sides are there to our dice?  ");
            int sNum = sc.nextInt();
            if(checkSideAmount(sNum)) return sNum;
            else {
                System.out.println("I'm sorry, that is an invalid entry for the amount of sides on a di.\n" +
                        "Please try again...");
            }
        }
    }

    public static boolean checkSideAmount(int sNum){
        return sNum > 2;
    }

    public static int roll(int max){
        Random random = new Random();
        return random.nextInt(max);
    }

    public static void askToRoll(int sides, Scanner sc){
        System.out.println("Sounds great.  Please roll our two " +
                sides + "-sided dice.\n  You may type \"Roll\" or just \"r\" if your lazy.");
        String ui = sc.next().toLowerCase(Locale.ROOT);

        if(ui.equals("roll") || ui.equals("r")){
            int d1 = roll(sides);
            int d2 = roll(sides);
            System.out.println("The first di shows, " +
                    d1 + ", while the second di is, " +
                    d2 + ".");
        } else {
            System.out.println("I thought you wanted to play dice.\n" +
                    "I suppose some folks don't like to gamble...");
        }
    }

    public static void askToPlayAgain(int sides, Scanner sc){
        while(true){
            System.out.println("Would you like to roll again? (Yes/No)");
            String response = sc.next();
            if(response.equals("yes") || response.equals("y")){
                askToRoll(sides, sc);
            } else if (response.equals("no") || response.equals("n")){
                System.out.println("Ok.  I suppose that is enough playing for now...");
                break;
            } else {
                System.out.println("I'm sorry, I didn't recognize that response.");
            }
        }
    }

    public static void rollDice(){
        Scanner sc = new Scanner(System.in);

        int sides = getMax(sc);
        askToRoll(sides, sc);
        askToPlayAgain(sides, sc);

    }
}  // <--END CLASS