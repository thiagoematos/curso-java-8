package _02_lambda_basico.prints._03;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        String[] nomes = {"Tabatha", "Sofia", "Emilly"};

        //Interface Funcional
        Arrays.sort(nomes, new Comparator<String>() {
            @Override
            public int compare(String nome1, String nome2) {
                return nome1.length() - nome2.length();
            }
        });

        // Lambda
        Arrays.sort(nomes, (nome1, nome2) -> nome1.length() - nome2.length());
    }

}
