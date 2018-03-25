package _01_revisao.exemplos._01_handle;

import java.util.Comparator;

public class LetterPositionComparator implements Comparator<String> {

    private final int position;

    LetterPositionComparator(int position) {
        this.position = position - 1;
    }

    @Override
    public int compare(String palavra1, String palavra2) {
        return palavra1.charAt(position) - palavra2.charAt(position);
    }

}
