package grades;

import java.util.ArrayList;

public class Student {
    public static void main(String[] args) {

        // TEST
        Student s1 = new Student("John");
        System.out.println(s1.getName());
        s1.addGrade(90);
        s1.addGrade(55);
        s1.addGrade(80);
        s1.addGrade(75);

        s1.showGradeList();
        System.out.println(s1.getGradeAverage());


    }  //  <--END MAIN

    // F
    private String name;
    private ArrayList<Integer> gradeList;

    // CON
    public Student(String name) {
        this.name = name;
        this.gradeList = new ArrayList<>();
    }

    // METH
    // returns the student's name
    public String getName(){
        return this.name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade){
        gradeList.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage(){
        double output = 0;
        int div = gradeList.size();
        for (Integer integer : gradeList) {
            output += integer;
        }
        return output / div;
    }

    public void showGradeList(){
        System.out.println("List of Grades: ");
        for (Integer integer : gradeList) {
            System.out.print(integer + " ");
        }
        System.out.println("");
    }






}  //  <--END
