package fileio;

import java.util.ArrayList;

public class FileIOLecture {

    public static void main(String[] args) {
        // Actual Lecture split

        // Person text files -> container a list of people
        FileManager postsFile = new FileManager("posts.txt", "data");
        FileManager peopleFile = new FileManager( "persons.txt", "data");

//        ArrayList<FileManager> files = new ArrayList<>();
//        files.add(new FileManager())

        postsFile.printLines();
        peopleFile.printLines();

        // Posts -> contains a number of posts



    }
}