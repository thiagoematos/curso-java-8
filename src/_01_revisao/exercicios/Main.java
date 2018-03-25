package _01_revisao.exercicios;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String[] strings = {"a", "_02"};
        ultimaEntrada(strings);

        Integer[] integers = {1, 2, 3};
        ultimaEntrada(integers);

        List<String> listaDeStrings = new ArrayList<>();
        ultimaEntrada(listaDeStrings);
    }

    private static <T> T ultimaEntrada(T[] array) {
        return array[array.length - 1];
    }

    private static <T> T ultimaEntrada(List<T> array) {
        return array.get(array.size() - 1);
    }

}
