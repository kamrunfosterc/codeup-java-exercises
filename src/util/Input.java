package util;
import java.util.Locale;
import java.util.Scanner;

public class Input {
    //TODO Part 1 Create an input validation class

    //
    private Scanner scanner;// initialized variable for when instance is created

    public Input(){// no argument constructor
        System.out.println("creating new input instance.");// extra line, can comment out
        this.scanner = new Scanner(System.in);// each instance
        // created scanner so when we estanciate a new input class it'll read scanner
    }
    public String getString(){
        System.out.println("Do something: ");// prompts for info
        return scanner.nextLine();//String personInput = scanner.nextLine();// stores types info in variable.. return personInput
    }
    public boolean yesNo(){
        System.out.println("Do you like to fly? (Yes/No) ");
        String personAnswer = scanner.nextLine();// stores user input in variable
//        if (personAnswer.toLowerCase().contains("y")){// alternative way
//            return true;
//        } else {
//            return false;
//        }
        return personAnswer.contains("y");// return true if y is in answer
    }
    public int getInt(int min, int max){
//        System.out.println("Provide a whole number: ");
        int userInt = scanner.nextInt();
        if (userInt < min || userInt > max){
            System.out.println("Invalid input! Try again.");
//            System.out.println("Please attempt again");
            return getInt(min, max);
        } else {
//            System.out.println("That one is valid.");
            return userInt;
        }
    }
    public int getInt(){
        System.out.println("Provide a number please: ");
        int userInt = scanner.nextInt();
        return userInt;
    }
    public double getDouble(double min, double max){
        System.out.println("Provide a decimal number: ");
        double userDouble = scanner.nextInt();
        if (userDouble < min || userDouble > max){
            System.out.println("Please attempt again");
            return getDouble(min, max);
        } else {
            System.out.println("That one is valid.");
            return userDouble;
        }
    }
    double getDouble(){
        System.out.println("Provide a decimal number please: ");
        double userDouble = scanner.nextInt();
        return userDouble;
    }
    //TODO PART 1 BONUS
    double getDouble(String prompt){
        System.out.println(prompt);//
        double userNewDouble = scanner.nextInt();
        return userNewDouble;
    }

//    public start here

    public static void main(String[] args) {

    }

    /*
    When an instance of
    this object is created, the scanner property should be set to a new
    instance of the Scanner class. The class should have the following methods,
    all of which return command line input from the user:

    String getString()
    boolean yesNo()
    int getInt(int min, int max)
    int getInt()
    double getDouble(double min, double max)
    double getDouble()

    The yesNo method should return true if the user enters y, yes, or variants
    thereof, and false otherwise.

    The getInt(int min, int max) method should keep prompting the user for
    input until they give an integer within the min and max. The getDouble
    method should do the same thing, but with decimal numbers.

    Create another class named InputTest that has a static main method that
    uses all the methods from the Input class.

    */
}
