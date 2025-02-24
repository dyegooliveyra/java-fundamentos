package objectOrientation.introductionToMethods.test;

import objectOrientation.introductionClasses.domain.PrintStudent;
import objectOrientation.introductionToMethods.domain.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        PrintStudent printStudent = new PrintStudent();

        student1.name = "João";
        student1.age = 20;
        student1.gender = 'M';

        student2.name = "Maria";
        student2.age = 22;
        student2.gender = 'F';




        printStudent.print(student1);

        System.out.println("------------------");

        student2.print();
    }


}
