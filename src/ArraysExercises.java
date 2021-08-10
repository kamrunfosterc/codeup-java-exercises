import java.util.Arrays;
import person.Person;

public class ArraysExercises {

    //TODO 1. Array Basics part 3 of 3
    public static Person[] addPerson(Person[] people, Person personToAdd){
        Person[] newPeopleArray = Arrays.copyOf(people, people.length + 1);// returning array
        newPeopleArray[newPeopleArray.length -1] = personToAdd;
        return newPeopleArray;
    }

    public static void main(String[] args) {
        //TODO 1. Array Basics part 1 of 3
        int[] numbers = {1,2,3,4,5};
//        System.out.println(Arrays.toString(numbers));

    //TODO 1. Arrays: Array Basics part 2 of 3
    Person[] people = new Person[3];// creates an array that can hold 3 objects
    people[0] = new Person("Kam","Fos", 30);
    people[1] = new Person("Ry","Roof", 40);
    people[2] = new Person("Bueno","Chris", 35);


    //adding new person
    for (int i = 0; i < people.length; i++) {
        System.out.println(people[i].getName());
    }
    people = addPerson(people, new Person("Man", "Child", 43));//could also create new person outside in var and pass it in here

    System.out.println("\nWith added Person: ");
    // ENHANCED FOR LOOP IS READ ONLY AND NO ACCESS TO INDEX
    for (Person person : people){
        System.out.println(person.getName());
    }// expecting same list but second time with Man Child added on

    //TODO 2. Arrays: Server Name Generator
        //ServerNameGenerator.java
    //TODO 3. Movie

    }

}
