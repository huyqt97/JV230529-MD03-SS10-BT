package baitapvenha.baitap1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BaiTap1 {
    public static void main(String[] args) {
        List<Integer> randomList = new ArrayList<>();
        System.out.println("Trước khi add: " + randomList);
        int number = (int) (Math.random() * 10) + 1;
        for (int i = 0; i < number; i++) {
            int randomValue = (int) (Math.random() * 100);
            randomList.add(randomValue);
        }
        System.out.println("Sau khi add: " + randomList);

        System.out.print("Danh sách ngẫu nhiên: ");
        for (Integer numberElement:randomList
             ) {
            System.out.print(numberElement+" ");
        }
        System.out.println();
        Integer maxNumber= Collections.max(randomList);
        System.out.println("Số lớn nhất là: "+ maxNumber);
    }


}
