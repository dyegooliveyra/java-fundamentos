package objectOrientation.association.test;

import objectOrientation.association.domain.Localization;
import objectOrientation.association.domain.Seminar;
import objectOrientation.association.domain.Teacher;
import objectOrientation.introductionToMethods.domain.Student;

public class SeminarExcercise {
    Student[] students = new Student[10];
    Localization localization = new Localization("São Paulo");
    Seminar seminar = new Seminar("Orientação a Objetos", localization);
    Teacher teacher = new Teacher("João", "Programação Orientada a Objetos");

}
