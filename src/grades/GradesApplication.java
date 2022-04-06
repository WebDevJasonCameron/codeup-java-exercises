package grades;

import util.Input;

import java.util.HashMap;

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
        System.out.println(students.keySet());
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


    public int menu(){
        System.out.println("PLease select from the following list...\n" +
                "1. See GH username list\n" +
                "2. See Student Name\n" +
                "3. See Student Grade List\n" +
                "4. See Student Average Grade\n" +
                "5. See Name, Grade List, and Average Grade\n" +
                "6. See Menu\n" +
                "7. End Application");
         return input.getInt(1, 7);
    }


    public boolean action(int userChoice){
        switch (userChoice) {
            case 1:
                printUserNames();
                return true;
            case 2:
                printStudentNameFromUN();
                return true;
            case 3:
                printStudentGradeListFromUN();
                return true;
            case 4:
                printStudentGradeAverageFromUN();
                return true;
            case 5:
                String username = input.getString("Please Provide GH Username:\n");
                printStudentNameFromUN(username);
                printStudentGradeListFromUN(username);
                printStudentGradeAverageFromUN(username);
                return true;
            case 6:
                menu();
                return true;
            case 7:
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
