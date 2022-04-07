package grades;

import util.Input;

import java.util.HashMap;
import java.util.Set;

public class GradesApplication {
    public static void main(String[] args) {

        Student s1 = new Student("Calvin");
        Student s2 = new Student("Mocha");
        Student s3 = new Student("Miya");

        s1.addGrade(75);
        s1.addGrade(85);
        s1.addGrade(77);

        s2.addGrade(88);
        s2.addGrade(45);
        s2.addGrade(68);

        s3.addGrade(95);
        s3.addGrade(98);
        s3.addGrade(97);

        GradesApplication gradesApplication = new GradesApplication();

        gradesApplication.addStudent("Smash", s1);
        gradesApplication.addStudent("Wif", s2);
        gradesApplication.addStudent("Rock", s3);

        // TEST
         /**
        gradesApplication.printStudentNameFromUN("Smash");
        gradesApplication.printStudentGradeListFromUN("Smash");
        gradesApplication.printStudentGradeAverageFromUN("Smash");

        gradesApplication.printUserNames();
        */

        gradesApplication.runApp();



    }  //  <--END MAIN



    // F
    private HashMap<String, Student> students;
    private Input input;

    // CON
    public GradesApplication() {
        this.students = new HashMap<>();
        this.input = new Input();
    }

    // METH
    public void addStudent(String userName, Student student){
        students.put(userName, student);
    }

    public void printStudentNameFromUN(String userName){
        System.out.println(students.get(userName).getName());
    }
    public void printStudentNameFromUN(){
        System.out.println(students.get(keyCheck()).getName());
    }

    public void printStudentGradeListFromUN(String userName){
        students.get(userName).printGradeList();
    }
    public void printStudentGradeListFromUN(){
        students.get(keyCheck()).printGradeList();
    }

    public void printStudentGradeAverageFromUN(String userName){
        System.out.println("Student's Average: ");
        System.out.println(students.get(userName).getGradeAverage());
    }
    public void printStudentGradeAverageFromUN(){
        System.out.println("Student's Average: ");
        System.out.println(students.get(keyCheck()).getGradeAverage());
    }

    public void printUserNames(){
        System.out.println("List of student GH usernames:  ");
        Set<String> gitHubUserNames = students.keySet();
        for (String gHUN : gitHubUserNames){
            System.out.printf(" |%s| ", gHUN);
        }
        System.out.println();

    }




    public String keyCheck(){
        String output = input.getString(
                "Please Provide GH Username:\n");
        while (true){
            if(students.containsKey(output)) return output;
            else {
                System.out.println(output + " is not a username.");
                output = input.getString(
                        "Please Provide GH Username:\n");
            }
        }
    }


    //BONUS
    public void printAllStudentsAndGrades(){
        students.forEach((k, v) -> {
            printStudentNameFromUN(k);
            printStudentGradeListFromUN(k);
            printStudentGradeAverageFromUN(k);
            System.out.println();
        });
    }

    public double getClassAverage(){
        double output = 0;
        int div = students.size();
        for(String un : students.keySet()){
            output += students.get(un).getGradeAverage();
        }
        return output / div;
    }

    public void printClassAverage(){
        System.out.println("The Class Average is:  " + getClassAverage());
    }

    // RUN
    public int menu(){
        System.out.println("PLease select from the following list...\n" +
                "1. See GH username list\n" +
                "2. See Student Name\n" +
                "3. See Student Grade List\n" +
                "4. See Student Average Grade\n" +
                "5. See Name, Grade List, and Average Grade\n" +
                "6. See All Student's names and grades\n" +
                "7. See Class Average\n" +
                "8. See Menu\n" +
                "9. End Application");
        return input.getInt(1, 9);
    }

    public boolean action(int userChoice){
        switch (userChoice) {
            case 1:
                System.out.println("\n--------------------------------------\n");
                printUserNames();
                System.out.println("\n--------------------------------------\n");
                return true;
            case 2:
                System.out.println("\n--------------------------------------\n");
                printStudentNameFromUN();
                System.out.println("\n--------------------------------------\n");
                return true;
            case 3:
                System.out.println("\n--------------------------------------\n");
                printStudentGradeListFromUN();
                System.out.println("\n--------------------------------------\n");
                return true;
            case 4:
                System.out.println("\n--------------------------------------\n");
                printStudentGradeAverageFromUN();
                System.out.println("\n--------------------------------------\n");
                return true;
            case 5:
                System.out.println("\n--------------------------------------\n");
                String username = input.getString("Please Provide GH Username:\n");
                printStudentNameFromUN(username);
                printStudentGradeListFromUN(username);
                printStudentGradeAverageFromUN(username);
                System.out.println("\n--------------------------------------\n");
                return true;
            case 6:
                System.out.println("\n--------------------------------------\n");
                printAllStudentsAndGrades();
                System.out.println("\n--------------------------------------\n");
                return true;
            case 7:
                System.out.println("\n--------------------------------------\n");
                printClassAverage();
                System.out.println("\n--------------------------------------\n");
                return true;
            case 8:
                System.out.println("\n--------------------------------------\n");
                menu();
                System.out.println("\n--------------------------------------\n");
                return true;
            case 9:
                System.out.println("\n--------------------------------------\n");
                System.out.println("Ending Application...");
                return false;
            default:
                System.out.println("Error, not recognized.");
                return true;
        }
    }

    public void runApp(){
        System.out.println("Welcome to the Classroom App...\n");
        boolean flag = true;
        while (flag){
            int c = menu();
            flag = action(c);
        }

    }

}  //  <--END


//      Set<String> gitHubUserNames = students keySet();
//      for (String gitHubUserNames : gitHubUserNames){
//          System.out.printf(" |%s| ", gitHubUserName;
//      }