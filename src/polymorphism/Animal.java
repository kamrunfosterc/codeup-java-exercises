package polymorphism;

public class Animal {
//    public void purring(){
//        System.out.println("I don't know how to purr!");
//    }

    //TODO final keyword
    public final void breath(){
        System.out.println("Take a breath");
    }
    public final void breathBreak(final int numSeconds){
//        numSeconds = 20;// can't change it w/ in the method
        System.out.println("Take a breath");
    }

    public void makeNoise(){
        breathBreak(5);//can call final after outside of method
        System.out.println("....");// makes no noise
        breathBreak(10);
    }

}
