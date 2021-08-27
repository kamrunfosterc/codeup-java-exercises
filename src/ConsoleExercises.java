import java.sql.SQLOutput;
import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately " + "%f.", pi);// my way yield 3.14159
//        System.out.printf("The value of pi is approximately " + "%.2f.", pi);// my 2nd option way yield 3.14
//        System.out.format("The value of pi is approximately " + "%.2f.", pi);// instructor way yields 3.14
//
//
//
//        Scanner scanner = new Scanner(System.in);// Scanner class + variable name = syntax"new Scanner(System.in);
//        //TODO:prompt user to enter integer, store in int variable using nextInt
//        System.out.print("\nEnter a number: ");
//        int userInput = scanner.nextInt();// scanner here is just the variable name
//        System.out.println("You entered : --> \"" + userInput + "\" <--");
//        //above requires an integer
//
//        //TODO: Prompt user to enter 3 words, store in separate variables
//        System.out.println("\nWhat are your three favorite colors: ");
//        String color1 = scanner.next();
//        String color2 = scanner.next();
//        String color3 = scanner.next();
//        System.out.printf("Your three favorite colors are: " + "\n%s\n, %s\n, %s", color1, color2, color3);
//
//        //TODO: enter a sentence and store in string variable
//        System.out.println("\nWrite a sentence: ");
////        String userSentence = scanner.next();
//        String userSentence1 = scanner.nextLine();
////        System.out.printf("\nYour first word is: " + userSentence);// returns first word
////        System.out.printf("\nThe rest of the sentence is: " + userSentence1);// returns rest of sentence
////        System.out.printf("\nThe whole sentence: " + userSentence + userSentence1);
//        System.out.printf(userSentence1);
//
//        //Calculate the perimeter and area of Codeup's classrooms.
//        //TODO
//        System.out.println("\nEnter the length and width of our Codeup classroom?");
////        String length = scanner.nextLine();
////        String width = scanner.nextLine();
////        int perimeter = Integer.parseInt(length + width + length + width);
////        System.out.print(dimensions);
//        System.out.println("\nEnter the width of our Codeup classroom?");
//        double width = Double.parseDouble(scanner.nextLine());// nextline is a string, parsing into numeric
//
//        System.out.println("\nEnter the length of our Codeup classroom?");
//        double length = Double.parseDouble(scanner.nextLine());
//
//        double area = length * width;
//        double perimeter = (2*width)+(2*length);
//        System.out.println("Area: " + area);
//        System.out.println("Perimeter: " + perimeter);

        //TODO Try the bonuses Next


        // TODO: 8/22/21 *** Redo Console IO exercises ***
        //#1
//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %.2f ", pi);//returns: The value of pi is approximately 3.14
//
//        //TODO Scanner Class
//        //Scanner Class #1
//        Scanner userInt = new Scanner(System.in);// initiates ability to store user input value
//        System.out.println("\nPlease enter an integer: ");
//        int answer = userInt.nextInt(); // stores entered value in variable answer
//        System.out.println("you entered: " + answer);// returns what they entered
//        System.out.println("\nThank you for your participation!");
//
//        //Scanner Class #2
//        Scanner threeWords = new Scanner(System.in);
//        System.out.println("Please enter 3 words: ");
//        String word1 = threeWords.next();
//        String word2 = threeWords.next();
//        String word3 = threeWords.next();
//        System.out.printf("\n%s \n%s \n%s\n", word1, word2, word3);// returns first 3 words entered
//
//        //Scanner Class #3/ #4
//        Scanner enteredSentenced = new Scanner(System.in);
//        System.out.println("Enter a sentence:\n ");
//        String userEntry = enteredSentenced.nextLine();
//        System.out.println("\nYour sentence read: " + userEntry );

        //TODO Calculate the perimeter and area of Codeup's classrooms.
        //#1
        Scanner codeupPerimeter = new Scanner(System.in);
//        System.out.printf("Enter the length and width of your classroom at Codeup: ");
//        String length = codeupPerimeter.nextLine();
//        String width = codeupPerimeter.nextLine();

        System.out.println("\nEnter the width of our codeup classroom ");
        double width = Double.parseDouble(codeupPerimeter.nextLine());// accepts answer and converts to double
        System.out.printf("you entered %s for the width", width);// THIS IS EXTRA, NOT REQUIRED FOR EXERCISE, JUST TRYING OUT

        System.out.println("\nEnter the length of our codeup classroom ");
        double length = Double.parseDouble(codeupPerimeter.nextLine());
        // at this point we have set both width, length to be doubles
        //next we define the math
        System.out.printf("you entered %s for the length", length);// THIS IS EXTRA, NOT REQUIRED FOR EXERCISE, JUST TRYING OUT

        double perimeter = (2*width)+(2*length);
        double area = length*width;

        System.out.printf("\nOur codeup class room has an Area of: %s sqft \nand\n a Perimeter of: %s ft!", area, perimeter);

        // TODO: 8/24/21 end of exercise 





    }
}