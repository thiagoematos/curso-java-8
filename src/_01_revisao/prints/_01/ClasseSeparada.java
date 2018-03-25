package _01_revisao.prints._01;

import java.util.Comparator;

public class ClasseSeparada implements Comparator<Integer> {

    @Override
    public int compare(Integer numero1, Integer numero2) {
        return numero1.compareTo(numero2);
    }

}
