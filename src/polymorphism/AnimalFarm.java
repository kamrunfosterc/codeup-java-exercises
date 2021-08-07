package polymorphism;

public class AnimalFarm {
    //TODO final keyword
    public static final int MAX_FARM_ANIMALS = 10;// final field

    //final method can't be overridden

    public static void main(String[] args) {
        Animal genericAnimal =new Animal();
        genericAnimal.makeNoise();

        //TODO part 1
//        Goat woodrow = new Goat();
//        woodrow.makeNoise();// output will be ****BAAAAALEAT****
//
//        Pig piglet = new Pig();
//        piglet.makeNoise();//output = Wee wee oink oink
//
//        Cat tabby = new Cat();
//        tabby.makeNoise();// output = Meow, prr prr

        //TODO part 2
        genericAnimal = new Goat();
        genericAnimal.makeNoise();// method: generic animal should now sound like a goat

        //limits of poly through inheritance
        Cat tabby = new Cat();
        tabby.purring();// works bc it is a cat

//        genericAnimal.purring();//should reach out to animal super
//        // won't work bc purring is specific to cats and
//        // isn't known by animal

        //TODO Casting (not best practices/ more of a work around iff)
        ((Cat) genericAnimal).purring();


    }
}
