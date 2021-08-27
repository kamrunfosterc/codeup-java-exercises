import java.util.Scanner;

public class Pizza {

    // TODO: 8/24/21  DR Rob practise
    //    Make a Pizza class. It should have fields like pizza type (e.g., Cheese, Pepperoni, Supreme, etc.),
//        size (Small, Medium, Large, and Extra Large), and crust type (Thin, Hand-tossed, Pan).
//        Include accessors and an appropriate constructor.
//        Make a PizzaShop class. This class will have your main() method for the program.
//        Write a static method in the PizzaShop class to make some pizza. The method should return an ArrayList of
//        Pizza. Have the method store a few different types of pizza in the array list before returning it.
//        Next, write a printPizza method that takes an ArrayList of Pizza and prints out the pizzas in the ArrayList.
//        In your main, call makePizza and then call printPizza

    // pizza type field
//    public String pizzaType;// Cheese, Pepperoni, Margarita
    public String pizzaSize;// Small 6", Medium 9", Large 12", and Extra Large 15" MIGHT CHANGE TO INT
    public String pizzaCrust;//hin, Hand-tossed, Pan
    Scanner userEntry = new Scanner(System.in);
    // pizza size
    // pizza crust type
    public String pizzaSize (String size){
        Scanner userEntry = new Scanner(System.in);
        System.out.println("Please choose your pizza size: small, medium, large, extra large >> "); //todo STARTING HERE
        String chosenSize = userEntry.nextLine();
        if (size == 'small'){
            "Chosen Pizza Size: "
        }

    }
    public static void main(String[] args) {

    }
}
