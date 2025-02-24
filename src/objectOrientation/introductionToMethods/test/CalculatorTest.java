package objectOrientation.introductionToMethods.test;

import objectOrientation.introductionToMethods.domain.Calculator;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(1, 2));
        System.out.println(calculator.multiply(3, 4));

        calculator.someArrayMethod(new int[]{1, 2, 3, 4, 5});
        calculator.someVarArgsMethod(1, 2, 3, 4, 5);
    }
}

