package _03_lambda_mais_detalhes.prints;

import java.util.Arrays;
import java.util.function.DoubleBinaryOperator;

import static util.Console.print;

public class Calculator {

    @FunctionalInterface
    interface Operator {
        double apply(double a, double b);
    }

    private static double operateV1(Operator operator, double a, double b) {
        return operator.apply(a, b);
    }

    private static double operateV2(DoubleBinaryOperator operator, double a, double b) {
        return operator.applyAsDouble(a, b);
    }

    public static void main(String[] args) {
        double sum      = operateV1((a, b) -> a + b, 1, 2);
        double subtract = operateV1((a, b) -> a - b, 4, 3);
        double multiply = operateV2((a, b) -> a * b, 5, 6);
        double divide   = operateV2((a, b) -> a / b, 8, 7);

        double hypot    = operateV1(Math::hypot, 9, 10);
        double max      = operateV2(Math::max,  12, 11);

        print(Arrays.asList(sum, subtract, multiply, divide, hypot, max));
    }

}
