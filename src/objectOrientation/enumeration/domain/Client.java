package objectOrientation.enumeration.domain;

public class Client {
    private String name;
    private ClientType type;
    private PaymentType paymentType;

    public Client(String name, ClientType type, PaymentType paymentType) {
        this.name = name;
        this.type = type;
        this.paymentType = paymentType;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", type.VALUE=" + type.getValue() +
                ", paymentType=" + paymentType +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ClientType getType() {
        return type;
    }

    public void setType(ClientType type) {
        this.type = type;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }
}
