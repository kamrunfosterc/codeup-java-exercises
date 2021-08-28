package dr_rob_pizza_practice;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
public class Pizza {
    // TODO:############  8/28/21  ############
    private String pizzaType;
    private String size;
    private String crustType;

    public Pizza(String pizzaType, String size, String crustType) {
        this.pizzaType = pizzaType;
        this.size = size;
        this.crustType = crustType;
    }

    @Override
    public String toString(){
        String crustText = crustType;
        return size+" "+ getCrustType()+" "+pizzaType+" pizza";
    }
    //ACCESSORS

    public String getPizzaType() {
        return pizzaType;
    }

    public void setPizzaType(String pizzaType) {
        this.pizzaType = pizzaType;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getCrustType() {
        if (crustType.equalsIgnoreCase("thin") ||crustType.equalsIgnoreCase("hand-tossed")){
            return crustType + "crust";
        }
        return crustType;

    }

    public void setCrustType(String crustType) {
        this.crustType = crustType;
    }


    //  TODO:############ 8/28/21  ############

    // TODO: 8/24/21  DR Rob practise
    //    Make a dr_rob_pizza_practice.Pizza class. It should have fields like pizza type (e.g., Cheese, Pepperoni, Supreme, etc.),
//        size (Small, Medium, Large, and Extra Large), and crust type (Thin, Hand-tossed, Pan).
//        Include accessors and an appropriate constructor.

// TODO: 8/27/21
//        Make a PizzaShop class. This class will have your main() method for the program.
//        Write a static method in the PizzaShop class to make some pizza. The method should return an ArrayList of
//        dr_rob_pizza_practice.Pizza. Have the method store a few different types of pizza in the array list before returning it.
//        Next, write a printPizza method that takes an ArrayList of dr_rob_pizza_practice.Pizza and prints out the pizzas in the ArrayList.
//        In your main, call makePizza and then call printPizza









//    // TODO: 8/28/21 KAMRUN'S WORK BELOW
//    // pizza type field
//    private String pizzaType;// Cheese, Pepperoni, Margarita
//    private String pizzaSize;// Small 6", Medium 9", Large 12", and Extra Large 15" MIGHT CHANGE TO INT
//    private String pizzaCrust;//hin, Hand-tossed, Pan
//
//    public Pizza(String pizzaType, String pizzaSize, String pizzaCrust) { // todo created constructor
//        this.pizzaType = pizzaType;
//        this.pizzaSize = pizzaSize;
//        this.pizzaCrust = pizzaCrust;
//    }
//
//    public String getPizzaType() {
//        return pizzaType;
//    }
//
//    public void setPizzaType(String pizzaType) {
//        this.pizzaType = pizzaType;
//    }
//
//    public String getPizzaSize() {
//        return pizzaSize;
//    }
//
//    public void setPizzaSize(String pizzaSize) {
//        this.pizzaSize = pizzaSize;
//    }
//
//    public String getPizzaCrust() {
//        return pizzaCrust;
//    }
//
//    public void setPizzaCrust(String pizzaCrust) {
//        this.pizzaCrust = pizzaCrust;
//    }
//
//    //    public String pizzaSize (String size){
////        Scanner userEntry = new Scanner(System.in);
////        System.out.println("Please choose your pizza size: small, medium, large, extra large >> "); //todo STARTING HERE
////        String chosenSize = userEntry.nextLine();
////        if (size == 'small'){
////            "Chosen dr_rob_pizza_practice.Pizza Size: "
////        }
////
////    }




}
