
public class RyWalkThroughs {
    // TODO: 8/13/21
    //todo Exceptions and error handling Exercise
//    Improve your Input class.
//    Your getInt and getDouble methods should make sure that the value returned from the method is actually an int or a double. You can do this by replacing the use of the Scanner nextInt() and nextDouble() methods with the existing getString() method you created in a previous exercise using the following methods to convert the returned String into the desired datatype:

//    Integer.valueOf(String s);
//    Double.valueOf(String s);
//    Note these methods will throw a NumberFormatException if the given input cannot be parsed as an int or double. Your methods on the Input class should handle these exceptions, you can use a try-catch for this.
//    Bonus:
//    Research the .valueOf method on the Integer class. You will find that it can also be used to parse integers in different bases. Use this functionality to create two new methods, getBinary and getHex that will accept a string that is a number in binary or hexadecimal.
//

//    public int getInt(int min, int max){//todo EXERCISES
//        System.out.println("Provide a whole number: ");
//        int userInt;
//        try{
//            userInt = Integer.valueOf(getString());
//        }catch(NumberFormatException e){
//
//        }
//        if (userInt < min || userInt > max){
//            System.out.println("Invalid input! Try again.");
////            System.out.println("Please attempt again");
//            return getInt(min, max);
//        } else {
////            System.out.println("That one is valid.");
//            return userInt;
//        }
//
//    }
//
//    public double getDouble(double min, double max){//todo EXERCISES
//        System.out.println("Provide a decimal number: ");
//        double userDouble = scanner.nextInt();
//        if (userDouble < min || userDouble > max){
//            System.out.println("Please attempt again");
//            return getDouble(min, max);
//        } else {
//            System.out.println("That one is valid.");
//            return userDouble;
//        }
//    }
}
