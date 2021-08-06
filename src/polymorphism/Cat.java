package polymorphism;

public class Cat extends Animal{

    @Override
    public void makeNoise() {
        System.out.println("Meow, prr prr");
    }

    public void purring(){
        System.out.println("purrr");
    }
}
