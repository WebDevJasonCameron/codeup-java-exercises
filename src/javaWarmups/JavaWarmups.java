package javaWarmups;

public class JavaWarmups {
    public static void main(String[] args) {

        // 2022 03 31
        /**
        System.out.println(returnFirstCapitalLetter("hellO"));      // returns 'O'
        System.out.println(returnFirstCapitalLetter("hello"));      // returns ' '
        System.out.println(returnFirstCapitalLetter("hEllo"));      // returns 'E'
        System.out.println(returnFirstCapitalLetter("hELlO"));      // returns 'E'
        System.out.println(returnFirstCapitalLetter("H"));          // returns 'H'


        // 2022 04 01

        int y = 7;
        String x = "" + 7;
               */

        // 2022 04 07



    }  //  <-- END MAIN

    // 2022 03 31       ================================= WARM UP
    //
    // Create a method, returnFirstCapitalLetter, that takes in a string and returns the first
    // capital letter as a char. If no capital letter is found, return a single space character
    // ' '. Assume only letters in the input string and all possible inputs will have at least
    // one letter.

    public static char returnFirstCapitalLetter(String string){
        for (int i = 0; i < string.length(); i++) {
            if(string.charAt(i) >= 'A' && string.charAt(i) <= 'Z' ) return string.charAt(i);
        }
        return ' ';
    }

    // 2022 04 07       ================================= WARM UP
    //# Java Assessment Practice Problems
    //
    // 1. Create a class called Practice with a main method.
    //
    // 2. Create a public static method in main called *subtractTen* that takes one
    //    integer argument and returns that number minus 10.
    //
    // 3. Create a public static method *average* that takes an array of integers
    //    and returns their average as a double.
    //
    // 4. Create a class called Pet with two String instance variables, name and type.

    // 5. Create getters and setters for the properties as well as a constructor that
    //    takes two strings and sets the name and type.
    //
    // 6. Create a PetDog class that inherits from Pet.
    // 7. In PetDog, create a boolean instance variable, trained.
    // 8. Write a constructor for PetDog that sets its name, type, and trained properties.
    // 9. Write an instance method in PetDog  called isTrained that returns the boolean
    // value of the trained property.





}  //  <--END
