package shapes;

public class Square extends Quadrilateral {// inherits Rectangle prior to we were extending Rectangle

//    protected int side;// initialized property
//    protected String areaMsg = "Area";// using to tell if I am using the override
//    protected String areaPerimeter = "Perimeter";// using to tell if I am using the override

//    public Square(int side){// our square constructor
//        super(side,side);// calls the parent's constructor to set both length & width to value of side
////        this.side = side;//
//    }
//
//
//    @Override
//    public double getArea() {
////       double side = super.getWidth();// alt try super.getArea() bc its less specific
////        return side * side;
//        System.out.println("square area calculations: ");
////        return side * side; //works bc we created a new variable side to assign value to
//        return super.length * super.width;// this is BETTER practice
//
//    }
//
//    @Override
//    public double getPerimeter() {
////        double side = super.getPerimeter();
//        System.out.println("square perimeter calculations: ");
////        return 4 * side;// have to initialize side from about
//        return 4 * super.length;
//    }

    //TODO More Shapes Exercise

    public Square(double side) {// our constructor
        super(side,side);
    }


    @Override
    public double getPerimeter() {
        return (4*super.length);
    }

    @Override
    public double getArea() {
        return super.length * super.length;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
        this.width = length;
    }

    @Override
    public void setWidth(double width) {
        this.setLength(width);
    }
}
