package _01_revisao.exemplos._01_handle;

import java.util.Comparator;

public class LengthComparator implements Comparator<String> {

    @Override
    public int compare(String hashTag1, String hashTag2) {
        return hashTag1.length() - hashTag2.length();
    }

}
