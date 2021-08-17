package practice;

public class Practice {

    public static double multiply(int x, int y){
        return x*y;
    }

    public static double multiply(double a, double b){
        return a*b;
    }//todo method overloading
//    public static double multiply(double a, double b, double c){
//        return a*b*c;
//    }



    public static void main(String[] args) {
        System.out.println(multiply(5.2, 4.1));

        Moward howard = new Moward("howard", 6, 72);
        System.out.println(howard);

        GetMallardDetails(howard);
    }

    //how to make methods that take in dynamic types
    public static void GetMallardDetails(Moward moward){
        System.out.printf("The Mallard %s flies at %s mph", moward.getName() ,moward.getFlightSpeed());
    }
}

//todo
// method overloading/ instantiating objects/ how to make methods that take in dynamic types
