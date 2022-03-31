import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class DateUtils {
    private static String defaultDateFormat = "yyyy-MM-dd";

    public static String getTodaysDate() {
        LocalDate dateObj = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(defaultDateFormat);
        return dateObj.format(formatter);
    }

    public static void changeDateFormat (String dateFormat) {
        defaultDateFormat = dateFormat;
    }

}

class Post {
    private String author;
    //  private Human author;
    private String title;
    private String content;
    private String creationDate;

    // Default # of posts
    private static long totalPosts = 0;


    public Post() {
        // so much logic!!!!!
        totalPosts++;
    }

    public Post(String title, String author, String content, String creationDate) {
        this();
        this.author = author;
        this.content = content;
        this.title = title;
        this.creationDate = creationDate;
    }

    public Post(String title, Human author, String content, String creationDate) {
        this(title,author.getFullName(),content, creationDate);
    }

    public Post(Post copyPost) {
        this(copyPost.getTitle(),copyPost.getAuthor(),copyPost.getContent(), copyPost.getCreationDate());
    }

    public Post(String title, Human author, String content) {
        this(title, author.getFullName(), content, DateUtils.getTodaysDate());
    }



    public String getPost() {
        return  "\nTitle: " + title +  "\n"+
                "Content: " + content + "\n" +
                "Author: " + author + "\n" +
                "CreationDate: " + creationDate +"\n";
    }

    public String updatePost(String title, String author,String content, String creationDate) {

        this.title = title;
        this.author = author;
        this.content = content;
        this.creationDate = creationDate;

        return  this.getPost();
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreationDate() {
        return creationDate;
    }


}

class Human {
    private String firstName;
    private String lastName;
    private int age;
    private static long totalPeople = 0;

    private static String description = "Object represents a person.";

    public Human() {}

    public Human(String first, String last) {
        this.firstName = first;
        this.lastName = last;
    }

    public static String getDescription() {
        return description;
    }

    public String sayHello() {
        return String.format("Hello from %s %s!",
                firstName, lastName);
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static long getTotalPeople() {
        return totalPeople;
    }

    public static void setTotalPeople(long totalPeople) {
        Human.totalPeople = totalPeople;
    }


}



public class OOPLecture {
    public static void main(String[] args) {
        // This is where we will do all our work with the class we're creating
        Post firstPost = new Post();

        System.out.println("firstPost = " + firstPost);

        System.out.println("firstPost = " + firstPost.getPost());

//        firstPost.author = "Dane Miller";
//        firstPost.title = "OOP is a fundamental of many programming languages";
//        firstPost.creationDate = "2022-03-31";
//        firstPost.content = "OOP allows us to create methods and variables that are encapsulated in a class object.";

        firstPost.setTitle("OOP is a fundamental of many programming languages");
        firstPost.setAuthor("Dane Miller");
        firstPost.setContent("OOP allows us to create methods and variables that are encapsulated in a class object.");
        firstPost.setCreationDate("2022-03-31");


        System.out.println("firstPost.getPost() = " + firstPost.getPost());


        String updatedPost = firstPost.updatePost(
                "OOP The 4 Fundamentals: Abstraction",
                "Dane Miller",
                "Abstraction is the simplification of complex things to make them easier to work with.",
                "2022-03-30");

        System.out.println("updatedPost = " + updatedPost);

        Post secondPost = new Post();

        secondPost.updatePost(
                "OOP The 4 Fundamentals: Encapsulation",
                "Dane Miller",
                "The bundling of data and methods into a single unit, a class.",
                "2022-03-30");

        System.out.println("secondPost.getPost() = " + secondPost.getPost());

        // 1. Created a class called post. Which is responsible for creating new posts.
        // 2 .We created field in that class with public visibility. meaning that everyone has access to this value
        // 3. We used encapsulation by storing our data and methods related to the class inside it.


        // People class!

        Human firstPerson = new Human("Justin","Reich");

        System.out.println("firstPerson.sayHello() = " + firstPerson.sayHello());

        Human secondPerson = new Human();

        secondPerson.setFirstName("Dane");
        secondPerson.setLastName("Miller");
//        secondPerson.age = 34;
        secondPerson.setAge(34);


        System.out.println("secondPerson.sayHello() = " + secondPerson.sayHello());
        System.out.println("secondPerson.getAge() = " + secondPerson.getAge());


        Post thirdPost = new Post(
                "THIS",
                "Dane Miller",
                "The this keyword can be used in a constructor to call another constructor.",
                "2022-03-30"
        );


        System.out.println("thirdPost.getPost() = " + thirdPost.getPost());

        DateUtils.changeDateFormat("dd-YYYY-MM");

        Post fourthPost = new Post(
                "Abstraction",
                secondPerson,
                "Breaking down problems and solving them such that you have smaller problems directly in front of you to solve.");


        System.out.println("fourthPost.getPost() = " + fourthPost.getPost());

        // Copy constructor





        Post fifthPost = new Post(fourthPost);

        System.out.println("fifthPost = " + fifthPost.getPost());


        Post sixthPost = new Post(
                "Encapsulation",
                firstPerson,
                "To encapsulate something in java is to bundle it into a known class.");


    }
}