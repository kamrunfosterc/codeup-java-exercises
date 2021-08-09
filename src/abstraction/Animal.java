package abstraction;

public abstract class Animal {
    //why would you want to have a class that you can't instantiate
    //bc its general so we can't instantiate (creating new obj of that class) bc its too broad
    //would want to create concrete subclasses, like pigs, chickens etc...

    protected String animalName;

    public Animal(String animalName){
        this.animalName = animalName;
    }
    public void walk (){
        System.out.println("Walks around a bit");
    }
    public final void breathe(int numSeconds){
        System.out.println("Breaths for " + numSeconds + " seconds.");
    }
    public abstract void makeSound();// have to instantiate it in subclass, bc we can't hear, to many noises

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }
//    public abstract void fly(){
//        System.out.println("Flying");
//    }
}
