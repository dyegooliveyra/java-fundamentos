package objectOrientation.heritage.test;

import objectOrientation.heritage.domain.Employee;

public class HeritageTest {
    public static void main(String[] args) {
        Employee employee = new Employee("Joaquim", "Silva");
        employee.setSalary(1000.0);
        employee.working();
    }
}
