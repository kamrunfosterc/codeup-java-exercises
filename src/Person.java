public class Person {

    private String name;

    public Person(String name){
        System.out.println("Person Constructor being used!");
        this.name = name;
    }
    public String getName(){
        //TODO: return the person's name
        return name;
    }
    public void setName(String name){
        //TODO: change the name property to the passed value
        this.name = name;
    }
    public void sayHello(){
        //TODO: print a message to the console usng the person's name
        System.out.println("Hello "+ this.name);
    }
    /*The class should have a constructor that accepts a `String` value and sets
    the person's name to the passed string.

    Create a `main` method on the class that creates a new `Person` object and
    tests the above methods.*/


    public static void main(String[] args) {
        //TODO: Part 1 object basics
        Person person = new Person("name");
        System.out.println(person.getName());
        person.sayHello();// each person object
        /*person.setName("Kamrun");
        System.out.println(person.getName());
        person.sayHello();*/

        //TODO Understanding references
        Person person1 = new Person("Kamrun");
        Person person2 = new Person("Kamrun");
        System.out.println(person1.getName().equals(person2.getName()));
        System.out.println("Jingle");
        System.out.println(person1 == person2);// expected true showing false, not sure why yet

        Person person3 = new Person("Amari");
        Person person4 = person3;
        System.out.println("Is person4 the same as person3? \n" + (person3 == person4) + "!!!");

        Person person5 = new Person("July");
        Person person6 = person5;
        System.out.println(person5.getName());
        System.out.println(person6.getName());
        person6.setName("Mr. Carson Williams");// changing name of person 6
        System.out.println("Who are you? "+ person5.getName());// name changed
        System.out.println("What is your new name? "+ person6.getName());// name changed as well




    }

}
