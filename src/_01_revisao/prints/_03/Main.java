package _01_revisao.prints._03;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Integer[] array = {1, 2, 3};
        Arrays.sort(array, new ClasseInterna());
    }

    public static class ClasseInterna implements Comparator<Integer> {

        @Override
        public int compare(Integer numero1, Integer numero2) {
            return numero1.compareTo(numero2);
        }

    }

}
