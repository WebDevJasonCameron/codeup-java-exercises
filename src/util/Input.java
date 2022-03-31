package util;
import java.util.Locale;
import java.util.Scanner;

class InputTest{
    public static void main(String[] args) {

        Input input = new Input();

        /**
         System.out.println("Type something... ");
         System.out.println(input.getString());
         System.out.println("Yes or No...  ");
         System.out.println(input.yesNo());
         System.out.println(input.getInt(1, 10));
         */
        System.out.println(input.getInt(1, 10));

    }
}


public class Input {

    // VARS
    private final Scanner scanner  =  new Scanner(System.in);

    // CONSTRUCTOR
    public Input() {
    }

    // METH
    public String getString(){
        return scanner.nextLine();
    }
    public String getString(String prompt){
        System.out.println(prompt);
        return scanner.nextLine();
    }

    //  The yesNo method should return true if the user enters y, yes, or
    //  variants thereof, and false otherwise.
    public boolean yesNo(){
        String r = scanner.nextLine().toLowerCase(Locale.ROOT);
        return r.equals("yes") || r.equals("y");
    }
    public boolean yesNo(String prompt){
        System.out.println(prompt);
        String r = scanner.nextLine().toLowerCase(Locale.ROOT);
        return r.equals("yes") || r.equals("y");
    }

    //  The getInt(int min, int max) method should keep prompting the user for
    //  input until they give an integer within the min and max
    public int getInt(){
        while (true){
            if(scanner.hasNextInt()){
                return scanner.nextInt();
            } else {
                scanner.next();
                System.out.println("try again....");
            }
        }
    }
    public int getInt(int min, int max){
        while (true){
            System.out.println("Provide a number between " + min + " and " + max +".");
            int x = getInt();
            if(x > min && x < max){
                return x;
            } else {
                System.out.println("Number not between " + min + " and " + max +".");
            }
        }
    }
    public int getInt(int min, int max, String prompt){
        System.out.println(prompt);
        while (true){
            System.out.println("Provide a number between " + min + " and " + max +".");
            int x = getInt();
            if(x > min && x < max){
                return x;
            } else {
                System.out.println("Number not between " + min + " and " + max +".");
            }
        }
    }
    //  The getInt(double min, double max) method should keep prompting the user for
    //  input until they give an integer within the min and max
    public double getDouble(){
        while (true){
            if(scanner.hasNextDouble()){
                return scanner.nextDouble();
            } else {
                scanner.next();
                System.out.println("try again....");
            }
        }
    }
    public double getDouble(double min, double max){
        while (true){
            System.out.println("Provide a number between " + min + " and " + max +".");
            double x = getDouble();
            if(x > min && x < max){
                return x;
            } else {
                System.out.println("Number not between " + min + " and " + max +".");
            }
        }
    }

    public double getDouble(double min, double max, String prompt){
        System.out.println(prompt);
        while (true){
            System.out.println("Provide a number between " + min + " and " + max +".");
            double x = getDouble();
            if(x > min && x < max){
                return x;
            } else {
                System.out.println("Number not between " + min + " and " + max +".");
            }
        }
    }



}
