package movies;
//TODO PART OF Arrays Exercise
//TODO 3. Arrays: Movie List
//TODO RY WALK THROUGH
public class Movie {
    private String name;
    private String category;

    public Movie(String name, String category) {// constructor
        this.name = name;
        this.category = category;
    }

    //Getters & Setters
    // ********************************
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    // ********************************



    public static void main(String[] args) {

    }
}
//public class Musician {
//
//    private String firstName;
//    private String lastName;
//    private String genre;
//    private String instrument;
//    private boolean isAlive;
//    private int age;
//
//    // DEAD MUSICIANS WITH ONE NAME
//    public Musician(String firstName, String genre, String instrument, boolean isAlive) {
//        this.firstName = firstName;
//        this.genre = genre;
//        this.instrument = instrument;
//        this.isAlive = isAlive;
//    }
//
//    // ALIVE MUSICIANS WITH ONE NAME
//    public Musician(String firstName, String genre, String instrument, boolean isAlive, int age) {
//        this.firstName = firstName;
//        this.genre = genre;
//        this.instrument = instrument;
//        this.isAlive = isAlive;
//        this.age = age;
//    }
//
//    // CONSTRUCTOR FOR MUSICIAN WITH ALL PROPERTIES
//    public Musician(String firstName, String lastName, String genre, String instrument, boolean isAlive, int age) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.genre = genre;
//        this.instrument = instrument;
//        this.isAlive = isAlive;
//        this.age = age;
//    }
//
//    // CONSTRUCTOR FOR DEAD MUSICIANS
//    public Musician(String firstName, String lastName, String genre, String instrument, boolean isAlive) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.genre = genre;
//        this.instrument = instrument;
//        this.isAlive = isAlive;
//    }
//
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public String getGenre() {
//        return genre;
//    }
//
//    public void setGenre(String genre) {
//        this.genre = genre;
//    }
//
//    public String getInstrument() {
//        return instrument;
//    }
//
//    public void setInstrument(String instrument) {
//        this.instrument = instrument;
//    }
//
//    public boolean isAlive() {
//        return isAlive;
//    }
//
//    public void setAlive(boolean alive) {
//        isAlive = alive;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//}
//1:56
//public class MusiciansArray {
//    public static Musician[] findAll() {
//        return new Musician[] {
//                new Musician("Julian", "Lage", "Jazz", "Guitar", true, 33),
//                new Musician("Art", "Tatum", "Jazz", "Piano", false),
//                new Musician("John", "Coltrane", "Jazz", "Saxophone", false),
//                new Musician("Bill", "Evans", "Jazz", "Piano", false),
//
//                new Musician("B.B.", "King", "Blues", "Guitar", false),
//                new Musician("Stevie Ray", "Vaughan", "Blues", "Guitar", false),
//                new Musician("Leyla", "McCalla", "Blues", "Vocals/Cello/Guitar/Banjo", true, 35),
//
//                new Musician("Uli Jon", "Roth", "Rock", "Guitar", true, 66),
//                new Musician("Jimi", "Hendrix", "Rock", "Guitar", false),
//                new Musician("Duane", "Allman", "Rock", "Guitar/Slide", false),
//
//                new Musician("Adele", "Pop", "Vocals/Bass", true, 33),
//                new Musician("Sam", "Smith", "Pop", "Vocals", true, 29),
//                new Musician("Bruno", "Mars", "Pop", "Vocals/Keyboard", true, 35),
//
//                new Musician("Scarface","Hip-Hop/Rap", "Vocals", true, 50),
//                new Musician("J.", "Cole", "Hip-Hop/Rap", "Vocals", true, 36),
//                new Musician("ODB","Hip-Hop/Rap", "Vocals", false),
//
//        };
//    }
//}