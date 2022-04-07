package grades;

public class ExceptionsLecture {
    public String maybeAnInteger = "42";
    public String certainlyNotAnInteger = "I am not an Integer";
    public String miniExString01 = "Testing this String Thing";
    public String miniExString02 = miniExString01.substring(0,19);
//    public String miniExString03 = miniExString01.substring(0,50);
}

//  Mini-exercise: Investigate the substring method for String objects in the Java API.
//  Find out what kind of exception it throws. Create a test class with a main method.
//  Set up a try-catch block that defines a string and finds its length. Once you have
//  the length of your string, modify your program so it creates a substring from your
//  original string, but give it an index that doesn't exist so you get the error message.
//
//  Optional: play with the .getMessage and .printStackTrace methods.
//
//  Optional: what are some other ways you can get the same exception? Try to set up your
//  program to produce and catch these exceptions.