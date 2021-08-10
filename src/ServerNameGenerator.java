import java.util.Random;
//TODO PART OF Arrays Exercise
//TODO 2. Arrays: Server Name Generator

public class ServerNameGenerator {

    public static String[] adjectives = {"blue","runny"};// access modifier
    public static String[] nouns = {"desk","house"};

    public static String arrayOfStrings(String[] choices){
        Random random = new Random();
        int randomNumb = random.nextInt(choices.length);
        return choices[randomNumb];
    }

    public static void main(String[] args) {
        //mine
//        String[] adjectives = new String[]{"adorable", "adventurous", "aggressive", "agreeable", "alert", "alive", "amused", "angry","annoyed", "blue"};
//        String[] nouns = new String[]{};
        System.out.println("Here is your server name: ");
        System.out.println(arrayOfStrings(adjectives)+ " "+ arrayOfStrings(nouns));

    }
}
