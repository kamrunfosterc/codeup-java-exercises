package Contacts_practice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.*;

public class Data_practice {

    protected static String directory = "data_practice";
    protected static String filename = "contacts.txt";
    private static Path dataDirectory = Paths.get(directory);//grabs String directory
    private static Path dataFile = Paths.get(directory, filename);
    static Scanner scanner = new Scanner(System.in);



    public static void searchingContacts() throws IOException {
        String userResponse = scanner.next();
        List<String> displayAllContacts = Files.readAllLines(dataFile);

        for(String contact: displayAllContacts){
            if(contact.toLowerCase().contains(userResponse.toLowerCase()));{
                System.out.println(contact);
            }
        }
    }
    public static void addToContacts(String ContactsBeingAdded) throws IOException{
        Files.write(
                Paths.get(directory, filename),
                Arrays.asList(ContactsBeingAdded),
                StandardOpenOption.APPEND

        );
    }
    public static void viewAllContacts() throws IOException{
        List<String> showAllContacts = Files.readAllLines(dataFile);//todo check out
        System.out.println("Name | Phone Number");
        System.out.println("-------------------");

        for(String contact: showAllContacts){
            String userResponse = scanner.nextLine();
            System.out.println(contact);
        }
    }
    public static void removingAContact() throws IOException{
        String userChoice = scanner.nextLine();
        List<String> showFullContactList = Files.readAllLines(dataFile);
        List<String> newContactList = new ArrayList<>();

        for(String contact: showFullContactList){
            if(!contact.toLowerCase().contains(userChoice.toLowerCase())){
                newContactList.add(contact);
            }
        }
        Files.write(dataFile, newContactList);
    }

    public static void initiateDataFile() throws IOException{
        if (Files.notExists(dataDirectory)) {
            Files.createDirectories(dataDirectory);
        }

        if (! Files.exists(dataFile)) {
            Files.createFile(dataFile);
        }
    }


    public static void main(String[] args)  throws IOException{//throws IOException
        // TODO: 8/13/21
//        try{
//            throw IOException
//        }catch(IOException e){
//
//

//        if (Files.notExists(dataDirectory)) {
//            Files.createDirectories(dataDirectory);
//        }
//
//        if (! Files.exists(dataFile)) {
//            Files.createFile(dataFile);
//        }


        //        this will write contents to the file
//        Files.write(dataFile, fileContents, StandardOpenOption.APPEND);// Path

        //This is how you will read a files content
        List<String> contentReadsFromFile = Files.readAllLines(dataFile);

        //create a list and write its contents to a file
        List<String> lines = Arrays.asList("coffee", "creme", "sugar","spice");// create new list of strings
//        Path filepath = Paths.get("data", "groceries.txt");
        Files.write(dataFile, lines);

        for (String line: contentReadsFromFile){
            System.out.println(line);
        }

//        List<String> contentReadsFromFile = Files.readAllLines(contactFile);// will read a files content
//        List<String> lines = Arrays.asList("testing: 1, 5, 3", "testing: 2, 7, 4"); // create new List of strings
//        Files.write(contactFile, lines);
//
//        for (String line: contentReadsFromFile){
//            System.out.println(line);
//        }
//        //alternative to our Enhanced for loop
////        for (int i = 0; i < lines.size(); i++) {
////            System.out.println((i+1)+": "+lines.get(i));
////        }
//        //TODO: method that shows all contacts
//        //TODO: Add new contact method
//        //TODO: Search contact by name
//        //TODO: delete existing contact





    // *********************END OF MAIN METHOD*********************
    }
    // *********************END OF Data_practice Class*********************
}
