package _01_revisao.exemplos._01_handle;

import java.util.Arrays;

import static util.Console.print;

public class Main {

    private static String socialNetwork;
    private String perfil;

    public static void main(String[] args) {
        String[] hashTags = {"#detremura", "#olympics", "#rockday"};

        print("Hash Tags", hashTags);

        Arrays.sort(hashTags, new LengthComparator());
        print("Ordenação por tamanho", hashTags);

        int position = 2;
        Arrays.sort(hashTags, new LetterPositionComparator(position));
        print("Ordenação pela segunda letra", hashTags);
    }

}
