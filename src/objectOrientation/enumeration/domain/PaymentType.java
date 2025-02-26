package objectOrientation.enumeration.domain;

public enum PaymentType {
    CREDIT_CARD {
        @Override
        public double calculateDiscount(double value) {
            return value * 0.05;
        }
    },
    DEBIT_CARD {
        @Override
        public double calculateDiscount(double value) {
            return value * 0.1;
        }
    },
    ;

    public double calculateDiscount(double value) {
        return value;
    }
}
