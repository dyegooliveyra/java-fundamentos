package objectOrientation.modifyEnd.domain;

public class Car {
    public String brand;
    public String model;
    public static final int MAX_SPEED = 120;
    public final Comprador comprador = new Comprador();

    public void print () {
        System.out.println(this.brand);
        System.out.println(this.model);
        System.out.println(this.MAX_SPEED);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Comprador getComprador() {
        return comprador;
    }
}
