import java.sql.SQLOutput;
import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately " + "%f.", pi);
        //TODO
        //NOT RETURNING 3.14 BUT I AM SURE THAT'S A SIMPLE FIX, CAN'T FIND RIGHT NOW

        Scanner scanner = new Scanner(System.in);

        //TODO:prompt user to enter integer, store in int variable using nextInt
        System.out.print("\nEnter a number: ");
        int userInput = scanner.nextInt();
        System.out.println("You entered : --> \"" + userInput + "\" <--");
        //above requires an integer

        //TODO: Prompt user to enter 3 words, store in separate variables
        System.out.print("\nWhat are your three favorite colors: ");
        String color1 = scanner.next();
        String color2 = scanner.next();
        String color3 = scanner.next();
        System.out.printf("Your three favorite colors are: " + "\n%s\n, %s\n, %s", color1, color2, color3);

        //TODO: enter a sentence and store in string variable
        System.out.print("\nWrite a sentence: ");
        String userSentence = scanner.next();
        String userSentence1 = scanner.nextLine();
        System.out.printf("\nYour first word is: " + userSentence);// returns first word
        System.out.printf("\nThe rest of the sentence is: " + userSentence1);// returns rest of sentence
        System.out.printf("\nThe whole sentence: " + userSentence + userSentence1);

        //Calculate the perimeter and area of Codeup's classrooms.
        System.out.print("\nEnter the length and width of our Codeup classroom? ");
        String length = scanner.nextLine();
        String width = scanner.nextLine();
//        int perimeter = Integer.parseInt(length + width + length + width);
//        System.out.print(dimensions);

    }
}