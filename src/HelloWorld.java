public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello, World!");// used to output info w/ a single line
        System.out.print("Hola,");// outputs one after another
        System.out.print("Mundo!");// this is

        // TODO: 8/22/21 REDO of Syntax, Types & variables exercise
        int myFavoriteNumber = 7;
        System.out.printf("My favorite number is: %s", myFavoriteNumber);

        String myString = "This is a string in java.";
//        String myString = 3.14159;// can't assign bc wrong type for value expected
        System.out.println(myString);

        System.out.println("My number example");
//        long myNumber = 123L;
        float myNumber = 123;
        System.out.println(myNumber+"\n");

        //#10
        int x = 5;
        System.out.println(x++);// displays 5 but adds 1 to it
        System.out.println("x value: "+x);// displays new x as 6

        int y = 5;
        System.out.println(++y);//displays 6 from the start
        System.out.println("y value: "+y);// should still be 6

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;// string cannot be cast to class java.lang.Integer

        //difference
//        int three = (int) "three";// inconvertible type int and string
//        System.out.println(three);

        //#13
        // part 1
        int a = 4;
//        x = x + 5;// x=+5
        a+=5;
        System.out.println("value of a: "+a);
//        // part 2
        int f = 3;
        int g = 4;
//        y = y * x;
        g*=f;
        System.out.println("value of g: "+g);

//
//        // part 3
        int w = 10;
        int z = 2;
//        w = w / z;
//        z = z - w;
        w /= z;
        z-=w;
        System.out.println("value of w: "+w);
        System.out.println("value of z: "+z);

        // TODO: 8/22/21 END OF EXERCISE

    }
}
