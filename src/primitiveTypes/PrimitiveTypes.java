package primitiveTypes;

public class PrimitiveTypes {

    public static void main(String[] args) {

        // Primitive types
        byte b = 1; // has a range of -128 to 127 - size of 1 byte
        short s = 2; // has a range of -32,768 to 32,767 - size of 2 bytes
        int i = 3; // has a range of -2,147,483,648 to 2,147,483,647 - size of 4 bytes
        long l = 4L;    // has a range of -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 - size of 8 bytes
        float f = 5.0f; // has a range of 1.4E-45 to 3.4028235E38 - size of 4 bytes
        double d = 6.0; // has a range of 4.9E-324 to 1.7976931348623157E308 - size of 8 bytes
        char c = '7';  // a single character - size of 2 bytes
        boolean bo = true; // true or false - size of 1 byte

        // Non-primitive types - Reference types
        String str = "any string"; // a sequence of characters - size of 2 bytes
    }
}
