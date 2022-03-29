import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        // 2. Create a class named Bob with a main method for the following
        //    exercise.
        //    2.1 Bob is a lackadaisical teenager. In conversation, his responses
        //        are very limited.
        //    2.2 Bob answers 'Sure.' if you ask him a question. (the input ends
        //        with a question mark)
        //    2.3 He answers 'Whoa, chill out!' if you yell at him. (the input ends
        //        with an exclamation mark)
        //    2.4 He says 'Fine. Be that way!' if you address him without actually
        //        saying anything. (empty input)
        //    2.5 He answers 'Whatever.' to anything else.
        //    2.6 Write the Java code necessary so that a user of your command line
        //        application can have a conversation with Bob.

        Scanner sc = new Scanner(System.in);

        System.out.println("What would you like to say to Bob?");
        System.out.println(BobsReply(sc.nextLine()));
    }

    public static String BobsReply(String s){
        if(s.endsWith("?")) return "Sure";
        if(s.endsWith("!")) return "Whoa, chill out!";
        if(s.equals("")) return "Fine. Be that way!";
        return "Whatever";
    }




}
