package fileio;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLOutput;

public class FileIOLectureExercise {

    public static void main(String[] args) {

        //Lecture examples to work out after students
        String myPath = "/Users/files/this.text";
        String fileName = "test.txt";
        String directory = "data";

        // Getting the file full path from this method get
        Path filePath = Paths.get(directory, fileName);

        System.out.println("filePath.getFileName() = " + filePath.getFileName());
        System.out.println("filePath.toString() = " + filePath.toString());

        Path fakePath = Paths.get("dir1", "dir2", "dir3", "dir4", "file.text");

        System.out.println("fakePath.toAbsolutePath() = " + fakePath.toAbsolutePath());


    }


}
