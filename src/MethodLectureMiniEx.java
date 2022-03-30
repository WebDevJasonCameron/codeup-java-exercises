public class MethodLectureMiniEx {
    public static void main(String[] args) {

        // countTo100(6);

        System.out.println(addNumbers(10));

    }

    // 1. TODO:
    // Use recursion to print out a given number up through 100
     public static int countTo100(int num) {
        if(num == 100) {
            System.out.println(100);
            return 100;
        }
         System.out.println(num);
         num++;
         return countTo100(num);
     }


    // 2. TODO:
    // Use recursion to add all numbers up from 1 to a given number

    public static int addNumbers(int num) {
        if (num != 0) {
            return num + addNumbers(num - 1);
        }
        else {
            return num;
        }
    }


}
