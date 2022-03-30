import java.util.Scanner;
import java.util.Random;

public class HighLow {
    public static void main(String[] args) {

        game();

    }  //  <--END MAIN

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
    //         <--DONE
    //   5.B.2 Set an upper limit on the number of guesses.

    public static int getRandomNum(){
        Random random = new Random();
        return random.nextInt(100);
    }

    public static int getUserNum(Scanner sc){
        System.out.println("Please pick a number between 1 and 100");
        return sc.nextInt();
    }

    public static boolean valNum(int uNum, int rNum){
        if(uNum > rNum){
            System.out.println("LOWER");
            return true;
        } else if(uNum < rNum){
            System.out.println("HIGHER");
            return true;
        } else if(uNum == rNum){
            System.out.println("GOOD GUESS!");
            return false;
        } else {
            System.out.println("That is outside the bounds");
            return true;
        }
    }

    public static void endGameReport(int count){
        if(count == 10){
            System.out.println("You did not pick the number after 10 tries.");
            System.out.println("This ends our guessing game.");
        } else {
            System.out.println("That ends our guessing game.");
            System.out.println("It took " + count + " tries.");
        }
    }

    public static void runGuess(int uNum, int rNum, Scanner sc){
        int count = 1;
        while(valNum(uNum, rNum) && count != 10){
            count ++;
            uNum = getUserNum(sc);
        }
        endGameReport(count);
    }

    public static void game(){
        Scanner sc = new Scanner(System.in);
        int rNum = getRandomNum();
        System.out.println("the random number is: " + rNum);
        int uNum = getUserNum(sc);
        runGuess(uNum, rNum, sc);
    }


}  // <--END CLASS





















