public class JavaWarmups {
    public static void main(String[] args) {

        // 2022 03 31
        System.out.println(returnFirstCapitalLetter("hellO"));      // returns 'O'
        System.out.println(returnFirstCapitalLetter("hello"));      // returns ' '
        System.out.println(returnFirstCapitalLetter("hEllo"));      // returns 'E'
        System.out.println(returnFirstCapitalLetter("hELlO"));      // returns 'E'
        System.out.println(returnFirstCapitalLetter("H"));          // returns 'H'

        // 2022 04 01





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

    // 2022 03 31       ================================= WARM UP
    //



    }
}
