import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class CollectionsDemo {
    public static void main(String[] args) {
        //ArrayList<object type> varName = new ArrayList<>();
        ArrayList<String> lastNames = new ArrayList<>();

        //TODO .add method
        lastNames.add("Wallace");
        lastNames.add("Thompson");
        lastNames.add("Smith");
        System.out.println(lastNames);// yields [Wallace, Thompson, Smith];

//        //Java Array / add (how we'd have to add if not using regular ArrayList<>
//        String [] lastNames2 = new String[10];
//        lastNames2 = Arrays.copyOf(lastNames2, lastNames2.length + 1);
//        lastNames2[lastNames2.length-1] = "Wallace";

        //TODO .size() method
        System.out.println("\n**** .size() method ****");
        System.out.println("The size of the lastNames array list is: " + lastNames.size() + "\n");
        //TODO .get() method
        System.out.println("\n**** .get() method ****");
        System.out.println("The element value returned will be Wallace: " + lastNames.get(0) + "\n");
        //TODO .contains() method
        System.out.println("\n**** .contains() method ****");
        System.out.println("We are checking to see if Wallace is an element in the array list: "+ lastNames.contains("Wallace")+"\n");


        //TODO .remove method example
        System.out.println("\n**** .remove() method ****");
        System.out.println(lastNames);
        lastNames.remove(0);
        lastNames.remove("Smith");
        System.out.println(".remove() method applied: " + lastNames);

        //TODO .isEmpty() method --> returns boolean
        System.out.println("\n**** .isEmpty() method ****");
        System.out.println(lastNames.isEmpty());// returns false currently

        //TODO .lastIndexOf() method
        System.out.println("\n**** .lastIndexOf() method ****");
        lastNames.add("Wallace");
        lastNames.add("Thompson");
        lastNames.add("Smith");
        System.out.println(lastNames.lastIndexOf("Smith"));

        // ######################################### ***HASH MAPS*** #################################################
//        HashMap<object, object> varName = new HashMap<>();// instance created
        HashMap<String, String> usernames = new HashMap<>();

        //TODO .put() method
        System.out.println("\n**** .put() method ****");
        usernames.put("Ryan","ryanorsinger");
        usernames.put("Zach","zgulde");
        usernames.put("Fernando","fmendozaro");
        usernames.put("Justin","jreich5");
        System.out.println("4 usernames: " + "\n");

        //TODO .get() method
        System.out.println("\n**** .get() method ****");
        System.out.println(usernames.get("Ryan"));// gets value of key, here it is: ryanorsinger

        //TODO .getOrDefault() method
        System.out.println("\n**** .getOrDefault() method ****");
        System.out.println(usernames.getOrDefault("Mary", "No Username"));
        //doesn't SET KEY OR VALUE

        //TODO .putIfAbsent() method
        System.out.println("\n**** .putIfAbsent() method ****");
        System.out.println(usernames.putIfAbsent("Mary", "replacement value"));
        System.out.println("This method will not overwrite current/ existing values: " + usernames + "\n");

        //TODO put method inside a HASMAP
        usernames.put("Justin", "Value2"); //overrides value, only allows 1 key for justin, any additional just overrides
        //previous

        //TODO .containsValue() method
        System.out.println("\n**** .containsValue() method ****");
        System.out.println("Checking for keys where the value contains the default of 'replacement value' "+ usernames.containsValue("replacement value")
        + "\n");

        //TODO .containsKey() method
        System.out.println("" + usernames.containsKey("")+ "\n");

        //TODO .replace() method
        usernames.replace("Mary", "marylee");
        System.out.println("Replacing the defualt value from the previouse method "+ usernames+ "\n");

        //TODO .remove() method
        usernames.remove("Mary");
        System.out.println("Removing the key, Mary, and the value: "+usernames+ "\n");

        //TODO .clear() method
        usernames.clear();
        System.out.println("The hash map should be empty: "+usernames+ "\n");

        //TODO .isEmpty() method
        usernames.isEmpty();
        System.out.println("");


    }
}
