import org.w3c.dom.ls.LSOutput;

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
        if (b == 0){
            return a;
        }
        double mod = a % b;
        return mod;
    }
    //BONUS
    public static double MultiplicationBonus(double a, double b){
        double totalMulti = 0; //accumulator to hold the value
        for (int i = 0; i < b; i++) {
            totalMulti += a;
        }
        return totalMulti;
    }


    //TODO 2. ############# ############# ############# ############# #############
    public static int getInteger(int min, int max){
        System.out.println("Please enter a numbers between 1 & 10!" );
        Scanner scanner = new Scanner(System.in);
        int userInput1 = scanner.nextInt();

        if (userInput1 >= min && userInput1 <= max){
            System.out.println("Thanks for answering with a valid numbers");
            return userInput1;
        } else {
            System.out.println("Invalid input, please try again.");
            return getInteger(1, 10);
//            return "Good job";
//            System.out.println("You entered: " + userInput1;
//            return userInput1;// not sure what to return
        }
    }
//      return min >= 1 && max <= 10; alternatively to if statement

    //TODO 3. ############# ############# ############# ############# #############
    public static String getFactorialString(int numb){
        String stringToReturn = "";
        if (i == numb){

        }
    }
    public static void getFactorial(int integer){//Recursion operation
        int factorialNumb = getInteger(1,10);
        for (int i = 1; i <= factorialNumb; i++) {
//            System.out.printf(i + "! = " + getFactorialString(i) + " = " + getFactorialSum(i));
            System.out.printf("%d! = %s = %d\n", i, getFactorialString(i), getFactorialSum(i));

        }
    }
    public static int getFactorialSum(int num){
        int sum = 0;
        for (int i = 2; i < num; i++) {
            sum *= i;
        }
        return sum;
    }
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter an integer from 1 to 10. " );
//        String integer = scanner.nextLine();// not sure why it needs to be a string
//
//        if (double integer == 1){//stopping point bc no sense in factoring by 1 bc returns that value
//            return integer;
//        }
//        return integer * factorial(integer-1);// 5! = 5*4*3*2*1 stop alt 5*(5-1)*(4-1)*(3-1)*(2-1)
//    };
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


    public static void main(String[] args) {
        //Basic Arithmetic

        //TODO 1. ############# ############# ############# ############# #############
//        System.out.println("Added results: "+ Addition(12,6));//yields 18
//        System.out.println("Subtracted results: "+ Subtraction(12,6));//yields 6
//        System.out.println("Multiplied results: "+ Multiplication(12,6));//yields 72
//        System.out.println("Divided results: "+ Division(12,6));//yields 2
//        System.out.println("Modulus results: "+ Modulus(24, 5));// evenly, no remainder
//        //BONUS
//        System.out.println("BONUS results: "+ MultiplicationBonus(5, 5));

        //TODO 2. ############# ############# ############# ############# #############
        System.out.println(getInteger(1,10));//"Range results: " +
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
//        System.out.println("factorial result: " + factorial(integer));// yields 5040

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
