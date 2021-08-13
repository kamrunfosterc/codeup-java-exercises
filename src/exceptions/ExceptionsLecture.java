////TODO need to edit
//package exceptions;
//
//import util.Input;
//
//import java.util.InputMismatchException;
//
//public class ExceptionsLecture {
//    //coming into situations that a problem/ something unexpected happened
//    //and no we need to handle this.... using a proper exception
//
//    public static void foo() throws Exception{
//        throw new Exception("Hey ARNOLD! Sp,etjomg bad happened!");
//    }
//
//    public static void main(String[] args) {// todo: after args) we can put --> throw Exception!!!!
//        //public static void main(String[] args) throw Exception {
//        int[] myArray = {1,2,3,4,5};
//
//        //todo exception example version 1
////        System.out.println(myArray[5]);// Exception: array out of bonds exception for this index
////        throw new RuntimeException("hi there, running a little late");//signals to communicate something
////        System.out.println("End of program");// unreachable statement when we have 'throw' exception above
//
//        //todo exception example version 2
////        try{
////            throw new RuntimeException("Hiddy ho Winslow, we are running slow!");
////        } catch(RuntimeException e){
////            System.out.println("Ouch! Runtime exception!");
////        }
////        System.out.println("End of program");
//
//        //todo catch example
////        try{
////            Input input = new Input();
////            System.out.println("Enter an int: ");
////            input.getInt();
////        } catch(InputMismatchException e){
////            System.out.println("Ouch! an exception occurred: "+ e.getMessage());
////            e.printStackTrace();//???
////        }
////        System.out.println("End of program");
//
//        //todo trying another example
////        int result = 0; //creates result visible outside block
////        try{
////            result = 1 / 0;
////        }catch(InputMismatchException e){
////            e.printStackTrace();
////        }catch(ArithmeticException e){
////            System.out.println("Don't divide by zero!");
////        }finally {
////            //any of the code above executes, this will also and be like a 'clean up'
////            System.out.println("Finally is Executing");
////        }
////        System.out.println("End of program 2");
//
////##########################################################################
//        //better practice to create void methods and put try catch in them, and then put that method w/
//        //in the try catch inside our main
//
//        //each code block has its on scope/ code block
//
//        // TODO:new example
////        throw new Exception("hello world");
////        try{
//////            result = 1 / 0;
////        }catch(ArithmeticException e){
////            System.out.println("Don't divide by zero!");
////        }finally {
////            //any of the code above executes, this will also and be like a 'clean up'
////            System.out.println("Finally is Executing");
////        }
////        System.out.println("End of program 3");
//
//        // TODO: a way to try out throwing exceptions differently (this is the caller below)
////        try {
////            foo();// foo throws exception in here now, caller handles this part
////        } catch (Exception e) {
////            System.out.println("Error occurred: " + e.getMessage());
////        }
////        System.out.println("End of program 4");
//
//        int result = 0;
//        while(result != 99){
//        try{
//            getIntegerFromUser();
//        } catch(UserCantTypeException e){
//            System.out.println(e.getMessage());
//        }
//        }
//        System.out.println("End of Program");
//
//
//        }
//
//    private static int getIntegerFromUser() throws UserCantTypeException {
//        try {
//            Input input = new Input();
//            System.out.print("Enter an integer: ");
//            return input.getInt();
//        } catch (InputMismatchException e) {
//            //turn Input class/ unchecked exception into a checked exception
//            throw new UserCantTypeException("Really bad user!!");
//        }
//
//
//
//
//
//    }
//}
