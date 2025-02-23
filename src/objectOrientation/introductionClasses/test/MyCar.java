package objectOrientation.introductionClasses.test;

import objectOrientation.introductionClasses.domain.Car;

public class MyCar {

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.brand = "Fiat";
        car1.model = "Uno";
        car1.year = 2018;

        System.out.println(car1.brand);
        System.out.println(car1.model);
        System.out.println(car1.year);

        System.out.println("------------------");

        Car car2 = new Car();
        car2.brand = "Honda";
        car2.model = "Civic";
        car2.year = 2019;

        System.out.println(car2.brand);
        System.out.println(car2.model);
        System.out.println(car2.year);
    }
}
