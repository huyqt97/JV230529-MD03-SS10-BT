package baitapvenha.baitap5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChuoiNganNhat {
    public static void main(String[] args) {
        String str = "Rekkei Academy để nông dân biết code";

        List<String> stringList = new ArrayList<>();

        String[] words = str.split("\\s+");
        stringList.addAll(Arrays.asList(words));

        System.out.println("Sau khi tách chuỗi: " + stringList);
        int minLength = Integer.MAX_VALUE;
        for (String word : words
        ) {
            int wordLength = word.length();

            if (wordLength < minLength) {
                minLength = wordLength;
                stringList.clear();
                stringList.add(word);
            } else if (wordLength == minLength) {
                stringList.add(word);
            }
        }
        for (String strList : stringList
        ) {
            System.out.print(stringList);
        }

    }


}
