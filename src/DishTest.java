import jdk.swing.interop.SwingInterOpUtils;

public class DishTest {

    public static void main(String[] args) {

        Dish dish1 = new Dish();

        dish1.setCostInCents( 500);
        dish1.setNameOfDish("Pizza Slice");
        dish1.setWouldRecommend(true);

        dish1.printSummary();

        DishTools dishTools = new DishTools();
        dishTools.shoutDishName(dish1);
        dishTools.analyzeDishCost(dish1);
        dishTools.flipRecommendation(dish1);
        System.out.println(dish1.isWouldRecommend());

    }
}

class Dish {

    private int costInCents;
    private String nameOfDish;
    private boolean wouldRecommend;


    public Dish(int costInCents, String nameOfDish, boolean wouldRecommend) {
        this.costInCents = costInCents;
        this.nameOfDish = nameOfDish;
        this.wouldRecommend = wouldRecommend;
    }

    public Dish() {
    }

    public int getCostInCents() {
        return costInCents;
    }

    public void setCostInCents(int costInCents) {
        this.costInCents = costInCents;
    }

    public String getNameOfDish() {
        return nameOfDish;
    }

    public void setNameOfDish(String nameOfDish) {
        this.nameOfDish = nameOfDish;
    }

    public boolean isWouldRecommend() {
        return wouldRecommend;
    }

    public void setWouldRecommend(boolean wouldRecommend) {
        this.wouldRecommend = wouldRecommend;
    }

    public void printSummary(){
        System.out.printf("" +
                        "Cost: %d\n" +
                        "The Name of the Dish: %s\n" +
                        "Recommend: %b\n",
                costInCents, nameOfDish, wouldRecommend);
    }
}

class DishTools {

    private static final int AVG_COST_OF_DISH_CENTS = 13_000;

    public void shoutDishName(Dish dish){
        System.out.println(dish.getNameOfDish().toUpperCase());
    }

    public void analyzeDishCost(Dish dish){
        if(dish.getCostInCents() > AVG_COST_OF_DISH_CENTS){
            System.out.println("More expensive than the average.");
        } else {
            System.out.println("Less expensive than the average.");
        }
    }

    public void flipRecommendation(Dish dish){
        dish.setWouldRecommend(!dish.isWouldRecommend());
    }



}
