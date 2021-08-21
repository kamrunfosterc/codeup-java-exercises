package aug21_tutoring;

import java.util.ArrayList;
import java.util.Locale;

public class BookApp {

    public static ArrayList<Book> copyLibrary(ArrayList<Book> library){
        ArrayList<Book> newList = new ArrayList<>();
        for (Book book : library){
            Book copiedBook = new Book(book.getTitle(), book.getAuthor());
            newList.add(copiedBook);
        }
        return newList;
    }

    public static void main(String[] args) {
        Book dune = new Book("Dune", "Frank Herbert");
        Book moby = new Book("Moby Dick","Herman Melville");

        ArrayList<Book> myLibrary = new ArrayList<>();
        myLibrary.add(dune);
        myLibrary.add(moby);

        ArrayList<Book> myModifiedLibrary = copyLibrary(myLibrary);
        myModifiedLibrary = titlesToUppercase(myModifiedLibrary);// modifies the books in library

        dune.setAuthor("Bob Herbert");

        printLibrary(myLibrary);// method is declared outside of main

        for (Book book: myModifiedLibrary){
            System.out.print("\n*** My Modified Library ***\n");
            System.out.println(book);
        }
        myModifiedLibrary = titlesToUppercase(myModifiedLibrary);


    }// END OF MAIN

    private static void printLibrary(ArrayList<Book> myLibrary) {
        for (Book book : myLibrary){
            System.out.print("\n*** My Library ***");
            System.out.println(book);
        }
    }

    private static ArrayList<Book> titlesToUppercase(ArrayList<Book> library){
        //iterate through library
        // change each book's title to upper case
        // and return the lirbary
        for (Book book: library){
//            book.setTitle(book.getTitle().toUpperCase();// easiest
            String newTitle = book.getTitle().toUpperCase();
            book.setTitle(newTitle);

//            // alt option to capilizing first letter
//            // immutable = can't be changed once created
//            String newTitle = book.getTitle().substring(0,1).toUpperCase();
//            newTitle += book.getTitle().substring(1);
//            book.setTitle(newTitle);
        }
        return library;
    }

//    public static String capitalize(String str) {
//        int strLen;
//        if (str == null || (strLen = str.length()) == 0) {
//            return str;
//        }
//        return new StringBuilder(strLen)
//                .append(Character.toTitleCase(str.charAt(0)))
//                .append(str.substring(1))
//                .toString();
//    }
}
