package baitapvenha.baitap4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChuoiKiTu {
    public static void main(String[] args) {
        String str="Rekkei Academy để nông dân biết code";

        List <String> stringList=new ArrayList<>();

        String[] worrds=str.split("\\s+");
        stringList.addAll(Arrays.asList(worrds));

        System.out.println("Sau khi tách chuỗi: "+stringList);
        System.out.println("Các từ có kí tự >3 là: ");
        for (String word:stringList
             ) {
            if (word.length()>3){
                System.out.print(word+" ");
            }
        }

    }

}
