package _02_lambda_basico.exercicios;

public class Main {

    public static void main(String[] args) {
        Decider<String> stringDecider = (str1, str2) -> str1.length() > str2.length();
        chooseTheBest("AB", "EWE", stringDecider);

        Decider<Integer> integerDecider = (num1, num2) -> num1 > num2;
        chooseTheBest(3, 6, integerDecider);
    }

    private interface Decider<T> {
        boolean isFirstTheBest(T first, T second);
    }

    private static <T> T chooseTheBest(T first, T second, Decider<T> decider) {
        return decider.isFirstTheBest(first, second) ? first : second;
    }

}
