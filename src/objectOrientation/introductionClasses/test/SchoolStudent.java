package objectOrientation.introductionClasses.test;

import objectOrientation.introductionClasses.domain.Student;

public class SchoolStudent {

    public static void main(String[] args) {
        Student student = new Student();
        student.name = "João";
        student.age = 20;
        student.gender = 'M'; ;

        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.gender);
    }
}
