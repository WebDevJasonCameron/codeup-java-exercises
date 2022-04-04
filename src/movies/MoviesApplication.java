package movies;
import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {

        MoviesArray moviesList = new MoviesArray();
        /**
         Input input = new Input();

        viewAllMovies(moviesList);
        viewMoviesByCat(moviesList, input.getString("What category do you want to view?  "));
         */

        runApp(moviesList);



    }  //  <-- END MAIN


    // METHS
    public static void viewAllMovies(MoviesArray movieList){
        for (int i = 0; i < movieList.findAll().length; i++) {
            System.out.println(movieList.findAll()[i].getName());
        }
    }
    public static void viewMoviesByCat(MoviesArray moviesArray, String cat){
        for (int i = 0; i < moviesArray.findAll().length; i++) {
            if(moviesArray.findAll()[i].getCategory().equals(cat)){
                System.out.println(moviesArray.findAll()[i].getName());
            }
        }
    }

    public static void runApp(MoviesArray moviesList){
        boolean flag = true;
        while(flag){
            flag = chooseView(moviesList);
        }
    }

    public static boolean chooseView(MoviesArray moviesList){
        Input input = new Input();
        switch (menu()) {
            case 1 -> {
                viewAllMovies(moviesList);
                return true;
            }
            case 2 -> {
                viewMoviesByCat(moviesList, input.getString("What category do you want to view?  "));
                return true;
            } case 3 -> {
                System.out.println("Ending Application.\n" +
                        "Thank you...");
                return false;
            }
        }
        return true;
    }

    public static int menu(){
        Input input = new Input();
        return input.getInt(0, 4,"What you like to view?\n" +
                "(Choose a number)\n" +
                "1. View All Movies\n" +
                "2. View by Categories\n" +
                "3. End App");
    }


}  //  <--END
