//package person;
//
//public class Employee extends Person {
//    // properties unique to the employee class/ adds specificity
//    private String position;
//    private long Id;
//    private double salary;
//
//    public Employee(String first, String last, int age){
//        super(first,last,age);// targets parent of whatever this class is aka person class
//    }// basic empoloyee no info
//
//    public Employee(String name, String position, long id, double salary) {
//        super(name);
//        this.position = position;
//        Id = id;
//        this.salary = salary;
//    }// basic employee with all info
//
//    public String getPosition() {
//        return position;
//    }
//
//    public void setPosition(String position) {
//        this.position = position;
//    }
//
//    public long getId() {
//        return Id;
//    }
//
//    public void setId(long id) {
//        Id = id;
//    }
//
//    public double getSalary() {
//        return salary;
//    }
//
//    public void setSalary(double salary) {
//        this.salary = salary;
//    }
//
//
//    // TODO need to go back and clarify the person info
//    public static void main(String[] args) {
//        Employee newEmployee = new Employee("Kam","Foster", 28);
//        System.out.println(newEmployee.getFirstName());
//    }
//
//
//
//
//}
