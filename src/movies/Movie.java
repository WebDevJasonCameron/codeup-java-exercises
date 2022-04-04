package movies;

public class Movie {

    private String name;
    private String category;

    // CON
    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    // GETS
    public String getName() {
        return name;
    }
    public String getCategory() {
        return category;
    }

    // SETS
    public void setName(String name) {
        this.name = name;
    }
    public void setCategory(String category) {
        this.category = category;
    }
}  //  <-- END
