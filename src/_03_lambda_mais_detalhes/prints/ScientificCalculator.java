package _03_lambda_mais_detalhes.prints;

import java.util.function.DoubleUnaryOperator;

public class ScientificCalculator {

    @FunctionalInterface
    public interface Integrable {
        double eval(double x);
    }

    public static void main(String[] main) {
        DoubleUnaryOperator function = Math::cos;
        integrate(function, 1, 2, 3);
    }

    public static double integrate(DoubleUnaryOperator function, double x1, double x2, int numSlices) {
        if (numSlices < 1) {
            numSlices = 1;
        }
        double delta = (x2 - x1) / numSlices;
        double start = x1 + delta / 2;
        double sum = 0;
        for (int i = 0; i < numSlices; i++) {
            sum += delta * function.applyAsDouble(start + delta * i);
        }
        return sum;
    }

}
