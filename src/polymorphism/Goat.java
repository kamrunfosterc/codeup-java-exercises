package polymorphism;

public class Goat extends Animal{
    //TODO final keyword
//    public void breath(){
//        //can't override breath bc it;s final
//    }

    @Override
    public void makeNoise() {
//        super.makeNoise();// calls make noise from animal which is nothing right now
        System.out.println("****BAAAAALEAT****");

    }
}
