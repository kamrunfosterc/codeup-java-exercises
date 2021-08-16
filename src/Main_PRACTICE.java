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
//        Contact.contactApp().
        //TODO note that Main class will be outside of contacts package

        Scanner userInput = new Scanner(System.in);
        displayMenu();
        int menuChoice = userInput.nextInt();
        switch (menuChoice){
            case 1:
                System.out.println("Display contacts");;//calls method to view contacts
                break;
            case 2:
                System.out.println("Add contacts");// method to add contacts
                break;
            case 3:
                System.out.println("Search contacts");//search contact by name
                break;
            case 4:
                System.out.println("Delete Contact");//delete existing contact
                break;
            case 5:
                System.out.println("Exit program");//Exit
                break;
        };

    }
    // contactApp can be defined

}
