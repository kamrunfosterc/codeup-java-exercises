import java.util.Scanner;

public class Main_PRACTICE {

//    public static void displayMenu(){
//        System.out.println("1. View contacts.");
//        System.out.println("2. Add a new contact.");
//        System.out.println("3. Search a contact by name.");
//        System.out.println("4. Delete an existing contact.");
//        System.out.println("5. Exit");
//        System.out.println("Enter an option (1 2 3 4 or 5): ");
//    }
    private static String [] menu = {// main menu
            "1. View Contacts",
            "2. Add a new contact",
            "3. Search a contact by name",
            "4. Delete an existing contact",
            "5. Exit",
//            "Enter an option (1, 2, 3, 4, or 5): "

};
    public static void displayMenu(){
        for(String item: menu){// for (type var name: array pulling from){prints each var name[i]}
            System.out.println(item);
        }
        System.out.println("Enter an option (1, 2, 3, 4, or 5):");
        Scanner userPick = new Scanner(String.valueOf(menu));
    }

    public static void main(String[] args) {
//        Conctact.contactApp().
        //TODO note that Main class will be outside of contacts package
//
//        private static String dir = "data";
//        private static
        //// TODO: 8/13/21
        // Show all your contacts
        //Add a new contact
        //Search a contact by her name
        //Delete an existing contact
        displayMenu();


    }
    // contactApp can be defined

}
