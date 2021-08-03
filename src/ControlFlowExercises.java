import java.util.Scanner;
import java.lang.Math;

public class ControlFlowExercises {
    public static void main(String[] args) {
        //TODO a) loop basics
//        //create loop that starts from 5, counts to 15 and displays each count
//        int i = 5;
//        while(i <= 15){
//            System.out.print(i + ", ");
//            i++;
//        }

        //TODO b) Do While
//        int counted = 0;
//        do{
//            counted += 2;
//            System.out.println(counted);
//        }while(counted < 100);

//        int backCount = 100;
//        do{
//            System.out.println(backCount);
//            count -= 5;
//        }while(backCount > -10);


//        long countBig = 2L;// explicit long
//
//        do{
//            System.out.println(countBig);//
//            countBig *= countBig;
//        }while(countBig < 1000000L);//1,000,000   1000000

        //TODO c) For
//        for (int j = 5; j <= 15; j++) {
//            System.out.println("Forloop count " + j);
//        }
//
//        for (int j = 0; j < 100; j+=2) {
//            System.out.println("Count to 100 by 2's " + j);
//        }
//
//        for (int j = 100; j >= -10 ; j -= 5) {//decrement by 5
//            System.out.println("For Loop Decrement by 5 " +j);
//        }
//
//        for (long j = 2L; j < 1000000L; j *= j) {
//            System.out.println("for loop squares " + j);
//        }

        //TODO 2) FIZZBUZZ (technical assessment interview)
        // tip: have most specific test cases at the top to avoid code skipping it later bc condition was met!!!!
//        for (int x = 1; x <= 100; x++){
//            if(x % 5 == 0 && x % 3 == 0){// could also start i % 15 == 0
//                System.out.println("FizzBuzz");
//            } else if (x % 5 == 0){
//                System.out.println("Buzz");
//            } else if (x % 3 == 0){
//                System.out.println("Fizz");
//            } else {
//                System.out.println(x);
//            }
//        }

        //TODO 3) Display table of powers
        // potential to iterate over something, do while and for loop
        Scanner scanner = new Scanner(System.in);
        boolean userContinues = true;
        do{
            System.out.println("What number would you like to go up to?");
            int userInt = scanner.nextInt();
            System.out.println("\nHere is your table!\n");
            System.out.println("number | squared | cubed");
            System.out.println("------ | ------- | ------");
            for (int i = 1; i < userInt; i++) {
                System.out.printf("%-6d", i);// prints i, but takes up 6 spaces justified left
                System.out.print(" | ");
                System.out.printf("%-7d", i*i);
                System.out.print(" | ");
                System.out.print(i * i * i);
                System.out.println();// empty line
                //alternate way, by doc Rob
//                System.out.printf("%-6d | %-7d | %-5d\n", i, i*i, i*i*i);

            }
            System.out.println("Would you like to enter another number (y/n)?");
            String userResponse = scanner.next();
            if (!userResponse.equalsIgnoreCase("y")){
                userContinues = false;
            }

        }while(userContinues);


        //TODO 4) Convert given number grades into letter grades
        boolean anotherGrade = true;

        do {
            System.out.println("Please enter a numerical grade from 0-100");
            int userGrade = scanner.nextInt();

            if (userGrade >= 88){
                System.out.println("A");
            }else if (userGrade >= 80){
                System.out.println("B");
            }else if (userGrade >= 67){
                System.out.println("C");
            }else if (userGrade >= 60){
                System.out.println("D");
            } else {
                System.out.println("F");
            }
            System.out.println("Do you want to enter a grade? ");
            String userResponse = scanner.next();

            if (!userResponse.equalsIgnoreCase("y")){
                anotherGrade = false;
            }
        }while(anotherGrade);


    }
}
