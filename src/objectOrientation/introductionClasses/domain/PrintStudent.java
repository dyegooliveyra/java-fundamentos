package objectOrientation.introductionClasses.domain;

import objectOrientation.introductionToMethods.domain.Student;

public class PrintStudent {

    public void print(Student student) {
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.gender);
    }
}
