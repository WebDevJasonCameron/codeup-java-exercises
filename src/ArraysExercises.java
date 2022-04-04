import java.util.Scanner;

public class ArraysExercises {

    public static void main(String[] args) {

        // 1. Array Basics
        //    1.1 What happens when you run the following code? Why is Arrays.toString necessary?
        //        <-- shows the memory address where the numbers array resides

        /**
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);
         */

        //    1.2 Create an array that holds 3 Person objects. Assign a new instance of the Person
        //        class to each element. Iterate through the array and print out the name of each
        //        person in the array.

        Person p1 = new Person("Bob");
        Person p2 = new Person("James");
        Person p3 = new Person("Sam");
        Person p4 = new Person("Calvin");

        Person[] people = { p1, p2, p3};

        /**
        for(Person p : people){
            System.out.println(p.getName());
        }
         */

        people = addPerson(people, p4);
        for(Person p : people){
            System.out.println(p.getName());
        }




    } //  <--END MAIN

    //    1.3 Create a static method named addPerson. It should accept an array of Person objects,
    //        as well as a single person object to add to the passed array. It should return an
    //        array whose length is 1 greater than the passed array, with the passed person object
    //        at the end of the array.

    public static Person[] addPerson(Person[] pArray, Person newPerson){
        Person[] outputArray = new Person[pArray.length + 1];

        for (int i = 0; i < pArray.length; i++) {
            outputArray[i] = pArray[i];
        }
        outputArray[outputArray.length -1] = newPerson;

        return outputArray;
    }




}  //  <-- END
