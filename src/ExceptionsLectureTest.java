import grades.ExceptionsLecture;

public class ExceptionsLectureTest {
    public static void main(String[] args) {

        ExceptionsLecture lecture = new ExceptionsLecture();
        /**
        try{
        System.out.println(Integer.parseInt(lecture.maybeAnInteger));
        System.out.println(Integer.parseInt(lecture.certainlyNotAnInteger));
        } catch (NumberFormatException nfx) {
            System.out.println("Got a number format exception: " + nfx);
        }

        System.out.println(lecture.miniExString01);
        System.out.println(lecture.miniExString02);

        try {
            lecture.miniExString01.substring(0,50);
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Got a String Index Exception: " + ex);
        } catch (NullPointerException npx){
            System.out.println("The String is null: " + npx);
        } finally {
            System.out.println("Thank you for using this complex and useless application");
        }
         */

        lecture.subListMaker("hello");


    }

}
