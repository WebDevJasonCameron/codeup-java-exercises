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
        String userName;
        int d1;
        int d2;
        int gamePoints = 0;
            // INVENTORY
            int healthPotion = 0;
            int freezePotion = 0;
            int firePotion = 0;
            boolean stick = false;
            boolean rock = false;
            boolean rustySword = false;
            boolean shinySword = false;
            boolean staff = false;







    }  // <--END MAIN



    /**
         GAME OBJECTS
         01. Parts
             - Dice               ... 2d 6
             - Board (Diff Scenes)
                                  ... 3 scenes (not including intro)
         02. Player
             - Name
             - Health
             - Game Points
         03. Inventory
             - Weapons
               -- Stick           ... 1pt dmg
               -- Rock            ... 1pt dmg
               -- Rusty Sword     ... 3pt dmg
               -- Shiny Sword     ... 5pt dmg
               -- Staff           ... 4pt dmg
         04. Enemy
             - Name
             - Health
             - Dialog
             - Appearance
             - Drop (points & treasure)
    */





    /**
        GAME MECHANICS
        00. Scanner
        01. Random Rolls
        02. Inventory
            - Add/Reduce/Remove Items
            - Observe
        03. Scene Controls
            - Wrong Command
            - Scene Nav
        04. Actions
            - Fight
            - Run
            - Heal
            - Observe
        05. Stat Control
            - Reduce Hit Points
            - Heal Hit Points
            - Death
            - Add Game Points
    */

    public static int roll(int d1, int d2){
        Random random = new Random();
        d1 = random.nextInt(6);
        d2 = random.nextInt(6);
        return d1 + d2;
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




    }



}
