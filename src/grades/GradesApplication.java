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
        studentJohnny.addGrade(88);
        studentJohnny.addGrade(72);
        studentJohnny.addGrade(95);
        System.out.println("Johnny's grade average: "+ studentJohnny.getGradeAverage());

        students.put("Kfos0561!",studentKamrun);
        studentKamrun.addGrade(88);
        studentKamrun.addGrade(72);
        studentKamrun.addGrade(95);

        students.put("Jser768$",studentJasmine);
        studentJasmine.addGrade(88);
        studentJasmine.addGrade(72);
        studentJasmine.addGrade(95);

        students.put("XB17!7",studentHarper);
        studentHarper.addGrade(88);
        studentHarper.addGrade(72);
        studentHarper.addGrade(95);

        students.put("ML26#",studentMaryLou);
        studentMaryLou.addGrade(88);
        studentMaryLou.addGrade(72);
        studentMaryLou.addGrade(95);

        students.put("sbell99@",studentAnnaMae);
        studentAnnaMae.addGrade(88);
        studentAnnaMae.addGrade(72);
        studentAnnaMae.addGrade(95);

        students.put("Ceribro45",studentAshley);


        //todo think about how we can add more students w/out the need to do the above


    }

}
