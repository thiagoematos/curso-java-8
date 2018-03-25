package _01_revisao.prints._02;

import java.util.Arrays;
import java.util.Comparator;

public class Main implements Comparator<Integer> {

    public void main(String[] args) {
        Integer[] array = {1, 2, 3};
        Arrays.sort(array, this);
    }

    @Override
    public int compare(Integer numero1, Integer numero2) {
        return numero1.compareTo(numero2);
    }

}
