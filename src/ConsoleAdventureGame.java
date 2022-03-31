import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/**
 * Console Adventure Game!
 *
 *    -   Using what you've learned so far in the Java I module, we're going to create a
 *        classic text-based RPG game. These types of online role-playing games date back
 *        to the 70's and solely rely on a text-based interface. In this case, we'll be
 *        using Java to run this game in our console.
 *
 *    -   The idea is that your game will prompt the user, who will then input answers
 *        through the console (using the Scanner class). How the game changes depending
 *        on their answer is completely up to you! Below are a list of suggested features
 *        to get you started:
 *
 *    3.  Ask if the user is ready to start. If they type in "yes", start the game.
 *
 *    4.  Ask the user for their name. Store this as a variable to personalize the adventure.
 *
 *    5.  A classic RPG will have the hero going through different scenarios and battling their
 *        enemies.
 *
 *    6.  Display enemy stats and hero stats. Properties and values can be assigned by you.
 *
 *        --- For example: Health, Attack Points, etc.
 *
 *    7.  Decide on what actions your hero can take.
 *
 *    8.  Attack (decreases enemyHealth)
 *
 *    9.  Drink potion (adds to heroHealth)
 *
 *    10. Run? (ends the game)
 *
 *    11. Keep asking for user input until the enemyHealth reaches 0, then end the game.
 *
 * BONUS - BONUS - BONUS - BONUS - BONUS - BONUS - BONUS - BONUS - BONUS - BONUS - BONUS - BONUS - BONUS
 *
 *    B1.  Allow the user to specify hero stats and enemy stats.
 *
 *    B2.  Automate an enemyAttack after each time the hero takes a turn.
 *    B3.  End the game if either heroHealth or enemyHealth drops to 0.
 *    B4.  Indicate how many potions your hero starts with. Decrement this number each time 'Use Potion' action is used.
 *
 * Remember that these are only suggestions. Feel free to get creative and have fun!!
 */

public class ConsoleAdventureGame {
    public static void main(String[] args) {

        // GAME VARS
        Scanner sc = new Scanner(System.in);
        int d1;
        int d2;
        int gamePoints = 0;

        // INVENTORY VARS
        int healthPotion = 0;
        int freezePotion = 0;
        int firePotion = 0;
        boolean stick = false;
        boolean rock = false;
        boolean rustySword = false;
        boolean shinySword = false;
        boolean staff = false;

        // PLAYER VARS
        String pName;
        int pHealth;

        // ENEMY VARS
        String eName;
        int eHealth;

        // NAR


        // START =============================================================
        pName = scrIntro(sc);





    }  // <--END MAIN



    /**
         GAME OBJECTS
         01. Parts
             - Dice               ... 2d 6                                      <--DONE
             - Board (Diff Scenes)
                                  ... 3 scenes (not including intro)
         02. Player
             - Name                                                             <--DONE
             - Health                                                           <--DONE
             - Game Points                                                      <--DONE
         03. Inventory
             - Weapons                                                          <--DONE
               -- Stick           ... 1pt dmg
               -- Rock            ... 1pt dmg
               -- Rusty Sword     ... 3pt dmg
               -- Shiny Sword     ... 5pt dmg
               -- Staff           ... 4pt dmg
         04. Enemy
             - Name                                                             <--DONE
             - Health                                                           <--DONE
             - Dialog
             - Appearance
             - Drop (points & treasure)
    */

    /**
        GAME MECHANICS
        00. Scanner                                                             <--DONE
        01. Random Rolls                                                        <--DONE
        02. Inventory
            - Add/Reduce/Remove Items
            - Observe
        03. Scene Controls
            - Wrong Command
            - Scene Nav
        04. Actions
            - Challenges                                                       <--DONE
                -- Fight
                -- Dodge
            - Run
            - Heal
            - Observe
        05. Stat Control
            - Reduce Hit Points
            - Heal Hit Points
            - Death
            - Add Game Points
    */
    public static String getName(Scanner sc){
        System.out.println("Would you like to tell me your name?");
        return sc.nextLine();
    }

    public static int roll(int d1, int d2){
        Random random = new Random();
        d1 = random.nextInt(6);
        d2 = random.nextInt(6);
        return d1 + d2;
    }

    public static String playerVrEnemy(int d1, int d2){
        int p = roll(d1, d2);
        int e = roll(d1, d2);
        if(p > e) {
            return "p";
        } else if (e > p){
            return "e";
        } else {
            return "t";
        }
    }

    public static int actionMenu(Scanner sc){
        System.out.println("" +
                "Your may either: \n" +
                "1. Observe\t 2. Fight\t 3. Dodge\t 4. Heal\t 5. Use Item\t 6. Check Stats\t 7. Run Away");
        String r = sc.nextLine().toLowerCase(Locale.ROOT);
        return switch (r) {
            case "1", "observe", "o" -> 1;
            case "2", "fight", "f" -> 2;
            case "3", "dodge", "d" -> 3;
            case "4", "heal", "h" -> 4;
            case "5", "use item", "use", "u" -> 5;
            case "6", "check status", "check", "c" -> 6;
            case "7", "run away", "run", "r" -> 7;
            default -> -1;
        };
    }

    public static void initiateAction(int choiceNum, Scanner sc){
        switch (choiceNum){
            case 1:
                System.out.println("observer");
                break;
            case 2:
                System.out.println("fight");
                break;
            case 3:
                System.out.println("dodge");
                break;
            case 4:
                System.out.println("heal");
                break;
            case 5:
                System.out.println("use");
                break;
            case 6:
                System.out.println("check stats");
                break;
            case 7:
                System.out.println("run");
            case -1:
                System.out.println("That was not listed.  Please try again...");
                actionMenu(sc);
        }
    }

    /**
        GAME FLOW
        01. Story
        02. Get Name
        03. Intro
        04. Introduce Inventory (Health and Items)
        05. Introduce Menu Choices (Perception, Fight, Run, Take)
        06. Stage 1
            06.1 Scene
            06.2 Enemy
            06.3 Reward (Story, Points, and Treasure)
        07. Stage 2
            07.1 Scene
            07.2 Enemy
            07.3 Reward (Story, Points, and Treasure)
        08. Stage 3
            08.1 Scene
            08.2 Enemy
            08.3 Reward (Story, Points, and Treasure)
        09. Ending and Credits
    */

    public static String scrIntro(Scanner sc){
        System.out.println("" +
                "Hello there. \n" +
                "I am the GM of this legendary adventure game!\n" +
                "Welcome!\n" +
                "Though, I will probably be the last person you ever speak to again...");
        String pName = getName(sc);
        System.out.println("" +
                "Well, " + pName + " should be easy enough to put on your grave...\n" +
                "Ur...I mean... That's a fine name!  Very fine name!!\n" +
                pName + ", yes indeed.  I'm sure you will do just fine.  Nope, no worries." +
                "....................");
        return pName;
    }






}
