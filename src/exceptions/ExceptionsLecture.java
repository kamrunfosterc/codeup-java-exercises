package exceptions;

import java.util.Locale;

public class ExceptionsLecture {
    //coming into situations that a problem/ something unexpected happened
    //and no we need to handle this.... using a proper exception


    public static void main(String[] args) {
        int[] myArray = {1,2,3,4,5};

//        System.out.println(myArray[5]);// Exception: array out of bonds exception for this index
        throw new RuntimeException("hi there, running a little late");//signals to communicate something
    }
}
