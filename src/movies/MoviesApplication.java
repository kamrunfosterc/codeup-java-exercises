//package movies;
//
//public class MoviesApplication {
////Give the user a list of options for viewing all the movies or viewing movies by category.
//    private static String returnMenuDisplay(){
//        //TODO: RY WALK THROUGH
//        String menu = "What would you like to do?\n" +
//                "\n" +
//                "0 - exit\n" +
//                "1 - view all movies\n" +
//                "2 - view movies in the animated category\n" +
//                "3 - view movies in the drama category\n" +
//                "4 - view movies in the horror category\n" +
//                "5 - view movies in the scifi category";
//
//        return menu;
//    }
//    private static int promptAndReturnUserChoice(){
//        //TODO: RY WALK THROUGH
//        Input input = new Input();
//        System.out.println("Enter your choice: ");
//        int userResponse = input.getInt(0, 5);
//        return userResponse;
//    }
//    private static boolean executeUserChoice(int choice){
//        //TODO: RY WALK THROUGH
//        boolean continueRunningApp = true;// run case
//        //good reason for switch case for ease of read
//        switch (choice){
//            case 0:
//                System.out.println("Good bye!");//exit
//                continueRunningApp = false;//
//                break;
//            case 1://view all movies
//                for (Movie movie: MoviesArray.findAll()){
//                    System.out.printf("%s -- %s\n",movie.getName(), movie.getCategory());
//                }
//                break;
//            case 2:
//                System.out.println();
//                viewMoviesByCategory("animated");
//                System.out.println();
//            case 3:
//                System.out.println();
//                viewMoviesByCategory("drama");
//                System.out.println();
//            case 4:
//                System.out.println();
//                viewMoviesByCategory("horro");
//                System.out.println();
//            case 5:
//                System.out.println();
//                viewMoviesByCategory("scifi");
//                System.out.println();
//        }
//    }
//    private static void viewMoviesByCategory(String category){
//        for (Movie movie: MoviesArray.findAll()){
//            if (movie.getCategory().equalsIgnoreCase(category)){
//                System.out.printf("%s -- %s\n", movie.getName(), movie.getCategory());
//            }
//        }
//    }
//
//
//
//
//    public static void main(String[] args) {
//        //want to keep this area clean for when we call methods
//        //TODO RY WALK THROUGH
//        boolean running = true;
//        while (running){
//            System.out.println(returnMenuDisplay());
//            int response = promptAndReturnUserChoice();//
//            running = executeUserChoice(response);
//        }
//    }
//}
