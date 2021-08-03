import java.util.Locale;
import java.util.Scanner;

public class controlStatementLecture {
    public static void main(String[] args) {
        //TODO Boolean Expressions
        System.out.println(3 >= 4);// yields false

        String myName = "Kam";
        String someOneElseName = "Herman";
        System.out.println(myName == someOneElseName);// ALWAYS yields false in this format
        System.out.println(myName.equals(someOneElseName));// yields boolean when the two names are the same

        //TODO Logical Operators
        String newName = "Ty";
        int age = 25;
        boolean isNewPersonOlderEnough = (newName.equals("Ty") && age >=21);// & vs && they opp diff like | and ||
        System.out.println("User meet the requirement is a " + isNewPersonOlderEnough + " statement.");

        //TODO String Comparison
        Scanner scanner = new Scanner(System.in);
        System.out.print("Would you like to continue: ");
        String userResponse = scanner.nextLine();
        boolean usersRespondedWithYes = userResponse.toLowerCase().contains("y");// shows if answer is yes it'll work
        // could also use .equals("y") vs .contains
        System.out.println(usersRespondedWithYes);

        //TODO IF Statements
        //conditional that tells input based on what is entered above
        if (userResponse.contains("YES")){
            System.out.println("Wow someone is really motivated!!");
        }else if (usersRespondedWithYes){
            System.out.println("Okay we will continue.");
        } else {
            System.out.println("Okay we will not continue");
        }

        //TODO Switch Statement
        //lets ask user for fav color
        //based off that color we will give a response
        //NOTE: can use scanners to read files

        System.out.print("What is your favorite color? ");
        String userFavColor = scanner.next();


        switch (userFavColor) {
            case "blue":
                System.out.println("Hey that's mine too");
                break;
                // Fall through! bc we didn't have a break initially
            case "red":
                System.out.println("That is pretty cool that's your favorite color");
                break;
            default:
                System.out.println("Cool, I don't know anyone who likes that color.");
                break;
        }

        // sout / souf
        //TODO While Loop
        System.out.println("Do you agree to our terms and services? ");
        boolean userAcceptedTerms = false;
        while (!userAcceptedTerms){
            System.out.println("Do you agree to our terms and services? ");
            userAcceptedTerms = scanner.nextLine().toLowerCase().contains("y");
            //if it contains true should kick us outta loop
        }
        System.out.println("Thank you for accepting our terms!");

        boolean userKnowsTheirOwnName = false;
        do{
            System.out.println("Type in your name!");
            userKnowsTheirOwnName = scanner.nextLine().equals("Kam");
        }while(!userKnowsTheirOwnName);
        System.out.println("Congrats! You know your name");


        //TODO For Loop
        //This is a classic For LOOP
        for(int i = 0; i <= 100; i++){
            System.out.println("We are at number " + i + ".");
        }
        System.out.println("Finished counting to 100");


        //TODO Break And Continue
        //This is a for Loop that'll skip the number 45
        for (int i = 0; i < 100; i++) {
            if (i == 45){
                System.out.println("Skipping #45");
                continue;
            }
            System.out.println(i);
        }

        // THis is a for loop that will stop at the number 45
        for (int i = 0; i < 100; i++) {
            if (i == 45){
                System.out.println("Breaking at 45");
                break;
            }

            System.out.println(i);

        }



    }
}
