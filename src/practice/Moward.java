package practice;

//todo how to extend and implement an interface
public class Moward extends Duck implements Quackable{
    private int flightSpeed;

    //todo know how to set up constructor
    public Moward(String name, int age, int flightSpeed) {
        super(name, age);
        this.flightSpeed = flightSpeed;
    }

    @Override //todo have to implement methods that are interfaced
    public void quack() {
        System.out.println("Quack!");
    }
    public void waddle(){
        System.out.println("waddling like a duck");
    }

    public int getFlightSpeed() {
        return flightSpeed;
    }

    public void setFlightSpeed(int flightSpeed) {
        this.flightSpeed = flightSpeed;
    }
}
