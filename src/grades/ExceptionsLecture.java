package grades;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ExceptionsLecture {
    /**
    public String maybeAnInteger = "42";
    public String certainlyNotAnInteger = "I am not an Integer";
    public String miniExString01 = "Testing this String Thing";
    public String miniExString02 = miniExString01.substring(0,19);
//    public String miniExString03 = miniExString01.substring(0,50);        // <--BREAKS
*/
    public void subListMaker(String sentence) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer");
        int firstInt = -1;
        try{
            firstInt = scanner.nextInt();
        } catch (InputMismatchException ime){
            System.out.println("Received an input mismatch Exception: " + ime);
        }
        System.out.println("Please enter another integer");
        int secondInt = scanner.nextInt();
        System.out.println(sentence);
        ArrayList<String> wordArrayList = new ArrayList<String>();
        String[] stringArray = sentence.split(" ");
        for (String word : stringArray) {
            wordArrayList.add(word);
        }
        try{
            List<String> shorterList = wordArrayList.subList(firstInt, secondInt);
            String newSentence = String.join(" ", shorterList);
            System.out.println(newSentence);
        } catch (IllegalArgumentException iae){
            System.out.println("Illegal Argument Exception: " + iae);
        } catch (IndexOutOfBoundsException ioobe){
            System.out.println("Index Out Of Bounds: " + ioobe);
        }
    }




}

//  Mini-exercise One:
//  Investigate the substring method for String objects in the Java API.
//  Find out what kind of exception it throws. Create a test class with a main method.
//  Set up a try-catch block that defines a string and finds its length. Once you have
//  the length of your string, modify your program so it creates a substring from your
//  original string, but give it an index that doesn't exist so you get the error message.
//
//  Optional: play with the .getMessage and .printStackTrace methods.
//
//  Optional: what are some other ways you can get the same exception? Try to set up your
//  program to produce and catch these exceptions.

// ======================================================================================

//  Mini-exercise Two:
//  Given the following code, investigate the kinds of exceptions it could throw and write
//  a try-catch structure catching these exceptions and providing the appropriate output
//  messages. Be careful of where exactly you begin your try-catch structure. Optionally,
//  add a final clause.
//
//  Test your code to make sure that the exceptions are indeed caught. Test the code by
//  entering a null value as the method's String parameter (subListMaker(null) or String
//  sentence = null; subListMaker(sentence)), and by entering negative integers and
//  integers larger than the number of words in the sentence as the user inputs. Try to
//  modify the warning for an improper integer to suggest to the user what range of
//  integers is acceptable.
//
//  To search for what exceptions a method throws, use the following search string: Java
//  + number of your Java JDK + API + name of method. For example, Java 16 API substring.
//



//
//  Option 2 (challenge):
//  Write a method called subsistence that takes a string parameter. It asks the user
//  for two integers, then uses the integers as indexes to create a subsistence from
//  the sentence. Use whatever methods you want (ArrayList methods and String methods
//  are suggested). Investigate all the exceptions your code can throw and write catch
//  statements for them.