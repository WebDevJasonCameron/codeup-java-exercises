package fileio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FileIOLectureMiniEX {
    public static void main(String[] args) {
/**
 *      // MY Work Based on previous Lecture Script....
        String newPath = "/User/files/this.text";
        String fileName = "miniTest.txt";
        String directory = "data";

        Path filePath = Paths.get(directory, fileName);

        Path newFakePath = Paths.get("nDir1", "nDir2", "nDir3", "newFile.text");

        System.out.println("newFakePath.toAbsolutePath() = " + newFakePath.toAbsolutePath());
*/

        // Path, 1 directory being passed as argument
        Path oneDirectoryPath = Paths.get("data");

        System.out.println("oneDirectoryPth.toAbsolutePath() = " + oneDirectoryPath.toAbsolutePath());

        // Path, 3 arguments, 2 dir + filename

        Path threeArgumentsPath = Paths.get("dir1, dir2", "filename.txt");

        //Absolute Path

        Path absolutePath = Paths.get("./", "User");

        System.out.println("absolutePath.isAbsolute() = " + absolutePath.isAbsolute());

        // Path, Absolute, verify with isAbsolute

        Path anotherAbsolutePath = Paths.get("./", "user");

        System.out.println("anotherAbsolutePath.isAbsolute() = " + anotherAbsolutePath.isAbsolute());




    }
}
