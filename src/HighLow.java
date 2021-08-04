public class HighLow {

//    static int randomNumber = MethodsExercises.getRandomNumber(1, 100);
    public static int getUsersGuessedNumber(){
        System.out.println("Guess the number. ");
        int usersGuessedNumber = MethodsExercises.getInteger(1,100);
        return usersGuessedNumber;
    }

    public static void highLowGame(){
        int randomNumber = MethodsExercises.getRandomNumber(1, 100);
        int usersLastGuess;
//        System.out.println(randomNumber);//tells me the random number
        int numberOfTries = 0;

        do{
            usersLastGuess = getUsersGuessedNumber();
            giveHelpHint(usersLastGuess, randomNumber);
//            if (usersLastGuess > randomNumber){
//                System.out.println("You need to choose LOWER!");
//            } else if(usersLastGuess < randomNumber){
//                System.out.println("You need to choose HIGHER!");
//            }
        }while(usersLastGuess != randomNumber);

        System.out.println("Hey, you guess right!!!");
        System.out.println("Hey you guess right in "+ numberOfTries + " number of tries!");

//        getUsersGuessedNumber();
    }
    public static void giveHelpHint(int guessedNumber, int ActualNumber){
        if (guessedNumber > ActualNumber){
            System.out.println("You need to choose LOWER!");
        } else if(guessedNumber < ActualNumber){
            System.out.println("You need to choose HIGHER!");
        }
    }



    public static void main(String[] args) {
        System.out.println(getUsersGuessedNumber());
        highLowGame();


    }
}
