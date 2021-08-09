package abstraction;

public interface FlightCapable {
    //TODO we would like to use these bc we can only inherit from one class

    // interfaces: watered down abstract classes in a sense
    // don't allow instance variables
    // can use
//    public static final String I_BELIEVE_I_CAN_FLY= "howdy";

    public abstract void fly();// public abstract is assumed and reason why it's not here
    //leaves it up to user to specify what fly is

    //DEFAULT allows us to provide...
    public  default void glide(){
        System.out.println("Does not glide");
    }

}
