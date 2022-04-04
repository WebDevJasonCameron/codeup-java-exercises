package vehicle;

public class Garage {

    // INSTALLATION
    Vehicle vehicle = new Vehicle("Cool Car", "Dark Green");
    MonsterTruck monsterTruck = new MonsterTruck("The Beast", "Pink");
    Motorcycle motorcycle = new Motorcycle("Bat-cycle", "black");

    // CON
    public Garage() {
    }
    public Garage(Vehicle vehicle, MonsterTruck monsterTruck, Motorcycle motorcycle) {
        this.vehicle = vehicle;
        this.monsterTruck = monsterTruck;
        this.motorcycle = motorcycle;
    }

    // VAR
    private final Vehicle[] garaged = {vehicle, monsterTruck, motorcycle};

    // METH
    public void garageNoise(){
        for (Vehicle value : garaged) {
            value.makeNoise();
        }
    }
    public void getVehicleNames(){
        for (int i = 0; i < garaged.length; i++) {
            System.out.println(garaged[i].getName());
        }
    }
}
