package grades;
import util.Input;
import java.util.HashMap;

public class GradesApplication {
    //todo Collections Exercise Part 2
    static Input input = new Input();

    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        // HashMap<KEY, VALUE> variable name = new HashMap<>();

        //todo creating Student object
        Student studentXayden = new Student("Xayden");//student #1
        Student studentKamrun = new Student("Kamrun");//student #2
        Student studentJasmine = new Student("Jasmine");//student #3
        Student studentHarper = new Student("Harper");//student #4
        Student studentMaryLou = new Student("Mary Lou");//student #5
        Student studentAnnaMae = new Student("Anna Mae");//student #6
        Student studentAshley = new Student("Ashley");//student #7

        //todo ADDED students and 3 grades per student
        students.putIfAbsent("Jsun78",studentXayden);//created relationship between these two values
        studentXayden.addGrade(84);
        studentXayden.addGrade(80);
        studentXayden.addGrade(91);
        System.out.println("Xayden's grade average: "+ studentXayden.getGradeAverage());
//        System.out.println(studentXayden);// returns grades.Student@3f0ee7cb
//        System.out.println(students.get("Jsun78"));// exist in hashmap... returns grades.Student@3f0ee7cb also


        students.putIfAbsent("Kfos0561!",studentKamrun);//this id is now associated w/ this student
        students.get("Kfos0561!");
        studentKamrun.addGrade(81);
        studentKamrun.addGrade(79);
        studentKamrun.addGrade(89);
        System.out.println("Kamrun's grade average: "+ studentKamrun.getGradeAverage());

        students.putIfAbsent("Jser768$",studentJasmine);
        studentJasmine.addGrade(88);
        studentJasmine.addGrade(72);
        studentJasmine.addGrade(95);
        System.out.println("Jasmine's grade average: "+ studentJasmine.getGradeAverage());

        students.putIfAbsent("XB17!7",studentHarper);
        studentHarper.addGrade(54);
        studentHarper.addGrade(73);
        studentHarper.addGrade(68);
        System.out.println("Harper's grade average: "+ studentHarper.getGradeAverage());

        students.putIfAbsent("ML26#",studentMaryLou);
        studentMaryLou.addGrade(80);
        studentMaryLou.addGrade(75);
        studentMaryLou.addGrade(91);
        System.out.println("Mary Lou's grade average: "+ studentMaryLou.getGradeAverage());


        students.putIfAbsent("sbell99@",studentAnnaMae);
        studentAnnaMae.addGrade(80);
        studentAnnaMae.addGrade(68);
        studentAnnaMae.addGrade(95);
        System.out.println("AnnaMae's grade average: "+ studentAnnaMae.getGradeAverage());

        students.putIfAbsent("Ceribro45",studentAshley);
        studentAshley.addGrade(90);
        studentAshley.addGrade(82);
        studentAshley.addGrade(98);
        System.out.println("Ashley's grade average: "+ studentAshley.getGradeAverage());

        commandLineInterface(students);// calls method


        //todo think about how we can add more students w/out the need to do the above


//        Welcome!
//
//                Here are the GitHub usernames of our students:
//
//|zgulde| |ryanorsinger| |jreich5| |fmendozaro| |MontealegreLuis|
//
//                What student would you like to see more information on?
//
//> pizza
//
//        Sorry, no student found with the GitHub username of "pizza".
//
//                Would you like to see another student?
//
//> y
//
//        What student would you like to see more information on?
//
//> zgulde
//
//        Name: Zach - GitHub Username: zgulde
//        Current Average: 87.4
//
//        Would you like to see another student?
//
//> no
//
//        Goodbye, and have a wonderful day!



    }

    //todo Collections Exercise part 3
    public static void commandLineInterface(HashMap<String, Student> ourStudents){// diff standalone students

        System.out.println("Welcome!\n"+"Here are the GitHub usernames of our students:");

        do {
            input = new Input();
            // how to iterate over hashmap that has objects
            for (String key: ourStudents.keySet()){//returns the array
                System.out.println("|"+ key + "|");
            }
            System.out.println("What student would you like to see more information on?");
            String userKey = input.getString();
            if(ourStudents.containsKey(userKey)){
                Student currentStudent = ourStudents.get(userKey);// grabs student by their key

                System.out.println("Name: "+currentStudent.getName()+" Github User Name: " + userKey);
                System.out.println("Current Average: "+ currentStudent.getGradeAverage());
            }else {
                System.out.println("So Sorry, there is no student with the Github username: "+userKey);
            }
        } while (input.yesNo());

    }

}
