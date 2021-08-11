package grades;

import java.util.ArrayList;


public class Student {
    //todo Collections Exercise Part 1

    private String studentName;
    private ArrayList<Integer> studentGrades;


    public Student(String studentName) {//sets constructor
        this.studentName = studentName;
        this.studentGrades = new ArrayList<>();//prepares grades to empty array list
    }

    public void addGrade(int grade){
        //adds given grade to the grades property
        studentGrades.add(grade);// adds new grades 
    }

    public double getGradeAverage() {
        // returns avg of student grades
        //step1 iterate over grades/ calc sum of grades
        double sumOfGrades = 0;
        double numbOfGrades = studentGrades.size();

        //todo working on for loop
//        for (double i = 0; i < studentGrades.size(); i++) {
//            //step2 return sum/ numb of grades
//            sumOfGrades += studentGrades[i];
//        }
//        return sumOfGrades/ numbOfGrades;
        for (Integer studentGrade: studentGrades){
            sumOfGrades += studentGrade;
        }
        return sumOfGrades/numbOfGrades;
    }
//    public double getGradeAverage(){
//        double sumOfGrades = 0;
//        double amountOfGrades = grades.size();
//        for(Integer grade :grades){
//            sumOfGrades += grade;
//        }
//        return sumOfGrades/amountOfGrades;
//    }


    public static void main(String[] args) {
        Student student = new Student("Johnny");
        student.addGrade(89);
        student.addGrade(76);
        student.addGrade(90);
        System.out.println("student gpa "+student.getGradeAverage());

    }

}
