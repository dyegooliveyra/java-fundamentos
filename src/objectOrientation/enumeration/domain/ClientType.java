package objectOrientation.enumeration.domain;

public enum ClientType {
    PESSOA_FISICA(1),
    PESSOA_JURIDICA(2);

    private final int VALUE;

    ClientType( int value ) {
        this.VALUE = value;
    }

    public  static ClientType getClientType(int value) {
        for (ClientType clientType : ClientType.values()) {
            if (clientType.VALUE == value) {
                return clientType;
            }
        }
        return null;
    }

    public int getValue() {
        return VALUE;
    }

}
