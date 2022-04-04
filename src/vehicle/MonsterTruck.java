package vehicle;

public class MonsterTruck extends Vehicle {

    // CON
    public MonsterTruck() {
        super();
    }
    public MonsterTruck(String name, String color) {
        super(name, color);
    }

    // OVER
    public void makeNoise() {
        System.out.println("ROAR!!!!!");
    }
}
