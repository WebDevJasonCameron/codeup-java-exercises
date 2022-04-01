package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {

        CircleApp circleApp = new CircleApp();
        circleApp.cAppRun();
    }

    // FIELDS
    private static int count = 0;

    // CON
    public CircleApp() {
    }

    // GETS
    public static int getCount() {
        return count;
    }

    // SETS
    public static void setCount(int count) {
        CircleApp.count = count;
    }

    // METHS
    public boolean cApp (){
        Input input = new Input();
        double r = input.getDouble("What is the radius of the circle?   ");
        Circle circle = new Circle(r);
        System.out.println("Circumference: " + circle.getCircumference());
        System.out.println("Radius: " + circle.getArea());
        return input.yesNo("Would you like to create another circle? ");
    }

    public void cAppRun(){
        boolean flag = true;
        while (true){
            if(flag) {
                flag = cApp();
                setCount(count + 1);
            } else {
                System.out.println("You created " + getCount() + " circles.");
                return;
            }
        }
    }
}
