import java.sql.SQLOutput;
import java.util.Scanner;

public class HelloPolaris {
    public static void main(String[] args){
        System.out.println("Howdy There Polaris!!!"); //strings inside of java require ""
        //single quotes '' are only for characters
        // A single-line comment begins with two slashes (//).
        // A block comment starts with a slash and an asterisk (/*) and ends with the same two symbols in reverse (*/).

//        ******* LECTURE *******
        //JS way variable
        // let nameOfVar = 123

        //JAVA variables
//        data type identifier = valid data entry
        int newNumber = 5;// need to know data type b4 calling
        // also can do following
        int nexNumber;
        nexNumber = 5;

        // reference types, think compound or complicated types bc they don't
        // primitive don't have any link attached to them

        byte dayOfMonth = 31; //byte (1) data type is very short integers from -128 to 127
        // one reason to use this type is when we have memory constraint

        short employees = 129;// short(2 bytes) integers from -32,768 to 32,767

        int carPrice = 50000;// int(4 bytes) Integers from -2,147,483,648 to 2,147,483,647

        long diameterOfMilkyWay = 7574875807807879L;//	Long(8 bytes) integers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        // L at the end explicitly makes it understood as a long... only for literals

        float gradeAverage = 93.35f;//float (4bytes) Single-precision, floating-point numbers from -3.4E38 to 3.4E38 with up to 7 significant digits
        //f puts this into the float category

        double testDouble = 1000000000.787655;//double (8bytes) Double-precision, floating-point numbers from -1.7E308 to 1.7E308 with up to 16 significant digits
        // good for mathematical precision
        // (5/2f) ******** ******** ******** ******** good example

        char yesNo = 'y';//A single Unicode character that’s stored in two bytes

        boolean areBaby = false;//A true or false value

        //JAVA strings
        String myName = "Mr. Foster";
        String criminalMindsQuote = "\"Some cheesy quote\" \n - Probably Mark Twain";

//        Special characters inside of strings must be escaped (i.e. prefixed with a backslash). Here are some of the most common escape sequences:
//
//        "\"" // => "
//        "\\" // => \
//        "\n" // => the newline character
//        "\t" // => the tab character
        String rockNRoll = "\t\\n/";
        System.out.println(criminalMindsQuote);
        System.out.println(rockNRoll);


        //JAVA Identifiers And Keywords
//        1. start with a letter, underscore, or dollar sign.
//        2. consist of letters, dollar signs, underscores, and digits.
//        3. be no more than 255 characters.

        //DO NOT use reserved/ keywords

    // JAVA Constants
    // same as before but we add the final key word final, sim to const in JS
//        final int SIDES_OF_A_DICE = 6;
//        final String API_KEY = "b75b703d8195f6f433ca";
//        final String GITHUB_API_BASE_URL = "https://api.github.com";

    //JAVA Arithmetic Expressions
//        XXXXX Binary vs. Unary XXXXX
//
//        An arithmetic expression consists of operands and arithmetic operators.
//                Binary operators operate on two operands
//        Unary operators operate on one operand

//        XXXXCOrder of Precedence XXXXX
//
//        Increment and decrement
//        Positive and negative
//        Multiplication, division, and modulus
//        Addition and subtraction

//                  BINARY OPERATOR
//                +	Addition
//                -	Subtraction
//                *	Multiplication
//                /	Division
//                %	Modulus

//                  UNARY OPERATOR Meaning
//                ++ increment (pre and post)
//                -- decrement (pre and post)
//                +	Positive sign
//                -	Negative sign

        int sum = 5 + 6;
        int difference = 5 - 6;
        int multiply = 5 * 6;
        int divide= 5 / 6;
        int remainder= 4 % 2;

//        System.out.println();// shorthand = sout


//        JAVA Casting
//        implicit casting below
        short myNewsShort = 900;
        long morePrecise = myNewsShort;//took short and assigned it to the long, gets more precise this way
        //short is like a matchbox, long is like a shoebox.. can easily throw matchbox into shoebox

        // Explicit casting below
        // going from more explicit to less
        double pi = 3.14159;
        int almostPi = (int) pi;// losing precision
        System.out.println(almostPi);// returns 3

        // ****** EXERCISE for Syntax, Types and Variables *****
        int myFavoriteNumber = 14;
        System.out.println(myFavoriteNumber);

        String myString = "3.14159";
        System.out.println(myString);

////        Curriculum Example 2: Multiple Placeholders
//        String name1 = "Codeup";
//        System.out.printf("Hello there, %s. Nice to see you.\n", name1);

////        Curriculum Example 2: Multiple Placeholders
//        String names = "Codeup";
//        String greeting = "Salutations";
//        System.out.printf("%s, %s", greeting, names);

//        Curriculum Example 4: String Formatter Example
        int intVar = 6;
        float floatVar = 49.0f;
        String stringVar = "This is a string";
        System.out.printf("The value of" + "the float variable is "+ "%f, while the value fo the "+ "integer" +
                "variable is %d, " + "and the string is %s", floatVar, intVar, stringVar);

////      *** Curriculum Example 4: Using the Scanner Class (java.util package)
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter something: ");
//        String userInput = scanner.next();// takes in user input and saves to var userInput
//        // the above grabs only first word
//
//        String userInput1 = scanner.nextLine();// will return next word



//        System.out.println("You entered : --> \"" + userInput1 + "\" <--");
        //JAVASCRIPT VERSION: const userInput = prompt("What is your name? ")

    }
}
