public class ServerNameGenerator {
    public static void main(String[] args) {

        getNameOfServer();


    }  //  <-- END MAIN



    //  2. We are going to build a server name generator. Create a class
    //     inside of src named ServerNameGenerator, and follow the specs below.
    //     2.1 Create two arrays whose elements are strings: one with at least
    //         10 adjectives, another with at least 10 nouns.

    // VARS
    private static String[] adj = {"adorable", "alert",
            "average", "breakable", "cheerful", "cautious",
            "depressed", "disgusted", "funny", "magnificent" };

    private static String[] noun = { "diamond", "lunch",
            "traffic", "egg", "elephant", "nail", "whale",
            "napkin", "night", "orange"};


    //    2.2 Create two arrays whose elements are strings: one with at least 10
    //        adjectives, another with at least 10 nouns.
    public static int getRandomNumber(int min, int max){
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static String randoString(String[] stringArray){
        return stringArray[getRandomNumber(0, stringArray.length - 1)];
    }

    //   2.3 Add a main method, and inside your main method select and random
    //       noun and adjective and hyphenate the combination and display the
    //       generated name to the user.
    public static String getNameOfServer(){
        String serverName = randoString(adj) + "-" + randoString(noun);
        System.out.println("Here is your server name:\n" + serverName);
        return serverName;
    }


}  //  END
