package vehicle;

public class MonsterTruck extends Vehicle {

    // CON


    public MonsterTruck(String name, String color) {
        super(name, color);
    }

    // OVER
    public void makeNoise() {
        super.makeNoise();
        System.out.println("ROAR!!!!!");
    }
}
