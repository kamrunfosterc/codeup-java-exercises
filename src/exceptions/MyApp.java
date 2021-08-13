package exceptions;

import util.Input;

import java.util.InputMismatchException;

public class MyApp {
    public static final int INVALID_CHOICE = 0;
    private static final int FIRST_CHOICE = 1;
    private static final int SECOND_CHOICE = 2;
    private static final int Exit_CHOICE = 3;
    /*
    main menu-printing and user choice loop
    loop will exit when user enters quit choice (3)
    1: print hello
    2: print I'm hungry
    3: quit
     */
    public void runMyApp(){
        int userChoice = INVALID_CHOICE;//needs to be avail to anything inside this method
        Input input = new Input();
        do {
            printMenu();
            try{
                userChoice = input.getInt(FIRST_CHOICE, Exit_CHOICE);// since this is the call we will wrap in try catch
                doUserChoice(userChoice);
            }catch (InputMismatchException e){
                System.out.println("Please type an integer between 1 and 3!");
                input = new Input();
            }
//            if (userChoice == 1){
//
//            }
        }while(userChoice != Exit_CHOICE);
    }
    private void doUserChoice(int userChoice){
        switch (userChoice){
            case FIRST_CHOICE:
                System.out.println("Hello");
                break;
            case SECOND_CHOICE:
                System.out.println("I'm hungry");
                break;
        }
    }
    private void printMenu(){
        System.out.println("Enter 1 or 2 or 3: ");
    }

    public static void main(String[] args) {
        //1. create an application object
        //2. run the menu loop
        //3.exit the program when user enters quit option

        //can create an isnstance of myAPP as an object to avoid static methods?
        MyApp myApp = new MyApp();//.1
        myApp.runMyApp();//.2
        System.out.println("You've ended the program.");
    }
}
