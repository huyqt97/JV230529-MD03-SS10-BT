package baitapvenha.baitap2;

import java.util.ArrayList;
import java.util.List;

public class ReservedListNumber {
    public static void main(String[] args) {
        List<Integer> listRandom=new ArrayList<>();
        listRandom.add(1);
        listRandom.add(2);
        listRandom.add(3);
        listRandom.add(4);
        listRandom.add(5);

        System.out.println("Danh sách chưa đảo ngược");
        for (Integer number:listRandom
             ) {
            System.out.print(number+" ");
        }
        System.out.println();

        // đảo ngược danh sách
        int leng=listRandom.toArray().length;
        System.out.println("độ dài: "+ leng);
List<Integer> reserverList= new ArrayList<>();
        for (int i = leng-1; i >= 0; i--) {
reserverList.add(listRandom.get(i));
        }

        System.out.println("Danh sách sau khi đảo ngược là: ");

        for (Integer numberList:reserverList
             ) {
            System.out.print(numberList+" ");
        }
    }

}
