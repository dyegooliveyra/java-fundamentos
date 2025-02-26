package objectOrientation.enumeration.test;

import objectOrientation.enumeration.domain.Client;
import objectOrientation.enumeration.domain.ClientType;
import objectOrientation.enumeration.domain.PaymentType;

public class ClientTest {

    public static void main(String[] args) {
        Client client1 = new Client("Joaquim", ClientType.PESSOA_FISICA, PaymentType.CREDIT_CARD);
        Client client2 = new Client("Maria", ClientType.PESSOA_JURIDICA, PaymentType.DEBIT_CARD);

        System.out.println(client1);
        System.out.println(client2);
        System.out.println(PaymentType.CREDIT_CARD.calculateDiscount(100));
        System.out.println(PaymentType.DEBIT_CARD.calculateDiscount(100));

        ClientType clientType = ClientType.getClientType(2);
        System.out.println(clientType);
    }
}
