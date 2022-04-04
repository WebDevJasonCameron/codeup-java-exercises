import java.util.Arrays;

public class ArraysLecture {
    public static void main(String[] args) {
         // We declare a ref var, numbers, of type Int Array
        int[] numbers;
        // we assign an actual array to the num ref
        numbers = new int[5];
        numbers[0] = 78;
        numbers[1] = 76;
        numbers[2] = 43;
        numbers[3] = 12;
        numbers[4] = -56;

        System.out.println(numbers[3]); // 12
        Arrays.sort(numbers);  // mutates array
        // *not* numbers.sort();
        System.out.println(numbers[0]);

        // array initializer syntax

        // Array of Strings
        String[] synonymsOfWeird = {"strange", "bizarre", "uncanny", "odd", "peculiar", "uncommon"};
        System.out.println(synonymsOfWeird[2]);

        for (int i = 0; i < synonymsOfWeird.length; i++) {
            System.out.println("The number at index " + i + " is " + synonymsOfWeird[i]);
        }

        // Neat way of doing the prev
        // "Enhanced For Loop"       <-- NICE!!!
        for (String synonymOfWeird : synonymsOfWeird) {
            System.out.println(synonymOfWeird);
        }

        // MINI EX
        // Create an array of five bytes using either array var declaration or array initialization syntax.
        // Use either a for loop or an enhanced for loop to output the values to the terminal
//        byte[] myByte = new byte[5];
//        myByte = {1, 2, 3, 4, 5};

        byte[] myByte;
        myByte = new byte[5];
        myByte[0] = 78;
        myByte[1] = 76;
        myByte[2] = 43;
        myByte[3] = 12;
        myByte[4] = -56;

        for (byte b : myByte) {
            System.out.println(b);
        }

    }
}

















