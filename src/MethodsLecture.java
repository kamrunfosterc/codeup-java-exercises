import java.util.Scanner;

public class MethodsLecture {
    //methods should not be declared inside of MAIN
    //methods declared inside of CLASS

    //1st Method below
//    public static returnType methodName([param1[, param2[, ...]]) {
//        // the statements of the method
//        // a return statement, if a return type is declared
//    }
    //TODO established variables
    static double pi = 3.14;// have to have static bc ref in static variables

    //TODO 1st example method
    public static String sayHello(String userName){
        String helloMessage = String.format("Hello, %s!", userName);// alt: "Hello, " + userName + "!";
        // format substitute printf???
//        return null; //initial to keep from errors
        return helloMessage;
    }

    //TODO 2nd example method METHOD OVERLOADING (declaring same method multi times)
        //will call these depending on which data type is used
    public static double getAreaOfCircle(double radius){
        double areaOfCircle = pi*(radius*radius);
        return areaOfCircle;
    }
    public static double getAreaOfCircle(long radius){
        double areaOfCircle = pi*(radius*radius);
        return areaOfCircle;
    }
    public static double getAreaOfCircle(float radius){
        double areaOfCircle = pi*(radius*radius);
        return areaOfCircle;
    }

    //TODO ** Recursion **: best to understand this vs having to learn to use (used in repetitive nature)
    //mathy use, solving mathematical problems
    //MUST define when this starts and stops/ can be define by smaller versions of itself
    // otherwise can crash
    public static boolean doesUserWantToContinue(){
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to continue? ");
        String usersResponse = input.nextLine();
        if (usersResponse.equals("yes")){
            return true;
        } else if (usersResponse.equals("no")){
            return false;
        } else {
            return doesUserWantToContinue();// part that is Recursion!!!
        }
    }

    public static int factorial(int n){
        if (n == 1){
            return n;// base case, 1 of the requirements that makes this program stop
        }
        return n * factorial(n-1);// actual work done with a smaller value
    }// best for iterative mathematics functioning
    // don't use computer resource very well

    public static void main(String[] args) {
        //used to execute codes
        //TODO 1st example method executed
        System.out.println(sayHello("Kamrun"));// calls method from above

        int radiusOfCircle = 4;// double is more precise and so can be used in 2nd method bc its a lower precision data type
        //TODO 2nd Example method executed
        System.out.println(getAreaOfCircle(34));
        //can try System.out.println(radiusOfCircle);
        // could try floats, long, etc to see the diff

        if (doesUserWantToContinue()){
            System.out.println(sayHello("Allison"));
            int newRadiusOfCircle = 4;
            System.out.println(getAreaOfCircle(newRadiusOfCircle));
        }



    }
}
