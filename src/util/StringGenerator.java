package util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static util.Console.print;

public class StringGenerator {

    private static final String A_TO_Z = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final int QUANTITY = 1_000_000;
    public static final int LENGTH = 10;

    private static String generateRandom(int length) {
        Random rand = new Random();

        StringBuilder res = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int randIndex = rand.nextInt(A_TO_Z.length());
            res.append(A_TO_Z.charAt(randIndex));
        }
        return res.toString();

        /*return Stream
                .generate(() -> rand.nextInt(A_TO_Z.length()))
                .parallel()
                .limit(LENGTH)
                .map(A_TO_Z::charAt)
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();*/
    }

    public static List<String> generate(int quantity, int length) {
        print("Gerando dados...");
        List<String> result = new ArrayList<>(quantity);
        for (int i = 0; i < quantity; i++) {
            result.add(generateRandom(length));
        }

        print("Dados gerados!");
        return result;

        /*return Stream
                .generate(StringGenerator::generateRandom)
                .parallel()
                .limit(quantity)
                .collect(Collectors.toList());*/
    }

    public static List<String> generate() {
        return generate(QUANTITY, LENGTH);
    }

}
