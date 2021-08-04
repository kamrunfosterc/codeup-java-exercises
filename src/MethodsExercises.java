import java.util.Scanner;

public class MethodsExercises {

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


    public static void main(String[] args) {
        System.out.println("Added results: "+ Addition(12,6));//yields 18

        System.out.println("Subtracted results: "+ Subtraction(12,6));//yields 6

        System.out.println("Multiplied results: "+ Multiplication(12,6));//yields 72

        System.out.println("Divided results: "+ Division(12,6));//yields 2

        System.out.println("Modulus results: "+ Modulus(24, 3));// evenly, no remainder



    }
}
