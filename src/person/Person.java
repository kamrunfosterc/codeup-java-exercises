package person;

public class Person {
    private String firstName;
    private String lastName;
//    private String name;
    private int age;
    // cmd n to create constructors
    public Person(String firstName, String lastName, int age){
        System.out.println("Person Constructor being used!");
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getName(){
        //TODO: return the person's name
        return firstName + lastName;
    }
    public void setName(String firstName, String lastName){
        //TODO: change the name property to the passed value
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String sayHello(){
        return "Hello my name is " +firstName +" "+ lastName + " and I am "+ age+ " years old";
    }
    /*The class should have a constructor that accepts a `String` value and sets
    the person's name to the passed string.

    Create a `main` method on the class that creates a new `Person` object and
    tests the above methods.*/

    public static void main(String[] args) {
        //TODO: Part 1 object basics
        Person person = new Person("name", "better", 25);
        System.out.println(person.getName());
        person.sayHello();// each person object
        /*person.setName("Kamrun");
        System.out.println(person.getName());
        person.sayHello();*/

        //TODO Part 1 Understanding references
        Person person1 = new Person("Kamrun", "Beales", 29);// person instance, object
        Person person2 = new Person("Tommy", "Pickles", 26);
        System.out.println(person1.getName().equals(person2.getName()));
        System.out.println("Jingle");// extra to seperate and see where the diff lies
        System.out.println(person1 == person2);// expected true showing false, not sure why yet

        Person person3 = new Person("Amari","Holla", 16);
        Person person4 = person3;
        System.out.println("Is person4 the same as person3? \n" + (person3 == person4) + "!!!");//true

        Person person5 = new Person("July","Theforth", 76);// one unique person, object
        Person person6 = person5;// person 6 is the same instance of person 5
        System.out.println(person5.getName());// returns july
        System.out.println(person6.getName());// returns another july
        person6.setName("Mr. Carson", "Williams");// changing name of person 6
        System.out.println("Who are you? " + person5.getName());// name changed
        System.out.println("What is your new name? " + person6.getName());// name changed as well


    }
}
