package TECHNOSTUDY_USA.day28.example.ex1;

class Person { //package-private
    /*
    A variable which is created inside the class but outside the method is known as an instance variable.
    Instance variable doesn't get memory at compile time.
    It gets memory at runtime when an object or instance is created.
    That is why it is known as an instance variable.
     */

    //instance variable (field)
    String name;
    String surname;
    int age;

    // when you have methods that are not static
    // they are instance methods

    //instance methods 1
    int getBirthYear() {

        return 2020 - age;
    }

    //instance methods 2
    String getInitials() {
        return name.charAt(0) + "." + surname.charAt(0) + ".";
    }

    //instance methods 3
    void print() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Age: " + age);
    }
}

public class Ex1 {
    // create a program that calculates
    // birth year of given person

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Yusuf";
        person1.surname = "Esenboga";
        person1.age = 25;
        int birthYearYusuf = person1.getBirthYear();
        String initials = person1.getInitials();
        person1.print();
        System.out.println("---------------------");

        Person person2 = new Person();
        person2.name = "Dos";
        person2.age = 31;
        int birthYearDos = person2.getBirthYear();
        person2.print();
        System.out.println("---------------------");

        Person person3 = new Person();
        person3.name = "Mark";
        person3.age = 69;
        int birthYearMark = person3.getBirthYear();
        person3.print();
        System.out.println("---------------------");

    }

}
