package vehicle;

public class Vehicle {
    private String name;
    private String color;

    // CON
    public Vehicle(){};
    public Vehicle(String name, String color) {
        this.name = name;
        this.color = color;
    }

    // GETS
    public String getName() {
        return name;
    }
    public String getColor() {
        return color;
    }

    // SETS
    public void setName(String name) {
        this.name = name;
    }
    public void setColor(String color) {
        this.name = color;
    }

    // METHS
    public void makeNoise(){
        System.out.println("Vroom, Vroom");
    }

}
