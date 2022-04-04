package vehicle;

public class Motorcycle extends Vehicle{

    // CON
    public Motorcycle() {
        super();
    }
    public Motorcycle(String name, String color) {
        super(name, color);
    }

    // OVER
    public void makeNoise() {
        System.out.println("Brrrrrrrrr!");
    }
}
