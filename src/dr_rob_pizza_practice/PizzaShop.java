package dr_rob_pizza_practice;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class PizzaShop extends Pizza{

    public PizzaShop(String pizzaType, String pizzaSize, String pizzaCrust) {
        super(pizzaType, pizzaSize, pizzaCrust);
    }
    // TODO: 8/27/21
//        Make a PizzaShop class. This class will have your main() method for the program.
//        Write a static method in the PizzaShop class to make some pizza. The method should return an ArrayList of
//        dr_rob_pizza_practice.Pizza. Have the method store a few different types of pizza in the array list before returning it.
//        Next, write a printPizza method that takes an ArrayList of dr_rob_pizza_practice.Pizza and prints out the pizzas in the ArrayList.
//        In your main, call makePizza and then call printPizza

    public static ArrayList<String> makePizza(){
        return makePizza();
    }

    public static void main(String[] args) {
        PizzaShop.makePizza();// not sure what to do here.... stopped 12:31
        ArrayList<String> pizza = new ArrayList<>();
        Scanner userEntry = new Scanner(System.in);

        System.out.println("What type of pizza would you like, \n\t*** select one ***\n [Cheese, Pepperoni, Margherita] ");
        String chosenType = userEntry.nextLine();
        System.out.println("\nWhat size pizza do you prefer:\n [Small, Medium, Large , or Extra Large ] ");
        String chosenSize = userEntry.nextLine();
        System.out.println("\nPlease enter the type of crust you prefer \n[thin, Hand-tossed, Pan] ");
        String chosenCrust = userEntry.nextLine();


        pizza.add(chosenType);
        pizza.add(chosenSize);
        pizza.add(chosenCrust);


        System.out.println("Current pizza order"+"\n"+pizza);
//        System.out.printf(chosenType + ' ' + chosenSize + ' ' + chosenCrust);// testing to make sure user entries were returned

    }
}
