package abstraction;

public class Snake extends Animal{

    public Snake(String animalName) {
        super(animalName);
    }

    @Override
    public void makeSound() {
        System.out.println("Hssssss");
    }


    @Override
    public void walk() {
        System.out.println("Slowly slithers...");
    }

    public void injectVenom(){
        System.out.println("It bit me!!! Heading to the hospital");
    }


}
