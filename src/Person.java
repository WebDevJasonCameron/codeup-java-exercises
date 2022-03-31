public class Person {
    public static void main(String[] args) {

        Person person = new Person("Smash");
        System.out.println(person.getName());
        person.setName("Capt Smash");
        person.sayHello();

        // 1. The following code blocks make use of the Person class from the previous exercise.
        //    For each code block, think about what the code will output, then copy the code into
        //    IntelliJ and run it to see if it matches your expectations.
        /**
        Person person1 = new Person("John");
        Person person2 = new Person("John");
        System.out.println(person1.getName().equals(person2.getName())); // true
        System.out.println(person1 == person2); // false because it is not in the same memory address

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1 == person2); // true, same memory with different name markers

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName()); // John
        System.out.println(person2.getName()); // John
        person2.setName("Jane");
        System.out.println(person1.getName()); // Jane
        System.out.println(person2.getName()); // Jane
        */










    }

    public Person(String name) {
        this.name = name;
    }

    private String name;
    public String getName(){
        //TODO: return the person's name
        return name;
    }

    public void setName(String name){
        //TODO: change the name field to the passed value
        this.name = name;
    }
    public void sayHello(){
        //TODO: print a message to the console using the person's name
        System.out.println("Hello, " + this.name);
    }



}
