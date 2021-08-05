public class PersonsLecture {// embodies what we want to have our person be
//    public String firstName;// called fields, member variables, instance variable = all the same thing, partic obj
//    public String lastName;// RULE: best practice is to Never have PUBLIC fields for a class
    private String firstName;// HELPS MAKE MAINTANENCE EASIER
    private String lastName;

    //fields should be PRIVATE unless there is a good reason for not!


    public String getFullName(){// method
        return firstName + " " + lastName;
    }

    public static void foo(){
        /*static method: can call with instance or class (best called with class)
        static methods designed to be called on class w/out object instances*/
//        String bigFoo = firstName + " " + lastName;//variables don't exist for class, exist for objects made out of class

    }
//    public static String abbreviateFirstName(){
//        return firstName.substring(0, 1);
//    }
    public static final int MAX_FIRSTNAME_LENGTH = 50;// indicates this can only ever be a constant, max length


    // ACCESSORS OR GETTERS & SETTERS
    /*note: go to code --> click generate --> select Getters and Setters... encaptulation
    * put these at the bottom of page*/
    //TODO gonna shrink these no argument constructors
    //TODO person 1
    public PersonsLecture(){//no arguement constructors lik
//        System.out.println("My constructor called");
//        firstName = "unknown";
//        lastName = "unknown";
        this("unknown", "unknown");

    }
    //TODO person 2
    public PersonsLecture(String firstName){
////        EXAMPLE OF WHAT NOT TO DO: firstName = firstName; // wouldnt work bc confused on which variable
//        this.firstName = firstName;// the this pulls out the firstName property above
//        //NOTE: this.firstName allows us to target the global field firstName
//        //NOTE: firstName is local parameter
//        // also could just not give the variable name the same as our member variable
        this(firstName,"unknown"); // works same as above
    }
    //TODO person 3
    public PersonsLecture(String firstName, String lastName){// this is what is being called
        this.firstName = firstName;
        this.lastName = lastName;
    }


    //TODO package
    // if we don't specify public or private, method becomes a package and can be called
    // by any source directory calling that package name



    public static void main(String[] args) {// static level, go to classes not objects
        PersonsLecture bob = new PersonsLecture();// class_name variable_name = new 'class name'()
        bob.firstName = "Bob";
        bob.lastName = "Smith";

        PersonsLecture sue = new PersonsLecture();
        sue.firstName = "Sue";
        sue.lastName = "Roberts";

        System.out.println(bob.getFullName());
        System.out.println(sue.getFullName());

        /* CAN NOT call 'this' bc it's static methods are used at the CLASS
        level where you do not have an object instance. THIS must be used
        with an object instance. */

        //TODO New way using getters and setters
//        Person bob = new Person();// class_name variable_name = new 'class name'()
//        bob.setfirstName("Bob");
//        bob.setlastName("Smith");
//
//        Person sue = new Person();
//        sue.setfirstName("Sue");
//        sue.setlastName("Roberts");
//
//        System.out.println(bob.getFullName());
//        System.out.println(sue.getFullName());



    }


    //TODO OUR Getters & Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
