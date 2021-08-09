package abstraction;

public class AnimalFarm {
    public static final int MAX_ANIMALS = 5;

    public static void main(String[] args) {
        Animal animal;// abstract ref, variable..

//        //creating instance
//        Pig wilbur = new Pig();// will have issue bc not calling name
//        wilbur.walk();
//        wilbur.breathe(4);
//        wilbur.makeSound();

//        Snake scooter = new Snake(); // will have issue bc no name to call
//        scooter.walk();
//        scooter.breathe(6);
//        scooter.makeSound();
//        scooter.injectVenom();

        //TODO Alternative way to call but is limited
//        animal = new Snake();// has all
//        animal.walk();
//        animal.breathe(5);
//        animal.makeSound();
//        animal.injectVenom// can't get this bc there is no injectVenom in animal

        //TODO Use of an array (cool part)
        Animal [] animals = new Animal[MAX_ANIMALS];// array of animal references
        System.out.println("\n$$$$$$$$ Our New Animals $$$$$$$$$\n");
        animals[0] = new Duck("Wilbur");
        animals[1] = new Pig("Scooter");
        animals[2] = new Snake("Coyle");
        animals[3] = new Chicken("Mary");
        animals[4] = new Snake("Jumpman");

//        Pig tempPig = (Pig) animals[1];
//        tempPig.fly(); // can't bc not in Pig or Animal

//        Chicken tempChicken = (Chicken) animals[3];
//        tempChicken.fly(); // this would work


//        for (int i = 0; i < animals.length; i++) {
////            System.out.printf("The %s goes: ",animals[i].getAnimalName(), animals[i].getClass().getSimpleName());//checks obj type
//            System.out.printf("%s is a(n) %s and goes: ",animals[i].getAnimalName(), animals[i].getClass().getSimpleName());//checks obj type
//
//            //pulls specific animal down to find it's info in other classes
//            //getClass() gets concrete subclasses name as string
//            //getSimpleName()
//            animals[i].makeSound();//shows each sound made by each animal
//
//            //TODO REFLECTION, STRING COMPARISON
//            if (animals[i] instanceof Snake){// allows us to look up objects parental hierchy
//            //   could also... if (animals[i].getClass().getSimpleName().equals("Snake")){} to check for specific class
//                //watch out for doing casting WITHOUT reflection first
//                Snake oldSnake = (Snake) animals[i];// (Snake) casting
//                oldSnake.injectVenom();
//            }
//        }
//        //how can we tell what subclass of abstract we are working with at run time
//        //reflection: being able to learn/ know something about the object
//    }

        //TODO make the animals who can fly, fly
        //check at run time if need be example
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof FlightCapable){// creates interface
//                Chicken tempFlyer = (Chicken) animals[i];
//                tempFlyer.fly();// would fail at pulling duck bc its not a chicken

                System.out.printf("I found a(n) %s that can fly: ", animals[i].getClass().getSimpleName());
                FlightCapable tempFlyer = (FlightCapable) animals[i];//only allows those that can fly to pass through
                tempFlyer.fly();// tells us that they are flying
                tempFlyer.glide();
            }
        }


}}
