import java.util.Scanner;
import java.lang.Math;
import java.util.Locale;
public class Bob {
    public static void main(String[] args) {
        //TODO Create a class named Bob with a main method for the following exercise.
        //Bob is a lackadaisical teenager. In conversation, his responses are very limited.
        //
        //Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
        //He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
        //He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
        //He answers 'Whatever.' to anything else.

        //Write the Java code necessary so that a user of your command line
        // application can have a conversation with Bob.


        //TODO GOT STUCK
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ask Bob anything. ");

        String inputResponse = scanner.nextLine().trim();//trim() was Ry suggestion
//        String inputResponse = scanner.nextLine(); // my initial version
        if(inputResponse.endsWith("?")){
            System.out.println("Sure.");
        } else if(inputResponse.endsWith("!")){
            System.out.println("Whoa, chill out!");
        } else if(inputResponse.isEmpty()){//inputResponse.equals("") try this one
            System.out.println("Fine. Be that way!");
        } else {
            System.out.println("Whatever");
        }

        //TODO Telvin version of working on it

//        boolean toContinue = true;
//        do{
//            String userInput = scanner.nextLine();
//            //if statement here
//        }while(toContinue);

//        boolean toContinue = true;
//        do {
//            String userInput = scanner.nextLine();
//            if (userInput.endsWith("?")) {
//                System.out.println("Sure.");
//            } else if (userInput.endsWith("!")){
//                System.out.println("Whoa, chill out!");
//            } else if (userInput.equals("")) {
//                System.out.println("Be that way!");
//            } else {
//                System.out.println("Whatever.");
//            }
//            System.out.println("Would you like to continue to text Bob? (y or n)?");
//            String userResponse = scanner.nextLine();
//            if (!userResponse.equals("y")) {
//                toContinue = false;
//                System.out.println("Good-Bye!");
//            } else {
//                System.out.println("Text to talk to Bob: ");
//            }
//        } while (toContinue);






    }
}
