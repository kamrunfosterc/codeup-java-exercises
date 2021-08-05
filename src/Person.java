public class Person {
    public String firstName;// called fields, member variables, instance variable = all the same thing, partic obj
    public String lastName;

    public String getFullName(){// method
        return firstName + " " + lastName;
    }

    public static void foo(){
        // static method: can call with instance or class (best called with class)
        // static methods designed to be called on class w/out object instances
//        String bigFoo = firstName + " " + lastName;//variables don't exist for class, exist for objects made out of class
    }
//    public static String abbreviateFirstName(){
//        return firstName.substring(0, 1);
//    }
    public static final int MAX_FIRSTNAME_LENGTH = 50;// indicates this can only ever be a constant, max length

    public Person (){//no arguement constructors lik
        System.out.println("My constructor called");
        firstName = "unknown";
        lastName = "unknown";
    }
    public Person (String firstName){
//        firstName = firstName; // wouldnt work bc confused on which variable
        this.firstName = firstName;// the this pulls out the firstName property above
        //this.firstName allows us to target the global field firstName

        // also could just not give the variable name the same as our member variable
    }


    public static void main(String[] args) {
        Person bob = new Person();// class_name variable_name = new 'class name'()
        bob.firstName = "Bob";
        bob.lastName = "Smith";

        Person sue = new Person();
        sue.firstName = "Sue";
        sue.lastName = "Roberts";

        System.out.println(bob.getFullName());
        System.out.println(sue.getFullName());


    }
}
