import java.util.Scanner;
import java.lang.Math;
public class ControlFlowExercises {
    public static void main(String[] args) {
        //TODO a) loop basics
        //create loop that starts from 5, counts to 15 and displays each count
        int i = 5;
        while(i <= 15){
            System.out.print(i + ", ");
            i++;
        }

        //TODO b) Do While
//        int counted = 0;
//        do{
//            counted += 2;
//            System.out.println(counted);
//        }while(counted < 100);

//        int count = 100;
//        do{
//            count -= 5;
//            System.out.println(count);
//        }while(count > -10);


        long countBig = 2;
//        double sqrRoot = countBig*countBig;
//        double result = Math.pow(2, sqrRoot);
        do{
            countBig *= countBig;
            System.out.println(countBig);//
        }while(countBig < 1000000);//1,000,000   1000000

        //TODO c) For
        for (int j = 5; j <= 15; j++) {
            System.out.println("Forloop count " + j);
        }

        for (int j = 0; j < 100; j+=2) {
            System.out.println("Count to 100 by 2's" + j);
        }




    }
}
