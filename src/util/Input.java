package util;
import java.util.Locale;
import java.util.Scanner;

class InputTest{
    public static void main(String[] args) {

        Input input = new Input();

        /**
         System.out.println("Type something... ");
         System.out.println(input.getString());
         */
         System.out.println();

         System.out.println(input.yesNo("Yes or No...  "));
          /**
         System.out.println(input.getInt(1, 10));

        System.out.println(input.getInt(1, 10));
        */
    }
}


public class Input {

    // VARS
    private final Scanner scannerNum  =  new Scanner(System.in);
    private final Scanner scannerStr  =  new Scanner(System.in);

    // CONSTRUCTOR
    public Input() {
    }

    // METH
    public String getString(){
        return scannerStr.nextLine();
    }
    public String getString(String prompt){
        System.out.println(prompt);
        return scannerStr.nextLine();
    }

    //  The yesNo method should return true if the user enters y, yes, or
    //  variants thereof, and false otherwise.
    public boolean yesNo(){
        String r = scannerStr.nextLine().toLowerCase(Locale.ROOT);
        return r.equals("yes") || r.equals("y");
    }
    public boolean yesNo(String prompt){
        System.out.println(prompt);
        String r = scannerStr.nextLine().toLowerCase(Locale.ROOT);
        return r.equals("yes") || r.equals("y");
    }

    //  The getInt(int min, int max) method should keep prompting the user for
    //  input until they give an integer within the min and max
    public int getInt(){
        while (true){
            if(scannerNum.hasNextInt()){
                return scannerNum.nextInt();
            } else {
                scannerNum.next();
                System.out.println("try again....");
            }
        }
    }
    public int getInt(String prompt){
        System.out.println(prompt);
        while (true){
            if(scannerNum.hasNextInt()){
                return scannerNum.nextInt();
            } else {
                scannerNum.next();
                System.out.println("try again....");
            }
        }
    }
    public int getInt(int min, int max){
        while (true){
            System.out.println("Provide a number between " + (min + 1) + " and " + (max - 1) +".");
            int x = getInt();
            if(x >= min && x <= max){
                return x;
            } else {
                System.out.println("Number not between " + (min + 1) + " and " + (max - 1) +".");
            }
        }
    }
    public int getInt(int min, int max, String prompt){
        System.out.println(prompt);
        while (true){
            System.out.println("Provide a number between " + (min + 1) + " and " + (max - 1) +".");
            int x = getInt();
            if(x >= min && x <= max){
                return x;
            } else {
                System.out.println("Number not between " + (min + 1) + " and " + (max - 1) +".");
            }
        }
    }
    //  The getInt(double min, double max) method should keep prompting the user for
    //  input until they give an integer within the min and max
    public double getDouble(){
        while (true){
            if(scannerNum.hasNextDouble()){
                return scannerNum.nextDouble();
            } else {
                scannerNum.next();
                System.out.println("try again....");
            }
        }
    }
    public double getDouble(String prompt){
        System.out.println(prompt);
        while (true){
            if(scannerNum.hasNextDouble()){
                return scannerNum.nextDouble();
            } else {
                scannerNum.next();
                System.out.println("try again....");
            }
        }
    }
    public double getDouble(double min, double max){
        while (true){
            System.out.println("Provide a number between " + (min + 1) + " and " + (max - 1) +".");
            double x = getDouble();
            if(x >= min && x <= max){
                return x;
            } else {
                System.out.println("Number not between " + (min + 1) + " and " + (max - 1) +".");
            }
        }
    }

    public double getDouble(double min, double max, String prompt){
        System.out.println(prompt);
        while (true){
            System.out.println("Provide a number between " + (min + 1) + " and " + (max - 1) +".");
            double x = getDouble();
            if(x >= min && x <= max){
                return x;
            } else {
                System.out.println("Number not between " + (min + 1) + " and " + (max - 1) +".");
            }
        }
    }



}
