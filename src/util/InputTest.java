package util;

class InputTest{
    public static void main(String[] args) {

        Input input = new Input();

        /**
         * PREVIOUS ASSIGNMENT
         System.out.println("Type something... ");
         System.out.println(input.getString());

         System.out.println();

         System.out.println(input.yesNo("Yes or No...  "));

         System.out.println(input.getInt(1, 10));

         System.out.println(input.getInt(1, 10));
         */

        // ERROR EXCEPTION HANDLING ASSIGNMENT
//        System.out.println(input.getInt("Please provide an integer: "));
//        System.out.println(input.getDouble("Please provide an integer: "));

        /**
         * EXAMPLES
        int num = 10;
        System.out.println("Binary is " + Integer.toBinaryString(num));

        num = 9;
        System.out.println("Binary is " + Integer.toBinaryString(num));

        int foo = Integer.parseInt("1001", 2);
        System.out.println(foo);
        */
        input.getBinary();

    }  //  <--END MAIN
}  //  <--END
