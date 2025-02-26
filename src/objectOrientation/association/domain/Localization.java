package objectOrientation.association.domain;

public class Localization {
    private String address;

    public Localization(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
