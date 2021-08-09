package shapes;

public class ShapesTest {


    public static void main(String[] args) {
        //TODO
        // create a variable of the type Rectangle named box1 and assign it a new instance of the Rectangle
        // class with a width of 4 and a length of 5.
        // verify that the getPerimeter and getArea methods return 18 and 20, respectively
        Rectangle box1 = new Rectangle(5, 4);
//        System.out.println(box1);
        System.out.println(box1.getArea());//returns area of box 1
        System.out.println(box1.getPerimeter());//returns perimeter of box 1

        //TODO create a variable of the type Rectangle named box2 and assign it a new instance of the
        // Square class that has a side value of 5. verify that the getPerimeter and getArea methods
        // return 20 and 25, respectively.
        Rectangle box2 = new Rectangle(5, 5);//square
        System.out.println(box2.getPerimeter());// returns 20
        System.out.println(box2.getArea());// returns 25

        //TODO override getArea and getPerimeter methods
        // Re-run methods being called on each object
        Rectangle box3 = new Square(5);//square
        System.out.println(box3.getPerimeter());// returns 20 using the override feature
        System.out.println(box3.getArea());// returns 25 using the override feature



    }
}
