package grades;

import java.util.HashMap;

public class GradesApplication {
    //todo Collections Exercise Part 2


    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        Student studentJohnny = new Student("Xayden");//student #1
        Student studentKamrun = new Student("Kamrun");//student #2
        Student studentJasmine = new Student("Jasmine");//student #3
        Student studentHarper = new Student("Harper");//student #4
        Student studentMaryLou = new Student("Mary Lou");//student #5
        Student studentAnnaMae = new Student("Anna Mae");//student #6
        Student studentAshley = new Student("Ashley");//student #7

        //todo ADDED students and 3 grades per student
        students.put("Jsun78",studentJohnny);//created relationship between these two values
        System.out.println(students.get("Jsun78"));// exist in hashmap
        studentJohnny.addGrade(84);
        studentJohnny.addGrade(80);
        studentJohnny.addGrade(91);
        System.out.println("Johnny's grade average: "+ studentJohnny.getGradeAverage());

        students.put("Kfos0561!",studentKamrun);
        studentKamrun.addGrade(81);
        studentKamrun.addGrade(79);
        studentKamrun.addGrade(89);
        System.out.println("Kamrun's grade average: "+ studentKamrun.getGradeAverage());

        students.put("Jser768$",studentJasmine);
        studentJasmine.addGrade(88);
        studentJasmine.addGrade(72);
        studentJasmine.addGrade(95);
        System.out.println("Jasmine's grade average: "+ studentJasmine.getGradeAverage());

        students.put("XB17!7",studentHarper);
        studentHarper.addGrade(54);
        studentHarper.addGrade(73);
        studentHarper.addGrade(68);
        System.out.println("Harper's grade average: "+ studentHarper.getGradeAverage());

        students.put("ML26#",studentMaryLou);
        studentMaryLou.addGrade(80);
        studentMaryLou.addGrade(75);
        studentMaryLou.addGrade(91);
        System.out.println("Mary Lou's grade average: "+ studentMaryLou.getGradeAverage());


        students.put("sbell99@",studentAnnaMae);
        studentAnnaMae.addGrade(80);
        studentAnnaMae.addGrade(68);
        studentAnnaMae.addGrade(95);
        System.out.println("AnnaMae's grade average: "+ studentAnnaMae.getGradeAverage());

        students.put("Ceribro45",studentAshley);
        studentAshley.addGrade(90);
        studentAshley.addGrade(82);
        studentAshley.addGrade(98);
        System.out.println("Ashley's grade average: "+ studentAshley.getGradeAverage());



        //todo think about how we can add more students w/out the need to do the above


    }

}
