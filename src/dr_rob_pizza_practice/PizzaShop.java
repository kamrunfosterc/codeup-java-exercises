package dr_rob_pizza_practice;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class PizzaShop extends Pizza{
    
    //TODO  KAMRUN WORK 
//    public PizzaShop(String pizzaType, String pizzaSize, String pizzaCrust) {
//        super(pizzaType, pizzaSize, pizzaCrust);
//    }
    // TODO: 8/27/21
//        Make a PizzaShop class. This class will have your main() method for the program.
//        Write a static method in the PizzaShop class to make some pizza. The method should return an ArrayList of
//        dr_rob_pizza_practice.Pizza. Have the method store a few different types of pizza in the array list before returning it.
//        Next, write a printPizza method that takes an ArrayList of dr_rob_pizza_practice.Pizza and prints out the pizzas in the ArrayList.
//        In your main, call makePizza and then call printPizza

//    public static ArrayList<String> makePizza(){
//        return makePizza();
//    }
    public static ArrayList<Pizza> pizzas;
    
    public static void main(String[] args) {
        
        //// TODO: 8/28/21 ASKING FOR USER INPUT SHOULD BE PUT INTO A LOOP 
//        Pizza pizza1 = new Pizza("Pepperoni", "large", "thin");
//        Pizza pizza2 = new Pizza("cheese", "small", "hand-tossed");
//        Pizza pizza3 = new Pizza("supreme", "extra-large", "pan");
        
//        pizzas = new ArrayList<>();
//        pizzas.add(pizza1);
//        pizzas.add(pizza2);
//        pizzas.add(pizza3);
//        
//        printPizzas(pizzas);
        
        ArrayList<Pizza> pizzaStack1 = makePizzas();
        ArrayList<Pizza> pizzaStack2 = makePizzas();
        
        pizzaStack2.remove(pizzaStack2.size()-1);
        
        printPizzas(pizzaStack1);
        printPizzas(pizzaStack2);
        
//        // TODO: 8/28/21 KAMRUN WORK BELOW 
//        PizzaShop.makePizza();// not sure what to do here.... stopped 12:31
//        ArrayList<String> pizza = new ArrayList<>();
//        Scanner userEntry = new Scanner(System.in);
//
//        System.out.println("What type of pizza would you like, \n\t*** select one ***\n [Cheese, Pepperoni, Margherita] ");
//        String chosenType = userEntry.nextLine();
//        System.out.println("\nWhat size pizza do you prefer:\n [Small, Medium, Large , or Extra Large ] ");
//        String chosenSize = userEntry.nextLine();
//        System.out.println("\nPlease enter the type of crust you prefer \n[thin, Hand-tossed, Pan] ");
//        String chosenCrust = userEntry.nextLine();
//
//
//        pizza.add(chosenType);
//        pizza.add(chosenSize);
//        pizza.add(chosenCrust);
//
//
//        System.out.println("Current pizza order"+"\n"+pizza);
////        System.out.printf(chosenType + ' ' + chosenSize + ' ' + chosenCrust);// testing to make sure user entries were returned

    }
    public static ArrayList<Pizza> makePizzas(){
        ArrayList<Pizza> pizzas = new ArrayList<>();
        
        Pizza pizza1 = new Pizza("Pepperoni", "large", "thin");
        Pizza pizza2 = new Pizza("cheese", "small", "hand-tossed");
        Pizza pizza3 = new Pizza("supreme", "extra-large", "pan");
        
        pizzas = new ArrayList<>();
        pizzas.add(pizza1);
        pizzas.add(pizza2);
        pizzas.add(pizza3);
        
        return pizzas;
    }
    
    private static void printPizzas(ArrayList<Pizza> pizzas){
        System.out.println("We currently have the following pizzas for sale: ");
        for (Pizza pizza: pizzas){
            System.out.println(pizza);
        }
    }
}
