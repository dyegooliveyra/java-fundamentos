package objectOrientation.modifyEnd.test;

import objectOrientation.modifyEnd.domain.Car;
import objectOrientation.modifyEnd.domain.Comprador;

import java.util.Arrays;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.brand = "Fiat";
        car.model = "Uno";
        Comprador comprador = new Comprador();
        comprador.setNome("Joaquim");
        System.out.println(comprador);
        car.print();

    }
}
