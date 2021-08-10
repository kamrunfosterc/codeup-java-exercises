import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        //TODO Array Lecture
        int[] anArray = new int[10]; //declaring array in java : type [] var name = new type[fixed length of array]

        int numberOfElements = 10;// if we don't know length we can pass in a variable
        int[] aNewArray = new int[numberOfElements];

        //TODO Working with Array Elements
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;

        System.out.println(numbers[0]); // 1
        System.out.println(numbers[1]); // 2
        System.out.println(numbers[2]); // 0 -- default value
//        System.out.println(numbers[3]); // ArrayIndexOutOfBoundsException !!!

        //TODO ARRAY INITIALIZER SYNTAX
        int [] arrayOfInt = {1,2,3,4,5,6};// ARRAY INITIALIZER SYNTAX

        //getting length
        System.out.println("\nThis is our length of arrayOfInt " + arrayOfInt.length);

        //TODO Enhanced for loop in java
        //the syntax/ layout: for(dataType item: array){}
        String[] languages = {"html", "css", "javascript", "java"};

        for (String language : languages) {
            System.out.println(language);
        }
//        //thinking example
//        for (int array: arrayOfInt ){
//            System.out.print(Arrays.toString(arrayOfInt));
//        }

        //TODO Manipulation tasks
        //TODO toString
        int [] scoreCard = {2,2,1,8,3,2,2,4,2};
        Arrays.fill(scoreCard, 0);
        System.out.println("Score card has been reset \n" + Arrays.toString(scoreCard));

        //TODO .fill
//        void Arrays.fill(arrayName, value);

        //TODO .Equals
//        boolean Arrays.equals(array1, array2);// common to see inside conditionals

        //TODO .copyOf
        int [] org = new int[]{1,2,3};// how we can set values in array
        System.out.println("Original Array");
            int[] copy = Arrays.copyOf(org, 5);// added two elements to copy
            copy[3] = 11;// must assign values to new positions
            copy[4] = 55;
            System.out.println(Arrays.toString(copy));

        //TODO Arrays.sort()
        int[] arr = {13,7,6,45,21,9,101,102};
        Arrays.sort(arr);// Perform the function
        System.out.printf("Modified arr[]: %s", Arrays.toString(arr));

        //TODO 2-D Arrays
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
//        {1, 2, 3}, [0,0=1],[0,1=2]
//        {4, 5, 6},
//        {7, 8, 9}
    // order: row(across), index of row(pos in that row)
// access the first element in the second row
        System.out.println(matrix[1][0]); // 4
// the last element in the first row
        System.out.println(matrix[0][2]); // 3
// the first element in the last row
        System.out.println(matrix[2][0]); // 7

//        //Example
//        String[][] names = {
//                {"Mr.", "Mrs.", "Ms."},
//                {"Smith", "Jones"}
//        };
//        System.out.println(names[0][0] + names[1][0]);

        for (int[] row : matrix) {
            System.out.println("+---+---+---+");

            System.out.print("| ");

            for (int column : row) {
                System.out.print(column + " | ");
            }

            System.out.println();// creates new line
        }

        System.out.println("+---+---+---+");




    }

}
