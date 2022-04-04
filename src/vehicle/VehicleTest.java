package vehicle;

public class VehicleTest {
    public static void main(String[] args) {

        MonsterTruck monsterTruck = new MonsterTruck("Beast", "pink");
        System.out.println( "The " + monsterTruck.getColor() + " " +  monsterTruck.getName() + " goes: ");
        monsterTruck.makeNoise();


    }




}
