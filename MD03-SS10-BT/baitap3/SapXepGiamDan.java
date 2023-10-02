package baitapvenha.baitap3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SapXepGiamDan {
    public static void main(String[] args) {
        List<Integer> arrList =new ArrayList<>();
        arrList.add(1);
        arrList.add(2);
        arrList.add(8);
        arrList.add(4);
        arrList.add(1);
       Collections.sort(arrList, Comparator.reverseOrder());
        System.out.println(arrList);
    }
}
