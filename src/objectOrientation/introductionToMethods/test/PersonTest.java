package objectOrientation.introductionToMethods.test;

import objectOrientation.introductionToMethods.domain.Person;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Maria");
        person.setAge(20);
        person.setGender('F');

        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getGender());
    }
}
