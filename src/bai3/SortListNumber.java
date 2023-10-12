package bai3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListNumber {
    public static void main(String[] args) {
        // Tạo một danh sách (List) chứa các số nguyên

        List<Integer> integerList=new ArrayList<>();

        // Thêm các số phần tử vào danh sách
        integerList.add(6);
        integerList.add(9);
        integerList.add(3);
        integerList.add(7);
        integerList.add(1);

        // Sắp xếp danh sách theo thứ tự giảm dần
        Collections.sort(integerList,Collections.reverseOrder());

        // In danh sách đã sắp xếp giảm dần
        System.out.println("Danh sách sau khi sắp xếp:");
        System.out.println(integerList);
    }
}
