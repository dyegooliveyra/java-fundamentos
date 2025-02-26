package objectOrientation.heritage.domain;

public class Employee extends Person {
    private double salary;
    public Employee(String nome, String sobrenome) {
        super(nome, sobrenome);
    }

    public void working() {
        System.out.println("Trabalhando...");
        super.print();
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
