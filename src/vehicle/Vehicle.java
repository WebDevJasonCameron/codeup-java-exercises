package vehicle;

public class Vehicle {
    private String name;

    // CON
    public Vehicle(String name) {
        this.name = name;
    }
    // GETS
    public String getName() {
        return name;
    }
    // SETS
    public void setName(String name) {
        this.name = name;
    }
    // METHS
    public static void makeNoice(){
        System.out.println("Vroom, Vroom");
    }

}
