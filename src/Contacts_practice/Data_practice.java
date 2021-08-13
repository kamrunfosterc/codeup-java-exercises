package Contacts_practice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Data_practice {

    public static void main(String[] args)  throws IOException{//throws IOException
        //refer to IO lecture for assistance
        String directory = "data_practice";
        String filename = "contacts.txt";
        Path dataDirectory = Paths.get(directory);//grabs String directory
        Path dataFile = Paths.get(directory, filename);//grabs String directory, String filename

        // TODO: 8/13/21
//        try{
//            throw IOException
//        }catch(IOException e){
//
//        }

        if (Files.notExists(dataDirectory)) {
            Files.createDirectories(dataDirectory);
        }

        if (! Files.exists(dataFile)) {
            Files.createFile(dataFile);
        }


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
