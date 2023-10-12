package bai2;

import java.util.ArrayList;
import java.util.List;

public class LissDaoNguoc {
    public static void main(String[] args) {

        // Bước 1: Tạo một danh sách (List) chứa các số nguyên
        List<Integer> lisNumber=new ArrayList<>();

        // Bước 2: Thêm các số phần tử vào danh sách
        lisNumber.add(1);
        lisNumber.add(2);
        lisNumber.add(3);
        lisNumber.add(4);
        lisNumber.add(5);

        // Bước 3: Đảo ngược danh sách (không sử dụng hàm đảo ngược có sẵn)
        List<Integer> listReversed = new ArrayList<>();
        int size = lisNumber.size();
        for (int i = size - 1; i >= 0; i--) {
            int element = lisNumber.get(i);
            listReversed.add(element);
        }

        // In danh sách ban đầu
        System.out.println("Danh sách ban đầu:");
        System.out.println(lisNumber);

        // In danh sách đảo ngược
        System.out.println("Danh sách đảo ngược:");
        System.out.println(listReversed);
    }
}
