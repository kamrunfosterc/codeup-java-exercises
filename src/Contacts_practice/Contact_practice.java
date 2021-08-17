package Contacts_practice;
//import Contact_practice.java;

import util.Input;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

// TODO: 8/16/21
//  1. Things accomplished: able to view working, add working,
//  2.Things left to do: test search, add a delete, test exit
public class Contact_practice {
    protected static String directory = "data_practice";
    protected static String filename = "contacts.txt";
    private static Path dataDirectory = Paths.get(directory);//grabs String directory
    private static Path dataFile = Paths.get(directory, filename);
    // TODO: 8/13/21 create ability to add/ remove new contacts and their format
    // TODO: 8/13/21 store contacts into contacts.txt data directory
    Scanner userInput = new Scanner(System.in);
    public static String showMainMenu(){

    }
    public static int grabUserSelection(){
        Input userInput = new Input();
        System.out.println();
        int userSelection = userInput.getInt(1, 5); // places user
        return userSelection;
    }
    public static Path getContacts() throws IOException {
        if (Files.notExists(dataDirectory)) {
            Files.createDirectories(dataDirectory);
        }

        if (! Files.exists(dataFile)) {
            Files.createFile(dataFile);
        }
        return dataFile;
    }
    public static void setUpDataFile(){

    }
    public static void  displayContacts()throws IOException{//option 3 search sim to viewing all
//        System.out.println("Testing displayContacts");
        List<String> contentReadsFromFile = Files.readAllLines(getContacts());
        System.out.println("Name      |  Phone Number");
        System.out.println("-------------------------");
        for (String line: contentReadsFromFile){
        System.out.println(line);
        }
    }

    public static void addContacts(String firstName, String lastName){
            String  firstName = input.next();

    }
    public static String formatContact(String contactFileLine){
        return String.format("%s, %s | %s", firsNAme)
    }


    public static boolean userInputSelection(int ){

        Input userInput = new Input();
//        displayMenu();
        int menuChoice = userInput.next();
        switch (menuChoice){
            case 1:
                System.out.println("Display contacts");;//calls method to view contacts
                break;

            case 2:
                System.out.println("Add contacts");// method to add contacts
                String newContactName = Contact_practice.addFirstName()+" "+ Contact_practice.addLastName();
                break;

            case 3:
                System.out.println("Search by name: ");//search contact by name
                break;

            case 4:
                System.out.println("Delete Contact");//delete existing contact
                break;

            case 5:
                System.out.println("Exit program");//Exit
                break;

            default:
                System.out.println("Please provide a valid selection.");
                break;
        }

    }

    private static String addLastName() {
    }

    private static String addFirstName() {
    }


    public static void main(String[] args) {
        // TODO: 8/13/21 create list of strings, iterate through string to
        //convert from contacts.txt

        //POJO
        //should rep an instance of each contact
        //properties, constructors, getters and setters

    }
}
