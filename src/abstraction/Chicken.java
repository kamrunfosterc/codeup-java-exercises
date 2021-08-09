package abstraction;

//import java.io.Serializable;
//
//public class Chicken extends Animal implements FlyingAnimal, Serializable {}

public class Chicken extends Animal implements FlightCapable {// implements interface, another behavior
    //requiring sub-classes to have same implementation of a super class constructor is stupid
    public Chicken(String animalName){
        super(animalName);
    }

    @Override
    public void makeSound() {
        System.out.println("Cluck cluck");
    }

    @Override
    public void fly() {
        System.out.println("Kind of flies, we call it advance flapping!");
    }
}
