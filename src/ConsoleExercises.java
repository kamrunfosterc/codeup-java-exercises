import java.sql.SQLOutput;
import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately " + "%f.", pi);// my way yield 3.14159
        System.out.printf("The value of pi is approximately " + "%.2f.", pi);// my 2nd option way yield 3.14
        System.out.format("The value of pi is approximately " + "%.2f.", pi);// instructor way yields 3.14



        Scanner scanner = new Scanner(System.in);// Scanner class + variable name = syntax"new Scanner(System.in);
        //TODO:prompt user to enter integer, store in int variable using nextInt
        System.out.print("\nEnter a number: ");
        int userInput = scanner.nextInt();// scanner here is just the variable name
        System.out.println("You entered : --> \"" + userInput + "\" <--");
        //above requires an integer

        //TODO: Prompt user to enter 3 words, store in separate variables
        System.out.println("\nWhat are your three favorite colors: ");
        String color1 = scanner.next();
        String color2 = scanner.next();
        String color3 = scanner.next();
        System.out.printf("Your three favorite colors are: " + "\n%s\n, %s\n, %s", color1, color2, color3);

        //TODO: enter a sentence and store in string variable
        System.out.println("\nWrite a sentence: ");
//        String userSentence = scanner.next();
        String userSentence1 = scanner.nextLine();
//        System.out.printf("\nYour first word is: " + userSentence);// returns first word
//        System.out.printf("\nThe rest of the sentence is: " + userSentence1);// returns rest of sentence
//        System.out.printf("\nThe whole sentence: " + userSentence + userSentence1);
        System.out.printf(userSentence1);

        //Calculate the perimeter and area of Codeup's classrooms.
        //TODO
        System.out.println("\nEnter the length and width of our Codeup classroom?");
//        String length = scanner.nextLine();
//        String width = scanner.nextLine();
//        int perimeter = Integer.parseInt(length + width + length + width);
//        System.out.print(dimensions);
        System.out.println("\nEnter the width of our Codeup classroom?");
        double width = Double.parseDouble(scanner.nextLine());// nextline is a string, parsing into numeric

        System.out.println("\nEnter the length of our Codeup classroom?");
        double length = Double.parseDouble(scanner.nextLine());

        double area = length * width;
        double perimeter = (2*width)+(2*length);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);

        //TODO Try the bonuses Next
    }
}