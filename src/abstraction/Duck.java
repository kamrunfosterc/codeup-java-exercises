package abstraction;

public class Duck extends Animal implements FlightCapable {
    public Duck(String animalName) {
        super(animalName);
    }

    @Override
    public void makeSound() {
        System.out.println("Quack, quack");
    }


    @Override
    public void fly() {
        System.out.println("Flying South for the winter!");
    }

    @Override
    public void glide() {// this is a default implementation
        System.out.println("I glide pretty well");
    }
}

//in general casting helps to force a variable to another data type?
