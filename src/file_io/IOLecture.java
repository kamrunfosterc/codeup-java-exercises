package file_io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class IOLecture {

    //this is writing to a js
//    public static void main(String[] args) throws IOException {
//        // TODO: 8/13/21 PART 1 ###############################
//        String directory = "src/file_io";// relative path bc missing "/" in front of data
//        String filename = "info.txt";
//
//        // part of Reading and Writing files section
//        // TODO: 8/13/21
//        //when writing multi content you will use a collection to hold each line
////        String directory = "js";
////        String filename = "madeByJava.js";
////        fileContents.add("const message = \"Hello World\"");
////        fileContents.add("// written by java file system");
//        //example to uncomment later and comment out appropriate others
//
//        //When writing multi line content you will use a collection to hold each line
//        ArrayList<String> fileContents = new ArrayList<String>();
//        //each string that we add to the fileContents collection will represent
//        //a line to write on the file
//        fileContents.add("Hello from");
//        fileContents.add("JAVA FILE IO");
//
//        // End of Reading and Writing File section
//
//        Path dataDirectory = Paths.get(directory);
//        Path dataFile = Paths.get(directory, filename);
//
//        //We should use the try & catch for the IOException
//        if (Files.notExists(dataDirectory)) {
//            Files.createDirectories(dataDirectory);
//            //first line checks if directory exits
//            // if it doesnt exist go ahead a create
//        }
//
//        if (! Files.exists(dataFile)) {
//            Files.createFile(dataFile);
//            //first line, checking to see if it exist
//            //if file doesn't exist, we will create it
//        }
//        // TODO: 8/13/21 END OF PART 1 ###############################
//
//        // TODO: 8/13/21 part 2 Reading and writing files ###############################
////        this will write contents to the file
//        Files.write(dataFile, fileContents);// Path
//
//        //This is how you will read a files content
////        Files.readAllLines(Path filepath);//returns  List<String> type
//        List<String> contentReadsFromFile = Files.readAllLines(dataFile);
//    }

    public static void main(String[] args) throws IOException {
        // TODO: 8/13/21 PART 1 ###############################
        String directory = "src/file_io";// relative path bc missing "/" in front of data
        String filename = "hello.sh";

//        String directory = "js";
//        String filename = "madeByJava.js";
//        fileContents.add("const message = \"Hello World\"");
//        fileContents.add("// written by java file system");
        //example to uncomment later and comment out appropriate others

        //When writing multi line content you will use a collection to hold each line
        ArrayList<String> fileContents = new ArrayList<String>();
        //each string that we add to the fileContents collection will represent
        //a line to write on the file
        fileContents.add("Say hello Polaris");
//        fileContents.add("JAVA FILE IO");

        // End of Reading and Writing File section

        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, filename);

        //We should use the try & catch for the IOException
        if (Files.notExists(dataDirectory)) {
            Files.createDirectories(dataDirectory);
            //first line checks if directory exits
            // if it doesnt exist go ahead a create
        }

        if (! Files.exists(dataFile)) {
            Files.createFile(dataFile);
            //first line, checking to see if it exist
            //if file doesn't exist, we will create it
        }
        // TODO: 8/13/21 END OF PART 1 ###############################

        // TODO: 8/13/21 part 2 Reading and writing files ###############################
//        this will write contents to the file
        Files.write(dataFile, fileContents, StandardOpenOption.APPEND);// Path

        //This is how you will read a files content
//        Files.readAllLines(Path filepath);//returns  List<String> type
        List<String> contentReadsFromFile = Files.readAllLines(dataFile);

//        System.out.println(contentReadsFromFile);
        for (String line: contentReadsFromFile){
            System.out.println(line);
        }
    }





}
