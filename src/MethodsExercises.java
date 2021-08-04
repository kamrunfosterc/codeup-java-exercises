import java.security.PublicKey;
import java.util.Scanner;

public class MethodsExercises {
    //TODO 1. ############# ############# ############# ############# #############
    public static double Addition(double x, double y){
        double add =  x + y;
        return add;
    }

    public static double Subtraction(double x, double y){
        double subtract = x - y;
        return subtract;
    }

    public static double Multiplication(double a, double b){
        double multiply = a * b;
        return multiply;
    }

    public static double Division(double a, double b){
        double divide = a / b;
        return divide;
    }

    public static double Modulus(double a, double b){
        double mod = a % b;
        return mod;
    }

    //TODO 2. ############# ############# ############# ############# #############
//    public static int getInteger(int min, int max){
//        return null;
//    }
    //TODO 3. ############# ############# ############# ############# #############
    public static int factorial(int x){//Recursion operation
        if (x == 1){//stopping point bc no sense in factoring by 1 bc returns that value
            return x;
        }
        return x * factorial(x-1);// 5! = 5*4*3*2*1 stop alt 5*(5-1)*(4-1)*(3-1)*(2-1)
    };
    //TODO 4. ############# ############# ############# ############# #############



    public static void main(String[] args) {
        //Basic Arithmetic
        //TODO 1. ############# ############# ############# ############# #############

        System.out.println("Added results: "+ Addition(12,6));//yields 18
        System.out.println("Subtracted results: "+ Subtraction(12,6));//yields 6
        System.out.println("Multiplied results: "+ Multiplication(12,6));//yields 72
        System.out.println("Divided results: "+ Division(12,6));//yields 2
        System.out.println("Modulus results: "+ Modulus(24, 3));// evenly, no remainder

        //TODO 2. ############# ############# ############# ############# #############
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number between 1 and 10. ");
//
//        if (input <= 10){
//            System.out.println("Enter a number between 1 and 10. ");
//        } else {
//            System.out.println("Not a valid entry... Goodbye!");
//        }
//        int userInput = getInteger(1,10);
        //TODO 3. ############# ############# ############# ############# #############
        System.out.println("factorial result: " + factorial(7));// yields 5040

//        Prompt the user to enter an integer from 1 to 10.
//        Display the factorial of the number entered by the user.
//        Ask if the user wants to continue.
//        Use a for loop to calculate the factorial.
//                Assume that the user will enter an integer, but verify it’s between 1 and 10.
//        Use the long type to store the factorial.
//        Continue only if the user agrees to.
//        A factorial is a number multiplied by each of the numbers before it.
//                Factorials are denoted by the exclamation point (n!). Ex:
        //TODO 4. ############# ############# ############# ############# #############





    }
}
